package Modelo.Jugador;

import Modelo.Herramientas.*;
import Modelo.Inventario.Inventario;
import Modelo.Mapa.*;
import Modelo.MateriaPrima.MateriaPrima;
import Modelo.TipoMaterial.*;
import Modelo.Recursos.*;


public class Jugador implements OcupanteMovible {
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


	// Implementacion interface ocupanteMovible
	public void setCasillero(Casillero casillero){
		this.casillero= casillero;
	}

	public Casillero getCasillero(){
		return this.casillero;
	}
	public PosicionEnlazada getPosicion(){return this.casillero.getPosicion();}

	public void mover(Mapa mapa, Direccion direccion){
		this.casillero.desocupar();
		this.casillero.obtenerCasilleroVecino(mapa, direccion).ocuparPor(this);
	}

	public void mover(Direccion direccion){
		this.mover(this.mapa,direccion);
		this.casilleroSeleccionadoParaRomper=this.casillero.obtenerCasilleroVecino(this.mapa,direccion);
	}


	public void ingresar(Mapa mapa, PosicionEnlazada posicion){
		mapa.getCasillero(posicion).ocuparPor(this);
		this.mapa = mapa;
	}
	// Fin implementacion

	/*public void construirHacha(Modelo.TipoMaterial unMaterial) {
		Hacha hacha = new Hacha(unMaterial);


		inventario.agregarElemento(hacha);
	}
*/
	public void golpear(){
		this.golpearRecurso((Recurso) this.casilleroSeleccionadoParaRomper.getOcupante());
	}
	
	
	public void golpearRecurso(Recurso unRecurso) {
		usarHerramienta(unRecurso);
		recolectarMateriaPrima((MateriaPrima) unRecurso.getCasillero().getOcupante());
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
