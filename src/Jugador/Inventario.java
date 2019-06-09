package Jugador;

import java.util.ArrayList;
import Herramientas.*;

public class Inventario {
	private ArrayList<Herramienta> herramientasEquipadas = 
			new ArrayList<Herramienta>();

	public Inventario(Hacha unaHacha) {
		herramientasEquipadas.add(unaHacha);
	}
	
	public void agregarHerramienta(Herramienta unaHerramienta) {
		herramientasEquipadas.add(unaHerramienta);
	}

	// busqueda sin if
	public Herramienta seleccionarHerramienta(Herramienta unaHerramienta) {
		for(Herramienta herramienta : herramientasEquipadas);
			
		return unaHerramienta;
	}
}
