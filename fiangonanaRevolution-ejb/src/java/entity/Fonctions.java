/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import connection.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Vector;

/**
 *
 * @author P13A-97-SOATOAVINA
 */
public class Fonctions {
    public Date prediction(double montant,int idMpiangona,double caisse,int semaine,int annee)
    {
        Date prediction=dateDimanche(semaine,annee);
        double somme=0;
        double moins=montant-caisse;
        return prediction;
    }
    public Date dateDimanche(int semaine,int annee)
    {
        Date daty=new Date(annee-1900,0,1);
        System.out.println(daty);
        int fin=365;
        int count=0;
        if(annee%4==0)fin=366;
        for(int i=1;i<=fin;i++){
            if(count==semaine)break;
            daty.setMonth(0);
            daty.setDate(i);
            if(daty.getDay()==0)count++;
        }
        return daty;
    }
    public double remboursementDetailPret(int semaine,int annee,int fiangonana)
    {
        String req="select sum(rembour) as s from remboursementDetailPret where datepart(week,dateLimite)="+semaine+" and datepart(year,dateLimite)="+annee;
        System.out.println(req);
        double r=0;
         try
        {
             Connection c=new Connection();
            java.sql.Connection con=c.getConnection();
            java.sql.Statement stmt=con.createStatement();
            ResultSet res=stmt.executeQuery(req);
            while(res.next())
            {
                r=res.getDouble("s");
            }
            con.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return r;
    }
    public double remboursementPretParSemaine(int semaine,int annee,int fiangonana)
    {
        double r=0;
        String req="select sum(rembour) as s from remboursementPret where datepart(week,dateLimite)="+semaine+" and datepart(year,dateLimite)="+annee;
        System.out.println(req);
        try
        {
             Connection c=new Connection();
            java.sql.Connection con=c.getConnection();
            java.sql.Statement stmt=con.createStatement();
            ResultSet res=stmt.executeQuery(req);
            while(res.next())
            {
                r=res.getDouble("s");
            }
            con.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return r;
    }
    public double caisseActuel()
    {
        double caisse=0;
        try
        {
            String req="select sum(montant) as caisse from caisse";
            System.out.println(req);
              Connection c=new Connection();
            java.sql.Connection con=c.getConnection();
            java.sql.Statement stmt=con.createStatement();
            ResultSet res=stmt.executeQuery(req);
            while(res.next())
            {
                caisse=res.getDouble("caisse");
            }
            con.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return caisse;
    }
    public PretFutur pretFarany()
    {
        PretFutur p=null;
        String req="select top 1* from pretFutur order by datePret DESC ";
        try
        {
            
           Connection c=new Connection();
           System.out.println(req);
            java.sql.Connection con=c.getConnection();
            java.sql.Statement stmt=con.createStatement();
            ResultSet res=stmt.executeQuery(req);
            res.next();
            PretFutur val=new PretFutur(res.getInt("id"),res.getTimestamp("datePret"),res.getTimestamp("dateLimite"),res.getInt("idMpiangona"),res.getDouble("montant"),res.getDouble("caisseActuel"),res.getDouble("interet"));
            Timestamp date=val.getDatePret();
            Date d=new Date(date.getTime());
            d.setHours(0);
            d.setSeconds(0);
            d.setMinutes(0);
            java.util.Date td=new java.util.Date();
            Date today=new Date(td.getTime());
            if(d.after(today))
            {
                p=val;
            }
            con.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return p;
    }
    public double pourcentageRakitra(Date d,int fiangonana)
    {
        double var=0;
        try
        {
            String dateString=(d.getYear())+""+(d.getMonth())+""+d.getDate();
            String req="select pourcentage from PourcentageRakitra where date1>='"+dateString+" 00:00:00' and date2<='"+dateString+" 23:59:59 ' and idFiangonana="+fiangonana;
            System.out.println(req);
            Connection c=new Connection();
            java.sql.Connection con=c.getConnection();
            java.sql.Statement stmt=con.createStatement();
            ResultSet res=stmt.executeQuery(req);
            while(res.next())
            {
                var=res.getDouble("pourcentage");
            }
            con.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return var;
    }
    public double moyenneRakitra(int semaine,int idFiangonana)
    {
        double m=0;
        String req="select AVG(montant) as moyenneRakitra from Rakitra group by semaine,idFiangonana having semaine="+semaine+" and idFiangonana="+idFiangonana;
        try
        {
            System.out.println(req);
            Connection c=new Connection();
            java.sql.Connection con=c.getConnection();
            java.sql.Statement stmt=con.createStatement();
            ResultSet res=stmt.executeQuery(req);
            res.next();
            m=res.getInt("moyenneRakitra");
            con.close();
        }
         catch(Exception e)
         {
             e.printStackTrace();
         }
        return m;
    }
    public int semaine(Date d) 
    {
        int num=1;
        try{
             // String daty=(d.getYear()+1900)+"-"+(d.getMonth()+1)+"-"+d.getDate();
             String daty=(d.getYear())+"-"+(d.getMonth())+"-"+d.getDate();
            Connection c=new Connection();
            java.sql.Connection con=c.getConnection();
            String req="SELECT datepart(week,'"+daty+"') as numero";
            java.sql.Statement stmt=con.createStatement();
            System.out.println(req);
            ResultSet res=stmt.executeQuery(req);
            res.next();
            num=res.getInt("numero");
            con.close();
        }
       catch(Exception e)
       {
           e.printStackTrace();
       }
        return num;
    }
    public Mpiangona login(String nom,String mdp)
    {
        Mpiangona m=null;
        Mpiangona m1=new Mpiangona();
        Vector v=m1.select("select * from Mpiangona where nom='"+nom+"' and mdp='"+mdp+"'");
        if(v.size()>0)
        {
            m=(Mpiangona)v.elementAt(0);
        }
        return m;
    }
}
