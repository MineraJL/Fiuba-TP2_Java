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

        if (this.durabilidad>0) {
            this.durabilidad = this.durabilidad - cantidadAReducir;
        }

        if (this.durabilidad<=0){           // (parece un else pero no lo es)
            casADesocupar.desocupar();
            casADesocupar.ocuparPor(MPaLiberar);
        }

    }




}
