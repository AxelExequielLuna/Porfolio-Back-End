/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ar.com.axelluna.ael.Interface;

import ar.com.axelluna.ael.Entity.Persona;

import java.util.List;
/**
 *
 * @author Axel Exequiel Luna
 */
public interface IPersonaService {
    //Traer
    public List<Persona> getPersona();
    
    //guardar
    
    public void savePersona(Persona persona);
            
    //borrar
    public void deletePersona(Long id);
    
    //buscar
    public Persona findPersona(Long id);
}
