
package pe.com.apiescuelanueva.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.apiescuelanueva.entity.Distrito;
import pe.com.apiescuelanueva.repository.DistritoRepositorio;


@Service
public class DistritoServiceImpl implements DistritoServicio{
    
    @Autowired
    private DistritoRepositorio distritoRepositorio;

    @Override
    public List<Distrito> findAll() {
        return distritoRepositorio.findAll();
    }

    @Override
    public List<Distrito> findAllCustom() {
        return distritoRepositorio.findAllCustom();
    }

    @Override
    public Optional<Distrito> findById(Long id) {
        return distritoRepositorio.findById(id);
    }

    @Override
    public Distrito add(Distrito distrito) {
        return distritoRepositorio.save(distrito);
    }

    @Override
    public Distrito update(Distrito distrito) {
        Distrito objDistrito = distritoRepositorio.getById(distrito.getCodigo());
        BeanUtils.copyProperties(distrito, objDistrito);
        return distritoRepositorio.save(objDistrito);
    }

    @Override
    public Distrito delete(Distrito distrito) {
        Distrito objDistrito = distritoRepositorio.getById(distrito.getCodigo());
        objDistrito.setEstado(false);
        return distritoRepositorio.save(objDistrito);
    }
    
}
