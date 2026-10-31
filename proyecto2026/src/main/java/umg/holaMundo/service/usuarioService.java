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
import umg.holaMundo.entity.usuario;
import umg.holaMundo.repository.usuarioRepository;

@RestController
@RequestMapping("/usuarioProyecto")
@CrossOrigin
public class usuarioService {
	
	@Autowired
	usuarioRepository ur; 
	
	@GetMapping(path ="/buscar")
	public List<usuario>buscarUsuario(){
		return ur.findAll();
	}
	
	
	
	@GetMapping(path ="/buscar/{correo}/{contrasena}")
	public List<usuario>buscarUsuarioCorreoYContrasena(
			@PathVariable("correo") String correo,
			@PathVariable("contrasena")String contrasena){
		return ur.findByCorreoAndContrasena(correo, contrasena);
	
	}
	
	@PostMapping(path="/guardar")
	public usuario guardarUsuario(@RequestBody usuario u) {
		return ur.save(u);
		
	}
	@DeleteMapping(path ="/eliminar/{idusuario}" )
	public void eliminarUsuario(@PathVariable("idusuario") int idusuario) {
		ur.deleteById(idusuario);
	}
	
	@PostMapping(path="/login")
	public usuario login(@RequestBody usuario u) {
		List<usuario>usuarios = ur.findByCorreoAndContrasena(u.getCorreo(), u.getContrasena());
		if(usuarios.isEmpty()) {
			return null;
		}else {
			return usuarios.get(0);
		}
	}

}