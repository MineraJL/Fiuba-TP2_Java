package Jugador;

import Herramientas.*;
import TipoMaterial.*;

public class Jugador {
	private Inventario inventario;
	private Herramienta herramientaDeTrabajo;

	public Jugador() {
		TipoMadera madera = new TipoMadera();
		Hacha hacha = new Hacha(madera);
		inventario = new Inventario(hacha);
		
		inventario.agregarHerramienta(hacha);
		herramientaDeTrabajo = hacha;
	}
	
	public void construirHacha(TipoMaterial unMaterial) {
		Hacha hacha = new Hacha(unMaterial);
		
		inventario.agregarHerramienta(hacha);
	}
	
	public void construirPico(TipoMaterial unMaterial) {
		Pico pico = new Pico(unMaterial);
		
		inventario.agregarHerramienta(pico);
	}
	
	public void construirPicoFino() {
		PicoFino picoFino = new PicoFino();
		
		inventario.agregarHerramienta(picoFino);
	}
	
	public void usarHerramienta(TipoMaterial unMaterial) {
		herramientaDeTrabajo.golpear(unMaterial);
	}
	
	public void cambiarHerramienta(Herramienta unaHerramienta) {
		herramientaDeTrabajo = inventario.seleccionarHerramienta(unaHerramienta);
	}
	
	public Herramienta herraminentaActual() {
		return herramientaDeTrabajo;
	}
}
