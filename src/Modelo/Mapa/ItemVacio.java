package Modelo.Mapa;

public class ItemVacio implements Item {

    private Casillero casillero;

    @Override
    public void setCasillero(Casillero casilleroRecibido) {
        this.casillero = casilleroRecibido;
    }

    // no deberia implementar esta interfaz xq todos estos metodos sobran
    @Override
    public Casillero getCasillero(){return new Casillero();}
    @Override
    public Posicion getPosicion(){return new Posicion(0,0);}
    @Override
    public void mover(Mapa mapa, Direccion direccion){}
    @Override
    public void ingresar(Mapa mapa, Posicion posicion){}
    // fin implementacion de interfaz que no deberia implementar
}
