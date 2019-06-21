package Jugador;

import Herramientas.*;
import Mapa.*;
import MateriaPrima.MateriaPrima;
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
		this.setCasillero(new Casillero());
	}


	// Implementacion interface item
	public void setCasillero(Casillero casillero){
		this.casillero= casillero;
	}

	public Casillero getCasillero(){
		return this.casillero;
	}
	public Posicion getPosicion(){return this.casillero.getPosicion();}

	public void mover(Mapa mapa, Direccion direccion){
		this.casillero.quitarItem();
		this.casillero.getCasilleroVecino(mapa, direccion).setItem(this);
	}

	public void ingresar(Mapa mapa, Posicion posicion){ mapa.getCasillero(posicion).setItem(this);}
	// Fin implementacion



	public void construirHacha(TipoMaterial unMaterial) {
		Hacha hacha = new Hacha(unMaterial);

		inventario.agregarHerramienta(hacha);
	}
	
	public void golpearRecurso(Recurso unRecurso) {
		usarHerramienta(unRecurso);
		recolectarMateriaPrima((MateriaPrima) unRecurso.getCasillero().getItem());
	}
	
	private void usarHerramienta(Recurso unRecurso) {
		
		while(herramientaDeTrabajo.durabilidad() > 0 
				&& unRecurso.durabilidad() > 0)
			herramientaDeTrabajo.golpear(unRecurso);
	}
	
	private void recolectarMateriaPrima(MateriaPrima materiaPrima) {
		inventario.agregarMateriaPrima(materiaPrima);
	}
	
	public Herramienta herraminentaActual() {
		return herramientaDeTrabajo;
	}
	
	public int cantidadHerramientas() {
		return inventario.cantidadHerramientas();
	}
}
