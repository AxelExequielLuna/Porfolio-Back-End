/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.axelluna.ael.Service;
/**
 *
 * @author Axel Exequiel Luna
 */

import ar.com.axelluna.ael.Entity.Experiencia;
import ar.com.axelluna.ael.Repository.IExperienciaRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ImpExperienciaService {
     @Autowired
     IExperienciaRepository irExperiencia;
     
     public List<Experiencia> list(){
         return irExperiencia.findAll();
     }
     
     public Optional<Experiencia> getOne(int id){
         return irExperiencia.findById(id);
     }
     
     public Optional<Experiencia> getByNombreEx(String nombreEx){
         return irExperiencia.findByNombreEx(nombreEx);
     }
     
     public void save(Experiencia expe){
         irExperiencia.save(expe);
     }
     
     public void delete(int id){
         irExperiencia.deleteById(id);
     }
     
     public boolean existsById(int id){
         return irExperiencia.existsById(id);
     }
     
     public boolean existsByNombreEx(String nombreEx){
         return irExperiencia.existsByNombreEx(nombreEx);
     }
}
