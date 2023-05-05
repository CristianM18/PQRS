package com.proyecto.empleados.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.proyecto.empleados.Entity.Radicado;
import com.proyecto.empleados.Repository.IRadicadoRepository;

@Service
public class RadicadoService implements IRadicadoService {

    private IRadicadoRepository radiacadoRepository;

    public RadicadoService(IRadicadoRepository radiacadoRepository) {
        this.radiacadoRepository = radiacadoRepository;
    }

    @Override
    public List<Radicado> getAllRadicado() {
        return radiacadoRepository.findAll();
    }

    @Override
    public Radicado saveRadicado(Radicado radicado) {
        return radiacadoRepository.save(radicado);
    }

    @Override
    public Radicado updateRadicado(Radicado radicado) {
        return radiacadoRepository.save(radicado);
    }

    @Override
    public List<Radicado> getRadicadoByNo(String name) {
        return radiacadoRepository.findByNameContaining(name);
    }

}
