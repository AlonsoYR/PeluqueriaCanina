package com.mycompany.peluqueriacanina.persistencia;

import com.mycompany.peluqueriacanina.logica.Dueno;
import com.mycompany.peluqueriacanina.logica.Mascota;
import com.mycompany.peluqueriacanina.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControlPersis {
    DuenoJpaController dueJPA = new DuenoJpaController();
    MascotaJpaController masJPA = new MascotaJpaController();

    public void guardar(Dueno due, Mascota mas) {
        //Creacion de Dueño y Mascota
        dueJPA.create(due);
        masJPA.create(mas);
               
    }

    public List<Mascota> readMas() {
        return masJPA.findMascotaEntities();
    }

    public void delete(int m_num) {
        try {
            masJPA.destroy(m_num);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControlPersis.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Mascota traeMas(int m_num) {
        return masJPA.findMascota(m_num);
    }

    public void editMas(Mascota mas) {
        try {
            masJPA.edit(mas);
        } catch (Exception ex) {
            Logger.getLogger(ControlPersis.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Dueno traDue(int d_id) {
        return dueJPA.findDueno(d_id);
    }

    public void ediDue(Dueno due) {
        try {
            dueJPA.edit(due);
        } catch (Exception ex) {
            Logger.getLogger(ControlPersis.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
}
