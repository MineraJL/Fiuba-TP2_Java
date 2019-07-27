package Modelo.MateriaPrima;

import Modelo.Inventario.InventarioMateriaPrima;

public class MPPiedra extends MateriaPrima {
	
	@Override
	public void agregarAlInventario(InventarioMateriaPrima inventario) {
		inventario.agregarMateriaPrima(this);
	}

	@Override
	public String obtenerNombreOcupante(){
		return this.getClass().getSimpleName();
	}
}
