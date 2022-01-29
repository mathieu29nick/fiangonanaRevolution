/*
 * To change this license header; choose License Headers in Project Properties.
 * To change this template file; choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author P13A-97-SOATOAVINA
 */
public class Fiangonana {
    int id ;
	String nom;
	int idSinodaParitany;
    public void setId(int id) {
        this.id = id;
    }
    public void setIdSinodaParitany(int idSinodaParitany) {
        this.idSinodaParitany = idSinodaParitany;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public int getId() {
        return id;
    }
    public int getIdSinodaParitany() {
        return idSinodaParitany;
    }
    public String getNom() {
        return nom;
    }
    public Fiangonana(int i,String n,int s)
    {
        id=i;
        nom=n;
        idSinodaParitany=s;
    }
    public Fiangonana()
    {
        
    }
}
