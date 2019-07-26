package Modelo.Mapa;

public interface Ocupante extends Golpeable {

    void setCasillero(Casillero casillero);

    Casillero getCasillero();

    PosicionEnlazada getPosicion();

    void ingresar(Mapa mapa, PosicionEnlazada posicion);
}
