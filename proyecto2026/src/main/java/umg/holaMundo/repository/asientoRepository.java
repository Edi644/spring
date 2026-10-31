package umg.holaMundo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import umg.holaMundo.entity.asiento;
import umg.holaMundo.entity.examen;

@Repository("asientoRepository")
public interface asientoRepository extends JpaRepository<asiento, Integer> {
	public List<asiento> findByIdAsiento(int carnet);
}
