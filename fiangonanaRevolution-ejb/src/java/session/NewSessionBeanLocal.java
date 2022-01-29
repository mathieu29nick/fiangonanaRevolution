/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import javax.ejb.Stateless;

/**
 *
 * @author P13A-97-SOATOAVINA
 */
@Stateless
public class NewSessionBeanLocal implements NewSessionBeanLocalLocal {
    @Override
    public String lol()
    {
        return "Soa sy Nick";
    }
 
}
