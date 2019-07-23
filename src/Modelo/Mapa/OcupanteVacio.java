package Modelo.Mapa;

import Modelo.Herramientas.Herramienta;
import Modelo.TipoMaterial.TipoMaterial;

public class OcupanteVacio implements Ocupante {

    private Casillero casillero;

    @Override
    public void setCasillero(Casillero casilleroRecibido) {
        this.casillero = casilleroRecibido;
    }


    @Override
    public Casillero getCasillero(){return new Casillero();}
    @Override
    public PosicionEnlazada getPosicion(){return new PosicionEnlazada(0,0);}
    @Override
    public void ingresar(Mapa mapa, PosicionEnlazada posicion){}

	@Override
	public void serGolpeadoCon(Herramienta unaHerramienta) {}


	@Override
	public void serGolpeadoCon(TipoMaterial material, int fuerza) {}
}
