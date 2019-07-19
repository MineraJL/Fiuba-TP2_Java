package Modelo.Mapa;

public class DireccionArriba implements Direccion {

    @Override
    public PosicionEnlazada siguiente(PosicionEnlazada posicionActual) {
        return posicionActual.posicionArriba();
    }
}
