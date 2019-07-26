package Vista;

import Modelo.Mapa.PosicionEnlazada;
import Modelo.Modelo;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class VistaModelo {
    private Modelo modelo;
    private Canvas canvas;

    public VistaModelo(Modelo modelo, Canvas canvas){
        this.modelo = modelo;
        this.canvas = canvas;
    }

    public void dibujar() {

        // inicio cosas random, solo estoy probando

        Button prueba = new Button();
        prueba.setText("probandooooooo");
        VBox probando = new VBox(prueba);
        //VBox mapa = new VBox();

        canvas.getGraphicsContext2D().setFill(Color.DARKBLUE);
        canvas.getGraphicsContext2D().fillOval(230, 110, 25, 8);

        // fin cosas random

        Image pasto = new Image("file:src/Vista/Imagenes/pasto.png");
        Image madera = new Image("file:src/Vista/Imagenes/madera.png");
        Image piedra = new Image("file:src/Vista/Imagenes/piedra.png");
        Image diamante = new Image("file:src/Vista/Imagenes/diamante.png");


        //canvas.getGraphicsContext2D().drawImage(pasto, 0, 0);
        //canvas.getGraphicsContext2D().drawImage(madera, 32, 0);
        //canvas.getGraphicsContext2D().drawImage(piedra, 0, 32);
        //canvas.getGraphicsContext2D().drawImage(diamante, 32, 32);

        // * M
        // P D

        int columna = 0;
        for (int fila=0; fila<modelo.cantColumnasMapa(); fila++){
            PosicionEnlazada posActual = new PosicionEnlazada(fila,columna);
            String nombreOcupante = modelo.mapa().ocupante(posActual).obtenerNombreOcupante();

            // buscar imagen a mostrar

            //canvas.getGraphicsContext2D().drawImage(pasto, 0 + 32 * fila, 0);
        }
        for (int fila=0; fila<16; fila++){

            canvas.getGraphicsContext2D().drawImage(madera,0+32*fila,32);
        }

        /*for (int fila=0; fila<14; fila++){

            canvas.getGraphicsContext2D().drawImage(piedra,0+32*fila,2);
        }*/

        //System.out.println(modelo.cantColumnasMapa());




    }
}

