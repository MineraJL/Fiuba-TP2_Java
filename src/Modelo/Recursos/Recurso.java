package Modelo.Recursos;


import Modelo.Herramientas.*;
import Modelo.Mapa.*;

public abstract class Recurso implements Ocupante {

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
    
    public void ingresar(Mapa mapa, Posicion posicion){ mapa.getCasillero(posicion).ocuparPor(this);}
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
        
        if (durabilidad <= 0) {
        	casillero.desocupar();
        	Ocupante materiaPrima = this.liberarMateriaPrima();
        	casillero.ocuparPor(materiaPrima);
        }
        	
    }


    @Override
    public boolean equals(Object object){
        return object.getClass() == this.getClass();
    }

    
    public abstract Ocupante liberarMateriaPrima();

}