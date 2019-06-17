package Mapa;

public interface Item {

    void setCasillero(Casillero casillero);
    Casillero getCasillero();

    Posicion getPosicion();

    void mover(Mapa mapa, Direccion direccion);
    void ingresar(Mapa mapa, Posicion posicion);
}
