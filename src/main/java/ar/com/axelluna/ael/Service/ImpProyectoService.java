/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.axelluna.ael.Service;

/**
 *
 * @author axeleif
 */
import ar.com.axelluna.ael.Entity.Proyecto;
import ar.com.axelluna.ael.Repository.IProyectosRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ImpProyectoService {
     @Autowired
     IProyectosRepository irProyecto;
     
     public List<Proyecto> list(){
         return irProyecto.findAll();
     }
     
     public Optional<Proyecto> getOne(int id){
         return irProyecto.findById(id);
     }
     
     public Optional<Proyecto> getByNombreP(String nombreP){
         return irProyecto.findByNombreP(nombreP);
     }
     
     public void save(Proyecto pro){
         irProyecto.save(pro);
     }
     
     public void delete(int id){
         irProyecto.deleteById(id);
     }
     
     public boolean existsById(int id){
         return irProyecto.existsById(id);
     }
     
     public boolean existsByNombreP(String nombreP){
         return irProyecto.existsByNombreP(nombreP);
     }
}