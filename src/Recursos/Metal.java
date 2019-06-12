package Recursos;

import Herramientas.*;

public class Metal extends Recurso {

    public Metal() {
        super.setDurabilidad(50);
    }

    public void golpearCon(Herramienta herramienta){
        herramienta.golpear(this);
    }

}
