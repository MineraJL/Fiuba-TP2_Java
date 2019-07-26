package Vista;

import Modelo.Mapa.PosicionEnlazada;
import Modelo.Modelo;
import javafx.scene.canvas.Canvas;
import javafx.scene.image.Image;

public class VistaModelo {
    private Modelo modelo;
    private Canvas canvas;

    public VistaModelo(Modelo modelo, Canvas canvas){
        this.modelo = modelo;
        this.canvas = canvas;
    }

    public void dibujar() {
        // ejemplos
        //canvas.getGraphicsContext2D().drawImage(pasto, 0, 0);
        //canvas.getGraphicsContext2D().drawImage(madera, 32, 0);
        //canvas.getGraphicsContext2D().drawImage(piedra, 0, 32);
        //canvas.getGraphicsContext2D().drawImage(diamante, 32, 32);

        Imagenes imagenes = new Imagenes();

        //int columna = 0;
        for (int columna=0; columna<modelo.cantColumnasMapa();columna++) {
            for (int fila = 0; fila < modelo.cantFilasMapa(); fila++) {
                PosicionEnlazada posActual = new PosicionEnlazada(fila, columna);
                String nombreOcupante = modelo.mapa().ocupante(posActual).obtenerNombreOcupante();

                Image imagenOcupante = imagenes.getImage(nombreOcupante);

                canvas.getGraphicsContext2D().drawImage(imagenOcupante, 0 + 32 * fila, 0+32*columna);
            }
        }

    }
}

