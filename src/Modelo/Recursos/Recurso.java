package Modelo.Recursos;


import Modelo.Excepciones.HerramientaDesgastadaExcepcion;
import Modelo.Herramientas.Herramienta;
import Modelo.Inventario.Inventario;
import Modelo.Mapa.Casillero;
import Modelo.Mapa.Ocupante;
import Modelo.MateriaPrima.MateriaPrima;

public abstract class Recurso extends Ocupante {

    protected DurabilidadRecurso durabilidad;
    protected MateriaPrima MPaLiberar;

    protected Recurso() {
        this.establecerCasillero(new Casillero());
    }

    public void reducirDurabilidadEn(int cantidadAReducir) {
        this.durabilidad.reducirDurabilidadEn(cantidadAReducir,this.MPaLiberar,this.casillero);
    }

    // Ocupante

    public abstract void golpeateCon(Herramienta herramienta) throws HerramientaDesgastadaExcepcion;

    public void serRecolectadoEn(Inventario inventario){}

    // Fin

    public int durabilidad(){
        return this.durabilidad.durabilidad();
    }

    public abstract void golpearCon(Herramienta herramienta) throws HerramientaDesgastadaExcepcion;

}