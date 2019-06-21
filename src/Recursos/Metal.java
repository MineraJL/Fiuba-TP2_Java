package Recursos;

import Herramientas.*;
import Mapa.Item;
import MateriaPrima.MPMetal;

public class Metal extends Recurso {

    public Metal() {
        super.setDurabilidad(50);
    }

    public void golpearCon(Herramienta herramienta){
        herramienta.golpear(this);
    }
    
    public Item liberarMateriaPrima() {
    	return new MPMetal();
    }

}
