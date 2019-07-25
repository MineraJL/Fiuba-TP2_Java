package Modelo.Recursos;
import Modelo.Herramientas.Herramienta;
import Modelo.MateriaPrima.MPDiamante;
import Modelo.TipoMaterial.TipoMaterial;

public class Diamante extends Recurso {

    public Diamante() {
        this.durabilidad = new DurabilidadRecurso(100);
        this.MPaLiberar = new MPDiamante();
    }

    public void golpearCon(Herramienta herramienta){
            herramienta.golpear(this);
    }
    
    public void golpearCon(TipoMaterial material, int fuerza, Herramienta herramienta){
    	herramienta.golpearCon(material, fuerza, this);
    }

}
