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
    /*public Date dateDimanche(int semaine,int annee)
    {
        
    }*/
    public PretFutur pretFarany()
    {
        PretFutur p=null;
        String req="select top 1* from pretFarany order by DESC date";
        try
        {
           Connection c=new Connection();
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
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return p;
    }
    public double pourcentageRakitra(Date d)
    {
        double var=0;
        try
        {
            String dateString=(d.getYear())+""+(d.getMonth())+""+d.getDate();
            String req="select pourcentage from PourcentageRakitra where date1>='"+dateString+" 00:00:00' and date2<='"+dateString+" 23:59:59 '";
            Connection c=new Connection();
            java.sql.Connection con=c.getConnection();
            java.sql.Statement stmt=con.createStatement();
            ResultSet res=stmt.executeQuery(req);
            while(res.next())
            {
                var=res.getDouble("pourcentage");
            }
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
        String req="select AVG(montant) as moyenneRakitra from Rakitra group by semaine having semaine="+semaine;
        try
        {
            Connection c=new Connection();
            java.sql.Connection con=c.getConnection();
            java.sql.Statement stmt=con.createStatement();
            ResultSet res=stmt.executeQuery(req);
            res.next();
            m=res.getInt("moyenneRakitra");
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
            ResultSet res=stmt.executeQuery(req);
            res.next();
            num=res.getInt("numero");
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
