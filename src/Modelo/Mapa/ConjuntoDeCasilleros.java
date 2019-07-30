package Modelo.Mapa;

public abstract class ConjuntoDeCasilleros {


    protected int filas;
    protected int columnas;
    protected Casillero[][] matriz;

    public ConjuntoDeCasilleros(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        this.matriz = new Casillero[filas][columnas];
        this.inicializarCasilleros();
    }

    protected abstract void inicializarCasilleros();

    public Casillero getCasillero(PosicionEnlazada posicion){
        return this.matriz[posicion.geti()][posicion.getj()];
    }


    // métodos info para vista
    public Ocupante ocupante(PosicionEnlazada posicion){
        return matriz[posicion.geti()][posicion.getj()].ocupante();
    }

    public int cantidadFilas(){return this.filas;}
    public int cantidadColumnas(){return this.columnas;}
    // fin métodos para vista

}
