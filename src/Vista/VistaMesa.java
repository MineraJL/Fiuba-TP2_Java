package Vista;

import Modelo.Modelo;
import javafx.scene.canvas.Canvas;
import javafx.scene.image.Image;

public class VistaMesa {

    private Modelo modelo;
    private Canvas canvas;

    public VistaMesa(Modelo modelo, Canvas canvasMesa) {
        this.modelo = modelo;
        this.canvas = canvasMesa;
    }

    public void dibujar() {
        //Image imagenRandom = new Image("Imagenes/unFondoCualquiera.png");
        Imagenes imagenes = new Imagenes();
        Image imagenRandomDePrueba = imagenes.getImage("pasto");
        canvas.getGraphicsContext2D().drawImage(imagenRandomDePrueba, 15, 15);

    }
}
