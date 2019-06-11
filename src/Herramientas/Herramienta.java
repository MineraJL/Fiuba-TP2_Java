package Herramientas;

import Desgastes.*;
import Recursos.*;
import TipoMaterial.*;

public abstract class Herramienta {

    protected int fuerza;
    protected Desgaste desgaste;
    protected TipoMaterial material;


    protected Herramienta(int fuerzaIndicada,  Desgaste desgasteIndicado){
        this.fuerza = fuerzaIndicada;
        this.desgaste = desgasteIndicado;
    }

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
