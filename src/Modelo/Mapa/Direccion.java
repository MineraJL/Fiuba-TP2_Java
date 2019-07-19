package Modelo.Mapa;

public interface Direccion {

    // return posicionActual.posicionAIzquierda();

    PosicionEnlazada siguiente(PosicionEnlazada posicionActual);
}