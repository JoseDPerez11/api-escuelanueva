
package pe.com.apiescuelanueva.services;

import java.util.List;
import java.util.Optional;
import pe.com.apiescuelanueva.entity.Apoderado;

public interface ApoderadoServicio {
    
    public List<Apoderado> findAll();
    
    public List<Apoderado> findAllCustom();
    
    public Optional<Apoderado> findById(Long id);
    
    public Apoderado add(Apoderado apoderado);
    
    public Apoderado update(Apoderado apoderado);
    
    public Apoderado delete(Apoderado apoderado);
}
