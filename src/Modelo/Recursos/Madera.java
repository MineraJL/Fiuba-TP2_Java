package Modelo.Recursos;

import Modelo.Herramientas.Herramienta;
import Modelo.MateriaPrima.MPMadera;

public class Madera extends Recurso {

    public Madera() {
        this.durabilidad = new DurabilidadRecurso(10);
        this.MPaLiberar = new MPMadera();
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