package Recursos;

import Herramientas.*;
import Mapa.Item;
import MateriaPrima.MPPiedra;

public class Piedra extends Recurso {
    public Piedra() {
        super.setDurabilidad(30);
    }

    public void golpearCon(Herramienta herramienta){
        herramienta.golpear(this);
    }
    
    public Item liberarMateriaPrima() {
    	return new MPPiedra();
    }
}