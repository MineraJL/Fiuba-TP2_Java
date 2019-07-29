package Modelo.Recursos;


import Modelo.Excepciones.HerramientaDesgastadaExcepcion;
import Modelo.Herramientas.Herramienta;
import Modelo.Inventario.Inventario;
import Modelo.Mapa.Casillero;
import Modelo.Mapa.Mapa;
import Modelo.Mapa.Ocupante;
import Modelo.Mapa.PosicionEnlazada;
import Modelo.MateriaPrima.MateriaPrima;

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

    // Implementacion interfaz Ocupante
    public void setCasillero(Casillero casillero){
        this.casillero= casillero;
    }

    public Casillero getCasillero(){
        return this.casillero;
    }

    public PosicionEnlazada getPosicion(){return this.casillero.getPosicion();}

    public void ingresar(Mapa mapa, PosicionEnlazada posicion){ mapa.getCasillero(posicion).ocuparPor(this);}

    public abstract String obtenerNombreOcupante();

    public abstract void golpeateCon(Herramienta herramienta) throws HerramientaDesgastadaExcepcion;

    public void serRecolectadoEn(Inventario inventario){}

    // Fin implementacion

    public int durabilidad(){
        return this.durabilidad.durabilidad();
    }

    public abstract void golpearCon(Herramienta herramienta) throws HerramientaDesgastadaExcepcion;

    @Override
    public boolean equals(Object object){
        return object.getClass() == this.getClass();
    }

}