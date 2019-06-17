package Mapa;


public class Mapa {

    private int filas;
    private int columnas;
    private Casillero[][] matriz;
    private CasilleroEnlazado[][] matrizEnlazada;

    public Mapa(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        this.matriz = new Casillero[filas][columnas];
        this.inicializarCasilleros();
        this.inicializarCasillerosEnlazados();
        this.generarBordes();

    }

    private void inicializarCasillerosEnlazados() {
        //genero la primer fila
        CasilleroEnlazado cInicial = new CasilleroEnlazado();
        matrizEnlazada[0][0] = cInicial;
        for(int columna=1; columna < this.columnas; columna++){
            CasilleroEnlazado cSiguiente = new CasilleroEnlazado();
            matrizEnlazada[0][columna] = cSiguiente;
            cSiguiente.enlazarAIzquierda(matrizEnlazada[0][columna-1]);
        }

        //genero el resto de filas
        for(int fila=1; fila < this.filas; fila++){
            CasilleroEnlazado cPrimero = new CasilleroEnlazado();
            matrizEnlazada[fila][0] = cPrimero;
            cPrimero.enlazarArriba(matrizEnlazada[fila-1][0]);

            for(int columna=1; columna < this.columnas; columna++){
                CasilleroEnlazado cSiguiente = new CasilleroEnlazado();
                matrizEnlazada[fila][columna] = cSiguiente;
                cSiguiente.enlazarAIzquierda(matrizEnlazada[fila][columna-1]);
                cSiguiente.enlazarArriba(matrizEnlazada[fila-1][columna]);
            }
        }
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
