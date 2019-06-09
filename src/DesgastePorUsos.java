package Desgastes;

public class DesgastePorUsos extends Desgaste {
    private int usos;


    public DesgastePorUsos(int seRompeAlUso) {
        this.durabilidad = seRompeAlUso;
        this.usos=0;

    }

    public void desgastar(){
        this.usos = this.usos + 1;
        if (this.usos == this.durabilidad){
            this.durabilidad = 0;
        }
    }

}
