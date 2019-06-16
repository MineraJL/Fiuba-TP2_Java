package Jugador;

import Herramientas.*;
import Mapa.*;
import TipoMaterial.*;
import Recursos.*;
import javafx.geometry.Pos;

public class Jugador implements Item {
	private Inventario inventario;
	private Hacha herramientaDeTrabajo;
	private Casillero casillero;

	public Jugador() {
		TipoMadera madera = new TipoMadera();
		Hacha hacha = new Hacha(madera);
		inventario = new Inventario(hacha);
		
		herramientaDeTrabajo = hacha;
		this.setCasillero(new Casillero());
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
	public Posicion getPosicion(){return this.casillero.getPosicion();}

	public void mover(Mapa mapa, Direccion direccion){
		this.casillero.getCasilleroVecino(mapa, direccion).setItem(this);
	}

	public void ingresar(Mapa mapa, Posicion posicion){ mapa.getCasillero(posicion).setItem(this);}
	// Fin implementacion



	public void construirHacha(TipoMaterial unMaterial) {
		inventario.agregarHerramienta(new Hacha(unMaterial));
	}
	
	public void usarHerramienta(Recurso unRecurso) {
		herramientaDeTrabajo.golpear(unRecurso);
	}
	
	public Herramienta herraminentaActual() {
		return herramientaDeTrabajo;
	}
	
	public int cantidadHerramientas() {
		return inventario.cantidadHerramientas();
	}
}
