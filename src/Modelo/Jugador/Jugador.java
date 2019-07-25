package Modelo.Jugador;

import Modelo.Herramientas.Hacha;
import Modelo.Herramientas.Herramienta;
import Modelo.Inventario.Inventario;
import Modelo.Mapa.*;
import Modelo.MateriaPrima.MateriaPrima;
import Modelo.MesaDeTrabajo.Mesa;
import Modelo.TipoMaterial.TipoMadera;


public class Jugador implements OcupanteMovible {
	private Mapa mapa;
	private Casillero casilleroSeleccionadoParaRomper;
	private Inventario inventario;
	private Mesa mesa;
	private Herramienta herramientaDeTrabajo;
	private Casillero casillero;

	private void recolectarMateriaPrima(MateriaPrima materiaPrima) {
		inventario.agregarElemento(materiaPrima); // esto no va a ser así, en el futuro hay interfaz recolectable
	}

	private void mover(Mapa mapa, Direccion direccion){
		this.casillero.desocupar();
		this.casillero.obtenerCasilleroVecino(mapa, direccion).ocuparPor(this);
	}

	public void golpear(){
		this.herramientaDeTrabajo.golpear(this.casilleroSeleccionadoParaRomper.getOcupante());
	}
	
	public Jugador(Inventario inventario, Mesa mesa) {
		TipoMadera madera = new TipoMadera();
		Hacha unHacha = new Hacha(madera);
		this.inventario = inventario;
		this.mesa = mesa;
		
		this.inventario.agregarElemento(unHacha);
		herramientaDeTrabajo = this.inventario.extraerHachaMadera();
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

	@Override
	public void golpeateCon(Herramienta herramienta){}
}
