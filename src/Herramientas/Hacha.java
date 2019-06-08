package Herramientas;

import Materiales.Madera;

public class Hacha extends Herramienta {

    public Hacha(int fuerza){
        super(fuerza,0);
    }


    public Hacha(int fuerza, Madera material) {
        super(fuerza,100);
        this.material = material;
    }

    @Override
    public void golpear(Madera material){
        this.durabilidad = DurabilidadHerramienta.desgastar(this,(Madera)this.material);
        material.recibirGolpeDe(this);
    }


}