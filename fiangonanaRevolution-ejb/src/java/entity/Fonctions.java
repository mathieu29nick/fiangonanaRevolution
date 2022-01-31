/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Vector;

/**
 *
 * @author P13A-97-SOATOAVINA
 */
public class Fonctions {
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
