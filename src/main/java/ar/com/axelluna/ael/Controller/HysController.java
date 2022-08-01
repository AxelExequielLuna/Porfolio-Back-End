/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.axelluna.ael.Controller;

/**
 *
 * @author axeleif
 */
import ar.com.axelluna.ael.Dto.dtoHys;
import ar.com.axelluna.ael.Entity.Hys;
import ar.com.axelluna.ael.Security.Controller.Mensaje;
import ar.com.axelluna.ael.Service.ImpHysService;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/hys")
@CrossOrigin(origins = "https://axel-luna.com.ar")
public class HysController {
    @Autowired
    ImpHysService sHys;
    
    @GetMapping("/lista")
    public ResponseEntity<List<Hys>> list(){
        List<Hys> list = sHys.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<Hys> getById(@PathVariable("id") long id){
        if(!sHys.existsById(id))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        Hys hys = sHys.getOne(id).get();
        return new ResponseEntity(hys, HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") long id) {
        if (!sHys.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        sHys.delete(id);
        return new ResponseEntity(new Mensaje("eliminado"), HttpStatus.OK);
    }

    
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoHys dtohys){      
        if(StringUtils.isBlank(dtohys.getPorcentaje()))
            return new ResponseEntity(new Mensaje("El porcentaje es obligatorio"), HttpStatus.BAD_REQUEST);
        
        Hys hys = new Hys(
                dtohys.getPorcentaje(), 
                dtohys.getImage(), 
                dtohys.isShowImage(),
                dtohys.getHeight(),
                dtohys.getWidth(),
                dtohys.isShowTitle(),
                dtohys.getTitle(),
                dtohys.getFontSize()
        );
        sHys.save(hys);
        
        return new ResponseEntity(new Mensaje("HYS agregada"), HttpStatus.OK);
    }
    
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") long id, @RequestBody dtoHys dtohys){
        //Validamos si existe el ID
        if(!sHys.existsById(id))
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
        //No puede estar vacio
        if(StringUtils.isBlank(dtohys.getPorcentaje()))
            return new ResponseEntity(new Mensaje("El porcentaje es obligatorio"), HttpStatus.BAD_REQUEST);
        
        Hys hys = sHys.getOne(id).get();
        hys.setPorcentaje(dtohys.getPorcentaje());
        hys.setImage(dtohys.getImage());
        hys.setShowImage(dtohys.isShowImage());
        hys.setHeight(dtohys.getHeight());
        hys.setWidth(dtohys.getWidth());
        hys.setShowTitle(dtohys.isShowTitle());
        hys.setTitle(dtohys.getTitle());
        hys.setFontSize(dtohys.getFontSize());
        
        sHys.save(hys);
        return new ResponseEntity(new Mensaje("Hys actualizada"), HttpStatus.OK);
             
    }
}