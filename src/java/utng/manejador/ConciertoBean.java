/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.manejador;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import utng.datos.ConciertoDAO;
import utng.modelo.Concierto;
/**
 *
 * @author felip
 */
@ManagedBean
@SessionScoped
public class ConciertoBean implements Serializable{
    
    private List<Concierto> conciertos;
    private Concierto concierto;
    
    public ConciertoBean(){
    }

    public List<Concierto> getConciertos() {
        return conciertos;
    }

    public void setConciertos(List<Concierto> conciertos) {
        this.conciertos = conciertos;
    }

    public Concierto getConcierto() {
        return concierto;
    }

    public void setConcierto(Concierto concierto) {
        this.concierto = concierto;
    }
    public String listar() {
        ConciertoDAO dao = new ConciertoDAO();
        try {
            conciertos = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Conciertos";
    }

    public String eliminar() {
        ConciertoDAO dao = new ConciertoDAO();
        try {
            dao.delete(concierto);
            conciertos = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Eliminar";
    }

    public String iniciar() {
        concierto = new Concierto();
        return "Iniciar";
    }

    public String guardar() {
        ConciertoDAO dao = new ConciertoDAO();
        try {
            if (concierto.getIdConcierto()!= 0) {
                dao.update(concierto);
            } else {
                dao.insert(concierto);
            }
            conciertos = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Guardar";
    }

    public String cancelar() {
        return "Cancelar";
    }

    public String editar(Concierto concierto) {
        this.concierto = concierto;
        return "Editar";
    }
}
