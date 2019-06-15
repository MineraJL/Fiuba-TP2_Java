package Mapa;

public interface Item {

    void setCasillero(Casillero casillero);
    void cambiarCasillero(Casillero casillero);
    Casillero getCasillero();

    int getFila();
    int getColumna();

    void mover(Mapa mapa, Direccion direccion);
}
