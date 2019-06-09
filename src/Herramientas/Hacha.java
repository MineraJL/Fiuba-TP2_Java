package Herramientas;

import Desgastes.DesgasteSegunMultiplicador;
import Materiales.Madera;
import Materiales.Metal;
import Materiales.Piedra;

public class Hacha extends Herramienta {

    public Hacha(int fuerza){
        super(fuerza,0);
    }


    public Hacha(Madera material) {
        super(2, new DesgasteSegunMultiplicador(1,100));
    }

    public Hacha(Piedra material) {
        super(4, new DesgasteSegunMultiplicador(1,200));
    }

    public Hacha(Metal material) {
        super(12, new DesgasteSegunMultiplicador(0.5,400));
    }



    @Override
    public void golpear(Madera material){
        material.reducirDurabilidadEn(this.fuerza);
    }


}