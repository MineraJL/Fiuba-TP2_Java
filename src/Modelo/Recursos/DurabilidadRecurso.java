package Modelo.Recursos;

import Modelo.Mapa.Casillero;
import Modelo.MateriaPrima.MateriaPrima;

public class DurabilidadRecurso {

    private int durabilidad;

    public DurabilidadRecurso(int durabilidadInicial){
        this.durabilidad = durabilidadInicial;
    }

    public int durabilidad(){return this.durabilidad;}

    public void reducirDurabilidadEn(int cantidadAReducir, MateriaPrima MPaLiberar, Casillero casADesocupar){

        this.durabilidad = this.durabilidad - cantidadAReducir;

        if (this.durabilidad <= 0) {
            casADesocupar.desocupar();
            casADesocupar.ocuparPor(MPaLiberar);
        }

    }




}
