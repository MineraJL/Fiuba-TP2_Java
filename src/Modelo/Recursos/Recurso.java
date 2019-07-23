package Modelo.Recursos;


import Modelo.Herramientas.Herramienta;
import Modelo.Mapa.Casillero;
import Modelo.Mapa.Mapa;
import Modelo.Mapa.Ocupante;
import Modelo.Mapa.PosicionEnlazada;
import Modelo.MateriaPrima.MateriaPrima;
import Modelo.TipoMaterial.TipoMaterial;

public abstract class Recurso implements Ocupante {

    protected DurabilidadRecurso durabilidad;
    protected Casillero casillero;
    protected MateriaPrima MPaLiberar;

    protected Recurso() {
        this.setCasillero(new Casillero());
    }

    public void reducirDurabilidadEn(int cantidadAReducir) {
        this.durabilidad.reducirDurabilidadEn(cantidadAReducir,this.MPaLiberar,this.casillero);
    }

    // Implementacion interface Ocupante
    public void setCasillero(Casillero casillero){
        this.casillero= casillero;
    }

    public Casillero getCasillero(){
        return this.casillero;
    }

    public PosicionEnlazada getPosicion(){return this.casillero.getPosicion();}

    public void ingresar(Mapa mapa, PosicionEnlazada posicion){ mapa.getCasillero(posicion).ocuparPor(this);}
    // Fin implementacion

    public int durabilidad(){
        return this.durabilidad.durabilidad();
    }

    public abstract void golpearCon(Herramienta herramienta);
    public abstract void golpearCon(TipoMaterial meterial, int fuerza);

    @Override
    public boolean equals(Object object){
        return object.getClass() == this.getClass();
    }
    
	@Override
	public void serGolpeadoCon(Herramienta unaHerramienta) {
		this.golpearCon(unaHerramienta);
		
	}
	
	@Override
	public void serGolpeadoCon(TipoMaterial material, int fuerza) {
		this.golpearCon(material, fuerza);
		
	}

}