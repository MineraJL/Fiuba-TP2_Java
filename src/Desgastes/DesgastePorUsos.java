package Desgastes;

public class DesgastePorUsos {
    private int durabilidad;
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

    public int durabilidad(){
        return this.durabilidad;
    }

}
