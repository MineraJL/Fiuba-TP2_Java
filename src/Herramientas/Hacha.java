package Herramientas;

import Desgastes.DesgasteSegunMultiplicador;
import Recursos.Madera;
import TipoMaterial.*;

public class Hacha extends Herramienta {


    public Hacha(TipoMaterial material){
        super(material);
        this.material.definirValores(this);
    }


    // Asignar valores por material - Dispatch
    public void asignarMaterial(TipoMadera madera){
        this.asignarFuerza(2);
        this.asignarDesgaste(new DesgasteSegunMultiplicador(1,100));
    }

    public void asignarMaterial(TipoPiedra piedra){
        this.asignarFuerza(5);
        this.asignarDesgaste(new DesgasteSegunMultiplicador(1,200));
    }

    public void asignarMaterial(TipoMetal metal){
        this.asignarFuerza(10);
        this.asignarDesgaste(new DesgasteSegunMultiplicador(0.5,400));
    }
    // Fin Dispatch


    @Override
    public void golpear(Madera recursoMadera){
        super.golpear(recursoMadera);
        this.material.golpear(recursoMadera, this.fuerza);
    }


}