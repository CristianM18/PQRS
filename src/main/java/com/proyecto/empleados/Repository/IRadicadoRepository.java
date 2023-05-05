package com.proyecto.empleados.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.proyecto.empleados.Entity.Radicado;

public interface IRadicadoRepository extends JpaRepository<Radicado, Long> {

    @Query("FROM Radicado s WHERE s.noradicado LIKE :noradicado")
    public List<Radicado> findByNameContaining(@Param("noradicado") String noradicado);

}
