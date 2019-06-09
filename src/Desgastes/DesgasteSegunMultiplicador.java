package Desgastes;

public class DesgasteSegunMultiplicador extends Desgaste {

    private double multiplicador;

    public DesgasteSegunMultiplicador(double multiplicadorDesgaste, int durabilidadDesgaste) {
        this.multiplicador = multiplicadorDesgaste;
        this.durabilidad = durabilidadDesgaste;
    }

    public void desgastarCon(int cantidad){

        this.durabilidad = this.durabilidad - (int)(cantidad * this.multiplicador);

    }

    public void desgastar(){


    }

}
