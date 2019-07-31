package Modelo.MateriaPrima;

import Modelo.Inventario.InventarioMateriaPrima;

public class MPMetal extends MateriaPrima {
	
	@Override
	public void agregarAlInventario(InventarioMateriaPrima inventario) {
		inventario.agregarMateriaPrima(this);
	}

}
