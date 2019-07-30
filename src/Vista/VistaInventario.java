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
    	this.width = 25;
    	this.height = 25;
        this.modelo = modelo;
        this.imagenes = new Imagenes();
        this.imagenes.cargarImagenesInventario();

        this.canvasInventario = canvasInventario;
        
        this.inicializarInventario();
    }
    
    private void inicializarInventario() {
    	
        for (int i=0; i<2; i++){
            for (int j=0;j<10;j++){

                String vacio = "fondoVacio";
                Image imagenFondoInventario = imagenes.getImage(vacio);
                canvasInventario.getGraphicsContext2D().drawImage(imagenFondoInventario,width*j,height*i,width,height);

            }
        }
        
        String herramienta = "hachaMadera";
        Image imagenHerramientaInicialInventario = imagenes.getImage(herramienta);
        canvasInventario.getGraphicsContext2D().drawImage(imagenHerramientaInicialInventario,width*0,height*0,width,height);

    }
    
    public void dibujar() {
    	
    }

}
