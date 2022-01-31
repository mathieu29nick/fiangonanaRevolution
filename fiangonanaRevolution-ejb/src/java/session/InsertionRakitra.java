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
public class InsertionRakitra implements InsertionRakitraLocal {
    
    Function f=new Function();
    
    @Override
    public String insertionRakitraContrainte(String numS,String annee,String montant,String fi){
        return f.insertionRakitraContrainte(numS, annee, montant, fi);
    }
}
