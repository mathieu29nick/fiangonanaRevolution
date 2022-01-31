/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entity.*;
import javax.ejb.Local;

/**
 *
 * @author Nick
 */
@Local
public interface LoginPasiteraLocal {
    
    public Pasitera login(String n,String mdp,String fia);
}
