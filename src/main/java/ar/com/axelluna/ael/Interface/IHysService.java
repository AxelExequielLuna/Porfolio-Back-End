/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ar.com.axelluna.ael.Interface;

import ar.com.axelluna.ael.Entity.Hys;

import java.util.List;
/**
 *
 * @author Axel Exequiel Luna
 */
public interface IHysService {
    //Traer
    public List<Hys> getHys();
    
    //guardar
    
    public void saveHys(Hys hys);
            
    //borrar
    public void deleteHys(Long id);
    
    //buscar
    public Hys findHys(Long id);
}
