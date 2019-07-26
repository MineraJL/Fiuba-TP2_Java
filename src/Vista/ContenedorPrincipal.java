package Vista;

import Controlador.*;
import Modelo.Jugador.Jugador;
import Modelo.MesaDeTrabajo.Mesa;
import Modelo.Modelo;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ContenedorPrincipal extends BorderPane {
	
    private BarraDeMenu menuBar;
    private Canvas canvasCentral;
    private VBox contenedorCentral;


	public ContenedorPrincipal(Stage stage, Modelo modelo) {
        this.setMenu(stage);
        this.setBotoneraJugador(modelo.jugador());
        this.setBotoneraMesaDeTrabajo(modelo.mesa());
        this.setCentro(modelo);
	}
	
    private void setMenu(Stage stage) {
        this.menuBar = new BarraDeMenu(stage);
        this.setTop(menuBar);
    }

    public BarraDeMenu getBarraDeMenu() {
        return menuBar;
    }


    public void setCentro(Modelo modelo){

	    canvasCentral = new Canvas(460,220);
	    VistaModelo vistaModelo = new VistaModelo(modelo,canvasCentral);
	    vistaModelo.dibujar();

	    contenedorCentral = new VBox(canvasCentral);
	    contenedorCentral.setAlignment(Pos.CENTER);

        Image imagen = new Image("file:src/Vista/Imagenes/unFondoCualquiera.jpg");
        BackgroundImage imagenDeFondo = new BackgroundImage(imagen, BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        contenedorCentral.setBackground(new Background(imagenDeFondo));

	    this.setCenter(contenedorCentral);

    }



    private void setBotoneraJugador(Jugador jugador) {

        Button botonGolpear = new Button();
        botonGolpear.setText("Golpear");
        BotonGolpearHandler botonGolpearHandler = new BotonGolpearHandler(jugador);
        botonGolpear.setOnAction(botonGolpearHandler);

        Text tituloMover = new Text("Mover");

        Button botonMoverHaciaArriba = new Button();
        botonMoverHaciaArriba.setText("arriba");
        BotonMoverHaciaArribaHandler botonMoverHaciaArribaHandler = new BotonMoverHaciaArribaHandler(jugador);
        botonMoverHaciaArriba.setOnAction(botonMoverHaciaArribaHandler);
        
        Button botonMoverHaciaAbajo = new Button();
        botonMoverHaciaAbajo.setText("abajo");
        BotonMoverHaciaAbajoHandler botonMoverHaciaAbajoHandler = new BotonMoverHaciaAbajoHandler(jugador);
        botonMoverHaciaAbajo.setOnAction(botonMoverHaciaAbajoHandler);
        
        Button botonMoverHaciaLaDerecha = new Button();
        botonMoverHaciaLaDerecha.setText("derecha");
        BotonMoverHaciaLaDerechaHandler botonMoverHaciaLaDerechaHandler = new BotonMoverHaciaLaDerechaHandler(jugador);
        botonMoverHaciaLaDerecha.setOnAction(botonMoverHaciaLaDerechaHandler);
        
        Button botonMoverHaciaLaIzquierda = new Button();
        botonMoverHaciaLaIzquierda.setText("izquierda");
        BotonMoverHaciaLaIzquierdaHandler botonMoverHaciaLaIzquierdaHandler = new BotonMoverHaciaLaIzquierdaHandler(jugador);
        botonMoverHaciaLaIzquierda.setOnAction(botonMoverHaciaLaIzquierdaHandler);


        HBox botonesMoverLateralmente = new HBox(botonMoverHaciaLaIzquierda,botonMoverHaciaLaDerecha);
        VBox botonesMover = new VBox(tituloMover, botonMoverHaciaArriba, botonesMoverLateralmente, botonMoverHaciaAbajo);
        botonesMover.setSpacing(5);
        botonesMover.setAlignment(Pos.CENTER);

        VBox botonera = new VBox(botonGolpear, botonesMover);
        botonera.setSpacing(20);
        botonera.setPadding(new Insets(15));


        this.setLeft(botonera);

    }
    
    private void setBotoneraMesaDeTrabajo(Mesa mesa) {
    	
    }

}
