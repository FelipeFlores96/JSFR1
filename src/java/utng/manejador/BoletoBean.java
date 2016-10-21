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
import utng.datos.FanDAO;
import utng.datos.ConciertoDAO;
import utng.datos.BoletoDAO;
import utng.modelo.Fan;
import utng.modelo.Concierto;
import utng.modelo.Boleto;

/**
 *
 * @author felip
 */
@ManagedBean(name = "boletoBean")
@SessionScoped
public class BoletoBean implements Serializable {

    private List<Boleto> boletos;
    private Boleto boleto;
    private List<Fan> fans;
    private List<Concierto> conciertos;

    public BoletoBean() {
        boleto = new Boleto();
        boleto.setConcierto(new Concierto());
        boleto.setFan(new Fan());
    }

    public List<Boleto> getBoletos() {
        return boletos;
    }

    public void setBoletos(List<Boleto> boletos) {
        this.boletos = boletos;
    }

    public Boleto getBoleto() {
        return boleto;
    }

    public void setBoleto(Boleto boleto) {
        this.boleto = boleto;
    }

    public List<Fan> getFans() {
        return fans;
    }

    public void setFans(List<Fan> fans) {
        this.fans = fans;
    }

    public List<Concierto> getConciertos() {
        return conciertos;
    }

    public void setConciertos(List<Concierto> conciertos) {
        this.conciertos = conciertos;
    }

    public String listar() {
        BoletoDAO dao = new BoletoDAO();
        try {
            boletos = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Boletos";
    }

    public String eliminar() {
        BoletoDAO dao = new BoletoDAO();
        try {
            dao.delete(boleto);
            boletos = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Eliminar";
    }

    public String iniciar() {
        boleto = new Boleto();
        boleto.setConcierto(new Concierto());
        boleto.setFan(new Fan());
        try {
            conciertos = new ConciertoDAO().getAll();
            fans = new FanDAO().getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Iniciar";
    }

    public String guardar() {
        BoletoDAO dao = new BoletoDAO();
        try {
            if (boleto.getIdBoleto()!= 0) {
                dao.update(boleto);
            } else {
                dao.insert(boleto);
            }
            boletos = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Guardar";
        
    }

    public String cancelar() {
        return "Cancelar";
    }

    public String editar(Boleto boleto) {
        this.boleto = boleto;
        try {
            conciertos = new ConciertoDAO().getAll();
            fans = new FanDAO().getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Editar";
    }
}
