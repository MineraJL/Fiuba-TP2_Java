package Modelo.Recursos;
import Modelo.Excepciones.HerramientaDesgastadaExcepcion;
import Modelo.Herramientas.Herramienta;
import Modelo.MateriaPrima.MPDiamante;

public class Diamante extends Recurso {

    public Diamante() {
        this.durabilidad = new DurabilidadRecurso(100);
        this.MPaLiberar = new MPDiamante();
    }

    public void golpearCon(Herramienta herramienta) throws HerramientaDesgastadaExcepcion{
            herramienta.golpear(this);
    }

    @Override
    public void golpeateCon(Herramienta herramienta) throws HerramientaDesgastadaExcepcion{
    	herramienta.golpear(this);
    }

}
