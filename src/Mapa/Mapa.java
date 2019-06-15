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
            this.matriz[casillero.getFila()][casillero.getColumna() + 1].moverMiItemA(casillero);
        }
    }
    public void moverAbajo(Casillero casillero){
        // Verifico que no sea el final del mapa
        if(casillero.getColumna()-1 >= 0) {
            casillero.moverMiItemA(this.matriz[casillero.getFila()][casillero.getColumna() - 1]);
        }
    }

    // agrego método obtenerSiguiente
    public Casillero obtenerSiguienteIzquierdaDe(Casillero casilleroOrigen) { // agrego este metodo que solo devuelve el siguiente
        Casillero casilleroSiguienteIzquierda = casilleroOrigen;
        if(casilleroOrigen.getFila()-1 >= 0) {
            casilleroSiguienteIzquierda = this.matriz[casilleroOrigen.getFila() - 1][casilleroOrigen.getColumna()];
        }
        return casilleroSiguienteIzquierda;
    }
    // fin metodo obtenerSiguiente

    // desde moverIzquierda en Casillero, uso mapa.obtenerSiguienteIzquierdaDe(...) en vez de mapa.moverIzquierda
    // pero el cambio todavia no es definitivo xq igual hay un problema con atibutos (null) mapa y estado de Casillero.
    public void moverIzquierda(Casillero casilleroOrigen){ // metodo original
        // Verifico que no sea el final del mapa
        if(casilleroOrigen.getFila()-1 >= 0) {
            casilleroOrigen.moverMiItemA(this.matriz[casilleroOrigen.getFila() - 1][casilleroOrigen.getColumna()]); //el pm es destino
        }
    }
    public void moverDerecha(Casillero casillero) {
        // Verifico que no sea el final del mapa
        if (casillero.getFila() + 1 <= this.filas) {
            casillero.moverMiItemA(this.matriz[casillero.getFila() + 1][casillero.getColumna()]);
        }
    }
    // Fin movimiento

}
