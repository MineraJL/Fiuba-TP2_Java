package Modelo.Desgastes;

public class DesgastePorUsos extends Desgaste {
    private int usos;
    private int usosMaximos;


    public DesgastePorUsos(int seRompeAlUso, int durabilidadInicial) {
        this.durabilidad = durabilidadInicial;
        this.usos=0;
        this.usosMaximos = seRompeAlUso;

    }

    public void desgastarCon(int fuerza){
        this.usos = this.usos + 1;
        if (this.usos == this.usosMaximos){
            this.durabilidad = 0;
        }

    }

}
