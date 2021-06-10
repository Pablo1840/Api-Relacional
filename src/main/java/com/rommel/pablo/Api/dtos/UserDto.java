package com.rommel.pablo.Api.dtos;

import com.rommel.pablo.Api.entities.User;

public class UserDto {

    private int id;
    private String nombres,apellidos,cargo,usuario,contrasena,area;


    public UserDto(String nombres, String apellidos, String cargo, String usuario, String contrasena, String area) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cargo = cargo;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.area = area;
    }

    public UserDto(User user){
        this.id=user.getId();
        this.nombre=user.getNombres();
        this.email=user.getEmail();
    }


    public UserDto() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}