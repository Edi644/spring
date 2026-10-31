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
import umg.holaMundo.entity.sala;
import umg.holaMundo.repository.clienteRepository;
import umg.holaMundo.repository.salaRepository;

@RestController
@RequestMapping("/sala")
@CrossOrigin
public class salaService {
	
	  @Autowired
	    salaRepository cr;

	    @GetMapping(path = "/buscar")
	    public List<sala> buscarSala() {
	        return cr.findAll();
	    }

	    @PostMapping(path = "/guardar")
	    public sala  guardarSala(@RequestBody sala c) {
	        return cr.save(c);
	    }

	    @DeleteMapping(path = "/eliminar/{idsala}")
	    public void eliminarSala(@PathVariable("idsala") int idsala) {
	        cr.deleteById(idsala);
	    }
	}


