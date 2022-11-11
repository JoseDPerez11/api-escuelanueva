
package pe.com.apiescuelanueva.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.apiescuelanueva.services.ApoderadoServicio;
import pe.com.apiescuelanueva.entity.Apoderado;

@RestController
@RequestMapping("/apoderado")
public class ApoderadoController {
    
    @Autowired
    private ApoderadoServicio apoderadoServicio;
    
    @GetMapping
    public List<Apoderado> findAll() {
        return apoderadoServicio.findAll();
    }
    
    @GetMapping("/custom")
    public List<Apoderado> findAllCustom() {
        return apoderadoServicio.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<Apoderado> findById(@PathVariable Long id) {
        return apoderadoServicio.findById(id);
    }
    
    @PostMapping
    public Apoderado add(@RequestBody Apoderado apoderado) {
        return apoderadoServicio.add(apoderado);
    }
    
    @PutMapping
        ("/{id}")
    public Apoderado update(@PathVariable Long id, @RequestBody Apoderado apoderado) {
        apoderado.setCodigo(id);
        return apoderadoServicio.update(apoderado);
    }
    
    @DeleteMapping("/{id}")
    public Apoderado update(@PathVariable Long id) {
        Apoderado objapoderado = new Apoderado();
        objapoderado.setEstado(false);
        return apoderadoServicio.delete(Apoderado.builder().codigo(id).build());
    }
    
}
