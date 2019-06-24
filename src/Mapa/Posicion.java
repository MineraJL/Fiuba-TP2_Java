package Mapa;

public class Posicion {

    private int coorX;
    private int coorY;

    public Posicion(int coorX, int coorY) {
        this.coorX = coorX;
        this.coorY = coorY;
    }

    public Posicion siguientePosicion(Direccion direccion) {
        return direccion.proximaPosicion(this);
    }

    public int getX() {
        return this.coorX;
    }

    public int getY() {
        return this.coorY;
    }

    //@Override
    public boolean equals(Posicion otraPosicion){
        return ((this.getX()==otraPosicion.getX()) && (this.getY() == otraPosicion.getY()));
    }
}
