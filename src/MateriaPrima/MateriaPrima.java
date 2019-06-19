package MateriaPrima;

import Mapa.Casillero;
import Mapa.Direccion;
import Mapa.Item;
import Mapa.Mapa;
import Mapa.Posicion;

public class MateriaPrima implements Item {
	
	protected Casillero casillero;
	
	public MateriaPrima() {
		this.setCasillero(casillero);
	}

	@Override
	public void setCasillero(Casillero casillero) {
		this.casillero = casillero;
	}

	@Override
	public Casillero getCasillero() {
		return this.casillero;
	}

	@Override
	public Posicion getPosicion() {
		return this.casillero.getPosicion();
	}

	@Override
	public void mover(Mapa mapa, Direccion direccion) {}

	@Override
	public void ingresar(Mapa mapa, Posicion posicion) {
		// TODO Auto-generated method stub
		
	}
}
