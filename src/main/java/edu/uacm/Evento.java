package edu.uacm;

import java.util.Date;

public class Evento {

	private String nombreEvento;
	private Date fechaEvento;
	private String lugarEvento;
	
	
	
	public Evento(String nombreEvento, Date fechaEvento, String lugarEvento) {
		this.setNombreEvento(nombreEvento);
		this.setFechaEvento(fechaEvento);
		this.setLugarEvento(lugarEvento);
	}
	
	
	public String getNombreEvento() {
		return nombreEvento;
	}
	public void setNombreEvento(String nombreEvento) {
		this.nombreEvento = nombreEvento;
	}
	public Date getFechaEvento() {
		return fechaEvento;
	}
	public void setFechaEvento(Date fechaEvento) {
		this.fechaEvento = fechaEvento;
	}
	public String getLugarEvento() {
		return lugarEvento;
	}
	public void setLugarEvento(String lugarEvento) {
		this.lugarEvento = lugarEvento;
	}
	
	
	
	
}
