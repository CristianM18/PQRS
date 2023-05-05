package com.proyecto.empleados.service;

import java.util.List;

import com.proyecto.empleados.Entity.Radicado;

public interface IRadicadoService {

    List<Radicado> getAllRadicado();

    List<Radicado> getRadicadoByNo(String noradicado);

    Radicado saveRadicado(Radicado radicado);

    Radicado updateRadicado(Radicado radicado);

}
