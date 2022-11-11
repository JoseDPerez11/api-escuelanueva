
package pe.com.apiescuelanueva.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.apiescuelanueva.entity.Parentesco;
import pe.com.apiescuelanueva.repository.ParentescoRepositorio;


@Service //define la clase como servicio
public class ParentescoServiceImpl implements ParentescoServicio{
    
    @Autowired
    private ParentescoRepositorio parentescoRepositorio;

    @Override
    public List<Parentesco> findAll() {
        return parentescoRepositorio.findAll();
    }
    
    @Override
    public List<Parentesco> findAllCustom() {
        return parentescoRepositorio.findAllCustom();
    }

    @Override
    public Optional<Parentesco> findById(Long id) {
        return parentescoRepositorio.findById(id);
    }

    @Override
    public Parentesco add(Parentesco parentesco) {
        return parentescoRepositorio.save(parentesco);
    }

    @Override
    public Parentesco update(Parentesco parentesco) {
        Parentesco objParentesco = parentescoRepositorio.getById(parentesco.getCodigo());
        BeanUtils.copyProperties(parentesco, objParentesco);
        return parentescoRepositorio.save(objParentesco);
    }

    @Override
    public Parentesco delete(Parentesco parentesco) {
        Parentesco objParentesco = parentescoRepositorio.getById(parentesco.getCodigo());
        objParentesco.setEstado(false);
        return parentescoRepositorio.save(objParentesco);
    }

    
    
}
