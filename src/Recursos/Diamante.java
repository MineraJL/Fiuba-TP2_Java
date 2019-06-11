package Recursos;
import Herramientas.*;

public class Diamante extends Recurso {

    public Diamante() {
        super.setDurabilidad(100);
    }

        public void golpearCon(Herramienta herramienta){
            herramienta.golpear(this);
    }

}
