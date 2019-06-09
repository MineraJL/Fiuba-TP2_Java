package Recursos;

import Herramientas.PicoFino;

public class Diamante extends Material {

    public Diamante(int durabilidadInicial) {
        super(durabilidadInicial);
    }
/*s
    @Override
    public void recibirGolpeDe(PicoFino picoFino) {
        this.durabilidad = this.durabilidad - picoFino.fuerza();
    }
    */
}
