package Materiales;

import Herramientas.Hacha;
import Herramientas.Pico;
import Herramientas.PicoFino;

public abstract class Material {
    protected int durabilidad;
    protected Material(int durabilidadInicial) {
        this.durabilidad = durabilidadInicial;
    }

    public int durabilidad(){
        return this.durabilidad;
    }

    public void reducirDurabilidadEn(int cantidadAReducir) {
        this.durabilidad = this.durabilidad - cantidadAReducir;
    }

    public void recibirGolpeDe(Hacha hacha){}

    public void recibirGolpeDe(Pico pico){}

    public void recibirGolpeDe(PicoFino picoFino){}
}