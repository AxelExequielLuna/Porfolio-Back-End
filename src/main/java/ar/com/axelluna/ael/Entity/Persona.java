/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.axelluna.ael.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Axel Exequiel Luna
 */
@Getter @Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Size(min = 1, max = 50,message = "Error de Longitud")
    private String nombre;
    @NotNull
    @Size(min = 1, max = 50,message = "Error de Longitud")
    private String apellido;
    @Size(min = 1, max = 50,message = "Error de Longitud")
    private String titulo;
    @Size(min = 1, max = 1500,message = "Error de Longitud")
    private String about;
    @Size(min = 1, max = 50,message = "Error de Longitud")
    private String img;
    @Size(min = 1, max = 250,message = "Error de Longitud")
    private String portada;
}