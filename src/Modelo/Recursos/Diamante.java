package Modelo.Recursos;
import Modelo.Herramientas.*;
import Modelo.Mapa.Ocupante;
import Modelo.MateriaPrima.MPDiamante;

public class Diamante extends Recurso {

    public Diamante() {
        super.setDurabilidad(100);
    }

        public void golpearCon(Herramienta herramienta){
            herramienta.golpear(this);
    }
        
        public Ocupante liberarMateriaPrima() {
        	return new MPDiamante();
        }

}
