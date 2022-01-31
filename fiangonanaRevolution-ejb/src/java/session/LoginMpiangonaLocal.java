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
 * @author P13A-97-SOATOAVINA
 */
@Local
public interface LoginMpiangonaLocal {
    public Mpiangona login(String n,String m);
}
