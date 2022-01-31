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
public class Rakitra {
         int id  ;
	 int idFiangonana ;
	 double montant ;
	 int semaine ;
	 int annee ;
     public void setAnnee(int annee) {
         this.annee = annee;
     }
     public void setId(int id) {
         this.id = id;
     }
     public void setIdFiangonana(int idFiangonana) {
         this.idFiangonana = idFiangonana;
     }
     public void setMontant(double montant) {
         this.montant = montant;
     }
     public void setSemaine(int semaine) {
         this.semaine = semaine;
     }
     public int getAnnee() {
         return annee;
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
     public int getSemaine() {
         return semaine;
     }
     public Rakitra(int i,int f,double m,int s,int a)
     {
         id=i;
         idFiangonana=f;
         montant=m;
         semaine=s;
         annee=a;
     }
     public Rakitra()
     {

     }
}
