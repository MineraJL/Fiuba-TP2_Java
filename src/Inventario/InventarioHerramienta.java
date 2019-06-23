package Inventario;

import java.util.ArrayList;

import Herramientas.*;

public class InventarioHerramienta {
	
	//Colección de hachas
	protected ArrayList<Herramienta> hachaMadera = 
			new ArrayList<Herramienta>();
	
	protected ArrayList<Herramienta> hachaPiedra = 
			new ArrayList<Herramienta>();
	
	protected ArrayList<Herramienta> hachaMetal = 
			new ArrayList<Herramienta>();
	
	//Colección de picos simples
	protected ArrayList<Herramienta> picoMadera = 
			new ArrayList<Herramienta>();
	
	protected ArrayList<Herramienta> picoPiedra = 
			new ArrayList<Herramienta>();
	
	protected ArrayList<Herramienta> picoMetal = 
			new ArrayList<Herramienta>();
	
	//Colección picos finos
	protected ArrayList<Herramienta> picoFino = 
			new ArrayList<Herramienta>();
	
	
	
	public void agregarHerramienta(Hacha unaHacha) {
		hachaMadera.add(unaHacha);
	}
	
	public void agregarHerramienta(Pico unPico) {
		picoMadera.add(unPico);
	}
	
	public void agregarHerramienta(PicoFino unaPicoFino) {
		picoFino.add(unaPicoFino);
	}
	
	/*public Hacha extraerHerramienta() {
		Herramienta herramienta = hachaMadera.get(0);		
		hachaMadera.remove(0);
		
		return herramienta;
	}*/
}
