package Mapa;

public class Casillero {

    private Mapa mapa;
    private int fila;
    private int columna;
    private Item item;
    private EstadoCasillero estado;


    public Casillero(){
        this.mapa= null;
        this.item= null;
        this.estado= new EstadoDisponible();

    }

    // Set ubicacion mapa
    public void setUbicacion(Mapa mapa, int fila, int columna){
        this.mapa=mapa;
        this.setFila(fila);
        this.setColumna(columna);
    }
    private void setFila(int fila){this.fila= fila; }
    private void setColumna(int columna){ this.columna= columna;  }

    // Get ubicacion mapa
    public int getFila(){
        return this.fila;
    }
    public int getColumna(){
        return this.columna;
    }
    //

    // Set and Get item
    public void setItem(Item itemNuevo){
        this.estado=this.estado.setItem(itemNuevo,this);
    }

    public Item getItem(){
        return estado.getItem();
    }

    // Dejar vacío al Casillero
    public void quitarItem(){
        this.estado=this.estado.quitarItem();
    }




    // Mover Item de Casillero al Casillero que corresponda
    public void moverArriba(){
        this.mapa.moverArriba(this);
    }
    public void moverAbajo(){
        this.mapa.moverAbajo(this);
    }
    public void moverIzquierda(){


        this.mapa.moverIzquierda(this);
    }
    public void moverDerecha(){
        this.mapa.moverDerecha(this);
    }


    // Se mueve un Ítem de un Casillero a otro
    public void moverMiItemA(Casillero casilleroDestino){
        casilleroDestino.setItem(this.item);
    }



}
