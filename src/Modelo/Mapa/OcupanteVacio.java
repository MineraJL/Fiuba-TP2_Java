package Modelo.Mapa;

import Modelo.Herramientas.Herramienta;
import Modelo.Inventario.Inventario;

public class OcupanteVacio extends Ocupante {

    public OcupanteVacio(){
        this.casillero = new Casillero(new PosicionEnlazada(0,0));
    }

    //@Override
    public void ingresar(Mapa mapa, PosicionEnlazada posicion){}

    @Override
    public String obtenerNombreOcupante(){return this.getClass().getSimpleName();}

    @Override
    public void golpeateCon(Herramienta herramienta){}
    @Override
    public void serRecolectadoEn(Inventario inventario){}

}
