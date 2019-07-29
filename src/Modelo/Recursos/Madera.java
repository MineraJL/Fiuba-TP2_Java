package Modelo.Recursos;

import Modelo.Excepciones.HerramientaDesgastadaExcepcion;
import Modelo.Herramientas.Herramienta;
import Modelo.MateriaPrima.MPMadera;

public class Madera extends Recurso {

    public Madera() {
        this.durabilidad = new DurabilidadRecurso(10);
        this.MPaLiberar = new MPMadera();
    }

    public void golpearCon(Herramienta herramienta) throws HerramientaDesgastadaExcepcion{
        herramienta.golpear(this);
    }

    @Override
    public void golpeateCon(Herramienta herramienta) throws HerramientaDesgastadaExcepcion{
    	herramienta.golpear(this);
    	}

    @Override
    public String obtenerNombreOcupante(){return this.getClass().getSimpleName();}

}