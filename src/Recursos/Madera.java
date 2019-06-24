package Recursos;

import Herramientas.*;
import Mapa.Item;
import MateriaPrima.*;

public class Madera extends Recurso {

    public Madera() {
        this.setDurabilidad(10);
    }

    public void golpearCon(Herramienta herramienta){
        herramienta.golpear(this);
    }
    
    public Item liberarMateriaPrima() {
    	return new MPMadera();
    }

}