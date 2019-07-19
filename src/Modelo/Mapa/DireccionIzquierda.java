package Modelo.Mapa;

public class DireccionIzquierda implements Direccion {

    @Override
    public PosicionEnlazada siguiente(PosicionEnlazada posicionActual) {
        return posicionActual.posicionAIzquierda();
    }
}
