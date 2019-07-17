package Modelo.MateriaPrima;

import Modelo.Inventario.InventarioMateriaPrima;
import Modelo.Mapa.Casillero;

import Modelo.Mapa.Ocupante;
import Modelo.Mapa.Mapa;
import Modelo.Mapa.Posicion;
import Modelo.Mapa.Direccion;


public abstract class MateriaPrima implements Ocupante {
	

    @Override
    public boolean equals(Object obj) {
        return this.getClass() == obj.getClass();
    }

    
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

	
	public abstract void agregarAlInventario(InventarioMateriaPrima inventario);

}
