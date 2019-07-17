package Modelo.Recursos;

import Modelo.Herramientas.*;
import Modelo.Mapa.Item;
import Modelo.MateriaPrima.MPMetal;

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
