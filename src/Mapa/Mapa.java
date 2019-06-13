package Mapa;

public class Mapa {

    public int filas;
    public int columnas;
    public Casillero[][] matriz;

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
    }
    //



    // Movimiento
    public void moverArriba(Casillero casillero){
        // Verifico que no sea el final del mapa
        if(casillero.getColumna()+1 <= this.columnas) {
            casillero.intercambiarItems(this.matriz[casillero.getFila()][casillero.getColumna() + 1]);
        }
    }
    public void moverAbajo(Casillero casillero){
        // Verifico que no sea el final del mapa
        if(casillero.getColumna()-1 >= 0) {
            casillero.intercambiarItems(this.matriz[casillero.getFila()][casillero.getColumna() - 1]);
        }
    }
    public void moverIzquierda(Casillero casillero){
        // Verifico que no sea el final del mapa
        if(casillero.getFila()-1 >= 0) {
            casillero.intercambiarItems(this.matriz[casillero.getFila() - 1][casillero.getColumna()]);
        }
    }
    public void moverDerecha(Casillero casillero) {
        // Verifico que no sea el final del mapa
        if (casillero.getFila() + 1 <= this.filas) {
            casillero.intercambiarItems(this.matriz[casillero.getFila() + 1][casillero.getColumna()]);
        }
    }
    // Fin movimiento

}
