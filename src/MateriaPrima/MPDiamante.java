package MateriaPrima;

import Inventario.InventarioMateriaPrima;

public class MPDiamante extends MateriaPrima {

	@Override
	public void agregarAlInventario(InventarioMateriaPrima inventario) {
	    	inventario.agregarMateriaPrima(this);
		
	}
}
