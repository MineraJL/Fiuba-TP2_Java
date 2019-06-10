package Jugador;

import Herramientas.*;
import TipoMaterial.*;
import Recursos.*;

public class Jugador {
	private Inventario inventario;
	private Hacha herramientaDeTrabajo;

	public Jugador() {
		TipoMadera madera = new TipoMadera();
		Hacha hacha = new Hacha(madera);
		inventario = new Inventario(hacha);
		
		herramientaDeTrabajo = hacha;
	}
	
	public void construirHacha(TipoMadera unMaterial) {
		Hacha hacha = new Hacha(unMaterial);
		
		inventario.agregarHerramienta(hacha);
	}
	
	public void usarHerramienta(Madera unMaterial) {
		herramientaDeTrabajo.golpear(unMaterial);
	}
	
	public Herramienta herraminentaActual() {
		return herramientaDeTrabajo;
	}
	
	public int cantidadHerramientas() {
		return inventario.cantidadHerramientas();
	}
}
