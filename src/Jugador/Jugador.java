package Jugador;

import Herramientas.*;
import Mapa.*;
import TipoMaterial.*;
import Recursos.*;

public class Jugador implements Item {
	private Inventario inventario;
	private Hacha herramientaDeTrabajo;
	private Casillero casillero;

	public Jugador() {
		TipoMadera madera = new TipoMadera();
		Hacha hacha = new Hacha(madera);
		inventario = new Inventario(hacha);
		
		herramientaDeTrabajo = hacha;
	}


	// Implementacion interface item
	public void setCasillero(Casillero casillero){
		this.casillero= casillero;
	}
	public void cambiarCasillero(Casillero casilleroNuevo){
		this.casillero.setEstado(new EstadoDisponible());
		this.setCasillero(casilleroNuevo);
	}
	public Casillero getCasillero(){
		return this.casillero;
	}
	public int getFila(){
		return this.casillero.getFila();
	}
	public int getColumna(){
		return this.casillero.getColumna();
	}

	public void mover(Mapa mapa, Direccion direccion){
		this.casillero.getCasilleroVecino(mapa, direccion).setItem(this);
	}
	// Fin implementacion



	public void construirHacha(TipoMadera unMaterial) {
		Hacha hacha = new Hacha(unMaterial);
		
		inventario.agregarHerramienta(hacha);
	}
	
	public void usarHerramienta(Madera unMaterial) {
		herramientaDeTrabajo.golpear(unMaterial);
	}
	
	public Herramienta herraminentaActual() {
		return herramientaDeTrabajo;
	}
	
	public int cantidadHerramientas() {
		return inventario.cantidadHerramientas();
	}
}
