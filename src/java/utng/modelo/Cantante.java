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
@Table(name="cantante")
public class Cantante implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_cantante")
    private Long idCantante;
    @Column(name="nombre",length = 150)
    private String nombre;
    @Column (name="nacionalidad",length=150)
    private String nacionalidad;
    @Column (name="origen",length=50)
    private String origen;
    
    public Cantante(){
        this.idCantante=0L;
    }

    public Long getIdCantante() {
        return idCantante;
    }

    public void setIdCantante(Long idCantante) {
        this.idCantante = idCantante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }
    
    
}
