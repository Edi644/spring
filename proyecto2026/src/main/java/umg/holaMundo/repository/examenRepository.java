package umg.holaMundo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import umg.holaMundo.entity.examen;
import umg.holaMundo.entity.usuario;

@Repository("examenRepository")
public interface examenRepository extends JpaRepository<examen, Integer>{
	public List<examen> findBycarnet(String carnet);

}
