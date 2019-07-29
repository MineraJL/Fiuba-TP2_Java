package Modelo.Mapa;

public class Disposicion {


    private int filas;
    private int columnas;
    private Casillero[][] matriz;

    private PosicionEnlazada posicionInicial;

    public Disposicion(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        this.matriz = new Casillero[filas][columnas];
        this.inicializarCasilleros();
    }

    private void inicializarCasilleros() { // enlazadas
        PosicionEnlazada[][] matrizPosicionesEnlazadas = new PosicionEnlazada[filas][columnas];

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
            matriz[fila][0] = new Casillero(pPrimero);

            for(int columna=1; columna < this.columnas; columna++){
                PosicionEnlazada pSiguiente = new PosicionEnlazada(fila,columna);
                matrizPosicionesEnlazadas[fila][columna] = pSiguiente;
                pSiguiente.enlazarAIzquierda(matrizPosicionesEnlazadas[fila][columna-1]);
                matriz[fila][columna] = new Casillero(pSiguiente);
            }
        }


        // enlazo el primero de una fila con el ultimo de la fila anterior
        for (int fila = 1 ; fila < this.filas ; fila++){
            PosicionEnlazada ultimaPosFilaDeArriba = matrizPosicionesEnlazadas[fila-1][cantidadColumnas()-1];
            matrizPosicionesEnlazadas[fila][0].enlazarAIzquierda(ultimaPosFilaDeArriba);
        }
        this.posicionInicial = matrizPosicionesEnlazadas[0][0];

    }

    public PosicionEnlazada posicionInicial(){return this.posicionInicial;}


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

