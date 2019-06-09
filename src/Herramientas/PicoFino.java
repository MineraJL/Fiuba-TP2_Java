package Herramientas;

import Desgastes.DesgastePorUsos;
import Desgastes.DesgasteSegunMultiplicador;
import Materiales.Diamante;
import TipoMaterial.TipoMetalYPiedra;

public class PicoFino extends Herramienta {


    public PicoFino(TipoMetalYPiedra material){
        super(20, new DesgasteSegunMultiplicador(0.1,1000));
        this.material= material;
    }

    @Override
    public void golpear(Diamante recursoDiamante) {
        this.desgaste.desgastarCon(this.fuerza);
        this.material.golpear(recursoDiamante, this.fuerza);
    }

}