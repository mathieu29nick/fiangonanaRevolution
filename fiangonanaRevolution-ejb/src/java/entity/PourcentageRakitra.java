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
public class PourcentageRakitra {
    int id  ;
	double pourcentage ;
	int idFiangonana ;
	Timestamp date1 ;
	Timestamp date2;
    public void setDate1(Timestamp date1) {
        this.date1 = date1;
    }
    public void setDate2(Timestamp date2) {
        this.date2 = date2;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setIdFiangonana(int idFiangonana) {
        this.idFiangonana = idFiangonana;
    }
    public void setPourcentage(double pourcentage) {
        this.pourcentage = pourcentage;
    }
    public Timestamp getDate1() {
        return date1;
    }
    public Timestamp getDate2() {
        return date2;
    }
    public int getId() {
        return id;
    }
    public int getIdFiangonana() {
        return idFiangonana;
    }
    public double getPourcentage() {
        return pourcentage;
    }
    public PourcentageRakitra(int i,double p,int f,Timestamp d1,Timestamp d2)
    {
        id=i;
        pourcentage=p;
        idFiangonana=f;
        date1=d1;
        date2=d2;
    }
}
