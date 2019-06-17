package Mapa;

public class CasilleroEnlazado {
    CasilleroEnlazado arriba;
    CasilleroEnlazado abajo;
    CasilleroEnlazado derecha;
    CasilleroEnlazado izquierda;

    public CasilleroEnlazado(){
        this.arriba = this;
        this.abajo = this;
        this.derecha = this;
        this.izquierda = this;
    }

    public void enlazarAIzquierda(CasilleroEnlazado vecino)
    {
        this.izquierda = vecino;
        vecino.enlazarADerecha(this);
    }


    public void enlazarADerecha(CasilleroEnlazado vecino)
    {
        this.derecha = vecino;
    }


    public void enlazarArriba(CasilleroEnlazado vecino)
    {
        this.arriba = vecino;
        vecino.enlazarAbajo(this);
    }

    public void enlazarAbajo(CasilleroEnlazado vecino) {
        this.abajo = vecino;
    }

    public CasilleroEnlazado casilleroAIzquierda() {
        return this.izquierda;
    }

    public CasilleroEnlazado casilleroADerecha() {
        return this.derecha;
    }

    public CasilleroEnlazado casilleroArriba() {
        return this.arriba;
    }

    public CasilleroEnlazado casilleroAbajo() {
        return this.abajo;
    }
}
