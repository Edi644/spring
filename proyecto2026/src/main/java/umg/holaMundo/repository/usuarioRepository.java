package umg.holaMundo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import umg.holaMundo.entity.usuario;

public interface usuarioRepository extends JpaRepository<usuario, Integer> {
	public List<usuario> findByCorreoAndContrasena(String correo, String contrasena);


}
