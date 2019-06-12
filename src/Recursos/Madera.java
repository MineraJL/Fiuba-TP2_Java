package Recursos;

import Herramientas.*;

public class Madera extends Recurso {

    public Madera() {
        this.setDurabilidad(10);
    }

    public void golpearCon(Herramienta herramienta){
        herramienta.golpear(this);
    }

}