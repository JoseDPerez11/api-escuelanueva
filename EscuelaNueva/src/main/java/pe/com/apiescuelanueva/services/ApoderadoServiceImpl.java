
package pe.com.apiescuelanueva.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.apiescuelanueva.entity.Apoderado;
import pe.com.apiescuelanueva.repository.ApoderadoRepositorio;

@Service
public class ApoderadoServiceImpl implements ApoderadoServicio{
    
    @Autowired
    private ApoderadoRepositorio apoderadoRepositorio;

    @Override
    public List<Apoderado> findAll() {
        return apoderadoRepositorio.findAll();
    }

    @Override
    public List<Apoderado> findAllCustom() {
        return apoderadoRepositorio.findAllCustom();
    }

    @Override
    public Optional<Apoderado> findById(Long id) {
        return apoderadoRepositorio.findById(id);
    }

    @Override
    public Apoderado add(Apoderado apoderado) {
        return apoderadoRepositorio.save(apoderado);
    }

    @Override
    public Apoderado update(Apoderado apoderado) {
        Apoderado objApoderado = apoderadoRepositorio.getById(apoderado.getCodigo());
        BeanUtils.copyProperties(apoderado, objApoderado);
        return apoderadoRepositorio.save(objApoderado); 
    }

    @Override
    public Apoderado delete(Apoderado apoderado) {
        Apoderado objApoderado = apoderadoRepositorio.getById(apoderado.getCodigo());
        objApoderado.setEstado(false);
        return apoderadoRepositorio.save(objApoderado);
    }
    
}
