package Modelo.Mapa;

public interface Ocupante {

    void setCasillero(Casillero casillero);
    Casillero getCasillero();

    Posicion getPosicion();

    void ingresar(Mapa mapa, Posicion posicion);
}
