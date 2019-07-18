package Modelo.Mapa;

public class Casillero {

    private PosicionEnlazada posicion; // temp: esto siendo enlazado va a romper tests
    private EstadoCasillero estado;


    public Casillero(){
        this.setEstado(new EstadoDisponible());
    }
    public Casillero(PosicionEnlazada unaPosicion){
        this.setEstado(new EstadoDisponible());
        this.posicion=unaPosicion;
    }

    // Set ubicacion mapa
    public void setPosicion(int fila, int columna){ // temp: este metodo no deberia existir
        this.posicion= new PosicionEnlazada(fila, columna);
    }
    public void setPosicion(PosicionEnlazada posicion){this.posicion= posicion;}

    // Get posicion mapa
    public PosicionEnlazada getPosicion(){
        return this.posicion;
    }

    // Set estado
    public void setEstado(EstadoCasillero estado){
        this.estado=estado;
    }

    /*public Casillero getCasilleroVecino(Mapa mapa, Direccion direccion){ // temp: este método no debería existir
        return mapa.getCasillero(this.getPosicion(),direccion);
    }*/

    // Manejo del ocupante
    public void ocuparPor(Ocupante ocupante){
        this.estado=this.estado.ocuparPor(this, ocupante);
    }

    public Ocupante getOcupante(){
        return estado.getOcupante();
    }

    public void desocupar(){
        this.estado=this.estado.desocupar();
    }

}
