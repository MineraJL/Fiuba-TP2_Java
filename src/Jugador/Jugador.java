package Jugador;

import Herramientas.*;
import Mapa.Casillero;
import Mapa.Item;
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
	public Casillero getCasillero(){
		return this.casillero;
	}
	public int getFila(){
		return this.casillero.getFila();
	}
	public int getColumna(){
		return this.casillero.getColumna();
	}

	public void intercambiarCasilleros(Item item){
		Casillero casillero= item.getCasillero();
		item.setCasillero(this.getCasillero());
		this.setCasillero(casillero);
	}

	public void moverArriba(){
		this.casillero.moverArriba();
	}
	public void moverAbajo(){
		this.casillero.moverAbajo();
	}
	public void moverIzquierda(){
		this.casillero.moverIzquierda();
	}
	public void moverDerecha(){
		this.casillero.moverDerecha();
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
