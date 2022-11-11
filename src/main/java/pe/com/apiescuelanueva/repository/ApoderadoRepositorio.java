
package pe.com.apiescuelanueva.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.apiescuelanueva.entity.Apoderado;


public interface ApoderadoRepositorio extends JpaRepository<Apoderado, Long>{
    
    @Query("select a from Apoderado a where a.estado=1")
    List<Apoderado> findAllCustom();
    
}
