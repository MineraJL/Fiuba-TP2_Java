package Modelo.MateriaPrima;

import Modelo.Inventario.InventarioMateriaPrima;

public class MPDiamante extends MateriaPrima {

	@Override
	public void agregarAlInventario(InventarioMateriaPrima inventario) {
	    	inventario.agregarMateriaPrima(this);
	    	this.casillero.desocupar();
		
	}

	@Override
	public String obtenerNombreOcupante(){return this.getClass().getSimpleName();}

}
