/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.apiescuelanueva.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.apiescuelanueva.entity.Distrito;


public interface DistritoRepositorio extends JpaRepository<Distrito, Long>{
    
    @Query("select d from Distrito d where d.estado=1")
    List<Distrito> findAllCustom();
}
