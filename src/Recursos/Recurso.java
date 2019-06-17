package Recursos;


import Herramientas.*;
import Mapa.*;

public abstract class Recurso implements Item {

    protected int durabilidad;
    protected Casillero casillero;

    protected Recurso() {
        this.setCasillero(new Casillero());
    }

    // Implementacion interface item
    public void setCasillero(Casillero casillero){
        this.casillero= casillero;
    }

    public Casillero getCasillero(){
        return this.casillero;
    }

    public Posicion getPosicion(){return this.casillero.getPosicion();}

    public void mover(Mapa mapa, Direccion direccion){
    }
    public void ingresar(Mapa mapa, Posicion posicion){ mapa.getCasillero(posicion).setItem(this);}
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