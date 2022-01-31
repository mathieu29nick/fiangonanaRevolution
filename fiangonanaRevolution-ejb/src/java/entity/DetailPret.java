/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.sql.Timestamp;

/**
 *
 * @author P13A-97-SOATOAVINA
 */
public class DetailPret {
    int id  ;
	int idPret  ;
	Timestamp date ;
	double montant;
	String remarque;
        double caisseActuel;
        double interet;
    public void setDate(Timestamp date) {
        this.date = date;
    }
    public double getInteret()
    {
        return interet;
    }
    public double getCaisseActuel()
    {
        return caisseActuel;
    }
    public void setInteret(double i)
    {
        interet=i;
    }
    public void setCaisseActuel(double c)
    {
        caisseActuel=c;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setIdPret(int idPret) {
        this.idPret = idPret;
    }
    public void setMontant(double montant) {
        this.montant = montant;
    }
    public void setRemarque(String remarque) {
        this.remarque = remarque;
    }
    public Timestamp getDate() {
        return date;
    }
    public int getId() {
        return id;
    }
    public int getIdPret() {
        return idPret;
    }
    public double getMontant() {
        return montant;
    }
    public String getRemarque() {
        return remarque;
    }
    public DetailPret(int i,int p,Timestamp d,double m,String r)
    {

    }
    public DetailPret()
    {
        
    }
}
