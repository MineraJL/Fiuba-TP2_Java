package Materiales;

import Herramientas.Pico;

public class Metal extends Material {

    public Metal(int durabilidadInicial) {
        super(durabilidadInicial);
    }

    @Override
    public void recibirGolpeDe(Pico pico) {
        this.durabilidad = this.durabilidad - pico.fuerza();
    }
}
