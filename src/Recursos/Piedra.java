package Recursos;

import Herramientas.Pico;

public class Piedra extends Material {
    public Piedra(int durabilidadInicial) {
        super(durabilidadInicial);
    }

    @Override
    public void recibirGolpeDe(Pico pico) {
        this.durabilidad = this.durabilidad - pico.fuerza();
    }
}