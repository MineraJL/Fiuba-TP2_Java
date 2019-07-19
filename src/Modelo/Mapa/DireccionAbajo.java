package Modelo.Mapa;

public class DireccionAbajo implements Direccion {

    @Override
    public PosicionEnlazada siguiente(PosicionEnlazada posicionActual) {
        return posicionActual.posicionAbajo();
    }
}
