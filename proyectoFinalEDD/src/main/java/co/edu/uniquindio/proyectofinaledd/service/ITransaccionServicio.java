package co.edu.uniquindio.proyectofinaledd.service;

import co.edu.uniquindio.proyectofinaledd.model.Transaccion;

import java.util.List;

public interface ITransaccionServicio {
    List<Transaccion> listarTransacciones();
    Transaccion buscarTransacciónPorId(Long id);
    void guardarTransaccion(Transaccion transaccion);
    void eliminarTransaccion(Transaccion transaccion);
    List<Transaccion> buscarTransaccionesPorCliente(Long clienteId);
    List<Transaccion> buscarTransaccionesPorTipo(String tipo);
}