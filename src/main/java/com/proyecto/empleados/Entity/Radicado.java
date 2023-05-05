package com.proyecto.empleados.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name = "Radicado")
public class Radicado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "noradicado")
    private String noradicado;

    @Column(name = "tiporadicado")
    private String tiporadicado;

    @Column(name = "estadoradicado")
    private String estadoradicado;

    public Radicado() {
    }

    public Radicado(String noradicado, String tiporadicado, String estadoradicado) {
        this.noradicado = noradicado;
        this.tiporadicado = tiporadicado;
        this.estadoradicado = estadoradicado;
    }

    public String getNoradicado() {
        return noradicado;
    }

    public void setNoradicado(String noradicado) {
        this.noradicado = noradicado;
    }

    public String getTiporadicado() {
        return tiporadicado;
    }

    public void setTiporadicado(String tiporadicado) {
        this.tiporadicado = tiporadicado;
    }

    public String getEstadoradicado() {
        return estadoradicado;
    }

    public void setEstadoradicado(String estadoradicado) {
        this.estadoradicado = estadoradicado;
    }

    @Override
    public String toString() {
        return "Radicado{" + "NumeroRadicado" + noradicado + ", Tipo" + tiporadicado + ", Estado=" + estadoradicado + '}';
    }

}
