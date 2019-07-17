package Modelo.Recursos;

import Modelo.Herramientas.*;
import Modelo.Mapa.Ocupante;
import Modelo.MateriaPrima.*;

public class Madera extends Recurso {

    public Madera() {
        this.setDurabilidad(10);
    }

    public void golpearCon(Herramienta herramienta){
        herramienta.golpear(this);
    }
    
    public Ocupante liberarMateriaPrima() {
    	return new MPMadera();
    }

}