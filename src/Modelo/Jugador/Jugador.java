package Modelo.Jugador;

import Modelo.Excepciones.HerramientaDesgastadaExcepcion;
import Modelo.Herramientas.Hacha;
import Modelo.Herramientas.Herramienta;
import Modelo.Inventario.Inventario;
import Modelo.Mapa.*;
import Modelo.MesaDeTrabajo.Mesa;
import Modelo.TipoMaterial.TipoMadera;


public class Jugador extends Ocupante {
	private Mapa mapa; // quiero sacar este atributo // hago commit para integrar
	private Casillero casilleroSeleccionadoParaGolpear;
	private Inventario inventario;
	private Mesa mesa;
	private Herramienta herramientaDeTrabajo;

	public Jugador(Inventario inventario, Mesa mesa) {
		TipoMadera madera = new TipoMadera();
		Hacha unHacha = new Hacha(madera);
		this.inventario = inventario;
		this.mesa = mesa;
		
		this.inventario.agregarElemento(unHacha);
		herramientaDeTrabajo = this.inventario.extraerHachaMadera();
		this.casillero = new Casillero();
	}

	private void mover(Mapa mapa, Direccion direccion){
		this.casillero.obtenerCasilleroVecino(mapa, direccion).ocuparPor(this); // no siempre se desocupa el cas actual.
	}

	public void recolectar(){
		this.casilleroSeleccionadoParaGolpear.ocupante().serRecolectadoEn(this.inventario);
	}

	public void golpear() throws HerramientaDesgastadaExcepcion{
		this.herramientaDeTrabajo.golpear(this.casilleroSeleccionadoParaGolpear.ocupante());
	}


	public void mover(Direccion direccion){
		this.mover(this.mapa,direccion);
		this.casilleroSeleccionadoParaGolpear =this.casillero.obtenerCasilleroVecino(this.mapa,direccion);
	}

	@Override
	public void establecerCasillero(Casillero casillero){
		this.casillero.desocupar();
		this.casillero = casillero;
	}

	@Override // una vez sacado el atributo, no se sobreescribe.
	public void ingresar(Mapa mapa, PosicionEnlazada posicion){
		super.ingresar(mapa,posicion);
		this.mapa = mapa;
	}
	
	public void seleccionarHachaMadera() {
		Herramienta herramientaSeleccionada = inventario.extraerHachaMadera();
		inventario.agregarElemento(herramientaDeTrabajo);
		herramientaDeTrabajo = herramientaSeleccionada;
	}
	
	public void seleccionarHachaPiedra() {
		Herramienta herramientaSeleccionada = inventario.extraerHachaPiedra();
		inventario.agregarElemento(herramientaDeTrabajo);
		herramientaDeTrabajo = herramientaSeleccionada;
	}
	
	public void seleccionarHachaMetal() {
		Herramienta herramientaSeleccionada = inventario.extraerHachaMetal();
		inventario.agregarElemento(herramientaDeTrabajo);
		herramientaDeTrabajo = herramientaSeleccionada;
	}
	
	public void seleccionarPicoMadera() {
		Herramienta herramientaSeleccionada = inventario.extraerPicoMadera();
		inventario.agregarElemento(herramientaDeTrabajo);
		herramientaDeTrabajo = herramientaSeleccionada;
	}
	
	public void seleccionarPicoPiedra() {
		Herramienta herramientaSeleccionada = inventario.extraerPicoPiedra();
		inventario.agregarElemento(herramientaDeTrabajo);
		herramientaDeTrabajo = herramientaSeleccionada;
	}
	
	public void seleccionarPicoMetal() {
		Herramienta herramientaSeleccionada = inventario.extraerPicoMetal();
		inventario.agregarElemento(herramientaDeTrabajo);
		herramientaDeTrabajo = herramientaSeleccionada;
	}
	
	public void seleccionarPicoFino() {
		Herramienta herramientaSeleccionada = inventario.extraerPicoFino();
		inventario.agregarElemento(herramientaDeTrabajo);
		herramientaDeTrabajo = herramientaSeleccionada;
	}
	
	
	public Herramienta herraminentaActual() {
		return herramientaDeTrabajo;
	}

	@Override
	public void golpeateCon(Herramienta herramienta){}
	@Override
	public void serRecolectadoEn(Inventario inventario){}
}
