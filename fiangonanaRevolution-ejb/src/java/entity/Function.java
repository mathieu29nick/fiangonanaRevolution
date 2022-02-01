/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;
import connection.ConnectionBD;
import java.sql.*;
import java.util.Date;
import java.sql.Statement;
import java.util.*;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
/**
 *
 * @author Nick
 */
public class Function {
    
    public int getIdFiangonana(String n){
        int rep=0;
        ConnectionBD con=new ConnectionBD();
        try{
            Connection c=con.getCon();
            PreparedStatement st=c.prepareStatement("SELECT *FROM Fiangonana where nom='"+n+"'");
            ResultSet res=st.executeQuery();
            while(res.next()){
                rep=res.getInt("id");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return rep;
    }
    
    public Pasitera login(String n,String mdp,String fia)
    {
        ConnectionBD con=new ConnectionBD();
        Pasitera re=new Pasitera();
        try{
            int idF=this.getIdFiangonana(fia);
            Connection c=con.getCon();
            PreparedStatement st=c.prepareStatement("SELECT *FROM Pasitera where nom='"+n+"' and mdp='"+mdp+"' and idFiangonana="+idF);
            System.out.println("SELECT *FROM Pasitera where nom='"+n+"' and mdp='"+mdp+"' and idFiangonana="+idF);
            ResultSet res=st.executeQuery();
            while(res.next()){
                re.setId(res.getInt("id"));
                re.setNom(res.getString("nom"));
                re.setMdp(res.getString("mdp"));
                re.setIdFiangonana(res.getInt("idFiangonana"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return re;
    }
    
    //Insertion Rakitra
    
    //Contrainte
    public int contrainteUnitaire(String nombre){
        int rep=0;//mety
        try{
            Integer i=new Integer(nombre);
            int ii=i.intValue();
            if(ii<0){
                rep=1;
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return rep;
    }
    
    public int contrainteSemaine(String semaine){
        int rep=0;//mety
        try{
            Integer i=new Integer(semaine);
            int ii=i.intValue();
            if(ii>52){
                rep=1;
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return rep;
    }
    
    public void insertionCaisse(String montant,String fi){
        try{
            ConnectionBD con=new ConnectionBD();
            Connection co=con.getCon();
            Date d=new Date();
            int id=this.getIdFiangonana(fi); 
            String req="Insert into Caisse values(next value for seq_Caisse,"+montant+","+id+",'"+d+"')";
            System.out.println(req);
            Statement st=co.createStatement();
            st.executeUpdate(req);
            co.commit();
            co.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void insertionRakitra(String numS,String annee,String montant,String fi){
        try{
            ConnectionBD con=new ConnectionBD();
            Connection co=con.getCon();
            int id=this.getIdFiangonana(fi);    
            String req="Insert into Rakitra values(next value for seq_Rakitra,"+id+","+montant+","+numS+","+annee+")";
            System.out.println(req);
            Statement st=co.createStatement();
            st.executeUpdate(req);
            co.commit();
            co.close();
        }catch(Exception e){
                e.printStackTrace();
        }
    }
    
    public String insertionRakitraContrainte(String numS,String annee,String montant,String fi){
        int cS=this.contrainteUnitaire(numS);
        int cA=this.contrainteUnitaire(annee);
        int cM=this.contrainteUnitaire(montant);
        int ccS=this.contrainteSemaine(numS);
        String req="";
        if(cS==1){
            req="Semaine negatif";
        }
        else if(cA==1){
            req="Annee negatif";
        }
        else if(cM==1){
            req="Montant negatif";
        }
        else if(ccS==1){
            req="Semaine superieur a 52";
        }
        else{
            this.insertionRakitra(numS,annee,montant,fi);
            this.insertionCaisse(montant,fi);
            req="Insertion effectuee";
        }
        return req;
    }
    
    //Montant Caisse Maintenant
    
    public double getMontantCaisseNow(String fi){
        int id=this.getIdFiangonana(fi);
        double rep=0;
        String req="select SUM(montant) as somme from Caisse where idFiangonana="+id;
        try{
            ConnectionBD co=new ConnectionBD();
            Connection con=co.getCon();
            PreparedStatement st=con.prepareStatement(req);
            ResultSet res=st.executeQuery();
            while(res.next()){
                rep=res.getDouble("somme");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return rep;
    }
    
    //Liste pret avec reste remboursement
    
    //Liste PretAll
    public Vector<PretAll> getListePret(){
        Vector<PretAll> rep=new Vector<PretAll>();
        String req="SELECT * FROM ListePret";
        try{
            ConnectionBD co=new ConnectionBD();
            Connection con=co.getCon();
            PreparedStatement st=con.prepareStatement(req);
            ResultSet res=st.executeQuery();
            while(res.next()){
                PretAll p=new PretAll();
                p.setIdMp(res.getInt("id"));
                p.setNom(res.getString("nom"));
                p.setDateLimite(res.getTimestamp("dateLimite"));
                p.setIdPret(res.getInt("idPr"));
                p.setDatePret(res.getTimestamp("dataPret"));
                p.setMontant(res.getDouble("montant"));
                p.setInteret(res.getDouble("interet"));
                p.setReste(res.getDouble("reste"));
                rep.add(p);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return rep;
    }
    
    public DetailPret getDetailPret(PretAll p,String date){
        DetailPret rep=new DetailPret();
        String daty=date.replace("-",""); //anne mois jour
        String req="select top 1 dt.id,dt.idPret,dt.date,dt.montant,dt.remarque from DetailPret as dt join Pret as pr on pr.id=dt.idPret where dt.date>='"+daty+"' and dt.idPret="+p.getIdPret()+" order by dt.date asc";
        System.out.println(req);
        try{
            ConnectionBD co=new ConnectionBD();
            Connection con=co.getCon();
            PreparedStatement st=con.prepareStatement(req);
            ResultSet res=st.executeQuery();
            while(res.next()){
                rep.setId(res.getInt("id"));
                rep.setIdPret(res.getInt("idPret"));
                rep.setDate(res.getTimestamp("date"));
                rep.setMontant(res.getDouble("montant"));
                rep.setRemarque(res.getString("remarque"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return rep;
    }
    
    public Vector<String> getNomMpiangona(String fi){
        Vector<String> rep=new Vector<String>();
        try{
            int id=this.getIdFiangonana(fi);
            String req="Select * from Mpiangona where idFiangonana="+id;
            System.out.println(req);
            ConnectionBD co=new ConnectionBD();
            Connection con=co.getCon();
            PreparedStatement st=con.prepareStatement(req);
            ResultSet res=st.executeQuery();
            while(res.next()){
               String s=res.getString("nom");
               rep.add(s);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return rep;
    }
    
    //Insertion Remboursement
    
    //Contrainte date remboursement
    public int contraiteDateRemboursement(DetailPret p,String date){
        int rep=0;//mety
        SimpleDateFormat d=new SimpleDateFormat("yyyy-MM-dd");
        try{
            Date parsedDate = d.parse(date);
            Timestamp timestamp = new java.sql.Timestamp(parsedDate.getTime());
            if(p.getDate().before(timestamp)){
                rep=1;
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return rep;
    }
    
    public void insertionConfiancePlus(PretAll p){
        try{
            String req="Insert into ConfiancePlus values(next value for seq_Confiance,"+p.getIdPret()+",10)";
            System.out.println(req);
            ConnectionBD con=new ConnectionBD();
            Connection co=con.getCon();
            Statement st=co.createStatement();
            st.executeUpdate(req);
            co.commit();
            co.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void insertionRemboursement(String montant,String date,PretAll pr,String rem){
        DetailPret dt=this.getDetailPret(pr,date);
        String daty=date.replace("-","");
        String req="Insert into Remboursement values(next value for seq_Remboursement,"+pr.getIdPret()+",'"+daty+"',"+montant+",'"+rem+"')";
        System.out.println(req);
        try{
            ConnectionBD con=new ConnectionBD();
            Connection co=con.getCon();
            Statement st=co.createStatement();
            st.executeUpdate(req);
            co.commit();
            co.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public String insertionRemboursementContrainte(String montant,String date,PretAll pr,String rem){
        int verif=this.contrainteUnitaire(montant);
        String rep="";
        if(verif==1){
            rep="Montant negatif";
        }
        else{
            this.insertionRemboursement(montant,date,pr,rem);
            this.insertionConfiancePlus(pr);
            rep="Insertion effectuee";
        }
        return rep;
    }
    
    //Insertion Pret
    
    public int getIdMpiangona(String nom){
        int rep=0;
        String req="SELECT * FROM Mpiangona where nom='"+nom+"'";
        try{
            ConnectionBD con=new ConnectionBD();
            Connection c=con.getCon();
            PreparedStatement st=c.prepareStatement(req);
            ResultSet res=st.executeQuery();
            while(res.next()){
                rep=res.getInt("id");
                c.commit();
                c.close();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return rep;
    }
    public void insertionPret(String dL,String dP,String montant,String nomM){
        try{
            int id=this.getIdMpiangona(nomM);
            String datyL=dL.replace("-","");//an mois jour
            String datyP=dP.replace("-","");//an mois jour
            String req="Insert into Pret values(next value for seq_Pret,'"+datyL+"','"+datyP+"',"+id+","+montant+",0)";
            System.out.println(req);
            ConnectionBD con=new ConnectionBD();
            Connection co=con.getCon();
            Statement st=co.createStatement();
            st.executeUpdate(req);
            co.commit();
            co.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    //Insertion DetailPret
    
    //Pret max 
    public Pret getPretMax(){
        Pret rep=new Pret();
        String req="select*from Pret where id=(select max(id) from Pret)";
        System.out.println(req);
        try{
            ConnectionBD con=new ConnectionBD();
            Connection c=con.getCon();
            PreparedStatement st=c.prepareStatement(req);
            ResultSet res=st.executeQuery();
            while(res.next()){
                rep.setId(res.getInt("id"));
                rep.setDateLimite(res.getTimestamp("dateLimite"));
                rep.setDatePret(res.getTimestamp("datePret"));
                rep.setIdMpiangona(res.getInt("idMpiangona"));
                rep.setMontant(res.getDouble("montant"));
                rep.setInteret(res.getDouble("interet"));   
                c.commit();
                c.close();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return rep;
    }
    public void insertionDetailPret(Pret p,String d,String montant,String rem){
        try{
            String daty=d.replace("-","");
            String req="insert into DetailPret values(next value for seq_DetailPret,"+p.getId()+",'"+daty+"',"+montant+",'"+rem+"')";
            System.out.println(req);
            ConnectionBD con=new ConnectionBD();
            Connection co=con.getCon();
            Statement st=co.createStatement();
            st.executeUpdate(req);
            co.commit();
            co.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    //Insertion PretFutur
    public void insertionPretFutur(String dP,String dL,String idM,String montant,String caisse){
        try{
            String datyP=dP.replace("-","");
            String datyL=dL.replace("-","");
            String req="insert into PretFutur values(next value for seq_PretFutur,'"+datyP+"','"+datyL+"',"+idM+","+montant+","+caisse+",0)";
            System.out.println(req);
            ConnectionBD con=new ConnectionBD();
            Connection co=con.getCon();
            Statement st=co.createStatement();
            st.executeUpdate(req);
            co.commit();
            co.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    
    
    
}
