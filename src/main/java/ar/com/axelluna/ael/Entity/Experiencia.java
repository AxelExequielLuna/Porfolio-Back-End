/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.axelluna.ael.Entity;


/**
 *
 * @author Axel Exequiel Luna
 */


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreEx;
    private String fechaEx;
    private String descripcionEx;
    
    //Constructores

    public Experiencia() {
    }

    public Experiencia(String nombreEx, String descripcionEx, String fechaEx) {
        this.nombreEx = nombreEx;
        this.fechaEx = fechaEx;
        this.descripcionEx = descripcionEx;
    }
    
    //Getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreEx() {
        return nombreEx;
    }

    public void setNombreEx(String nombreEx) {
        this.nombreEx = nombreEx;
    }

    public String getDescripcionEx() {
        return descripcionEx;
    }

    public void setDescripcionEx(String descripcionEx) {
        this.descripcionEx = descripcionEx;
    }
    
    public void setFechaEx(String fechaEx){
        this.fechaEx = fechaEx;
    }
    
    public String getFechaEx(){
        return fechaEx;
    }
    
}