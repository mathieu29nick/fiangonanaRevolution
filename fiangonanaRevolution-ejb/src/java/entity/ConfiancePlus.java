/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author P13A-97-SOATOAVINA
 */
public class ConfiancePlus {
    int id  ;
	int idPret ;
	double plus ;
    public void setId(int id) {
        this.id = id;
    }
    public void setIdPret(int idPret) {
        this.idPret = idPret;
    }
    public void setPlus(double plus) {
        this.plus = plus;
    }
    public int getId() {
        return id;
    }
    public int getIdPret() {
        return idPret;
    }
    public double getPlus() {
        return plus;
    }
    public ConfiancePlus()
    {
        
    }
    public ConfiancePlus(int i,int p,double pl)
    {
        id=i;
        idPret=p;
        plus=pl;
    }
}
