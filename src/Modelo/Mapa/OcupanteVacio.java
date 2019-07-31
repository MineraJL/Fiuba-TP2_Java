package Modelo.Mapa;

import Modelo.Herramientas.Herramienta;
import Modelo.Inventario.Inventario;

public class OcupanteVacio extends Ocupante {

    public OcupanteVacio(){
        this.casillero = new Casillero(new PosicionEnlazada(0,0));
    }

    @Override
    public void golpeateCon(Herramienta herramienta){}
    @Override
    public void serRecolectadoEn(Inventario inventario){}

}
