package Vista;

import Modelo.Mapa.PosicionEnlazada;
import Modelo.Modelo;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class VistaMesa {

    private int width;
    private int height;

    private Modelo modelo;
    private Canvas canvasMesa;
    private Imagenes imagenes;

    private PosicionEnlazada posicionActual;
    private GraphicsContext gc;

    public VistaMesa(Modelo modelo, Canvas canvasMesa) {
        this.modelo = modelo;
        this.imagenes = new Imagenes();
        this.imagenes.cargarImagenesMesa();

        this.canvasMesa = canvasMesa;
        this.establecerTamanioCuadradoDeCadaMateriaPrima(25);

        this.inicializarPosicionActual();
        gc = this.canvasMesa.getGraphicsContext2D();

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

        PosicionEnlazada pos = new PosicionEnlazada(i,j);
        //int i = pos.geti();
        //int j = pos.getj();

        //String mpEnMesa = modelo.mesa().obtenerOcupanteEn(i,j).obtenerNombreOcupante();
        String mpEnMesa = modelo.mesa().obtenerOcupanteEn(pos).obtenerNombreOcupante();
        Image imagenMPEnMesa = imagenes.getImage(mpEnMesa);
        gc.drawImage(imagenMPEnMesa, width * pos.getj(), height * pos.geti(), width, height);

    }

    private void seleccionarConBorde(PosicionEnlazada pos){
        gc.strokeRect(width*pos.getj(),height*pos.geti(),width-1,height-1);
    }
    private void limpiarBorde(int i, int j){
        gc.clearRect(width*j,height*i,width-1,height-1);
        this.mostrarElemento(i,j);
        this.inicializarMesa(); // TEMPORAL: borrar esta línea.
    }

    public void dibujar(PosicionEnlazada posicionActual) {
        // limpiarBorde de pos anterior

        this.mostrarElemento(posicionActual.geti(),posicionActual.getj());
        this.seleccionarConBorde(posicionActual);

        // avanzar a la siguiente posicion.
    }

    private void inicializarMesa() {

        for (int i=0; i<3; i++){
            for (int j=0;j<3;j++){

                String vacio = "MPVacio";
                Image imagenMPEnMesa = imagenes.getImage(vacio);
                gc.drawImage(imagenMPEnMesa,width*j,height*i,width,height);

            }
        }

    }

    private void inicializarPosicionActual() {

         //this.posicionActual = modelo.mesa().obtenerOcupanteEn(0,0).getPosicion();
        this.posicionActual = new PosicionEnlazada(0,0);

    }

    private void establecerTamanioCuadradoDeCadaMateriaPrima(int tamanio) {
        this.width = tamanio;
        this.height = tamanio;
    }

    public PosicionEnlazada posicionActual(){return this.posicionActual;}



}
