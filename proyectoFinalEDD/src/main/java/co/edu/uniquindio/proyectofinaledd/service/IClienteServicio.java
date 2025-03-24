package co.edu.uniquindio.proyectofinaledd.service;

import co.edu.uniquindio.proyectofinaledd.model.Cliente;

import java.util.List;

public interface IClienteServicio {
    List<Cliente> listarClientes();
    Cliente buscarClientePorId(Long idCliente);
    void guardarCliente(Cliente cliente);
    void eliminarCliente(Cliente cliente);
    List<Cliente> buscarClientesPorNombre(String nombre);
    List<Cliente> buscarClientesPorRango(String nombreRango);
}
