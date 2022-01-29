package entity;
public class Mpandray {
     int id;
     int idMpiangona;
     public void setId(int id) {
         this.id = id;
     }
     public int getId() {
         return id;
     }
     public int getIdMpiangona() {
         return idMpiangona;
     }
     public void setIdMpiangona(int idMpiangona) {
         this.idMpiangona = idMpiangona;
     }
     public Mpandray()
     {
         
     }
     public Mpandray(int i,int m)
     {
         id=i;
         idMpiangona=m;
     }
}
