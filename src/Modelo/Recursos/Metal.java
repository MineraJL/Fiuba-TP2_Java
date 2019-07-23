package Modelo.Recursos;

import Modelo.Herramientas.Herramienta;
import Modelo.MateriaPrima.MPMetal;
import Modelo.TipoMaterial.TipoMaterial;

public class Metal extends Recurso {

    public Metal() {
        this.durabilidad = new DurabilidadRecurso(50);
        this.MPaLiberar = new MPMetal();
    }

    public void golpearCon(Herramienta herramienta){
        herramienta.golpear(this);
    }
    
    public void golpearCon(TipoMaterial material, int fuerza){
        material.golpear(this, fuerza);
    }

}
