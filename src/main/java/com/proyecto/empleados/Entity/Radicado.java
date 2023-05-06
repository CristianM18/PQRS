package com.proyecto.empleados.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name = "Radicados")
public class Radicado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 6)
    private String noradicado;
 
    @Column(length = 11)
    private String cedula;

    @Column(length = 8)
    private String fecharadicadoado;

    @Column(length = 10)
    private String tiporadicado;

    @Column(length = 500)
    private String comentarioradicado;

    @Column(length = 500)
    private String anexoradicado;

    @Column(length = 10)
    private String estadoradicado;

    @Column(length = 500)
    private String justificacionradicado;

    public Radicado() {
    }

    public Radicado(String cedula, String noradicado, String fecharadicadoado, String tiporadicado, 
    String comentarioradicado, String anexoradicado, String estadoradicado, String justificacionradicado) {
        this.cedula = cedula;
        this.noradicado = noradicado;
        this.tiporadicado = tiporadicado;
        this.estadoradicado = estadoradicado;
        this.fecharadicadoado = fecharadicadoado;
        this.comentarioradicado = comentarioradicado;
        this.anexoradicado = anexoradicado;
        this.justificacionradicado = justificacionradicado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
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

    public String getFecharadicado() {
        return fecharadicadoado;
    }

    public void setFecharadicado(String fecharadicado) {
        this.fecharadicadoado = fecharadicado;
    }

    public String getComentarioradicado() {
        return comentarioradicado;
    }

    public void setComentarioradicado(String comentarioradicado) {
        this.comentarioradicado = comentarioradicado;
    }

    public String getAnexoradicado() {
        return anexoradicado;
    }

    public void setAnexoradicado(String anexoradicado) {
        this.anexoradicado = anexoradicado;
    }

    public String getJustificacionradicado() {
        return justificacionradicado;
    }

    public void setJustificacionradicado(String justificacionradicado) {
        this.justificacionradicado = justificacionradicado;
    }

    @Override
    public String toString() {
        return "Radicado{" + "NumeroRadicado" + noradicado + ", Tipo" + tiporadicado + ", Estado=" + estadoradicado + '}';
    }

}
