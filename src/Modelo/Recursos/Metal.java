package Modelo.Recursos;

import Modelo.Herramientas.*;
import Modelo.Mapa.Ocupante;
import Modelo.MateriaPrima.MPMetal;

public class Metal extends Recurso {

    public Metal() {
        super.setDurabilidad(50);
    }

    public void golpearCon(Herramienta herramienta){
        herramienta.golpear(this);
    }
    
    public Ocupante liberarMateriaPrima() {
    	return new MPMetal();
    }

}
