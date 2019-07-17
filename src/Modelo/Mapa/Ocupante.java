package Modelo.Mapa;

public interface Ocupante {

    void setCasillero(Casillero casillero);
    Casillero getCasillero();

    Posicion getPosicion();

    void mover(Mapa mapa, Direccion direccion);
    void ingresar(Mapa mapa, Posicion posicion);
}