
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

import pe.com.apiescuelanueva.services.DistritoServicio;
import pe.com.apiescuelanueva.entity.Distrito;

@RestController
@RequestMapping("/distrito")
public class DistritoController {
    
    @Autowired
    private DistritoServicio distritoServicio;
    
    @GetMapping
    public List<Distrito> findAll() {
        return distritoServicio.findAll();
    }
    
    @GetMapping("/custom")
    public List<Distrito> findAllCustom() {
        return distritoServicio.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<Distrito> findById(@PathVariable Long id) {
        return distritoServicio.findById(id);
    }
    
    @PostMapping
    public Distrito add(@RequestBody Distrito distrito) {
        return distritoServicio.add(distrito);
    }
    
    @PutMapping("/{id}")
    public Distrito update(@PathVariable Long id, @RequestBody Distrito distrito) {
        distrito.setCodigo(id);
        return distritoServicio.update(distrito);
    }
    
    @DeleteMapping("/{id}")
    public Distrito delete(@PathVariable Long id) {
        Distrito objdistrito = new Distrito();
        objdistrito.setEstado(false);
        return distritoServicio.delete(Distrito.builder().codigo(id).build());
    }
}
