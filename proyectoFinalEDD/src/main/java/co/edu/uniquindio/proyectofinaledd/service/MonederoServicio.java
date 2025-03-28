package co.edu.uniquindio.proyectofinaledd.service;

import co.edu.uniquindio.proyectofinaledd.model.Cuenta;
import co.edu.uniquindio.proyectofinaledd.repository.MonederoRepositorio;
import co.edu.uniquindio.proyectofinaledd.service.interfaces.IMonederoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MonederoServicio implements IMonederoServicio {
    @Autowired
    private MonederoRepositorio monederoRepositorio;

    @Override
    public List<Cuenta> listarMonederos() {
        return monederoRepositorio.findAll();
    }

    @Override
    public Cuenta buscarMonederoPorId(Long id) {
        return monederoRepositorio.findById(id).orElse(null);
    }

    @Override
    public Cuenta guardarMonedero(Cuenta monedero) {
        return monederoRepositorio.save(monedero);
    }

    @Override
    public void eliminarMonedero(Long id) {
        monederoRepositorio.deleteById(id);
    }

    @Override
    public List<Cuenta> buscarMonederosPorCliente(Long clienteId) {
        return monederoRepositorio.findByClienteId(clienteId);
    }

    @Override
    public List<Cuenta> buscarMonederosPorNombre(String nombre) {
        return monederoRepositorio.findByNombre(nombre);
    }
}
