package POJOS;
// Generated 23-ene-2017 14:22:55 by Hibernate Tools 4.3.1



/**
 * Fabricantes generated by hbm2java
 */
public class Fabricantes  implements java.io.Serializable {


     private int cif;
     private String domicilioSocial;

    public Fabricantes() {
    }

    public Fabricantes(int cif, String domicilioSocial) {
       this.cif = cif;
       this.domicilioSocial = domicilioSocial;
    }
   
    public int getCif() {
        return this.cif;
    }
    
    public void setCif(int cif) {
        this.cif = cif;
    }
    public String getDomicilioSocial() {
        return this.domicilioSocial;
    }
    
    public void setDomicilioSocial(String domicilioSocial) {
        this.domicilioSocial = domicilioSocial;
    }




}


