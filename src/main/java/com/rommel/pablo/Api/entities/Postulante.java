package com.rommel.pablo.Api.entities;

import javax.persistence.*;


import java.util.Objects;

@Entity(name= "postulante")
public class Postulante {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codPostulante;
	
	private String nombres,apellidos,ci,titulo,experiencia,estado;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Solicitud solicitud;
	
	public Postulante(int codPostulante, String nombres, String apellidos, String ci, String titulo,
			String experiencia, String estado) {
		this.codPostulante = codPostulante;
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
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Postulante that = (Postulante) o;
		return Objects.equals(codPostulante, that.codPostulante) && Objects.equals(nombres, that.nombres) && Objects.equals(apellidos, that.apellidos) && Objects.equals(ci, that.ci) && Objects.equals(titulo, that.titulo) && Objects.equals(experiencia, that.experiencia) && Objects.equals(estado, that.estado) && Objects.equals(solicitud, that.solicitud);
	}

	@Override
	public int hashCode() {
		return Objects.hash(codPostulante, nombres, apellidos, ci, titulo, experiencia, estado, solicitud);
	}

	public Integer getCodPostulante() {
		return codPostulante;
	}

	public void setCodPostulante(Integer codPostulante) {
		this.codPostulante = codPostulante;
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

	public Solicitud getSolicitud() {
		return solicitud;
	}

	public void setSolicitud(Solicitud solicitud) {
		this.solicitud = solicitud;
	}
}
