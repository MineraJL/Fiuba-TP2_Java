package Recursos;
import Herramientas.*;
import Mapa.Item;
import MateriaPrima.MPDiamante;

public class Diamante extends Recurso {

    public Diamante() {
        super.setDurabilidad(100);
    }

        public void golpearCon(Herramienta herramienta){
            herramienta.golpear(this);
    }
        
        public Item liberarMateriaPrima() {
        	return new MPDiamante();
        }

}
