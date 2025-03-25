package co.edu.uniquindio.proyectofinaledd.service;

import co.edu.uniquindio.proyectofinaledd.model.Monedero;
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
    public List<Monedero> listarMonederos() {
        return monederoRepositorio.findAll();
    }

    @Override
    public Monedero buscarMonederoPorId(Long id) {
        return monederoRepositorio.findById(id).orElse(null);
    }

    @Override
    public Monedero guardarMonedero(Monedero monedero) {
        return monederoRepositorio.save(monedero);
    }

    @Override
    public void eliminarMonedero(Long id) {
        monederoRepositorio.deleteById(id);
    }

    @Override
    public List<Monedero> buscarMonederosPorCliente(Long clienteId) {
        return monederoRepositorio.findByClienteId(clienteId);
    }

    @Override
    public List<Monedero> buscarMonederosPorNombre(String nombre) {
        return monederoRepositorio.findByNombre(nombre);
    }
}
