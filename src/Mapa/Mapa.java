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
        this.generarBordes();

    }

    // Get and Set Casilleros
    public Casillero getCasillero(Posicion posicion, Direccion direccion) {
        return matriz[posicion.siguientePosicion(direccion).getX()][posicion.siguientePosicion(direccion).getY()];
    }
    public Casillero getCasillero(Posicion posicion){
        return this.matriz[posicion.getX()][posicion.getY()];
    }

    private void setCasillero(Casillero casillero, Posicion posicion) {
        this.matriz[posicion.getX()][posicion.getY()] = casillero;
        casillero.setPosicion(posicion);
    }
    //

    private void inicializarCasilleros(){

        for(int fila=0; fila < this.filas; fila++){
            for(int columna=0; columna < this.columnas; columna++){
                Posicion posicion= new Posicion(fila, columna);
                Casillero casillero= new Casillero();
                this.setCasillero(casillero, posicion);
            }
        }

    }

    private void generarBordes(){
        for(int fila=0; fila < this.filas; fila++){
            this.matriz[fila][0].setEstado(new EstadoOcupado());
            this.matriz[fila][this.columnas-1].setEstado(new EstadoOcupado());
        }
        for(int columna=0; columna< this.columnas; columna++){
            this.matriz[0][columna].setEstado(new EstadoOcupado());
            this.matriz[this.filas-1][columna].setEstado(new EstadoOcupado());
        }

    }




}
