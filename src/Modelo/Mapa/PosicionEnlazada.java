package Modelo.Mapa;

public class PosicionEnlazada {
    private PosicionEnlazada arriba;
    private PosicionEnlazada abajo;
    private PosicionEnlazada derecha;
    private PosicionEnlazada izquierda;

    private int coorX;
    private int coorY;

    public PosicionEnlazada(int coorX, int coorY) {
        this.coorX = coorX;
        this.coorY = coorY;
        this.inicializarSiguientes();
    }

    public int getX() {
        return this.coorX;
    }
    public int getY() {
        return this.coorY;
    }

    public boolean equals(Posicion otraPosicion){
        return ((this.getX()==otraPosicion.getX()) && (this.getY() == otraPosicion.getY()));
    }


    // enlaces
    private void inicializarSiguientes(){
        this.arriba = this;
        this.abajo = this;
        this.derecha = this;
        this.izquierda = this;
    }

    public void enlazarAIzquierda(PosicionEnlazada vecino){
        this.izquierda = vecino;
        vecino.enlazarADerecha(this);
    }

    public void enlazarADerecha(PosicionEnlazada vecino)
    {
        this.derecha = vecino;
    }


    public void enlazarArriba(PosicionEnlazada vecino){
        this.arriba = vecino;
        vecino.enlazarAbajo(this);
    }

    public void enlazarAbajo(PosicionEnlazada vecino) {
        this.abajo = vecino;
    }

    public PosicionEnlazada casilleroAIzquierda() {
        return this.izquierda;
    }
    public PosicionEnlazada casilleroADerecha() {
        return this.derecha;
    }
    public PosicionEnlazada casilleroArriba() {
        return this.arriba;
    }
    public PosicionEnlazada casilleroAbajo() {
        return this.abajo;
    }

}