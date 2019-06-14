package Mapa;

import java.util.ArrayList;

public interface Item {

    void setCasillero(Casillero casillero);
    Casillero getCasillero();

    int getFila();
    int getColumna();

    void intercambiarCasilleros(Item item);

    void moverArriba();
    void moverAbajo();
    void moverIzquierda();
    void moverDerecha();
    //public int[] ubicacion();


}
