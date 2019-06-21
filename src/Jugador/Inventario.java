package Jugador;

import java.util.ArrayList;
import Herramientas.*;
import MateriaPrima.MateriaPrima;

public class Inventario {
	private ArrayList<Herramienta> herramientasEquipadas = 
			new ArrayList<Herramienta>();
	
	private ArrayList<MateriaPrima> materiaPrima =
			new ArrayList<MateriaPrima>();

	public Inventario(Hacha unaHacha) {
		herramientasEquipadas.add(unaHacha);
	}
	
	public void agregarHerramienta(Herramienta unaHerramienta) {
		herramientasEquipadas.add(unaHerramienta);
	}
	
	public void agregarMateriaPrima(MateriaPrima unaMateriaPrima) {
		materiaPrima.add(unaMateriaPrima);
	}
	
	public int cantidadHerramientas() {
		return herramientasEquipadas.size();
	}

}
