package Modelo.Mapa;

public abstract class Ocupante implements Golpeable, Recolectable {

    protected Casillero casillero;

    public Ocupante(){}
    public Ocupante(Casillero casillero){
        this.establecerCasillero(casillero);
    }

    public void establecerCasillero(Casillero casilleroRecibido) {this.casillero = casilleroRecibido;}

    public Casillero obtenerCasillero(){
        return this.casillero;
    }

    public PosicionEnlazada posicion(){return this.casillero.posicion();}

    public void ingresar(Mapa mapa, PosicionEnlazada posicion){ mapa.getCasillero(posicion).ocuparPor(this);}

    public String obtenerNombreOcupante(){return this.getClass().getSimpleName();}

}
