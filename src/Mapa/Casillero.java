package Mapa;

public class Casillero {

    private Posicion posicion;
    private EstadoCasillero estado;


    public Casillero(){
        this.setEstado(new EstadoDisponible());

    }

    // Set ubicacion mapa
    public void setPosicion(int fila, int columna){
        this.posicion= new Posicion(fila, columna);
    }

    // Get ubicacion mapa
    public Posicion getPosicion(){
        return this.posicion;
    }
    public int getFila(){return this.posicion.getX();}
    public int getColumna(){return this.posicion.getY();}
    //

    // Set estado
    public void setEstado(EstadoCasillero estado){
        this.estado=estado;
    }

    public Casillero getCasilleroVecino(Mapa mapa, Direccion direccion){
        return mapa.getCasillero(this,direccion);
    }

    public void setItem(Item item){
        this.estado.setItem(this,item);
    }

}
