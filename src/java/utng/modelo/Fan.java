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
@Table(name = "fan")
public class Fan implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_fan")
    private Long idFan;
    @Column(name = "nombre", length = 120)
    private String nombreFan;
    @Column(name = "ape_pat", length = 120)
    private String apePat;
    @Column(name = "ape_mat", length = 120)
    private String apeMat;
    
    public Fan(){
        this.idFan=0L;
    }

    public Long getIdFan() {
        return idFan;
    }

    public void setIdFan(Long idFan) {
        this.idFan = idFan;
    }

    public String getNombreFan() {
        return nombreFan;
    }

    public void setNombreFan(String nombreFan) {
        this.nombreFan = nombreFan;
    }

    public String getApePat() {
        return apePat;
    }

    public void setApePat(String apePat) {
        this.apePat = apePat;
    }

    public String getApeMat() {
        return apeMat;
    }

    public void setApeMat(String apeMat) {
        this.apeMat = apeMat;
    }
    
}
