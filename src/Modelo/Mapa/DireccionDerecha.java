package Modelo.Mapa;

public class DireccionDerecha implements Direccion {

    @Override
    public PosicionEnlazada siguiente(PosicionEnlazada posicionActual) {
        return posicionActual.posicionADerecha();
    }

}