package Mapa;

public class Posicion {

    private int x;
    private int y;

    public Posicion(int coorX, int coorY) {
        this.x = coorX;
        this.y = coorY;
    }

    public Posicion siguientePosicion(Direccion direccion) {
        return direccion.proximaPosicion(this);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
