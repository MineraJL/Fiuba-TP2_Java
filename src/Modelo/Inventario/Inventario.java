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
	
	/*public int cantidadHerramientas() {
		int totalHerramientas = 0;
		
		totalHerramientas += hachaMadera.size();
		totalHerramientas += hachaPiedra.size();
		totalHerramientas += hachaMetal.size();
		totalHerramientas += picoMadera.size();
		totalHerramientas += picoPiedra.size();
		totalHerramientas += picoMetal.size();
		totalHerramientas += picoFino.size();
		
		return totalHerramientas;
	}*/

}
