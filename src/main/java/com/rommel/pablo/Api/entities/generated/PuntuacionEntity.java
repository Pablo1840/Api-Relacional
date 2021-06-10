package com.rommel.pablo.Api.entities.generated;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "puntuacion", schema = "esquema1", catalog = "proyecto")
public class PuntuacionEntity {
    private Object codEvaluacion;
    private Object calificador;
    private Object calificacion1;
    private Object calificacion2;
    private Object calificacion3;
    private Object notatotal;

    @Id
    @Column(name = "cod_evaluacion", nullable = false)
    public Object getCodEvaluacion() {
        return codEvaluacion;
    }

    public void setCodEvaluacion(Object codEvaluacion) {
        this.codEvaluacion = codEvaluacion;
    }

    @Basic
    @Column(name = "calificador", nullable = true)
    public Object getCalificador() {
        return calificador;
    }

    public void setCalificador(Object calificador) {
        this.calificador = calificador;
    }

    @Basic
    @Column(name = "calificacion1", nullable = true)
    public Object getCalificacion1() {
        return calificacion1;
    }

    public void setCalificacion1(Object calificacion1) {
        this.calificacion1 = calificacion1;
    }

    @Basic
    @Column(name = "calificacion2", nullable = true)
    public Object getCalificacion2() {
        return calificacion2;
    }

    public void setCalificacion2(Object calificacion2) {
        this.calificacion2 = calificacion2;
    }

    @Basic
    @Column(name = "calificacion3", nullable = true)
    public Object getCalificacion3() {
        return calificacion3;
    }

    public void setCalificacion3(Object calificacion3) {
        this.calificacion3 = calificacion3;
    }

    @Basic
    @Column(name = "notatotal", nullable = true)
    public Object getNotatotal() {
        return notatotal;
    }

    public void setNotatotal(Object notatotal) {
        this.notatotal = notatotal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PuntuacionEntity that = (PuntuacionEntity) o;
        return Objects.equals(codEvaluacion, that.codEvaluacion) && Objects.equals(calificador, that.calificador) && Objects.equals(calificacion1, that.calificacion1) && Objects.equals(calificacion2, that.calificacion2) && Objects.equals(calificacion3, that.calificacion3) && Objects.equals(notatotal, that.notatotal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codEvaluacion, calificador, calificacion1, calificacion2, calificacion3, notatotal);
    }
}
