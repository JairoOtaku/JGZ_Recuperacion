package POJOS;
// Generated 23-ene-2017 14:22:55 by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;

/**
 * Electrodomestico generated by hbm2java
 */
public class Electrodomestico implements java.io.Serializable {

    private int id;
    private String nombre;
    private String caracteristica;
    //private Set aparatoelectricos = new HashSet(0);

    public Electrodomestico() {
    }

    public Electrodomestico(int id, String nombre, String caracteristica) {
        this.id = id;
        this.nombre = nombre;
        this.caracteristica = caracteristica;
    }
//    public Electrodomestico(int id, String nombre, String caracteristica, Set aparatoelectricos) {
//       this.id = id;
//       this.nombre = nombre;
//       this.caracteristica = caracteristica;
//       this.aparatoelectricos = aparatoelectricos;
//    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCaracteristica() {
        return this.caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }
//    public Set getAparatoelectricos() {
//        return this.aparatoelectricos;
//    }
//    
//    public void setAparatoelectricos(Set aparatoelectricos) {
//        this.aparatoelectricos = aparatoelectricos;
//    }

}
