package Modelo.Mapa;

import Modelo.Excepciones.HerramientaDesgastadaExcepcion;
import Modelo.Herramientas.Herramienta;

public interface Golpeable {

    void golpeateCon(Herramienta herramienta) throws HerramientaDesgastadaExcepcion;

}
