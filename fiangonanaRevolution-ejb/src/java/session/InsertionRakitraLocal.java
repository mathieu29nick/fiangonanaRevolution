/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import javax.ejb.Local;

/**
 *
 * @author Nick
 */
@Local
public interface InsertionRakitraLocal{
    
    public String insertionRakitraContrainte(String numS,String annee,String montant,String fi);
}
