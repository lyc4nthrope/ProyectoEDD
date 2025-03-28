package co.edu.uniquindio.proyectofinaledd.repository;

import co.edu.uniquindio.proyectofinaledd.model.Cuenta;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface MonederoRepositorio extends JpaRepository<Cuenta, Long> {
    List<Cuenta> findByClienteId(Long clienteId);
    List<Cuenta> findByNombre(String nombre);
}
