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
public class Caisse {
    int id ;
	double montant ;
	int idFiangonana ;
    public void setId(int id) {
        this.id = id;
    }
    public void setIdFiangonana(int idFiangonana) {
        this.idFiangonana = idFiangonana;
    }
    public void setMontant(double montant) {
        this.montant = montant;
    }
    public int getId() {
        return id;
    }
    public int getIdFiangonana() {
        return idFiangonana;
    }
    public double getMontant() {
        return montant;
    }
    public Caisse(int i,double m,int f)
    {
        id=i;
        montant=m;
        idFiangonana=f;
    }
    public Caisse()
    {
        
    }
}
