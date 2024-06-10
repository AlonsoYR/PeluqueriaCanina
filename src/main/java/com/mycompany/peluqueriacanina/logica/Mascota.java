package com.mycompany.peluqueriacanina.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Mascota implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int m_numc;
    
    private String m_nom;
    private String m_raz;
    private String m_col;
    private String m_ale;
    private String m_aes;
    private String m_obs;
    
    @OneToOne
    private Dueno due;

    public Mascota() {
    }

    public Mascota(int m_numc, String m_nom, String m_raz, String m_col, String m_ale, String m_aes, String m_obs, Dueno due) {
        this.m_numc = m_numc;
        this.m_nom = m_nom;
        this.m_raz = m_raz;
        this.m_col = m_col;
        this.m_ale = m_ale;
        this.m_aes = m_aes;
        this.m_obs = m_obs;
        this.due = due;
    }

    public int getM_numc() {
        return m_numc;
    }

    public void setM_numc(int m_numc) {
        this.m_numc = m_numc;
    }

    public String getM_nom() {
        return m_nom;
    }

    public void setM_nom(String m_nom) {
        this.m_nom = m_nom;
    }

    public String getM_raz() {
        return m_raz;
    }

    public void setM_raz(String m_raz) {
        this.m_raz = m_raz;
    }

    public String getM_col() {
        return m_col;
    }

    public void setM_col(String m_col) {
        this.m_col = m_col;
    }

    public String getM_ale() {
        return m_ale;
    }

    public void setM_ale(String m_ale) {
        this.m_ale = m_ale;
    }

    public String getM_aes() {
        return m_aes;
    }

    public void setM_aes(String m_aes) {
        this.m_aes = m_aes;
    }

    public String getM_obs() {
        return m_obs;
    }

    public void setM_obs(String m_obs) {
        this.m_obs = m_obs;
    }

    public Dueno getDue() {
        return due;
    }

    public void setDue(Dueno due) {
        this.due = due;
    }
    
    
    
}
