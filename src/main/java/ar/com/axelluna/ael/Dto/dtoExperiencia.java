/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.axelluna.ael.Dto;
import javax.validation.constraints.NotBlank;
/**
 *
 * @author axeleif
 */


public class dtoExperiencia {
    @NotBlank
    private String nombreEx;
    @NotBlank
    private String descripcionEx;
    @NotBlank
    private String fechaEx;
    
    //Constructores

    public dtoExperiencia() {
    }

    public dtoExperiencia(String nombreEx, String descripcionEx, String fechaEx) {
        this.nombreEx = nombreEx;
        this.descripcionEx = descripcionEx;
        this.fechaEx = fechaEx;
    }
    //Getters & Setters

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
    
    public String getFechaEx(){
        return fechaEx;
    }
    
    public void setFechaEx(String fechaEx){
        this.fechaEx = fechaEx;
    }
    
}