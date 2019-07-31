package Modelo.Recursos;

import Modelo.Excepciones.HerramientaDesgastadaExcepcion;
import Modelo.Herramientas.Herramienta;
import Modelo.MateriaPrima.MPMetal;

public class Metal extends Recurso {

    public Metal() {
        this.durabilidad = new DurabilidadRecurso(50);
        this.MPaLiberar = new MPMetal();
    }

    public void golpearCon(Herramienta herramienta) throws HerramientaDesgastadaExcepcion{
        herramienta.golpear(this);
    }

    @Override
    public void golpeateCon(Herramienta herramienta) throws HerramientaDesgastadaExcepcion{
    	herramienta.golpear(this);
    }

}
