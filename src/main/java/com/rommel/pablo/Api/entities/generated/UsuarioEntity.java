package com.rommel.pablo.Api.entities.generated;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "usuario", schema = "esquema1", catalog = "proyecto")
public class UsuarioEntity {
    private Object codUsuario;
    private Object cargo;
    private Object nombres;
    private Object apellidos;
    private Object contrasena;
    private Object area;

    @Id
    @Column(name = "cod_usuario", nullable = false)
    public Object getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(Object codUsuario) {
        this.codUsuario = codUsuario;
    }

    @Basic
    @Column(name = "cargo", nullable = true)
    public Object getCargo() {
        return cargo;
    }

    public void setCargo(Object cargo) {
        this.cargo = cargo;
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
    @Column(name = "contrasena", nullable = true)
    public Object getContrasena() {
        return contrasena;
    }

    public void setContrasena(Object contrasena) {
        this.contrasena = contrasena;
    }

    @Basic
    @Column(name = "area", nullable = true)
    public Object getArea() {
        return area;
    }

    public void setArea(Object area) {
        this.area = area;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsuarioEntity that = (UsuarioEntity) o;
        return Objects.equals(codUsuario, that.codUsuario) && Objects.equals(cargo, that.cargo) && Objects.equals(nombres, that.nombres) && Objects.equals(apellidos, that.apellidos) && Objects.equals(contrasena, that.contrasena) && Objects.equals(area, that.area);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codUsuario, cargo, nombres, apellidos, contrasena, area);
    }
}
