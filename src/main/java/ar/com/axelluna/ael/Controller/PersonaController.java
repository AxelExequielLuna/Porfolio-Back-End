/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.axelluna.ael.Controller;

import ar.com.axelluna.ael.Entity.Persona;
import ar.com.axelluna.ael.Interface.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Axel Exequiel Luna
 */

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PersonaController {
    @Autowired IPersonaService ipersonaService;
    
    @GetMapping("/api/personas/traer/")
    public List<Persona> getPersona(){
        return ipersonaService.getPersona();
    }
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/api/personas/crear")
    public String createPersona(@RequestBody Persona persona){
        ipersonaService.savePersona(persona);
        return "Persona Agregada Correctamente";
    }
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/api/personas/borrar/{id}")
    public String deletePersona(@PathVariable Long id){
        ipersonaService.deletePersona(id);
        return "Persona Borrada";
    }
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/api/personas/editar/{id}")
    public Persona editPersona(@PathVariable Long id,
                               @RequestParam("nombre") String nuevoNombre,
                               @RequestParam("apellido") String nuevoApellido,
                               @RequestParam("titulo") String nuevoTitulo,
                               @RequestParam("about") String nuevoAbout,
                               @RequestParam("img") String nuevoImg,
                                @RequestParam("portada") String nuevoPortada){
        Persona persona = ipersonaService.findPersona(id);
        persona.setNombre(nuevoNombre);
        persona.setApellido(nuevoApellido);
        persona.setImg(nuevoImg);
        persona.setTitulo(nuevoTitulo);
        persona.setAbout(nuevoAbout);
        persona.setPortada(nuevoPortada);
        ipersonaService.savePersona(persona);
        return persona;
    }
    @GetMapping("/api/personas/traer/perfil")
    public Persona findPersona(){
        return ipersonaService.findPersona((long)1);
    }
}
