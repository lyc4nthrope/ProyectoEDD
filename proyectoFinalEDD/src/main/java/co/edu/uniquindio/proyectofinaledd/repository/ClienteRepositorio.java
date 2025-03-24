package co.edu.uniquindio.proyectofinaledd.repository;

import co.edu.uniquindio.proyectofinaledd.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ClienteRepositorio extends JpaRepository<Cliente, Long> {
    // Método personalizado: Buscar clientes por nombre
    List<Cliente> findByNombre(String nombre);

    // Método personalizado: Buscar clientes por rango
    List<Cliente> findByRangoNombre(String nombreRango);
}
