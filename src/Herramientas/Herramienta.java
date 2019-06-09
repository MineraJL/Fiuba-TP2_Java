package Herramientas;

import Desgastes.Desgaste;
import Materiales.Madera;
import Materiales.Material;
import Materiales.Metal;
import Materiales.Piedra;

public abstract class Herramienta {

    protected int fuerza;
    protected Desgaste desgaste;


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

    public abstract void golpear(Madera material);
    public abstract void golpear(Piedra material);
    public abstract void golpear(Metal material);
}
