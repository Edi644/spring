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

import umg.holaMundo.entity.examen;
import umg.holaMundo.entity.usuario;
import umg.holaMundo.repository.examenRepository;

@RestController
@RequestMapping("/examen")
@CrossOrigin
public class examenService {
	
	@Autowired
	examenRepository ur;
	@GetMapping(path = "/buscar")
	public List<examen>buscarExamen(){
		return ur.findAll();
		
	}
	@PostMapping(path="/guardar")
	public examen guardarExamen(@RequestBody examen u) {
		return ur.save(u);
	}
	@DeleteMapping(path ="/eliminar/{idexamen}" )
	public void eliminarExamen(@PathVariable("idexamen") int idexamen) {
		ur.deleteById(idexamen);
	}
	
	@GetMapping(path ="/buscar/{carnet}")
	public List<examen>buscarExamen(
			@PathVariable("carnet") String carnet)
			{
		return ur.findBycarnet(carnet);
	
	}
	
}
