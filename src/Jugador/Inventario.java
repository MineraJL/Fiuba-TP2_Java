package Jugador;

import java.util.ArrayList;
import Herramientas.*;
import MateriaPrima.*;

public class Inventario {
	//Colección de hachas
	private ArrayList<Hacha> hachaMadera = 
			new ArrayList<Hacha>();
	
	private ArrayList<Hacha> hachaPiedra = 
			new ArrayList<Hacha>();
	
	private ArrayList<Hacha> hachaMetal = 
			new ArrayList<Hacha>();
	
	//Colección de picos simples
	private ArrayList<Pico> picoMadera = 
			new ArrayList<Pico>();
	
	private ArrayList<Pico> picoPiedra = 
			new ArrayList<Pico>();
	
	private ArrayList<Pico> picoMetal = 
			new ArrayList<Pico>();
	
	//Colección picos finos
	private ArrayList<PicoFino> picoFino = 
			new ArrayList<PicoFino>();
	
	
	//Coleccion materias primas
	private ArrayList<MateriaPrima> mpMadera = 
			new ArrayList<MateriaPrima>();
	
	private ArrayList<MateriaPrima> mpPiedra = 
			new ArrayList<MateriaPrima>();
	
	private ArrayList<MateriaPrima> mpMetal =
			new ArrayList<MateriaPrima>();
	
	private ArrayList<MateriaPrima> mpDiamante =
			new ArrayList<MateriaPrima>();
	
	//Se agregan herramientas al inventario
	private void agregarHerramienta(Herramienta unaHerramienta) {
		agregarHerramienta(unaHerramienta);
	}
	
	//Se agregab hachas
	private void agregarHerramienta(Hacha unaHacha) {
		hachaMadera.add(unaHacha);
	}
	
	private void agregarHerramienta(Pico unPico) {
		picoMadera.add(unPico);
	}
	
	private void agregarHerramienta(PicoFino unPicoFino) {
		picoFino.add(unPicoFino);
	}

	
	//Se agregan materias primas al inventario
	private void agregarMateriaPrima(MateriaPrima unaMateriaPrima) {
		agregarMateriaPrima(unaMateriaPrima);
	}
	
	private void agregarMateriaPrima(MPMadera madera) {
		mpMadera.add(madera);
	}
	
	private void agregarMateriaPrima(MPPiedra piedra) {
		mpPiedra.add(piedra);
	}
	
	private void agregarMateriaPrima(MPMetal metal) {
		mpMetal.add(metal);
	}
	
	private void agregarMateriaPrima(MPDiamante diamante) {
		mpDiamante.add(diamante);
	}
	
	public Inventario(Hacha unaHacha) {
		hachaMadera.add(unaHacha);
	}
	
	public void agregarElemento(MateriaPrima objeto) {
		agregarMateriaPrima(objeto);
	}
	
	public void agregarElemento(Herramienta objeto) {
		agregarHerramienta(objeto);
	}
	
	public int cantidadHerramientas() {
		int totalHerramientas = 0;
		
		totalHerramientas += hachaMadera.size();
		totalHerramientas += hachaPiedra.size();
		totalHerramientas += hachaMetal.size();
		totalHerramientas += picoMadera.size();
		totalHerramientas += picoPiedra.size();
		totalHerramientas += picoMetal.size();
		totalHerramientas += picoFino.size();
		
		return totalHerramientas;
	}

}
