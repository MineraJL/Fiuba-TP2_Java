package Modelo.Recursos;

import Modelo.Excepciones.HerramientaDesgastadaExcepcion;
import Modelo.Herramientas.Herramienta;
import Modelo.MateriaPrima.MPPiedra;

public class Piedra extends Recurso {
    public Piedra() {
        this.durabilidad = new DurabilidadRecurso(30);
        this.MPaLiberar = new MPPiedra();
    }

    public void golpearCon(Herramienta herramienta) throws HerramientaDesgastadaExcepcion{
        herramienta.golpear(this);
    }

    @Override
    public void golpeateCon(Herramienta herramienta) throws HerramientaDesgastadaExcepcion{herramienta.golpear(this);}

    @Override
    public String obtenerNombreOcupante(){
        return this.getClass().getSimpleName();
    }

}