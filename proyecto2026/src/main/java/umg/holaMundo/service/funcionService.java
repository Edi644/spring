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
import umg.holaMundo.entity.funcion;
import umg.holaMundo.repository.clienteRepository;
import umg.holaMundo.repository.funcionRepository;

@RestController
@RequestMapping("/funcion")
@CrossOrigin

public class funcionService {

	 @Autowired
	    funcionRepository cr;

	    @GetMapping(path = "/buscar")
	    public List<funcion> buscarFuncion() {
	        return cr.findAll();
	    }

	    @PostMapping(path = "/guardar")
	    public funcion guardarFuncion(@RequestBody funcion c) {
	        return cr.save(c);
	    }

	    @DeleteMapping(path = "/eliminar/{idfuncion}")
	    public void eliminarFuncion(@PathVariable("idfuncion") int idfuncion) {
	        cr.deleteById(idfuncion);
	    }
	}