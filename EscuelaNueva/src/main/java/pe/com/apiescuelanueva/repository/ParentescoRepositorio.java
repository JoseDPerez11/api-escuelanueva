/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.apiescuelanueva.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.apiescuelanueva.entity.Parentesco;


public interface ParentescoRepositorio extends JpaRepository<Parentesco, Long>{
    
    @Query("select p from Parentesco p where p.estado=1")
    List<Parentesco> findAllCustom();
    
}
