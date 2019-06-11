package Herramientas;

import Desgastes.DesgasteSegunMultiplicador;
import Recursos.Madera;
import TipoMaterial.*;

public class Hacha extends Herramienta {


    public Hacha(TipoMaterial material){
        super(material);
        this.material.definirValores(this);
    }

    /*
    public Hacha(TipoMadera madera) {
        super(2, new DesgasteSegunMultiplicador(1,100));
        this.material= madera;
    }*/

    /*
    public Hacha(TipoPiedra piedra) {
        super(5, new DesgasteSegunMultiplicador(1,200));
        this.material= piedra;

    }
    */

    /*
    public Hacha(TipoMetal metal) {
        super(10, new DesgasteSegunMultiplicador(0.5,400));
        this.material= metal;

    }*/

    public void asignarMaterial(TipoMadera madera){
        this.asignarFuerza(10);
        this.asignarDesgaste(new DesgasteSegunMultiplicador(1,100);
    }

    public void asignarMaterial(TipoPiedra piedra){
        this.asignarFuerza(10);
        this.asignarDesgaste(new DesgasteSegunMultiplicador(1,100);
    }

    public void asignarMaterial(TipoMetal metal){
        this.asignarFuerza(10);
        this.asignarDesgaste(new DesgasteSegunMultiplicador(1,100);
    }

    @Override
    public void golpear(Madera recursoMadera){
        super.golpear(recursoMadera);
        this.material.golpear(recursoMadera, this.fuerza);
    }


}