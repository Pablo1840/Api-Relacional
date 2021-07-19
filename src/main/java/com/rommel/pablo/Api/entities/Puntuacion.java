package com.rommel.pablo.Api.entities;

import javax.persistence.*;


import java.util.Objects;

@Entity(name = "puntuacion")

public class Puntuacion {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int codigoEvaluacion;
	
	private int calificacion;
	private String calificador, rubrica;
	
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Postulante postulante;
	
	public Puntuacion(int codigoEvaluacion, int calificacion, String calificador, String rubrica) {
		this.codigoEvaluacion = codigoEvaluacion;
		this.calificacion = calificacion;
		this.calificador = calificador;
		this.rubrica = rubrica;
	}
	
	
	public Puntuacion() {
		
	}
	
	@Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Puntuacion puntuacion = (Puntuacion) obj;
        return Objects.equals(codigoEvaluacion, puntuacion.getCodigoEvaluacion())
                && Objects.equals(calificacion, puntuacion.getCalificacion())
                && Objects.equals(calificador, puntuacion.getCalificador())
                && Objects.equals(rubrica, puntuacion.getRubrica());
   }
	
	@Override
    public int hashCode() {
        return Objects.hash(codigoEvaluacion, calificador, calificacion, rubrica);
   }


	public int getCodigoEvaluacion() {
		return codigoEvaluacion;
	}


	public void setCodigoEvaluacion(int codigoEvaluacion) {
		this.codigoEvaluacion = codigoEvaluacion;
	}


	public int getCalificacion() {
		return calificacion;
	}


	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}


	public String getCalificador() {
		return calificador;
	}


	public void setCalificador(String calificador) {
		this.calificador = calificador;
	}


	public String getRubrica() {
		return rubrica;
	}


	public void setRubrica(String rubrica) {
		this.rubrica = rubrica;
	}

	
	
	
}
