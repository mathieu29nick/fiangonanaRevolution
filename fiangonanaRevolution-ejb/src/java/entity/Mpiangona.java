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
public class Mpiangona {
    int id;
    String nom;
    String mdp;
    int idFiangonana;
    int idFamille;
    public void setIdFamille(int i)
    {
        idFamille=i;
    }
    public int getIdFamille()
    {
        return idFamille;
    }
    public void setIdFiangonana(int i)
    {
        idFiangonana=i;
    }
    public void setId(int i)
    {
        id=i;
    }
    public void setMdp(String mdp) {
        this.mdp = mdp;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public int getIdFiangonana() {
        return idFiangonana;
    }
    public int getId() {
        return id;
    }
    public String getNom() {
        return nom;
    }
    public String getMdp() {
        return mdp;
    }
    public Mpiangona(int i,String n,String m,int f,int fa)
    {
        id=i;
        nom=n;
        mdp=m;
        idFiangonana=f;
        idFamille=fa;
    }
    public Mpiangona()
    {
        
    }
}
