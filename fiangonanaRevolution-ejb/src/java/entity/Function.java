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
    
    //insertion Remboursement
    
    
    
    
    
}
