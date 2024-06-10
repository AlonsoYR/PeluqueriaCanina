package com.mycompany.peluqueriacanina.logica;

import com.mycompany.peluqueriacanina.persistencia.ControlPersis;
import java.util.List;

public class Control {
    ControlPersis ctrper = new ControlPersis();

    public void guardar(String m_nom, String m_raz, String m_col, String m_ale, String m_aes, String m_obs, String d_nom, String d_cel) {
        
        Dueno due = new Dueno();
        due.setD_nom(d_nom);
        due.setD_cel(d_cel);
        
        Mascota mas = new Mascota();
        mas.setM_nom(m_nom);
        mas.setM_raz(m_raz);
        mas.setM_col(m_col);
        mas.setM_obs(m_obs);
        mas.setM_ale(m_ale);
        mas.setM_aes(m_aes);
        mas.setDue(due);
        
        ctrper.guardar(due,mas);
        
    }

    public List<Mascota> readMas() {
        return ctrper.readMas();
        
    }

    public void delete(int m_num) {
        ctrper.delete(m_num);
    }

    public Mascota traeMas(int m_num) {
        return ctrper.traeMas(m_num);
    }

    public void ediMas(Mascota mas, String m_nom, String m_raz, String m_col, String m_ale, String m_aes, String m_obs, String d_nom, String d_cel) {
        mas.setM_nom(m_nom);
        mas.setM_raz(m_raz);
        mas.setM_col(m_col);
        mas.setM_obs(m_obs);
        mas.setM_aes(m_aes);
        mas.setM_ale(m_ale);
        
        ctrper.editMas(mas);
        
        Dueno due = this.busDue(mas.getDue().getD_id());
        due.setD_nom(d_nom);
        due.setD_cel(d_cel);
        
        this.ediDue(due);
    }

    private Dueno busDue(int d_id) {
        return ctrper.traDue(d_id);
    }

    private void ediDue(Dueno due) {
        ctrper.ediDue(due);
    }
}
