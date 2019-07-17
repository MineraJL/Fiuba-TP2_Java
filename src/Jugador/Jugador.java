package Jugador;

import Herramientas.*;
import Inventario.Inventario;
import Mapa.*;
import MateriaPrima.MateriaPrima;
import TipoMaterial.*;
import Recursos.*;


public class Jugador implements Item {
	private Inventario inventario;
	private Herramienta herramientaDeTrabajo;
	private Casillero casillero;
	
	private void usarHerramienta(Recurso unRecurso) {
		
		while(herramientaDeTrabajo.durabilidad() > 0 
				&& unRecurso.durabilidad() > 0)
			herramientaDeTrabajo.golpear(unRecurso);
	}
	
	private void recolectarMateriaPrima(MateriaPrima materiaPrima) {
		inventario.agregarElemento(materiaPrima);
	}

	private Mapa mapa;
	private Casillero casilleroSeleccionadoParaRomper;

	public Jugador() {
		TipoMadera madera = new TipoMadera();
		Hacha unHacha = new Hacha(madera);
		inventario = new Inventario();
		
		inventario.agregarElemento(unHacha);
		herramientaDeTrabajo = inventario.extraerHachaMadera();
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

	public void mover(Direccion direccion){
		this.mover(this.mapa,direccion);
		this.casilleroSeleccionadoParaRomper=mapa.getCasillero(this.casillero.getPosicion(),direccion);
	}


	public void ingresar(Mapa mapa, Posicion posicion){
		mapa.getCasillero(posicion).setItem(this);
		this.mapa = mapa;
	}
	// Fin implementacion

	/*public void construirHacha(TipoMaterial unMaterial) {
		Hacha hacha = new Hacha(unMaterial);


		inventario.agregarElemento(hacha);
	}
*/
	public void golpear(){
		this.golpearRecurso((Recurso) this.casilleroSeleccionadoParaRomper.getItem());
	}
	
	
	public void golpearRecurso(Recurso unRecurso) {
		usarHerramienta(unRecurso);
		recolectarMateriaPrima((MateriaPrima) unRecurso.getCasillero().getItem());
	}
	
	public void seleccionarHachaMadera() {
		herramientaDeTrabajo = inventario.extraerHachaMadera();
	}
	
	public void seleccionarHachaPiedra() {
		herramientaDeTrabajo = inventario.extraerHachaPiedra();
	}
	
	public void seleccionarHachaMetal() {
		herramientaDeTrabajo = inventario.extraerHachaMetal();
	}
	
	public void seleccionarPicoMadera() {
		herramientaDeTrabajo = inventario.extraerPicoMadera();
	}
	
	public void seleccionarPicoPiedra() {
		herramientaDeTrabajo = inventario.extraerPicoPiedra();
	}
	
	public void seleccionarPicoMetal() {
		herramientaDeTrabajo = inventario.extraerPicoMetal();
	}
	
	public void seleccionarPicoFino() {
		herramientaDeTrabajo = inventario.extraerPicoFino();
	}
	
	
	public Herramienta herraminentaActual() {
		return herramientaDeTrabajo;
	}
	
}
