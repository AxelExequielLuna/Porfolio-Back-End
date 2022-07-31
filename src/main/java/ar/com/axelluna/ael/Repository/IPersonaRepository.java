/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ar.com.axelluna.ael.Repository;

import ar.com.axelluna.ael.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Axel Exequiel Luna
 */
@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Long>{
    
}
