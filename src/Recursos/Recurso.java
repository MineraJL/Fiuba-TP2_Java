package Recursos;


import Herramientas.*;

public abstract class Recurso {

    protected int durabilidad;

    protected Recurso() {

    }


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