package Mapa;

public class Casillero {

    private Mapa mapa;

    private static int fila;
    private static int columna;
    private Item item;

    public Casillero(Mapa mapa, int fila, int columna){
        this.mapa= mapa;
        this.fila= fila;
        this.columna= columna;
        this.item= null;
    }


    // Set and Get item
    public void setItem(Item itemNuevo){
        this.item=itemNuevo;
        this.item.agregarCasillero(this);
    }
    public Item getItem(){
        return this.item;
    }
    //

    // Limpiar item, casillero vacio
    public void limpiarItem(){
        this.item=null;
    }
    //

    // Ubicacion mapa
    public int getFila(){
        return this.fila;
    }
    public int getColumna(){
        return this.columna;
    }
    //

    public void movermeHaciaArriba(){
        Casillero casilleroDeArriba= this.mapa.getCasillero(this.getFila(), this.getColumna()+1);
    }

    // Mover Casillero
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


    // Switch de items en los casilleros
    public void intercambiarItems(Casillero casillero){
        Item item= casillero.getItem();
        casillero.setItem(this.getItem());
        this.setItem(item);
    }



}
