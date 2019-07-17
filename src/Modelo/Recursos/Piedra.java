package Modelo.Recursos;

import Modelo.Herramientas.*;
import Modelo.Mapa.Ocupante;
import Modelo.MateriaPrima.MPPiedra;

public class Piedra extends Recurso {
    public Piedra() {
        super.setDurabilidad(30);
    }

    public void golpearCon(Herramienta herramienta){
        herramienta.golpear(this);
    }
    
    public Ocupante liberarMateriaPrima() {
    	return new MPPiedra();
    }
}