package Desgastes;

public abstract class Desgaste {

    protected int durabilidad;

    public int durabilidad(){
        return this.durabilidad;
    }

    public abstract void desgastarCon(int fuerza);

}
