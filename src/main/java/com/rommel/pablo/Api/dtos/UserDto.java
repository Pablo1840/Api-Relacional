package com.rommel.pablo.Api.dtos;

import com.rommel.pablo.Api.entities.generated.UsuarioEntity;

public class UserDto {

    private int codUsuario;
    private String contrasena,cargo,nombres,apellidos,area;

    public UserDto(int codUsuario, String contrasena, String cargo, String nombres, String apellidos, String area) {
        this.codUsuario = codUsuario;
        this.contrasena = contrasena;
        this.cargo = cargo;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.area = area;
    }

    public UserDto(UsuarioEntity user) {
        this.codUsuario = codUsuario;
        this.contrasena = contrasena;
        this.cargo = cargo;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.area = area;
    }

    public UserDto() {
    }

    public int getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(int codUsuario) {
        this.codUsuario = codUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}