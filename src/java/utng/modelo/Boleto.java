/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author felip
 */
@Entity
@Table (name="boleto")
public class Boleto implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_boleto")
    private Long idBoleto;
    @Column(name = "entrada", length = 120)
    private String entrada;
    @Column(name = "asiento", length = 120)
    private String asiento;
    @Column(name = "preferencia", length = 120)
    private String preferencia;
    @ManyToOne//(cascade = CascadeType.REMOVE)
    @JoinColumn(name="id_fan")
    private Fan fan;
    @ManyToOne//(cascade = CascadeType.REMOVE)
    @JoinColumn(name="id_concierto")
    private Concierto concierto;

    public Boleto(Long idBoleto, String entrada, String asiento, String preferencia, Fan fan, Concierto concierto) {
        super();
        this.idBoleto = idBoleto;
        this.entrada = entrada;
        this.asiento = asiento;
        this.preferencia = preferencia;
        this.fan = fan;
        this.concierto = concierto;
    }
    
    public Boleto (){
        this.idBoleto=0L;
    }

    public Long getIdBoleto() {
        return idBoleto;
    }

    public void setIdBoleto(Long idBoleto) {
        this.idBoleto = idBoleto;
    }

    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }

    public String getPreferencia() {
        return preferencia;
    }

    public void setPreferencia(String preferencia) {
        this.preferencia = preferencia;
    }

    public Fan getFan() {
        return fan;
    }

    public void setFan(Fan fan) {
        this.fan = fan;
    }

    public Concierto getConcierto() {
        return concierto;
    }

    public void setConcierto(Concierto concierto) {
        this.concierto = concierto;
    }
}
