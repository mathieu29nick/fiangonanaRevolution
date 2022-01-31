/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entity.*;
import javax.ejb.Stateless;

/**
 *
 * @author P13A-97-SOATOAVINA
 */
@Stateless
public class LoginMpiangona implements LoginMpiangonaLocal {
    Fonctions f=new Fonctions();
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
     public Mpiangona login(String n,String m)
     {
         return f.login(n, m);
     }
}
