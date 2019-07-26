package Modelo.Recursos;
import Modelo.Herramientas.Herramienta;
import Modelo.MateriaPrima.MPDiamante;

public class Diamante extends Recurso {

    public Diamante() {
        this.durabilidad = new DurabilidadRecurso(100);
        this.MPaLiberar = new MPDiamante();
    }

    public void golpearCon(Herramienta herramienta){
            herramienta.golpear(this);
    }

    @Override
    public void golpeateCon(Herramienta herramienta){herramienta.golpear(this);}

}
