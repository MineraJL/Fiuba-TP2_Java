package Modelo.Jugador;

import Modelo.Excepciones.HerramientaDesgastadaExcepcion;
import Modelo.Herramientas.Hacha;
import Modelo.Herramientas.Herramienta;
import Modelo.Inventario.Inventario;
import Modelo.Mapa.*;
import Modelo.MesaDeTrabajo.Mesa;
import Modelo.TipoMaterial.TipoMadera;


public class Jugador implements OcupanteMovible {
	private Mapa mapa;
	private Casillero casilleroSeleccionadoParaGolpear;
	private Inventario inventario;
	private Mesa mesa;
	private Herramienta herramientaDeTrabajo;
	private Casillero casillero;

	public Jugador(Inventario inventario, Mesa mesa) {
		TipoMadera madera = new TipoMadera();
		Hacha unHacha = new Hacha(madera);
		this.inventario = inventario;
		this.mesa = mesa;
		
		this.inventario.agregarElemento(unHacha);
		herramientaDeTrabajo = this.inventario.extraerHachaMadera();
		this.casillero = new Casillero();
	}


	public void recolectar(){
		this.casilleroSeleccionadoParaGolpear.ocupante().serRecolectadoEn(this.inventario);
	}

	public void golpear() throws HerramientaDesgastadaExcepcion{
		this.herramientaDeTrabajo.golpear(this.casilleroSeleccionadoParaGolpear.ocupante());
	}


	private void mover(Mapa mapa, Direccion direccion){
		this.casillero.obtenerCasilleroVecino(mapa, direccion).ocuparPor(this); // no siempre se desocupa el cas actual.
	}

	// Implementacion interface ocupanteMovible
	public void setCasillero(Casillero casillero){
		this.casillero.desocupar();
		this.casillero = casillero;
	}

	public Casillero getCasillero(){
		return this.casillero;
	}
	public PosicionEnlazada getPosicion(){return this.casillero.getPosicion();}

	public void mover(Direccion direccion){
		this.mover(this.mapa,direccion);
		this.casilleroSeleccionadoParaGolpear =this.casillero.obtenerCasilleroVecino(this.mapa,direccion);
	}


	public void ingresar(Mapa mapa, PosicionEnlazada posicion){
		mapa.getCasillero(posicion).ocuparPor(this);
		this.mapa = mapa;
	}

	public String obtenerNombreOcupante(){return this.getClass().getSimpleName();}
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
	@Override
	public void serRecolectadoEn(Inventario inventario){}
}
