package Modelo.MateriaPrima;

import Modelo.Herramientas.Herramienta;
import Modelo.Inventario.InventarioMateriaPrima;
import Modelo.Mapa.*;


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
	public PosicionEnlazada getPosicion() {
		return this.casillero.getPosicion();
	}

	@Override
	public void ingresar(Mapa mapa, PosicionEnlazada posicion) {}


	public abstract void agregarAlInventario(InventarioMateriaPrima inventario);


	@Override
	public void serGolpeadoCon(Herramienta unaHerramineta){}

}
