package umg.holaMundo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import umg.holaMundo.entity.pelicula;
import umg.holaMundo.entity.reserva;

@Repository("reservaRepository")
public interface reservaRepository extends JpaRepository<reserva, Integer>{

}
