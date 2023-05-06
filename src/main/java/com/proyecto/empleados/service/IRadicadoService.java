package com.proyecto.empleados.service;

import java.util.List;

import com.proyecto.empleados.Entity.Radicado;

public interface IRadicadoService {

    List<Radicado> getAllRadicado();

    Radicado getRadicadoById(Long id);

    Radicado saveRadicado(Radicado radicado);

    Radicado updateRadicado(Radicado radicado);

}
