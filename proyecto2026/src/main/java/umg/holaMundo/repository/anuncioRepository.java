package umg.holaMundo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import umg.holaMundo.entity.anuncio;
import umg.holaMundo.entity.usuario;

@Repository("anuncioRepository")
public interface anuncioRepository  extends JpaRepository<anuncio, Integer> {

}
