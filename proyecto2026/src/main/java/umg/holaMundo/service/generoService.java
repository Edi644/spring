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

import umg.holaMundo.entity.genero;
import umg.holaMundo.entity.usuario;
import umg.holaMundo.repository.generoRepository;
import umg.holaMundo.repository.usuarioRepository;

@RestController
@RequestMapping("/genero")
@CrossOrigin
public class generoService {
	
	@Autowired
	generoRepository ur;
	
	@GetMapping(path ="/buscar")
	public List<genero>buscarGenero(){
		return ur.findAll();
	}
	
	@PostMapping(path="/guardar")
	public genero guardarGenero(@RequestBody genero u) {
		return ur.save(u);
		
	}
	@DeleteMapping(path ="/eliminar/{idGenero}" )
	public void eliminarGenero(@PathVariable("idgenero") int idgenero) {
		ur.deleteById(idgenero);
	}

}

	
	

