package Modelo.Recursos;

import Modelo.Herramientas.Herramienta;
import Modelo.MateriaPrima.MPMetal;

public class Metal extends Recurso {

    public Metal() {
        this.durabilidad = new DurabilidadRecurso(50);
        this.MPaLiberar = new MPMetal();
    }

    public void golpearCon(Herramienta herramienta){
        herramienta.golpear(this);
    }

    @Override
    public void golpeateCon(Herramienta herramienta){herramienta.golpear(this);}
}
