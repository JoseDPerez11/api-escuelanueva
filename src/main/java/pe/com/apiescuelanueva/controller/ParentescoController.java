
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
import pe.com.apiescuelanueva.services.ParentescoServicio;
import pe.com.apiescuelanueva.entity.Parentesco;

@RestController
@RequestMapping("/parentesco")
public class ParentescoController {
    
    @Autowired
    private ParentescoServicio parentescoServicio;
    
    @GetMapping
    public List<Parentesco> findAll() {
        return parentescoServicio.findAll();
    }
    
    @GetMapping("/custom")
    public List<Parentesco> findAllCustom() {
        return parentescoServicio.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<Parentesco> findById(@PathVariable Long id) {
        return parentescoServicio.findById(id);
    }
    
    @PostMapping
    public Parentesco add(@RequestBody Parentesco parentesco) {
        return parentescoServicio.add(parentesco);
    }
    
    @PutMapping("/{id}")
    public Parentesco update(@PathVariable Long id, @RequestBody Parentesco parentesco) {
        parentesco.setCodigo(id);
        return parentescoServicio.update(parentesco);
    }
    
    @DeleteMapping("/{id}")
    public Parentesco delete(@PathVariable Long id) {
        Parentesco objparentesco = new Parentesco();
        objparentesco.setEstado(false);
        return parentescoServicio.delete(Parentesco.builder().codigo(id).build());
    }
}
