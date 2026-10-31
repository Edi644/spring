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
import org.springframework.transaction.annotation.Transactional; // 1. IMPORTANTE: Agrega este import

import jakarta.persistence.EntityManager; // 2. IMPORTANTE: Agrega este import
import umg.holaMundo.entity.anuncio;
import umg.holaMundo.entity.usuario;
import umg.holaMundo.repository.anuncioRepository;
import umg.holaMundo.repository.usuarioRepository;

@RestController
@RequestMapping("/anuncio")
@CrossOrigin
public class anuncioService {
	
	@Autowired
	anuncioRepository ur;

	@Autowired
	private EntityManager entityManager; 
	
	@GetMapping(path ="/buscar")
	@Transactional(readOnly = true)
	public List<anuncio> buscarAnuncio(){
		entityManager.clear(); 
		return ur.findAll();
	}

	@PostMapping(path="/guardar")
	public anuncio guardarAnuncio(@RequestBody anuncio u) {
		return ur.save(u);
	}

	@DeleteMapping(path ="/eliminar/{idanuncio}" )
	public void eliminarAnuncio(@PathVariable("idanuncio") int idanuncio) {
		ur.deleteById(idanuncio);
	}
}

