package Vista;

import Modelo.Modelo;
import javafx.scene.canvas.Canvas;
import javafx.scene.paint.Color;

public class VistaModelo {
    private Modelo modelo;
    private Canvas canvas;

    public VistaModelo(Modelo modelo, Canvas canvas){
        this.modelo = modelo;
        this.canvas = canvas;
    }

    public void dibujar() {
        canvas.getGraphicsContext2D().setFill(Color.LIGHTBLUE); // cualquier cosa


    }
}
