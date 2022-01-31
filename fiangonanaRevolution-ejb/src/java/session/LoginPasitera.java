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
 * @author Nick
 */
@Stateless
public class LoginPasitera implements LoginPasiteraLocal {

    Function f=new Function();
    
    public Pasitera login(String n,String mdp,String fia){
        return f.login(n, mdp, fia);
    }
            
}
