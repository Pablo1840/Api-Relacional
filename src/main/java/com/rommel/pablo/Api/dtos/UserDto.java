package com.rommel.pablo.Api.dtos;

import com.rommel.pablo.Api.entities.User;

public class UserDto {

    private int id;
    private String nombres,apellidos,cargo,contrasena,area;


    public UserDto(String nombres, String apellidos, String cargo, String contrasena, String area) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cargo = cargo;
        this.contrasena = contrasena;
        this.area = area;
    }

    public UserDto(User user){
        this.id=user.getId();
        this.nombres=user.getNombres();
        this.apellidos= user.getApellidos();
        this.cargo= user.getCargo();
        this.contrasena = user.getContrasena();
        this.area = user.getArea();
    }


    public UserDto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}