package Modelo.MateriaPrima;

import Modelo.Herramientas.Herramienta;
import Modelo.Inventario.Inventario;
import Modelo.Inventario.InventarioMateriaPrima;
import Modelo.Mapa.Casillero;
import Modelo.Mapa.Mapa;
import Modelo.Mapa.Ocupante;
import Modelo.Mapa.PosicionEnlazada;


public abstract class MateriaPrima extends Ocupante {
	

    @Override
    public boolean equals(Object obj) {
        return this.getClass() == obj.getClass();
    }

	public MateriaPrima() {}

	//@Override
	public void ingresar(Mapa mapa, PosicionEnlazada posicion){ mapa.getCasillero(posicion).ocuparPor(this);}


	public abstract void agregarAlInventario(InventarioMateriaPrima inventario);

	@Override
	public void golpeateCon(Herramienta herramienta){}

	@Override
	public void serRecolectadoEn(Inventario inventario){
		inventario.agregarElemento(this);
		this.casillero.desocupar();
	}

}
