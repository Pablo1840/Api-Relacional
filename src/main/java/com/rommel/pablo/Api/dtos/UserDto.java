package com.rommel.pablo.Api.dtos;

import com.rommel.pablo.Api.entities.User;

public class UserDto {
    private int codUsuario;
    private  String email,contrasena,nombres,apellidos,area,cargo;

    public UserDto(String email, String contrasena) {
        this.email = email;
        this.contrasena = contrasena;
    }

    public UserDto(User user) {
        this.codUsuario = user.getCodUsuario();
        this.email = user.getEmail();
        this.nombres = user.getNombres();
        this.apellidos = user.getApellidos();
        this.area = user.getArea();
        this.cargo = user.getCargo();
    }

    public UserDto() {
    }

    public int getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(int codUsuario) {
        this.codUsuario = codUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
