package co.edu.uniquindio.proyectofinaledd.service;

import co.edu.uniquindio.proyectofinaledd.model.Transaccion;
import co.edu.uniquindio.proyectofinaledd.repository.TransaccionRepositorio;
import co.edu.uniquindio.proyectofinaledd.service.interfaces.ITransaccionServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TransaccionServicio implements ITransaccionServicio {

    @Autowired
    private  TransaccionRepositorio transaccionRepositorio;

    @Override
    public List<Transaccion> listarTransacciones() {
        return transaccionRepositorio.findAll();
    }

    @Override
    public Transaccion buscarTransacciónPorId(Long id) {
        return transaccionRepositorio.findById(id).orElse(null);
    }

    @Override
    public void guardarTransaccion(Transaccion transaccion) {
        transaccionRepositorio.save(transaccion);
    }

    @Override
    public void eliminarTransaccion(Transaccion transaccion) {
        transaccionRepositorio.delete(transaccion);
    }

    @Override
    public List<Transaccion> buscarTransaccionesPorCliente(Long clienteId) {
        return transaccionRepositorio.findByClienteId(clienteId);
    }

    @Override
    public List<Transaccion> buscarTransaccionesPorTipo(String tipo) {
        return transaccionRepositorio.findByTipo(tipo);
    }
}