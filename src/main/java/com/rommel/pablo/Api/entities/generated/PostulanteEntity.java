package com.rommel.pablo.Api.entities.generated;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "postulante", schema = "esquema1", catalog = "proyecto")
public class PostulanteEntity {
    private Object codPostulante;
    private Object nombres;
    private Object apellidos;
    private Object ci;
    private Object titulo;
    private Object experiencia;
    private Object estado;

    @Id
    @Column(name = "cod_postulante", nullable = false)
    public Object getCodPostulante() {
        return codPostulante;
    }

    public void setCodPostulante(Object codPostulante) {
        this.codPostulante = codPostulante;
    }

    @Basic
    @Column(name = "nombres", nullable = true)
    public Object getNombres() {
        return nombres;
    }

    public void setNombres(Object nombres) {
        this.nombres = nombres;
    }

    @Basic
    @Column(name = "apellidos", nullable = true)
    public Object getApellidos() {
        return apellidos;
    }

    public void setApellidos(Object apellidos) {
        this.apellidos = apellidos;
    }

    @Basic
    @Column(name = "ci", nullable = true)
    public Object getCi() {
        return ci;
    }

    public void setCi(Object ci) {
        this.ci = ci;
    }

    @Basic
    @Column(name = "titulo", nullable = true)
    public Object getTitulo() {
        return titulo;
    }

    public void setTitulo(Object titulo) {
        this.titulo = titulo;
    }

    @Basic
    @Column(name = "experiencia", nullable = true)
    public Object getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(Object experiencia) {
        this.experiencia = experiencia;
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
        PostulanteEntity that = (PostulanteEntity) o;
        return Objects.equals(codPostulante, that.codPostulante) && Objects.equals(nombres, that.nombres) && Objects.equals(apellidos, that.apellidos) && Objects.equals(ci, that.ci) && Objects.equals(titulo, that.titulo) && Objects.equals(experiencia, that.experiencia) && Objects.equals(estado, that.estado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codPostulante, nombres, apellidos, ci, titulo, experiencia, estado);
    }
}
