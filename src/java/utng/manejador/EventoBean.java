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
import javax.faces.context.FacesContext;
import utng.datos.CantanteDAO;
import utng.datos.EventoDAO;
import utng.modelo.Cantante;
import utng.modelo.Evento;

/**
 *
 * @author felip
 */
@ManagedBean(name = "eventoBean")
@SessionScoped
public class EventoBean implements Serializable {

    private List<Evento> eventos;
    private Evento evento;
    private List<Cantante> cantantes;

    public EventoBean() {
        evento = new Evento();
        evento.setCantante(new Cantante());
    }

    public List<Evento> getEventos() {
        return eventos;
    }

    public void setEventos(List<Evento> eventos) {
        this.eventos = eventos;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public List<Cantante> getCantantes() {
        return cantantes;
    }

    public void setCantantes(List<Cantante> cantantes) {
        this.cantantes = cantantes;
    }

    public String listar() {
        EventoDAO dao = new EventoDAO();
        try {
            eventos = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Eventos";
    }

    public String eliminar() {
        EventoDAO dao = new EventoDAO();
        try {
            dao.delete(evento);
            eventos = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Eliminar";
    }

    public String iniciar() {
        evento = new Evento();
        evento.setCantante(new Cantante());
        try {
            cantantes = new CantanteDAO().getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Iniciar";
    }

    public String guardar() {
        EventoDAO dao = new EventoDAO();
        try {
           if (evento.getIdEvento()!= 0) {
              dao.update(evento);
           } else {
                dao.insert(evento);
            }
            eventos = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Guardar";
    }

    public String cancelar() {
        return "Cancelar";
    }

    public String editar(Evento usuario) {
        this.evento = usuario;
        try {
            cantantes = new CantanteDAO().getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Editar";
    }

}
