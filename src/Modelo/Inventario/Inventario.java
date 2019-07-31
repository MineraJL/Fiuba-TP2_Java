package Modelo.Inventario;

import Modelo.Herramientas.*;
import Modelo.MateriaPrima.*;

public class Inventario {
	private InventarioHerramienta herramienta;
	private InventarioMateriaPrima materiaPrima;
	
	public Inventario() {
		herramienta = new InventarioHerramienta();
		materiaPrima = new InventarioMateriaPrima();
	}
	
	public void agregarElemento(Herramienta herramienta) {
		herramienta.agregarAlInventario(this.herramienta);
	}
	

	public void agregarElemento(MateriaPrima materiaPrima) {
		materiaPrima.agregarAlInventario(this.materiaPrima);
	}
	
	public MPMadera extraerMateriaPrimaMadera() {
		return materiaPrima.extraerMadera();
	}
	
	public MPPiedra extraerMateriaPrimaPiedra() {
		return materiaPrima.extraerPiedra();
	}
	
	public MPMetal extraerMateriaPrimaMetal() {
		return materiaPrima.extraerMetal();
	}
	
	public MPDiamante extraerMateriaPrimaDiamante() {
		return materiaPrima.extraerDiamante();
	}
	
	public Hacha extraerHachaMadera() {
		return herramienta.extraerHachaMadera();
	}
	
	public Hacha extraerHachaPiedra() {
		return herramienta.extraerHachaPiedra();
	}
	
	public Hacha extraerHachaMetal() {
		return herramienta.extraerHachaMetal();
	}
	
	public Pico extraerPicoMadera() {
		return herramienta.extraerPicoMadera();
	}
	
	public Pico extraerPicoPiedra() {
		return herramienta.extraerPicoPiedra();
	}
	
	public Pico extraerPicoMetal() {
		return herramienta.extraerPicoMetal();
	}
	
	public PicoFino extraerPicoFino() {
		return herramienta.extraerPicoFino();
	}
	
	public int cantidadHachaMadera() {
		return herramienta.cantidadHachaMadera();
	}
	
	public int cantidadHachaPiedra() {
		return herramienta.cantidadHachaPiedra();
	}
	
	public int cantidadHachaMetal() {
		return herramienta.cantidadHachaMetal();
	}
	
	
	public int cantidadPicoMadera() {
		return herramienta.cantidadPicoMadera();
	}
	
	public int cantidadPicoPiedra() {
		return herramienta.cantidadPicoPiedra();
	}
	
	public int cantidadPicoMetal() {
		return herramienta.cantidadPicoMetal();
	}
	
	
	public int cantidadPicoFino() {
		return herramienta.cantidadPicoFino();
	}
	
	public int cantidadMadera() {
		return materiaPrima.cantidadMadera();
	}
	
	public int cantidadPiedra() {
		return materiaPrima.cantidadPiedra();
	}
	
	public int cantidadMetal() {
		return materiaPrima.cantidadMetal();
	}
	
	public int cantidadDiamante() {
		return materiaPrima.cantidadDiamante();
	}

}
