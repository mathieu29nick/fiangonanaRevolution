/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;
import java.sql.*;
/**
 *
 * @author Nick
 */
public class PretAll {
    
    int idMp;
    String nom;
    Timestamp dateLimite;
    int idPret;
    Timestamp datePret;
    double montant;
    double interet;
    double reste;

    public PretAll(int idMp, String nom, Timestamp dateLimite, int idPret, Timestamp datePret, double montant, double interet, double reste) {
        this.idMp = idMp;
        this.nom = nom;
        this.dateLimite = dateLimite;
        this.idPret = idPret;
        this.datePret = datePret;
        this.montant = montant;
        this.interet = interet;
        this.reste = reste;
    }

    public PretAll() {
    }

    
    
    public int getIdMp() {
        return idMp;
    }

    public void setIdMp(int idMp) {
        this.idMp = idMp;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Timestamp getDateLimite() {
        return dateLimite;
    }

    public void setDateLimite(Timestamp dateLimite) {
        this.dateLimite = dateLimite;
    }

    public int getIdPret() {
        return idPret;
    }

    public void setIdPret(int idPret) {
        this.idPret = idPret;
    }

    public Timestamp getDatePret() {
        return datePret;
    }

    public void setDatePret(Timestamp datePret) {
        this.datePret = datePret;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public double getInteret() {
        return interet;
    }

    public void setInteret(double interet) {
        this.interet = interet;
    }

    public double getReste() {
        return reste;
    }

    public void setReste(double reste) {
        this.reste = reste;
    }
    
    
}
