package Modelo.MateriaPrima;

import Modelo.Inventario.InventarioMateriaPrima;

public class MPVacio extends MateriaPrima {

    public MPVacio(){}

	@Override
	public void agregarAlInventario(InventarioMateriaPrima inventario) {
		
	}

	@Override
	public String obtenerNombreOcupante(){
		return this.getClass().getSimpleName();
	}


}
