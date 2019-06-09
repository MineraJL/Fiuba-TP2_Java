package Herramientas;

import Desgastes.DesgastePorUsos;
import Desgastes.DesgasteSegunMultiplicador;
import Materiales.Madera;
import Materiales.Metal;
import Materiales.Piedra;
import TipoMaterial.TipoMadera;
import TipoMaterial.TipoMetal;
import TipoMaterial.TipoPiedra;

public class Pico extends Herramienta {

    public Pico(TipoMadera madera) {

        super(2, new DesgasteSegunMultiplicador(1,100));
        this.material= madera;
    }

    public Pico(TipoPiedra piedra) {

        super(5, new DesgasteSegunMultiplicador(0.66,200));
        this.material= piedra;
    }

    public Pico(TipoMetal metal) {
        super(10, new DesgastePorUsos(10, 400));
        this.material= metal;
    }


    @Override
    public void golpear(Piedra recursoPiedra) {
        this.desgaste.desgastarCon(this.fuerza);
        this.material.golpear(recursoPiedra, this.fuerza);
    }

    @Override
    public void golpear(Metal recursoMetal) {
        this.desgaste.desgastarCon(this.fuerza);
        this.material.golpear(recursoMetal, this.fuerza);
    }
}