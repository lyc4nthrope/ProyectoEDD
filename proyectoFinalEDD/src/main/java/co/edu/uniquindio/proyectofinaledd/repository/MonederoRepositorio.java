package co.edu.uniquindio.proyectofinaledd.repository;

import co.edu.uniquindio.proyectofinaledd.model.Monedero;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface MonederoRepositorio extends JpaRepository<Monedero, Long> {
    List<Monedero> findByClienteId(Long clienteId);
    List<Monedero> findByNombre(String nombre);
}
