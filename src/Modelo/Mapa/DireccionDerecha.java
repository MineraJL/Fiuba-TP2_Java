package Modelo.Mapa;

public class DireccionDerecha implements Direccion {

    public DireccionDerecha(){}

    @Override
    public PosicionEnlazada siguiente(PosicionEnlazada posicionActual) {
        return posicionActual.posicionADerecha();
    }
}