package com.rommel.pablo.Api.entities.generated;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "solicitud", schema = "esquema1", catalog = "proyecto")
public class SolicitudEntity {
    private Object codSolicitud;
    private Object razon;
    private Object fecha;
    private Object nombre;
    private Object estado;

    @Id
    @Column(name = "cod_solicitud", nullable = false)
    public Object getCodSolicitud() {
        return codSolicitud;
    }

    public void setCodSolicitud(Object codSolicitud) {
        this.codSolicitud = codSolicitud;
    }

    @Basic
    @Column(name = "razon", nullable = true)
    public Object getRazon() {
        return razon;
    }

    public void setRazon(Object razon) {
        this.razon = razon;
    }

    @Basic
    @Column(name = "fecha", nullable = true)
    public Object getFecha() {
        return fecha;
    }

    public void setFecha(Object fecha) {
        this.fecha = fecha;
    }

    @Basic
    @Column(name = "nombre", nullable = true)
    public Object getNombre() {
        return nombre;
    }

    public void setNombre(Object nombre) {
        this.nombre = nombre;
    }

    @Basic
    @Column(name = "estado", nullable = true)
    public Object getEstado() {
        return estado;
    }

    public void setEstado(Object estado) {
        this.estado = estado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SolicitudEntity that = (SolicitudEntity) o;
        return Objects.equals(codSolicitud, that.codSolicitud) && Objects.equals(razon, that.razon) && Objects.equals(fecha, that.fecha) && Objects.equals(nombre, that.nombre) && Objects.equals(estado, that.estado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codSolicitud, razon, fecha, nombre, estado);
    }
}
