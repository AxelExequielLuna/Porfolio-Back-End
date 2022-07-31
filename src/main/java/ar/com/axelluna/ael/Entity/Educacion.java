/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.axelluna.ael.Entity;

/**
 *
 * @author axeleif
 */

//importacion de las librerias
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Educacion {
    
    //declaramos la entidad
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreEdu;
    private String fechaEdu;
    private String descripcionEdu;
    
    //Constructores

    public Educacion() {
    }

    public Educacion(String nombreEdu, String descripcionEdu, String fechaEdu) {
        this.nombreEdu = nombreEdu;
        this.fechaEdu = fechaEdu;
        this.descripcionEdu = descripcionEdu;
    }
    
    //Getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreEdu() {
        return nombreEdu;
    }

    public void setNombreEdu(String nombreEdu) {
        this.nombreEdu = nombreEdu;
    }

    public String getDescripcionEdu() {
        return descripcionEdu;
    }

    public void setDescripcionEdu(String descripcionEdu) {
        this.descripcionEdu = descripcionEdu;
    }
    
    public void setFechaEdu(String fechaEdu){
        this.fechaEdu = fechaEdu;
    }
    
    public String getFechaEdu(){
        return fechaEdu;
    }
    
}