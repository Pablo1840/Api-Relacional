package com.rommel.pablo.Api.entities;


import javax.persistence.*;


import java.util.Date;
import java.util.Objects;


@Entity(name = "solicitud")

public class Solicitud {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int codigoSolicitud;
	
	private String razon,nombre,estado;
	private Date fecha;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private User usuario;
	
	
	public Solicitud(int codigoSolicitud, String razon, String nombre, String estado, Date fecha, User codUser) {
		this.codigoSolicitud = codigoSolicitud;
		this.razon = razon;
		this.nombre = nombre;
		this.estado = estado;
	}
	
	public Solicitud(){
		
	}
	
	@Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Solicitud solicitud = (Solicitud) obj;
        return Objects.equals(codigoSolicitud, solicitud.getCodigoSolicitud())
                && Objects.equals(razon, solicitud.getRazon())
                && Objects.equals(nombre, solicitud.getNombre())
                && Objects.equals(estado, solicitud.getEstado())
                && Objects.equals(fecha, solicitud.getFecha());
   }
	
	@Override
    public int hashCode() {
        return Objects.hash(codigoSolicitud, razon, nombre, estado, fecha);
   }

	public int getCodigoSolicitud() {
		return codigoSolicitud;
	}

	public void setCodigoSolicitud(int codigoSolicitud) {
		this.codigoSolicitud = codigoSolicitud;
	}

	public String getRazon() {
		return razon;
	}

	public void setRazon(String razon) {
		this.razon = razon;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	
}
