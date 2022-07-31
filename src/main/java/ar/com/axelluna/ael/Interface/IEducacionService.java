/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ar.com.axelluna.ael.Interface;
import ar.com.axelluna.ael.Entity.Educacion;
import java.util.List;


/**
 *
 * @author axeleif
 */

public interface IEducacionService {
    //Traer
    public List<Educacion> getEducacion();
    
    //guardar
    
    public void saveEducacion(Educacion educacion);
            
    //borrar
    public void deleteEducacion(Long id);
    
    //buscar
    public Educacion findEducacion(Long id);
}
