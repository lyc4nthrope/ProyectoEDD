package co.edu.uniquindio.proyectofinaledd.service;

import co.edu.uniquindio.proyectofinaledd.model.Cliente;
import co.edu.uniquindio.proyectofinaledd.repository.ClienteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ClienteServicio implements IClienteServicio {

    @Autowired
    private ClienteRepositorio clienteRepositorio;

    @Override
    public List<Cliente> listarClientes() {
        return clienteRepositorio.findAll();
    }

    @Override
    public Cliente buscarClientePorId(Long idCliente) {
        return clienteRepositorio.findById(idCliente).orElse(null);
    }

    @Override
    public void guardarCliente(Cliente cliente) {
        clienteRepositorio.save(cliente);
    }

    @Override
    public void eliminarCliente(Cliente cliente) {
        clienteRepositorio.delete(cliente);
    }

    @Override
    public List<Cliente> buscarClientesPorNombre(String nombre) {
        return clienteRepositorio.findByNombre(nombre);
    }

    @Override
    public List<Cliente> buscarClientesPorRango(String nombreRango) {
        return clienteRepositorio.findByRangoNombre(nombreRango);
    }
}
