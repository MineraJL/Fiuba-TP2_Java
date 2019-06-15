package Mapa;

public class Direccion {

    private static Direccion norte;
    private static Direccion sur;
    private static Direccion este;
    private static Direccion oeste;

    static {
        norte = new Direccion(0, 1);
        sur = new Direccion(0, -1);
        este = new Direccion(1, 0);
        oeste = new Direccion(-1, 0);
    }


    private int coordenadaX;
    private int coordenadaY;

    private Direccion(int x, int y) {
        this.coordenadaX = x;
        this.coordenadaY = y;

    }

    public static Direccion norte() {
        return norte;
    }

    public static Direccion sur() {
        return sur;
    }

    public static Direccion este() {
        return este;
    }

    public static Direccion oeste() {
        return oeste;
    }

    public Posicion proximaPosicion(Posicion posicion) {
        int x = posicion.getX() + this.coordenadaX;
        int y = posicion.getY() + this.coordenadaY;

        return new Posicion(x, y);
    }



}
