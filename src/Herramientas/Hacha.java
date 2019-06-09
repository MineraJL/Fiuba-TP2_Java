package Herramientas;

import Desgastes.DesgasteSegunMultiplicador;
import Materiales.Madera;
import Materiales.Metal;
import Materiales.Piedra;
import TipoMaterial.*;

public class Hacha extends Herramienta {


    public Hacha(TipoMadera madera) {
        super(2, new DesgasteSegunMultiplicador(1,100));
        this.material= madera;
    }

    public Hacha(TipoPiedra piedra) {
        super(4, new DesgasteSegunMultiplicador(1,200));
        this.material= piedra;

    }

    public Hacha(TipoMetal metal) {
        super(12, new DesgasteSegunMultiplicador(0.5,400));
        this.material= metal;

    }


    @Override
    public void golpear(Madera recursoMadera){
        this.desgaste.desgastarCon(this.fuerza);
        this.material.golpear(recursoMadera, this.fuerza);
    }


}