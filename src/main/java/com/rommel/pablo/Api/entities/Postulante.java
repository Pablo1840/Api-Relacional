package com.rommel.pablo.Api.entities;

import javax.persistence.*;


import java.util.Objects;

@Entity(name= "postulante")
public class Postulante {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codPostulante;
	
	private String nombres,curriculo,certificadobanca,titulo,ci;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Solicitud solicitud;
	
	public Postulante(int codPostulante, String nombres, String curriculo, String certificadobanca, String titulo,
			String experiencia, String estado, String ci) {
		this.codPostulante = codPostulante;
		this.nombres = nombres;
		this.curriculo = curriculo;
		this.titulo = titulo;
		this.certificadobanca = certificadobanca;
		this.ci = ci;
	
	}
	
	public Postulante() {
		
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Postulante that = (Postulante) o;
		return Objects.equals(codPostulante, that.codPostulante) && Objects.equals(nombres, that.nombres) && Objects.equals(curriculo, that.curriculo) && Objects.equals(certificadobanca, that.certificadobanca) && Objects.equals(titulo, that.titulo) && Objects.equals(ci, that.ci) && Objects.equals(solicitud, that.solicitud);
	}

	@Override
	public int hashCode() {
		return Objects.hash(codPostulante, nombres, curriculo, certificadobanca, titulo, solicitud,ci);
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

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	
	public String getCurriculo() {
		return curriculo;
	}

	public void setCurriculo(String curriculo) {
		this.curriculo = curriculo;
	}

	public String getCertificadobanca() {
		return certificadobanca;
	}

	public void setCertificadobanca(String certificadobanca) {
		this.certificadobanca = certificadobanca;
	}

	public Solicitud getSolicitud() {
		return solicitud;
	}

	public void setSolicitud(Solicitud solicitud) {
		this.solicitud = solicitud;
	}

	public String getCi() {
		return ci;
	}

	public void setCi(String ci) {
		this.ci = ci;
	}
	
	
	
}
