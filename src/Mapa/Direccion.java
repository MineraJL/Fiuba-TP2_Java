package Mapa;

public class Direccion {

    private static Direccion arriba;
    private static Direccion abajo;
    private static Direccion derecha;
    private static Direccion izquierda;

    static {
        arriba = new Direccion(0, 1);
        abajo = new Direccion(0, -1);
        derecha = new Direccion(1, 0);
        izquierda = new Direccion(-1, 0);
    }


    private int coordenadaX;
    private int coordenadaY;

    private Direccion(int x, int y) {
        this.coordenadaX = x;
        this.coordenadaY = y;

    }

    public static Direccion arriba() {
        return arriba;
    }

    public static Direccion abajo() {
        return abajo;
    }

    public static Direccion derecha() {
        return derecha;
    }

    public static Direccion izquierda() {
        return izquierda;
    }

    public Posicion proximaPosicion(Posicion posicion) {
        int x = posicion.getX() + this.coordenadaX;
        int y = posicion.getY() + this.coordenadaY;

        return new Posicion(x, y);
    }



}
