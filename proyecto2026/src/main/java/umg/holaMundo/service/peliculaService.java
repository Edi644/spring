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

import umg.holaMundo.entity.cliente;
import umg.holaMundo.entity.pelicula;
import umg.holaMundo.repository.clienteRepository;
import umg.holaMundo.repository.peliculaRepository;

@RestController
@RequestMapping("/pelicula")
@CrossOrigin

public class peliculaService {


    @Autowired
    peliculaRepository cr;

    @GetMapping(path = "/buscar")
    public List<pelicula> buscarPelicula() {
        return cr.findAll();
    }

    @PostMapping(path = "/guardar")
    public pelicula guardarPelicula(@RequestBody pelicula c) {
        return cr.save(c);
    }

    @DeleteMapping(path = "/eliminar/{idpelicula}")
    public void eliminarPelicula(@PathVariable("idpelicula") int idpelicula) {
        cr.deleteById(idpelicula);
    }
}