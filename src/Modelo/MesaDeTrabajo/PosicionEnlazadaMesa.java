package Modelo.MesaDeTrabajo;

public class PosicionEnlazadaMesa {

    private int i;
    private int j;

    private PosicionEnlazadaMesa siguiente;
    private PosicionEnlazadaMesa anterior;

    private void inicializarSiguienteYAnterior() {
        this.anterior = this;
        this.siguiente = this;
    }

    public PosicionEnlazadaMesa(int i, int j) {
        this.i = i;
        this.j = j;
        this.inicializarSiguienteYAnterior();
    }

    public PosicionEnlazadaMesa siguiente(){return this.siguiente;}



}
