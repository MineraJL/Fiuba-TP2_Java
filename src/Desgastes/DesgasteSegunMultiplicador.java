package Desgastes;

public class DesgasteSegunMultiplicador extends Desgaste {

    private int multiplicador;

    public DesgasteSegunMultiplicador(int multiplicadorDesgaste, int durabilidadDesgaste) {
        this.multiplicador = multiplicadorDesgaste;
        this.durabilidad = durabilidadDesgaste;
    }

    public void desgastarCon(int cantidad){

        this.durabilidad = this.durabilidad - cantidad * this.multiplicador;

    }

}
