/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.axelluna.ael.Service;

/**
 *
 * @author axeleif
 */
import ar.com.axelluna.ael.Entity.Educacion;
import ar.com.axelluna.ael.Repository.IEducacionRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional

//Implementamos Educacion

public class ImpEducacionService {
     @Autowired
     IEducacionRepository irEducacion;
     
     public List<Educacion> list(){
         return irEducacion.findAll();
     }
     
     public Optional<Educacion> getOne(int id){
         return irEducacion.findById(id);
     }
     
     public Optional<Educacion> getByNombreEdu(String nombreEdu){
         return irEducacion.findByNombreEdu(nombreEdu);
     }
     
     public void save(Educacion educ){
         irEducacion.save(educ);
     }
     
     public void delete(int id){
         irEducacion.deleteById(id);
     }
     
     public boolean existsById(int id){
         return irEducacion.existsById(id);
     }
     
     public boolean existsByNombreEdu(String nombreEdu){
         return irEducacion.existsByNombreEdu(nombreEdu);
     }
}
