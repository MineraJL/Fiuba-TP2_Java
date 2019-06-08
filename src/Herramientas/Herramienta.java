package Herramientas;

import Materiales.Madera;
import Materiales.Material;

public abstract class Herramienta {

    protected int fuerza;

    protected int durabilidad;
    protected Material material;

    public Herramienta(int fuerza, int durabilidadInicial){
        this.fuerza = fuerza;
        this.durabilidad = durabilidadInicial;
    }

    public int Fuerza() {
        return this.fuerza;
    }

    public int durabilidad(){
        return this.durabilidad;
    }

    public abstract void golpear(Madera material);
}
