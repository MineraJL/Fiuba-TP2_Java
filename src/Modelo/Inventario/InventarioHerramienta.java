package Modelo.Inventario;

import Modelo.Herramientas.Hacha;
import Modelo.Herramientas.Pico;
import Modelo.Herramientas.PicoFino;
import Modelo.TipoMaterial.TipoMadera;
import Modelo.TipoMaterial.TipoMetal;
import Modelo.TipoMaterial.TipoPiedra;

import java.util.ArrayList;

public class InventarioHerramienta {
	
	//Colección de hachas
	protected ArrayList<Hacha> hachaMadera = 
			new ArrayList<Hacha>();
	
	protected ArrayList<Hacha> hachaPiedra = 
			new ArrayList<Hacha>();
	
	protected ArrayList<Hacha> hachaMetal = 
			new ArrayList<Hacha>();
	
	//Colección de picos simples
	protected ArrayList<Pico> picoMadera = 
			new ArrayList<Pico>();
	
	protected ArrayList<Pico> picoPiedra = 
			new ArrayList<Pico>();
	
	protected ArrayList<Pico> picoMetal = 
			new ArrayList<Pico>();
	
	//Colección picos finos
	protected ArrayList<PicoFino> picoFino = 
			new ArrayList<PicoFino>();
	
	
	//Se almacenan hachas
	public void agregarHerramienta(Hacha unaHacha, TipoMadera madera) {
		hachaMadera.add(unaHacha);
	}
	
	public void agregarHerramienta(Hacha unaHacha, TipoPiedra piedra) {
		hachaPiedra.add(unaHacha);
	}
	
	public void agregarHerramienta(Hacha unaHacha, TipoMetal metal) {
		hachaMetal.add(unaHacha);
	}
	
	//Se almacenan picos simples
	public void agregarHerramienta(Pico unPico, TipoMadera madera) {
		picoMadera.add(unPico);
	}
	
	public void agregarHerramienta(Pico unPico, TipoPiedra piedra) {
		picoPiedra.add(unPico);
	}
	
	public void agregarHerramienta(Pico unPico, TipoMetal metal) {
		picoMetal.add(unPico);
	}
	
	//Se almacenan picos finos
	public void agregarHerramienta(PicoFino unaPicoFino) {
		picoFino.add(unaPicoFino);
	}
	
	public Hacha extraerHachaMadera() {
		Hacha hacha = hachaMadera.get(0);
		hachaMadera.remove(0);
		
		return hacha;
	}
	
	public Hacha extraerHachaPiedra() {
		Hacha hacha = hachaPiedra.get(0);
		hachaPiedra.remove(0);
		
		return hacha;
	}
	
	public Hacha extraerHachaMetal() {
		Hacha hacha = hachaMetal.get(0);
		hachaMetal.remove(0);
		
		return hacha;
	}
	
	public Pico extraerPicoMadera() {
		Pico pico = picoMadera.get(0);
		picoMadera.remove(0);
		
		return pico;
	}
	
	public Pico extraerPicoPiedra() {
		Pico pico = picoPiedra.get(0);
		picoPiedra.remove(0);
		
		return pico;
	}
	
	public Pico extraerPicoMetal() {
		Pico pico = picoMetal.get(0);
		picoMetal.remove(0);
		
		return pico;
	}
	
	public PicoFino extraerPicoFino() {
		PicoFino pico = picoFino.get(0);
		picoFino.remove(0);
		
		return pico;
	}
	
	/*public Hacha extraerHerramienta() {
		Herramienta herramienta = hachaMadera.get(0);		
		hachaMadera.remove(0);
		
		return herramienta;
	}*/
}
