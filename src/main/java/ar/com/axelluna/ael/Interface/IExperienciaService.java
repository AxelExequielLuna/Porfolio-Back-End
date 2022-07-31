/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ar.com.axelluna.ael.Interface;

import ar.com.axelluna.ael.Entity.Experiencia;

import java.util.List;
/**
 *
 * @author Axel Exequiel Luna
 */
public interface IExperienciaService {
    //Traer
    public List<Experiencia> getExperiencia();
    
    //guardar
    
    public void saveExperiencia(Experiencia experiencia);
            
    //borrar
    public void deleteExperiencia(Long id);
    
    //buscar
    public Experiencia findExperiencia(Long id);
}
