package Modelo.Mapa;

public class PosicionEnlazada {
    PosicionEnlazada arriba;
    PosicionEnlazada abajo;
    PosicionEnlazada derecha;
    PosicionEnlazada izquierda;

    public PosicionEnlazada(){
        this.arriba = this;
        this.abajo = this;
        this.derecha = this;
        this.izquierda = this;
    }

    public void enlazarAIzquierda(PosicionEnlazada vecino)
    {
        this.izquierda = vecino;
        vecino.enlazarADerecha(this);
    }


    public void enlazarADerecha(PosicionEnlazada vecino)
    {
        this.derecha = vecino;
    }


    public void enlazarArriba(PosicionEnlazada vecino)
    {
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
