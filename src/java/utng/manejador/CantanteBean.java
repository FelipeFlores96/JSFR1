/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.manejador;

import java.io.Serializable;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import utng.datos.CantanteDAO;
import utng.modelo.Cantante;

/**
 *
 * @author felip
 */
@ManagedBean
@SessionScoped
public class CantanteBean implements Serializable {

    private List<Cantante> cantantes;
    private Cantante cantante;

    public CantanteBean() {

    }

    public List<Cantante> getCantantes() {
        return cantantes;
    }

    public void setCantantes(List<Cantante> cantantes) {
        this.cantantes = cantantes;
    }

    public Cantante getCantante() {
        return cantante;
    }

    public void setCantante(Cantante cantante) {
        this.cantante = cantante;
    }

    public String listar() {
        CantanteDAO dao = new CantanteDAO();
        try {
            cantantes = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Cantantes";
    }

    public String eliminar() {
        CantanteDAO dao = new CantanteDAO();
        try {
            dao.delete(cantante);
            cantantes = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Eliminar";
    }

    public String iniciar() {
        cantante = new Cantante();
        return "Iniciar";
    }

    public String guardar() {
        CantanteDAO dao = new CantanteDAO();
        try {
            if (cantante.getIdCantante()!= 0) {
                dao.update(cantante);
            } else {
                dao.insert(cantante);
            }
            cantantes = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Guardar";
    }

    public String cancelar() {
        return "Cancelar";
    }

    public String editar(Cantante cantante) {
        this.cantante = cantante;
        return "Editar";
    }

}


