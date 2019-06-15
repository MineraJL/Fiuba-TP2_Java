package Mapa;

public class Mapa {

    private int filas;
    private int columnas;
    private Casillero[][] matriz;

    public Mapa(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        this.matriz = new Casillero[filas][columnas];
        this.inicializarCasilleros();

    }

    // Get and Set Casilleros
    public Casillero getCasillero(Posicion posicion, Direccion direccion) {
        return matriz[posicion.siguientePosicion(direccion).getX()][posicion.siguientePosicion(direccion).getY()];
    }
    public Casillero getCasillero(Posicion posicion){
        return this.matriz[posicion.getX()][posicion.getY()];
    }
    public void setCasillero(Casillero casillero, int fila, int columna) {
        this.matriz[fila][columna] = casillero;
        casillero.setPosicion(fila,columna);
    }
    //

    public void inicializarCasilleros(){

        for(int fila=0; fila < this.filas; fila++){
            for(int columna=0; columna < this.columnas; columna++){
                Casillero casillero= new Casillero();
                this.setCasillero(casillero, fila,columna);
            }
        }
    }





}
