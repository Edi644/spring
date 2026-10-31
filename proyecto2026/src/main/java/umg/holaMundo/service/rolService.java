package umg.holaMundo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import umg.holaMundo.entity.rol;
import umg.holaMundo.repository.rolRepository;

@RestController
@RequestMapping("/rol")
@CrossOrigin
public class rolService {

    @Autowired
    rolRepository rr;

    @GetMapping(path = "/buscar")
    public List<rol> buscarRol() {
        return rr.findAll();
    }

    @PostMapping(path = "/guardar")
    public rol guardarRol(@RequestBody rol r) {
        return rr.save(r);
    }

    @DeleteMapping(path = "/eliminar/{idrol}")
    public void eliminarRol(@PathVariable("idrol") int idrol) {
        rr.deleteById(idrol);
    }
}