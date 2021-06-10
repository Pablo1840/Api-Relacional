package com.rommel.pablo.Api.entities;

import javax.persistence.*;


import java.util.Objects;

@Entity(name = "usuario")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String cargo, nombres, apellidos,usuario,contrasena,area;

    
	public User(int id, String cargo, String nombres, String apellidos, String usuario, String contrasena,
			String area) {
		this.id = id;
		this.cargo = cargo;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.usuario = usuario;
		this.contrasena = contrasena;
		this.area = area;
	}
	
	public User() {
    }
	
	 @Override
	    public boolean equals(Object obj) {
	        if (this == obj) return true;
	        if (obj == null || getClass() != obj.getClass()) return false;
	        User user = (User) obj;
	        return Objects.equals(id, user.getId())
	                && Objects.equals(cargo, user.getCargo());
	   }
	 
	 @Override
	    public int hashCode() {
	        return Objects.hash(id, cargo, nombres, apellidos, usuario, contrasena,area);
	   }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
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
