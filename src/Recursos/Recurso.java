package Recursos;


import Herramientas.*;
import Mapa.Casillero;
import Mapa.Item;

public abstract class Recurso implements Item {

    protected int durabilidad;
    protected Casillero casillero;

    protected Recurso() {

    }

    // Implementacion interface item
    public void setCasillero(Casillero casillero){
        this.casillero= casillero;
    }
    public Casillero getCasillero(){
        return this.casillero;
    }
    public int getFila(){
        return this.casillero.getFila();
    }
    public int getColumna(){
        return this.casillero.getColumna();
    }

    public void intercambiarCasilleros(Item item){}

    public void moverArriba(){

    }
    public void moverAbajo(){

    }
    public void moverIzquierda(){

    }
    public void moverDerecha(){    }
    // Fin implementacion



    public abstract void golpearCon(Herramienta herramienta);

    protected void setDurabilidad(int durabilidad){
        this.durabilidad = durabilidad;
    }

    public int durabilidad(){
        return this.durabilidad;
    }

    public void reducirDurabilidadEn(int cantidadAReducir) {
        this.durabilidad = this.durabilidad - cantidadAReducir;
    }
}