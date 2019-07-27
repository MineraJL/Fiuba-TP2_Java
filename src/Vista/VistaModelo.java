package Vista;

import Modelo.Mapa.PosicionEnlazada;
import Modelo.Modelo;
import javafx.scene.canvas.Canvas;
import javafx.scene.image.Image;

public class VistaModelo {
    private Modelo modelo;
    private Canvas canvas;
    private Imagenes imagenes;

    public VistaModelo(Modelo modelo, Canvas canvas){
        this.modelo = modelo;
        this.canvas = canvas;
        this.imagenes = new Imagenes();
    }

    public void dibujar() {

        for (int columna=0; columna<modelo.cantColumnasMapa();columna++) {
            for (int fila = 0; fila < modelo.cantFilasMapa(); fila++) {
                PosicionEnlazada posActual = new PosicionEnlazada(fila, columna);
                String nombreOcupante = modelo.mapa().ocupante(posActual).obtenerNombreOcupante();

                Image imagenOcupante = imagenes.getImage(nombreOcupante);

                canvas.getGraphicsContext2D().drawImage(imagenOcupante, 32*columna, 32*fila);
            }
        }

    }

    public void actualizar(){
        this.dibujar();
    }
}

