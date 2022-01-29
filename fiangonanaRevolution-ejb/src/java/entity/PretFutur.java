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
public class PretFutur {
    int id ;
	Timestamp datePret;
	Timestamp dateLimite;
	int idMpiangona ;
	double montant;
    public void setDateLimite(Timestamp dateLimite) {
        this.dateLimite = dateLimite;
    }
    public void setDatePret(Timestamp datePret) {
        this.datePret = datePret;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setIdMpiangona(int idMpiangona) {
        this.idMpiangona = idMpiangona;
    }
    public void setMontant(double montant) {
        this.montant = montant;
    }
    public Timestamp getDateLimite() {
        return dateLimite;
    }
    public Timestamp getDatePret() {
        return datePret;
    }
    public int getId() {
        return id;
    }
    public int getIdMpiangona() {
        return idMpiangona;
    }
    public double getMontant() {
        return montant;
    }
    public PretFutur(int i,Timestamp d1,Timestamp d2,int m,double mo)
    {
        id=i;
        datePret=d1;
        dateLimite=d2;
        idMpiangona=m;
        montant=mo;
    }
    public PretFutur()
    {
        
    }
}
