package Modelo.Mapa;

public abstract class Ocupante implements Golpeable {

    protected Casillero casillero;

    public Ocupante(){}
    public Ocupante(Casillero casillero){
        this.setCasillero(casillero);
    }

    public void setCasillero(Casillero casilleroRecibido) {this.casillero = casilleroRecibido;}

    public Casillero getCasillero(){
        return this.casillero;
    }

    public PosicionEnlazada getPosicion(){return this.casillero.getPosicion();}

    public void ingresar(Mapa mapa, PosicionEnlazada posicion){ mapa.getCasillero(posicion).ocuparPor(this);}

    public String obtenerNombreOcupante(){return this.getClass().getSimpleName();}

}
