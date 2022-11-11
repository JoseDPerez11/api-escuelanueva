
package pe.com.apiescuelanueva.services;

import java.util.List;
import java.util.Optional;
import pe.com.apiescuelanueva.entity.Parentesco;

public interface ParentescoServicio {
    
    List<Parentesco> findAll();
    
    List<Parentesco> findAllCustom();
    
    Optional<Parentesco> findById(Long id);
    
    Parentesco add(Parentesco parentesco);
    
    Parentesco update(Parentesco parentesco);
    
    Parentesco delete(Parentesco parentesco);
}
