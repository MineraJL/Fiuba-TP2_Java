package Vista;

import Modelo.Modelo;
import javafx.scene.canvas.Canvas;
import javafx.scene.image.Image;

public class VistaInventario {
    private int width;
    private int height;

    private Modelo modelo;
    private Canvas canvasInventario;
    private Imagenes imagenes;
    
    public VistaInventario(Modelo modelo, Canvas canvasInventario) {
    	this.width = 50;
    	this.height = 25;
        this.modelo = modelo;
        this.imagenes = new Imagenes();
        this.imagenes.cargarImagenesInventario();

        this.canvasInventario = canvasInventario;
    }
    
    private void inicializarInventario() {

    	canvasInventario.getGraphicsContext2D().drawImage(imagenMPEnMesa,width*0,height*0,width,height);
        for (int i=0; i<3; i++){
            for (int j=0;j<3;j++){

                String vacio = "MPVacio";
                Image imagenMPEnMesa = imagenes.getImage(vacio);
                canvasInventario.getGraphicsContext2D().drawImage(imagenMPEnMesa,width*j,height*i,width,height);

            }
        }

    }

}
