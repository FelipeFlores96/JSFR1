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
import utng.datos.FanDAO;
import utng.modelo.Fan;

/**
 *
 * @author felip
 */
@ManagedBean
@SessionScoped
public class FanBean implements Serializable{
    
    private List<Fan> fans;
    private Fan fan;
    
    public FanBean(){
    }

    public List<Fan> getFans() {
        return fans;
    }

    public void setFanes(List<Fan> fans) {
        this.fans = fans;
    }

    public Fan getFan() {
        return fan;
    }

    public void setFan(Fan fan) {
        this.fan = fan;
    }
    
    public String listar() {
        FanDAO dao = new FanDAO();
        try {
            fans = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Fans";
    }

    public String eliminar() {
        FanDAO dao = new FanDAO();
        try {
            dao.delete(fan);
            fans = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Eliminar";
    }

    public String iniciar() {
        fan = new Fan();
        return "Iniciar";
    }

    public String guardar() {
        FanDAO dao = new FanDAO();
        try {
            if (fan.getIdFan()!= 0) {
                dao.update(fan);
            } else {
                dao.insert(fan);
            }
            fans = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Guardar";
    }

    public String cancelar() {
        return "Cancelar";
    }

    public String editar(Fan fan) {
        this.fan = fan;
        return "Editar";
    }
}
