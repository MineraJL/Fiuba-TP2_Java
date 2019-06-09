package Herramientas;

import Desgastes.Desgaste;
import Materiales.Madera;
import Materiales.Material;
import Materiales.Metal;
import Materiales.Piedra;
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

    public void golpear(Madera material){}
    public void golpear(Piedra material){}
    public void golpear(Metal material){}
}
