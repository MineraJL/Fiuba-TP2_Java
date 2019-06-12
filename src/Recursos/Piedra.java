package Recursos;

import Herramientas.*;

public class Piedra extends Recurso {
    public Piedra() {
        super.setDurabilidad(30);
    }

    public void golpearCon(Herramienta herramienta){
        herramienta.golpear(this);
    }
}