package Mapa;

public class Mapa {

    private int filas;
    private int columnas;
    private Casillero[][] matriz;

    public Mapa(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        this.matriz = new Casillero[filas][columnas];

    }

    // Get and Set Casilleros
    public Casillero getCasillero(int fila, int columna) {
        return matriz[fila][columna];
    }

    public void setCasillero(Casillero casillero, int fila, int columna) {
        this.matriz[fila][columna] = casillero;
        casillero.setUbicacion(this,fila,columna);
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

    public void setItem(Item item, int fila, int columna){
        this.matriz[fila][columna].setItem(item);
    }

    // Movimiento
    public void moverArriba(Casillero casillero){
        // Verifico que no sea el final del mapa
        if(casillero.getColumna()+1 <= this.columnas) {
            this.matriz[casillero.getFila()][casillero.getColumna() + 1].moverItem(casillero);
        }
    }
    public void moverAbajo(Casillero casillero){
        // Verifico que no sea el final del mapa
        if(casillero.getColumna()-1 >= 0) {
            casillero.moverItem(this.matriz[casillero.getFila()][casillero.getColumna() - 1]);
        }
    }
    public void moverIzquierda(Casillero casillero){
        // Verifico que no sea el final del mapa
        if(casillero.getFila()-1 >= 0) {
            casillero.moverItem(this.matriz[casillero.getFila() - 1][casillero.getColumna()]);
        }
    }
    public void moverDerecha(Casillero casillero) {
        // Verifico que no sea el final del mapa
        if (casillero.getFila() + 1 <= this.filas) {
            casillero.moverItem(this.matriz[casillero.getFila() + 1][casillero.getColumna()]);
        }
    }
    // Fin movimiento

}
