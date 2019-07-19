package Modelo.Mapa;

public class DireccionIzquierda implements Direccion {

    public DireccionIzquierda(){}

    @Override
    public PosicionEnlazada siguiente(PosicionEnlazada posicionActual) {
        return posicionActual.posicionArriba();
    }
}
