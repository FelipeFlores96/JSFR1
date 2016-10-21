/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author felip
 */
@Entity 
@Table (name="concierto")
public class Concierto implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_concierto")
    private Long idConcierto;
    @Column (name="lugar",length=120)
    private String lugar;
    @Column (name="tamano",length=120)
    private String tamano;
    @Column (name="cantante",length=120)
    private String cantante;
    
    public Concierto(){
        this.idConcierto=0L;
    }

    public Long getIdConcierto() {
        return idConcierto;
    }

    public void setIdConcierto(Long idConcierto) {
        this.idConcierto = idConcierto;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getCantante() {
        return cantante;
    }

    public void setCantante(String cantante) {
        this.cantante = cantante;
    }
    
}
