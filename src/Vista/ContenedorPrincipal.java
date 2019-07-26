package Vista;

import Controlador.*;
import Modelo.CreadorDeMapa.CreadorDeMapa;
import Modelo.Jugador.Jugador;
import Modelo.MesaDeTrabajo.Mesa;
import javafx.geometry.Insets;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ContenedorPrincipal extends BorderPane {
	
    BarraDeMenu menuBar;
    CreadorDeMapa mapa;
    Canvas canvasCentral;
    VBox contenedorCentral;

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

        Button botonGolpearRecurso = new Button();
        botonGolpearRecurso.setText("Golpear Recurso");
        BotonGolpearRecursoHandler botonGolpearRecursoHandler = new BotonGolpearRecursoHandler(jugador);
        botonGolpearRecurso.setOnAction(botonGolpearRecursoHandler);
        
        Button botonMoverHaciaArriba = new Button();
        botonMoverHaciaArriba.setText("Mover hacia arriba");
        BotonMoverHaciaArribaHandler botonMoverHaciaArribaHandler = new BotonMoverHaciaArribaHandler(jugador);
        botonMoverHaciaArriba.setOnAction(botonMoverHaciaArribaHandler);
        
        Button botonMoverHaciaAbajo = new Button();
        botonMoverHaciaAbajo.setText("Mover hacia abajo");
        BotonMoverHaciaAbajoHandler botonMoverHaciaAbajoHandler = new BotonMoverHaciaAbajoHandler(jugador);
        botonMoverHaciaAbajo.setOnAction(botonMoverHaciaAbajoHandler);
        
        Button botonMoverHaciaLaDerecha = new Button();
        botonMoverHaciaLaDerecha.setText("Mover hacia la derecha");
        BotonMoverHaciaLaDerechaHandler botonMoverHaciaLaDerechaHandler = new BotonMoverHaciaLaDerechaHandler(jugador);
        botonMoverHaciaLaDerecha.setOnAction(botonMoverHaciaLaDerechaHandler);
        
        Button botonMoverHaciaLaIzquierda = new Button();
        botonMoverHaciaLaIzquierda.setText("Mover hacia la izquierda");
        BotonMoverHaciaLaIzquierdaHandler botonMoverHaciaLaIzquierdaHandler = new BotonMoverHaciaLaIzquierdaHandler(jugador);
        botonMoverHaciaLaIzquierda.setOnAction(botonMoverHaciaLaIzquierdaHandler);


        VBox contenedor = new VBox(botonGolpearRecurso, botonMoverHaciaArriba, botonMoverHaciaAbajo,
        						   botonMoverHaciaLaDerecha, botonMoverHaciaLaIzquierda);
        contenedor.setSpacing(10);
        contenedor.setPadding(new Insets(15));

        this.setBottom(contenedor);

    }
    
    private void setBotoneraMesaDeTrabajo(Mesa mesa) {
    	
    }

}
