package Modelo.Recursos;

import Modelo.Herramientas.Herramienta;
import Modelo.MateriaPrima.MPMadera;
import Modelo.TipoMaterial.TipoMaterial;

public class Madera extends Recurso {

    public Madera() {
        this.durabilidad = new DurabilidadRecurso(10);
        this.MPaLiberar = new MPMadera();
    }

    public void golpearCon(Herramienta herramienta){
        herramienta.golpear(this);
    }
    
    public void golpearCon(TipoMaterial material, int fuerza){
        material.golpear(this, fuerza);
    }

}