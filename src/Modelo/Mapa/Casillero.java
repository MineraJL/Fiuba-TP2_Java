package Modelo.Mapa;

public class Casillero {

    private PosicionEnlazada posicion;
    private EstadoCasillero estado;


    public Casillero(){
        this.asignarEstado(new EstadoDisponible());
    }
    public Casillero(PosicionEnlazada unaPosicion){
        this.asignarEstado(new EstadoDisponible());
        this.posicion=unaPosicion;
    }

    public void establecerPosicion(int fila, int columna){ // temp: este metodo no deberia existir
        this.posicion= new PosicionEnlazada(fila, columna);
    }
    public void establecerPosicion(PosicionEnlazada posicion){this.posicion= posicion;}

    public PosicionEnlazada posicion(){
        return this.posicion;
    }

    private void asignarEstado(EstadoCasillero estado){
        this.estado=estado;
    }

    public Casillero obtenerCasilleroVecino(Mapa mapa, Direccion direccion){
        PosicionEnlazada posSiguiente = direccion.siguiente(this.posicion);
        return mapa.getCasillero(posSiguiente);
    }

    // Manejo del ocupante
    public void ocuparPor(Ocupante ocupante){
        this.estado=this.estado.ocuparPor(this, ocupante);
    }

    public Ocupante ocupante(){
        return estado.ocupante();
    }

    public void desocupar(){
        this.estado=this.estado.desocupar();
    }

}
