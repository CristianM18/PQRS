package com.proyecto.empleados.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.proyecto.empleados.Entity.Radicado;
import com.proyecto.empleados.Repository.IRadicadoRepository;

@Service
public class RadicadoService implements IRadicadoService {

    private IRadicadoRepository radicadoRepository;

    public RadicadoService(IRadicadoRepository radicadoRepository) {
        this.radicadoRepository = radicadoRepository;
    }

    @Override
    public List<Radicado> getAllRadicado() {
        return radicadoRepository.findAll();
    }

    @Override
    public Radicado saveRadicado(Radicado radicado) {
        return radicadoRepository.save(radicado);
    }

    @Override
    public Radicado updateRadicado(Radicado radicado) {
        return radicadoRepository.save(radicado);
    }

    @Override
    public Radicado getRadicadoById(Long id) {
        return radicadoRepository.findById(id).get();
    }

}
