package entity;
public class Famille {
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
    public Famille(int i,String n)
    {
        id=i;
        nom=n;
    }
    public Famille()
    {

    }
}
