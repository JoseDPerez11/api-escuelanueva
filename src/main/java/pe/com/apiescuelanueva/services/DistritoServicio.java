
package pe.com.apiescuelanueva.services;

import java.util.List;
import java.util.Optional;
import pe.com.apiescuelanueva.entity.Distrito;

public interface DistritoServicio {
    
    List<Distrito> findAll();
    
    List<Distrito> findAllCustom();
    
    Optional<Distrito> findById(Long id);
    
    Distrito add(Distrito distrito);
    
    Distrito update(Distrito distrito);
    
    Distrito delete(Distrito distrito);
    
}
