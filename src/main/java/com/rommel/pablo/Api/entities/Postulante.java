package com.rommel.pablo.Api.entities;

import javax.persistence.*;


import java.util.Objects;

@Entity(name = "postulante")

public class Postulante {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int codigoPostulante;
	
	private String nombres,apellidos,ci,titulo,experiencia,estado;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Solicitud solicitud;
	
	public Postulante(int codigoPostulante, String nombres, String apellidos, String ci, String titulo,
			String experiencia, String estado) {
		this.codigoPostulante = codigoPostulante;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.ci = ci;
		this.titulo = titulo;
		this.experiencia = experiencia;
		this.estado = estado;
	}
	
	public Postulante() {
		
	}
	
	@Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Postulante postulante = (Postulante) obj;
        return Objects.equals(codigoPostulante, postulante.getCodigoPostulante())
                && Objects.equals(nombres, postulante.getNombres());
   }
	
	@Override
    public int hashCode() {
        return Objects.hash(codigoPostulante, nombres, apellidos, ci, titulo, experiencia, estado);
   }

	public int getCodigoPostulante() {
		return codigoPostulante;
	}

	public void setCodigoPostulante(int codigoPostulante) {
		this.codigoPostulante = codigoPostulante;
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

	public String getCi() {
		return ci;
	}

	public void setCi(String ci) {
		this.ci = ci;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
}
