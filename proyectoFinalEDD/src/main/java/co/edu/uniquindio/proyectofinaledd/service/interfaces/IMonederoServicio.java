package co.edu.uniquindio.proyectofinaledd.service.interfaces;

import co.edu.uniquindio.proyectofinaledd.model.Cuenta;

import java.util.List;

public interface IMonederoServicio {
    List<Cuenta> listarMonederos();
    Cuenta buscarMonederoPorId(Long id);
    Cuenta guardarMonedero(Cuenta monedero);
    void eliminarMonedero(Long id);
    List<Cuenta> buscarMonederosPorCliente(Long clienteId);
    List<Cuenta> buscarMonederosPorNombre(String nombre);
}
