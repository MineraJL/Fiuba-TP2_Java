package Materiales;

import Herramientas.PicoFino;

public class Diamante extends Material {

    public Diamante(int durabilidadInicial) {
        super(durabilidadInicial);
    }

    @Override
    public void recibirGolpeDe(PicoFino picoFino) {
        this.durabilidad = this.durabilidad - picoFino.Fuerza();
    }
}