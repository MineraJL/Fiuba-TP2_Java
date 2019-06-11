package Herramientas;

import Desgastes.*;
import Recursos.*;
import TipoMaterial.*;

public abstract class Herramienta {

    protected int fuerza;
    protected Desgaste desgaste;
    protected TipoMaterial material;


    public Herramienta(TipoMaterial material){
        this.material=material;
    }

    /*
    protected Herramienta(int fuerzaIndicada,  Desgaste desgasteIndicado){
        this.fuerza = fuerzaIndicada;
        this.desgaste = desgasteIndicado;
    }*/

    public void asignarMaterial(TipoMaterial material){material.definirValores(this);}


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
}
