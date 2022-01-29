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
public class SinodamParitany {
    int id;
    String nom;
   public void setId(int id) {
       this.id = id;
   }
   public void setNom(String nom) {
       this.nom = nom;
   }
   public int getId() {
       return id;
   }
   public String getNom() {
       return nom;
   }
   public SinodamParitany(int i,String n)
   {
       id=i;
       nom=n;
   }
   public SinodamParitany()
   {

   }
}
