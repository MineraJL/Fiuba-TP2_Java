package Modelo.Mapa;

public class PosicionEnlazada {
    private PosicionEnlazada arriba;
    private PosicionEnlazada abajo;
    private PosicionEnlazada derecha;
    private PosicionEnlazada izquierda;

    private int i;
    private int j;

    public PosicionEnlazada(int i, int j) {
        this.i = i;
        this.j = j;
        this.inicializarSiguientes();
    }

    public int geti() {
        return this.i;
    }
    public int getj() {
        return this.j;
    }

    public boolean equals(PosicionEnlazada otraPosicion){
        return ((this.geti()==otraPosicion.geti()) && (this.getj() == otraPosicion.getj()));
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

    public PosicionEnlazada posicionAIzquierda() {
        return this.izquierda;
    }
    public PosicionEnlazada posicionADerecha() {
        return this.derecha;
    }
    public PosicionEnlazada posicionArriba() {
        return this.arriba;
    }
    public PosicionEnlazada posicionAbajo() {
        return this.abajo;
    }

}