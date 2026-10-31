package umg.holaMundo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import umg.holaMundo.entity.cliente;

public interface clienteRepository extends JpaRepository<cliente, Integer> {

}