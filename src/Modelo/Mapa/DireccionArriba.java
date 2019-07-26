package Modelo.Mapa;

public class DireccionArriba implements Direccion {

    public DireccionArriba() {}

    @Override
    public PosicionEnlazada siguiente(PosicionEnlazada posicionActual) {
        return posicionActual.posicionArriba();
    }
}
