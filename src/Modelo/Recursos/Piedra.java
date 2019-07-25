package Modelo.Recursos;

import Modelo.Herramientas.Herramienta;
import Modelo.MateriaPrima.MPPiedra;

public class Piedra extends Recurso {
    public Piedra() {
        this.durabilidad = new DurabilidadRecurso(30);
        this.MPaLiberar = new MPPiedra();
    }

    public void golpearCon(Herramienta herramienta){
        herramienta.golpear(this);
    }
    
    /*public void golpearCon(TipoMaterial material, int fuerza, Herramienta herramienta){
    	herramienta.golpearCon(material, fuerza, this);
    }*/

    @Override
    public void golpeateCon(Herramienta herramienta){herramienta.golpear(this);}

}