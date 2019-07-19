package Modelo.Mapa;


public class Mapa {

    private int filas;
    private int columnas;
    private Casillero[][] matriz;
    private PosicionEnlazada[][] matrizPosicionesEnlazadas;

    public Mapa(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        this.matriz = new Casillero[filas][columnas];
        this.matrizPosicionesEnlazadas = new PosicionEnlazada[filas][columnas];
        this.inicializarCasilleros();
    }

    private void inicializarCasilleros() { // enlazadas
        //genero la primer fila
        PosicionEnlazada pInicial = new PosicionEnlazada(0,0);
        matrizPosicionesEnlazadas[0][0] = pInicial;
        matriz[0][0] = new Casillero(pInicial);

        for(int columna=1; columna < this.columnas; columna++){
            PosicionEnlazada pSiguiente = new PosicionEnlazada(0,columna);
            matrizPosicionesEnlazadas[0][columna] = pSiguiente;
            pSiguiente.enlazarAIzquierda(matrizPosicionesEnlazadas[0][columna-1]);
            matriz[0][columna] = new Casillero(pSiguiente);
        }

        //genero el resto de filas
        for(int fila=1; fila < this.filas; fila++){
            PosicionEnlazada pPrimero = new PosicionEnlazada(fila,0);
            matrizPosicionesEnlazadas[fila][0] = pPrimero;
            pPrimero.enlazarArriba(matrizPosicionesEnlazadas[fila-1][0]);
            matriz[fila][0] = new Casillero(pPrimero);

            for(int columna=1; columna < this.columnas; columna++){
                PosicionEnlazada pSiguiente = new PosicionEnlazada(fila,columna);
                matrizPosicionesEnlazadas[fila][columna] = pSiguiente;
                pSiguiente.enlazarAIzquierda(matrizPosicionesEnlazadas[fila][columna-1]);
                pSiguiente.enlazarArriba(matrizPosicionesEnlazadas[fila-1][columna]);
                matriz[fila][columna] = new Casillero(pSiguiente);
            }
        }
    }

    // Get and Set Casilleros
    public Casillero getCasillero(PosicionEnlazada posicion){
        return this.matriz[posicion.getX()][posicion.getY()];
    }

    private void setCasillero(Casillero casillero, PosicionEnlazada posicion) {
        this.matriz[posicion.getX()][posicion.getY()] = casillero;
    }
    //

}
