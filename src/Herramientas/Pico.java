package Herramientas;

import Desgastes.DesgastePorUsos;
import Desgastes.DesgasteSegunMultiplicador;
import Recursos.Metal;
import Recursos.Piedra;
import TipoMaterial.TipoMadera;
import TipoMaterial.TipoMetal;
import TipoMaterial.TipoPiedra;

public class Pico extends Herramienta {

    public Pico(TipoMadera madera) {

        super(2, new DesgasteSegunMultiplicador(1,100));
        this.material= madera;
    }

    public Pico(TipoPiedra piedra) {

        super(4, new DesgasteSegunMultiplicador(0.66,200));
        this.material= piedra;
    }

    public Pico(TipoMetal metal) {
        super(12, new DesgastePorUsos(10, 400));
        this.material= metal;
    }



    @Override
    public void golpear(Piedra recursoPiedra) {
        super.golpear(recursoPiedra);
        this.material.golpear(recursoPiedra, this.fuerza);
    }

    @Override
    public void golpear(Metal recursoMetal) {
        super.golpear(recursoMetal);
        this.material.golpear(recursoMetal, this.fuerza);
    }
}