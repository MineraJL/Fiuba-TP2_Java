package Modelo.Mapa;

public class OcupanteVacio implements Ocupante {

    private Casillero casillero;

    @Override
    public void setCasillero(Casillero casilleroRecibido) {
        this.casillero = casilleroRecibido;
    }

    // no deberia implementar esta interfaz xq todos estos metodos sobran
    @Override
    public Casillero getCasillero(){return new Casillero();}
    @Override
    public PosicionEnlazada getPosicion(){return new PosicionEnlazada(0,0);}
    @Override
    public void ingresar(Mapa mapa, PosicionEnlazada posicion){}
    // fin implementacion de interfaz que no deberia implementar
}
