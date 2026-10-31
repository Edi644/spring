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

import umg.holaMundo.entity.asiento;
import umg.holaMundo.entity.pelicula;
import umg.holaMundo.entity.usuario;
import umg.holaMundo.repository.asientoRepository;
import umg.holaMundo.repository.peliculaRepository;

@RestController
@RequestMapping("/asiento")
@CrossOrigin
public class asientoService {

	@Autowired
     asientoRepository cr;

    @GetMapping(path = "/buscar")
    public List<asiento> buscarAsiento() {
        return cr.findAll();
    }

    @PostMapping(path = "/guardar")
    public asiento guardarAsiento(@RequestBody asiento c) {
        return cr.save(c);
    }

    @DeleteMapping(path = "/eliminar/{idasiento}")
    public void eliminarAsiento(@PathVariable("idasiento") int idasiento) {
        cr.deleteById(idasiento);
    }
    @GetMapping(path ="/buscar/{idasiento}")
	public List<asiento>buscarAsiento(
			@PathVariable("idasiento") int idasiento){
				
		return cr.findByIdAsiento(idasiento);
	
	}
}