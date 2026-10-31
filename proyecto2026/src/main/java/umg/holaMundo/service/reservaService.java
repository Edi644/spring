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
import umg.holaMundo.entity.reserva;
import umg.holaMundo.repository.generoRepository;
import umg.holaMundo.repository.reservaRepository;

@RestController
@RequestMapping("/reserva")
@CrossOrigin
public class reservaService {
	
	
	@Autowired
	reservaRepository ur;
	
	@GetMapping(path ="/buscar")
	public List<reserva>buscarReserva(){
		return ur.findAll();
	}
	
	@PostMapping(path="/guardar")
	public reserva guardarReserva(@RequestBody reserva u) {
		return ur.save(u);
		
	}
	@DeleteMapping(path ="/eliminar/{idReserva}" )
	public void eliminarGenero(@PathVariable("idreserva") int idreserva) {
		ur.deleteById(idreserva);
	}

}