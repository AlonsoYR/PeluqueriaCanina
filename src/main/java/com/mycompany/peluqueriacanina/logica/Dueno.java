package com.mycompany.peluqueriacanina.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Dueno implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)    
    private int d_id;
    private String d_nom;
    private String d_cel;
    
    
    public Dueno() {
    }

    public Dueno(int d_id, String d_nom, String d_cel) {
        this.d_id = d_id;
        this.d_nom = d_nom;
        this.d_cel = d_cel;
    }

    public int getD_id() {
        return d_id;
    }

    public void setD_id(int d_id) {
        this.d_id = d_id;
    }

    public String getD_nom() {
        return d_nom;
    }

    public void setD_nom(String d_nom) {
        this.d_nom = d_nom;
    }

    public String getD_cel() {
        return d_cel;
    }

    public void setD_cel(String d_cel) {
        this.d_cel = d_cel;
    }

        
}
