package Vista;

import java.util.ArrayList;
import java.util.HashMap;

import Modelo.Modelo;
import javafx.scene.canvas.Canvas;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class VistaInventario {
    private int anchuraInventario;
    private int alturaInventario;
    private int anchuraCelda;
    private int alturaCelda;

    private Modelo modelo;
    private Canvas canvasInventario;
    private Imagenes imagenes;
    
    public VistaInventario(Modelo modelo, Canvas canvasInventario) {
    	this.anchuraInventario = 40;
    	this.alturaInventario = 40;
    	this.anchuraCelda = 6;
    	this.alturaCelda = 2;
        this.modelo = modelo;
        this.imagenes = new Imagenes();
        this.imagenes.cargarImagenesInventario();

        this.canvasInventario = canvasInventario;
        
        this.inicializarInventario();
    }
    
    private void inicializarInventario() {
    	ArrayList<String> itemsIventario = imagenes.nombresItemsIventario();
    	
        for (int i=0, k = 0; i<alturaCelda; i++){
            for (int j=0;j<anchuraCelda;j++, k++){

                Image imagenFondoInventario = imagenes.getImage(itemsIventario.get(k));
                canvasInventario.getGraphicsContext2D().drawImage(imagenFondoInventario,anchuraInventario*j,alturaInventario*i,anchuraInventario,alturaInventario);
                canvasInventario.getGraphicsContext2D().fillText("x0", (anchuraInventario-20)+(j*anchuraInventario), alturaInventario*(i+1));
            }
        }
        
        canvasInventario.getGraphicsContext2D().clearRect(0, 0, anchuraInventario, alturaInventario);
        String herramienta = "hachaMadera";
        Image imagenHerramientaInicialInventario = imagenes.getImage(herramienta);
        canvasInventario.getGraphicsContext2D().drawImage(imagenHerramientaInicialInventario,anchuraInventario*0,alturaInventario*0,anchuraInventario,alturaInventario);
        canvasInventario.getGraphicsContext2D().fillText("x1", anchuraInventario-20, alturaInventario);
    }
    
    public void dibujar() {
    	ArrayList<String> itemsIventario = imagenes.nombresItemsIventario();
    	HashMap<String, String> cantidadItemsInventario = new HashMap<String, String>();
    	
    	cantidadItemsInventario.put("hachaMadera", 
    			Integer.toString(modelo.inventario().cantidadHachaMadera()));
    	cantidadItemsInventario.put("hachaPiedra", 
    			Integer.toString(modelo.inventario().cantidadHachaPiedra()));
    	cantidadItemsInventario.put("hachaMetal",
    			Integer.toString(modelo.inventario().cantidadHachaMetal()));
    	cantidadItemsInventario.put("picoMadera", 
    			Integer.toString(modelo.inventario().cantidadPicoMadera()));
    	cantidadItemsInventario.put("picoPiedra", 
    			Integer.toString(modelo.inventario().cantidadPicoPiedra()));
    	cantidadItemsInventario.put("picoMetal", 
    			Integer.toString(modelo.inventario().cantidadPicoMetal()));
    	cantidadItemsInventario.put("picoFino", 
    			Integer.toString(modelo.inventario().cantidadPicoFino()));
    	cantidadItemsInventario.put("MPMadera", 
    			Integer.toString(modelo.inventario().cantidadMadera()));
    	cantidadItemsInventario.put("MPPiedra", 
    			Integer.toString(modelo.inventario().cantidadPiedra()));
    	cantidadItemsInventario.put("MPMetal", 
    			Integer.toString(modelo.inventario().cantidadMetal()));
    	cantidadItemsInventario.put("MPDiamante", 
    			Integer.toString(modelo.inventario().cantidadDiamante()));
    	
    	
        for (int i=0, k = 0; i<alturaCelda; i++){
            for (int j=0;j<anchuraCelda;j++, k++){

                Image imagenFondoInventario = imagenes.getImage(itemsIventario.get(k));
                canvasInventario.getGraphicsContext2D().drawImage(imagenFondoInventario,anchuraInventario*j,alturaInventario*i,anchuraInventario,alturaInventario);
                canvasInventario.getGraphicsContext2D().fillText(cantidadItemsInventario.get(itemsIventario.get(k)),
                		 (anchuraInventario-20)+(j*anchuraInventario), alturaInventario*(i+1));
            }
        }
    }


}
