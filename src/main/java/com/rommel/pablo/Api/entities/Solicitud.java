package com.rommel.pablo.Api.entities;


import javax.persistence.*;


import java.util.Date;
import java.util.Objects;


@Entity(name = "solicitud")

public class Solicitud {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int codigoSolicitud;
	
	private String razon,nombre,estado,perfild;
	private Date fecha;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private User usuario;
	
	
	public Solicitud(int codigSolicitud, String razon, String nombre, String estado,String perfild, Date fecha, User codUser) {
		this.codigoSolicitud = codigoSolicitud;
		this.razon = razon;
		this.nombre = nombre;
		this.estado = estado;
		this.perfild = perfild;
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
                && Objects.equals(perfild, solicitud.getPerfild())
                && Objects.equals(fecha, solicitud.getFecha());
   }
	
	@Override
    public int hashCode() {
        return Objects.hash(codigoSolicitud, razon, nombre, estado,perfild, fecha);
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
	
	

	public String getPerfild() {
		return perfild;
	}

	public void setPerfild(String perfild) {
		this.perfild = perfild;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	
}
