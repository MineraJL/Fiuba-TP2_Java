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
    public void setPosicion(Posicion posicion){this.posicion= posicion;}

    // Get posicion mapa
    public Posicion getPosicion(){
        return this.posicion;
    }

    // Set estado
    public void setEstado(EstadoCasillero estado){
        this.estado=estado;
    }

    public Casillero getCasilleroVecino(Mapa mapa, Direccion direccion){
        return mapa.getCasillero(this.getPosicion(),direccion);
    }

    public void setItem(Item item){
        this.estado.setItem(this,item);
    }

}
