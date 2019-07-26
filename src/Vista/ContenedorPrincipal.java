package Vista;

import Controlador.*;
import Modelo.CreadorDeMapa.CreadorDeMapa;
import Modelo.Jugador.Jugador;
import Modelo.MesaDeTrabajo.Mesa;
import javafx.geometry.Insets;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ContenedorPrincipal extends BorderPane {
	
    private BarraDeMenu menuBar;
    private CreadorDeMapa mapa;
    private Canvas canvasCentral;
    private VBox contenedorCentral;

	public ContenedorPrincipal(Stage stage, Jugador jugador, Mesa mesa) {
        this.setMenu(stage);
        this.setMapa(jugador);
        this.setBotoneraJugador(jugador);
        this.setBotoneraMesaDeTrabajo(mesa);
	}
	
    private void setMenu(Stage stage) {
        this.menuBar = new BarraDeMenu(stage);
        this.setTop(menuBar);
    }
    
    public BarraDeMenu getBarraDeMenu() {
        return menuBar;
    }
    
    private void setMapa(Jugador jugador) {
    	
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
        botonesMover.setPadding(new Insets(5));

        VBox contenedor = new VBox(botonGolpear, botonesMover);
        contenedor.setSpacing(10);
        contenedor.setPadding(new Insets(15));

        this.setBottom(contenedor);

    }
    
    private void setBotoneraMesaDeTrabajo(Mesa mesa) {
    	
    }

}
