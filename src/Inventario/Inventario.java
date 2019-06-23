package Inventario;

import Herramientas.*;
import MateriaPrima.*;

public class Inventario {
	private InventarioHerramienta herramienta;
	private InventarioMateriaPrima materiaPrima;
	
	public Inventario(Hacha unaHacha) {
		herramienta = new InventarioHerramienta();
		materiaPrima = new InventarioMateriaPrima();
		
		herramienta.agregarHerramienta(unaHacha);
	}
	
	public void agregarElemento(Herramienta herramienta) {
		herramienta.agregarAlInventario(this.herramienta);
		//this.herramienta.agregarHerramienta(herramienta);
	}
	

	public void agregarElemento(MateriaPrima materiaPrima) {
		materiaPrima.agregarAlInventario(this.materiaPrima);
	}
	
	public MateriaPrima extraerMateriaPrima() {
		return null;
	}
	
	public Herramienta extraerHerramienta() {
		return null;
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
