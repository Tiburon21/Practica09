package edu.uacm.test;

import java.util.Date;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import edu.uacm.Evento;

public class EventoTest {
	
	String nombreEvento;
	Date fechaEvento;
	String lugarEvento;
	
	
	@Before
	public void inicializar(){
		// Datos correspondientes a mis dato|s de
		nombreEvento="Simposium";
		fechaEvento= new Date();
		lugarEvento="UACM-SLT";
	}
	
	
	//@Test
	public void probarConstructorEvento(){
		Evento evento = new Evento(nombreEvento, fechaEvento, lugarEvento);		
		
		Assert.assertEquals(evento.getNombreEvento(), nombreEvento);
		Assert.assertEquals(evento.getFechaEvento(), fechaEvento);
		Assert.assertEquals(evento.getLugarEvento(), lugarEvento);
		
	}
	
	
	
	
	public void probarGetSet(){
		//Datos de prueba a nivel metodo de prueba
		String nuevoNombreEvento ="Taller";
		//creo el objeto
		Evento evento = new Evento(nombreEvento, fechaEvento, lugarEvento);
		//moficiacion del set
		evento.setNombreEvento(nuevoNombreEvento);
		
		Assert.assertEquals(nuevoNombreEvento, evento.getNombreEvento());
	}
	
	

}
