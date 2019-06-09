package Herramientas;

import Desgastes.DesgastePorUsos;
import Desgastes.DesgasteSegunMultiplicador;
import Materiales.Madera;
import Materiales.Metal;
import Materiales.Piedra;

public class Pico extends Herramienta {

    public Pico(Madera material) {
        super(2, new DesgasteSegunMultiplicador(1,100));
    }

    public Pico(Piedra material) {
        super(5, new DesgasteSegunMultiplicador(1.5,200));
    }

    public Pico(Metal material) {
        super(10, new DesgastePorUsos(10, 400));
    }




    @Override
    public void golpear(Piedra material) {
        material.reducirDurabilidadEn(this.fuerza);
    }




}