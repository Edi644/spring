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

import umg.holaMundo.entity.cliente;
import umg.holaMundo.repository.clienteRepository;

@RestController
@RequestMapping("/cliente")
@CrossOrigin
public class clienteService {

    @Autowired
    clienteRepository cr;

    @GetMapping(path = "/buscar")
    public List<cliente> buscarCliente() {
        return cr.findAll();
    }

    @PostMapping(path = "/guardar")
    public cliente guardarCliente(@RequestBody cliente c) {
        return cr.save(c);
    }

    @DeleteMapping(path = "/eliminar/{idcliente}")
    public void eliminarCliente(@PathVariable("idcliente") int idcliente) {
        cr.deleteById(idcliente);
    }
}