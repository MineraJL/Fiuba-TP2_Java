package Modelo.Herramientas;

import Modelo.Desgastes.*;
import Modelo.Inventario.InventarioHerramienta;
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


    // Set
    public void asignarFuerza(int fuerza){
        this.fuerza= fuerza;
    }
    public void asignarDesgaste(Desgaste desgaste){
        this.desgaste = desgaste;
    }





    // Get
    public int fuerza() {
        return this.fuerza;
    }

    public int durabilidad(){
        return this.desgaste.durabilidad();
    }


    // Dispatch
    public void golpear(Recurso recurso) { recurso.golpearCon(this);}
    // Fin dispatch

    public void golpear(Madera material){
        this.desgaste.desgastarCon(this.fuerza);
    }
    public void golpear(Piedra material){
        this.desgaste.desgastarCon(this.fuerza);
    }
    public void golpear(Metal material){
        this.desgaste.desgastarCon(this.fuerza);
    }
    public void golpear(Diamante material){
        this.desgaste.desgastarCon(this.fuerza);
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