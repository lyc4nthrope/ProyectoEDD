package co.edu.uniquindio.proyectofinaledd.repository;


import co.edu.uniquindio.proyectofinaledd.model.Transaccion;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TransaccionRepositorio extends JpaRepository<Transaccion, Long> {
    List<Transaccion> findByClienteId(Long clienteId);
    List<Transaccion> findByTipo(String tipo);
}