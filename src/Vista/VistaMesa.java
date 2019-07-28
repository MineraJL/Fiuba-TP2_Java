package Vista;

import Modelo.Modelo;
import javafx.scene.canvas.Canvas;
import javafx.scene.image.Image;

public class VistaMesa {

    private int width;
    private int height;

    private Modelo modelo;
    private Canvas canvasMesa;
    private Imagenes imagenes;

    private Canvas canvasBordeSeleccionado;

    public VistaMesa(Modelo modelo, Canvas canvasMesa) {
        this.modelo = modelo;
        this.imagenes = new Imagenes();
        this.imagenes.cargarImagenesMesa();

        this.canvasMesa = canvasMesa;
        this.establecerTamanioCuadradoDeCadaMateriaPrima(25);

        this.inicializarMesa();
    }
    // (sacar a "3" y "3" (cant filas y columnas) del modelo).

    public void dibujar(){

        for (int i=0; i<3; i++){
            for (int j=0;j<3;j++){

                this.mostrarElemento(i,j);

            }
        }

    }

    private void mostrarElemento(int i, int j){
        String mpEnMesa = modelo.mesa().obtenerItemEn(i,j).obtenerNombreOcupante();
        Image imagenMPEnMesa = imagenes.getImage(mpEnMesa);
        canvasMesa.getGraphicsContext2D().drawImage(imagenMPEnMesa,width*j,height*i,width,height);
    }

    private void seleccionarConBorde(int i, int j){
        canvasMesa.getGraphicsContext2D().strokeRect(width*j,height*i,width-1,height-1);
    }
    private void limpiarBorde(int i, int j){
        canvasMesa.getGraphicsContext2D().clearRect(width*j,height*i,width-1,height-1);
        this.mostrarElemento(i,j);
        this.inicializarMesa(); // TEMPORAL: borrar esta línea.
    }

    private void inicializarMesa() {

        for (int i=0; i<3; i++){
            for (int j=0;j<3;j++){

                String vacio = "MPVacio";
                Image imagenMPEnMesa = imagenes.getImage(vacio);
                canvasMesa.getGraphicsContext2D().drawImage(imagenMPEnMesa,width*j,height*i,width,height);

            }
        }

    }


    private void establecerTamanioCuadradoDeCadaMateriaPrima(int tamanio) {
        this.width = tamanio;
        this.height = tamanio;
    }



}
