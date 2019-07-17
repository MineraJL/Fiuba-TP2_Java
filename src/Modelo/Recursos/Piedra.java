package Modelo.Recursos;

import Modelo.Herramientas.*;
import Modelo.Mapa.Item;
import Modelo.MateriaPrima.MPPiedra;

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