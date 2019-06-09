package Herramientas;
import Recursos.*;
import Desgastes.DesgasteSegunMultiplicador;
import Recursos.Diamante;
import TipoMaterial.TipoMetalYPiedra;

public class PicoFino extends Herramienta {


    public PicoFino(TipoMetalYPiedra material){
        super(20, new DesgasteSegunMultiplicador(0.1,1000));
        this.material= material;
    }


    public void golpear(Diamante recursoDiamante) {
        super.golpear(recursoDiamante);
        this.material.golpear(recursoDiamante, this.fuerza);
    }
    public void golpear(Madera material){
    }
    public void golpear(Piedra material){
    }
    public void golpear(Metal material){
    }

}