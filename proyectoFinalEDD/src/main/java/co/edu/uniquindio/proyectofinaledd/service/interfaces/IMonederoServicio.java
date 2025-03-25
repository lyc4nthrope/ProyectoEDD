package co.edu.uniquindio.proyectofinaledd.service.interfaces;

import co.edu.uniquindio.proyectofinaledd.model.Monedero;

import java.util.List;

public interface IMonederoServicio {
    List<Monedero> listarMonederos();
    Monedero buscarMonederoPorId(Long id);
    Monedero guardarMonedero(Monedero monedero);
    void eliminarMonedero(Long id);
    List<Monedero> buscarMonederosPorCliente(Long clienteId);
    List<Monedero> buscarMonederosPorNombre(String nombre);
}
