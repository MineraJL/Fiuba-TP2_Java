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

    //void ingresar(Mapa mapa, PosicionEnlazada posicion);

    public String obtenerNombreOcupante(){return this.getClass().getSimpleName();}

}
