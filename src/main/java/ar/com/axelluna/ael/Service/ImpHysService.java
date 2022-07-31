/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.axelluna.ael.Service;

/**
 *
 * @author axeleif
 */

import ar.com.axelluna.ael.Entity.Hys;
import ar.com.axelluna.ael.Repository.IHysRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ImpHysService {
     @Autowired
     IHysRepository irHys;
     
     public List<Hys> list(){
         return irHys.findAll();
     }
     
     public Optional<Hys> getOne(long id){
         return irHys.findById(id);
     }
     
     public void save(Hys hys){
         irHys.save(hys);
     }
     
     public void delete(long id){
         irHys.deleteById(id);
     }
     
     public boolean existsById(long id){
         return irHys.existsById(id);
     }
}
