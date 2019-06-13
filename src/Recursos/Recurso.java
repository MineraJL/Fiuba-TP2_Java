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
    public void agregarCasillero(Casillero casillero){
        this.casillero= casillero;
    }
    public int getFila(){
        return this.casillero.getFila();
    }
    public int getColumna(){
        return this.casillero.getColumna();
    }


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