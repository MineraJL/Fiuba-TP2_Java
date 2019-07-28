package Vista;

import Modelo.Modelo;
import javafx.scene.canvas.Canvas;
import javafx.scene.image.Image;

public class VistaMesa {

    private int width;
    private int height;

    private Modelo modelo;
    private Canvas canvasMesa;

    public VistaMesa(Modelo modelo, Canvas canvasMesa) {
        this.modelo = modelo;
        this.canvasMesa = canvasMesa;
        this.establecerTamanioDeCadaMateriaPrima(25);
    }

    public void dibujar() {
        //Image imagenRandom = new Image("Imagenes/unFondoCualquiera.png");
        Imagenes imagenes = new Imagenes();
        Image imagenRandomDePrueba = imagenes.getImage("Diamante");
        canvasMesa.getGraphicsContext2D().drawImage(imagenRandomDePrueba,0*width, 0*height,width,height);

        Image imagenDePrueba2 = new Image("file:src/Vista/Imagenes/MateriaPrima/mpmadera.png");
        canvasMesa.getGraphicsContext2D().drawImage(imagenDePrueba2,1*width,1*width,width,height);

    }


    private void establecerTamanioDeCadaMateriaPrima(int tamanio) {
        this.width = tamanio;
        this.height = tamanio;
    }



}
