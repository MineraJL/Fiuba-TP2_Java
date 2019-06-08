package Desgastes;

public class DesgasteSegunMultiplicador {

    private int multiplicador;
    private int durabilidad;

    public DesgasteSegunMultiplicador(int multiplicadorDesgaste, int durabilidadDesgaste) {
        this.multiplicador = multiplicadorDesgaste;
        this.durabilidad = durabilidadDesgaste;
    }

    public void desgastarCon(int cantidad){

        this.durabilidad = this.durabilidad - cantidad * this.multiplicador;

    }

    public int durabilidad(){
        return this.durabilidad;
    }
}
