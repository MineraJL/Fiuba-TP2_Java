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

    @Override
    public void golpeateCon(Herramienta herramienta){herramienta.golpear(this);}

    @Override
    public String obtenerNombreOcupante(){
        return this.getClass().getSimpleName();
    }

}