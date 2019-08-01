package Modelo.Herramientas;

import Modelo.Desgastes.Desgaste;
import Modelo.Excepciones.DurabilidadDesgastadaExcepcion;
import Modelo.Excepciones.HerramientaDesgastadaExcepcion;
import Modelo.Inventario.InventarioHerramienta;
import Modelo.Mapa.Ocupante;
import Modelo.Recursos.*;
import Modelo.TipoMaterial.*;

public abstract class Herramienta {

    protected int fuerza;
    protected Desgaste desgaste;
    protected TipoMaterial material;


    public Herramienta(TipoMaterial material){
        this.material=material;
    }


    public abstract void agregarAlInventario(InventarioHerramienta inventario);

    public void agregarAlInventario(InventarioHerramienta inventario, TipoMadera madera){}
    public void agregarAlInventario(InventarioHerramienta inventario, TipoPiedra piedra){}
    public void agregarAlInventario(InventarioHerramienta inventario, TipoMetal metal){}
    public void agregarAlInventario(InventarioHerramienta inventario, TipoMetalYPiedra metalYPiedra){}

    public void asignarMaterial(TipoMaterial material){material.definirValores(this);}
    public void asignarMaterial(TipoMadera madera){}
    public void asignarMaterial(TipoPiedra piedra){}
    public void asignarMaterial(TipoMetal metal){}
    public void asignarMaterial(TipoMetalYPiedra metalYPiedra){}


    protected void asignarFuerza(int fuerza){
        this.fuerza= fuerza;
    }
    protected void asignarDesgaste(Desgaste desgaste){
        this.desgaste = desgaste;
    }


    public int fuerza() {
        return this.fuerza;
    }

    public int durabilidad(){
        return this.desgaste.durabilidad();
    }

    public abstract void golpear(Ocupante ocupante) throws HerramientaDesgastadaExcepcion;

    // Dispatch
    public void golpear(Recurso recurso) throws HerramientaDesgastadaExcepcion { recurso.golpearCon(this);}
    // Fin dispatch

    public void golpear(Madera material) throws HerramientaDesgastadaExcepcion{
        try {
			this.desgaste.desgastarCon(this.fuerza);
		} catch (DurabilidadDesgastadaExcepcion e) {
			throw new HerramientaDesgastadaExcepcion();
		}
    }
    public void golpear(Piedra material) throws HerramientaDesgastadaExcepcion{
        try {
			this.desgaste.desgastarCon(this.fuerza);
		} catch (DurabilidadDesgastadaExcepcion e) {
			throw new HerramientaDesgastadaExcepcion();
		}
    }
    public void golpear(Metal material) throws HerramientaDesgastadaExcepcion{
        try {
			this.desgaste.desgastarCon(this.fuerza);
		} catch (DurabilidadDesgastadaExcepcion e) {
			throw new HerramientaDesgastadaExcepcion();
		}
    }
    public void golpear(Diamante material) throws HerramientaDesgastadaExcepcion{
        try {
			this.desgaste.desgastarCon(this.fuerza);
		} catch (DurabilidadDesgastadaExcepcion e) {
			throw new HerramientaDesgastadaExcepcion();
		}
    }

    @Override
    public boolean equals(Object otraHerramienta){
        if (otraHerramienta.getClass() == this.getClass() ){
            Herramienta paraComparar =  this.getClass().cast(otraHerramienta);
            return paraComparar.material.equals(this.material);
        }
        return false;

    }


}