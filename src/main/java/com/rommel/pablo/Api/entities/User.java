package com.rommel.pablo.Api.entities;

import javax.persistence.*;


import java.util.Objects;

@Entity(name = "usuario")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int codUsuario;

    private String cargo, nombres, apellidos,email,contrasena,area;

    
	public User(int codUsuario,String cargo, String nombres, String apellidos, String email, String contrasena,
			String area) {
		this.codUsuario = codUsuario;
		this.cargo = cargo;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.email = email;
		this.contrasena = contrasena;
		this.area = area;
	}
	
	public User() {
    }

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		User user = (User) o;
		return codUsuario == user.codUsuario && Objects.equals(cargo, user.cargo) && Objects.equals(nombres, user.nombres) && Objects.equals(apellidos, user.apellidos) && Objects.equals(email, user.email) && Objects.equals(contrasena, user.contrasena) && Objects.equals(area, user.area);
	}

	@Override
	public int hashCode() {
		return Objects.hash(codUsuario, cargo, nombres, apellidos, email, contrasena, area);
	}

	public int getCodUsuario() {
		return codUsuario;
	}

	public void setCodUsuario(int codUsuario) {
		this.codUsuario = codUsuario;
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

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
}
