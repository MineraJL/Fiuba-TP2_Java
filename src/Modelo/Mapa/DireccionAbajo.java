package Modelo.Mapa;

public class DireccionAbajo implements Direccion {

    public DireccionAbajo(){}

    @Override
    public PosicionEnlazada siguiente(PosicionEnlazada posicionActual) {
        return posicionActual.posicionAIzquierda();
    }
}
