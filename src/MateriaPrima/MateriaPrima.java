package MateriaPrima;

import Mapa.Casillero;
import Mapa.Item;
import Mapa.Mapa;
import Mapa.Posicion;
import Mapa.Direccion;

public class MateriaPrima implements Item {

    @Override
    public boolean equals(Object obj) {
        return this.getClass() == obj.getClass();
    }


    @Override
    public void setCasillero(Casillero casillero) {

    }

    @Override
    public Casillero getCasillero() {
        return null;
    }

    @Override
    public Posicion getPosicion() {
        return null;
    }

    @Override
    public void ingresar(Mapa mapa, Posicion posicion) {

    }

    @Override
    public void mover(Mapa mapa, Direccion direccion) {

    }
}
