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
    public Casillero getCasillero(Casillero casillero, Direccion direccion) {
        int coorX= casillero.getPosicion().siguientePosicion(direccion).getX();
        int coorY= casillero.getPosicion().siguientePosicion(direccion).getY();
        return matriz[coorX][coorY];
    }
    public Casillero getCasillero(int fila, int columna){
        return this.matriz[fila][columna];
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
