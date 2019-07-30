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
        gc = this.canvasMesa.getGraphicsContext2D();
        this.establecerTamanioCuadradoDeCadaMateriaPrima(25);

        this.limpiar();
    }


    public void limpiar() {
        this.dibujar();
        this.inicializarPosicionActual();
        this.seleccionarConBorde(posicionActual);
    }

    public void dibujar(){

        for (int i=0; i<3; i++){
            for (int j=0;j<3;j++){
                this.mostrarElemento(i,j);
            }
        }

    }

    public void actualizar() {
        PosicionEnlazada anterior = this.posicionActual.posicionAIzquierda();
        this.limpiarBorde(anterior.geti(),anterior.getj());

        this.dibujar();
        this.seleccionarConBorde(this.posicionActual.posicionADerecha());

        this.posicionActual=posicionActual.posicionADerecha();
    }

    public PosicionEnlazada posicionActual(){return this.posicionActual;}


    private void mostrarElemento(int i, int j){

        PosicionEnlazada pos = new PosicionEnlazada(i,j);
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
    }

    private void inicializarPosicionActual() {
        this.posicionActual = modelo.mesa().posicionInicial();
        this.seleccionarConBorde(posicionActual);
    }

    private void establecerTamanioCuadradoDeCadaMateriaPrima(int tamanio) {
        this.width = tamanio;
        this.height = tamanio;
    }

    public void construirHerramienta() {
        limpiarBorde(2,2);
    }
}
