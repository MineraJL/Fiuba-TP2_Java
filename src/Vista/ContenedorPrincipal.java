package Vista;

import Controlador.*;
import CreadorDeMapa.CreadorDeMapa;
import Jugador.Jugador;
import MesaDeTrabajo.Mesa;
import javafx.geometry.Insets;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import Vista.BarraDeMenu;

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
        
        Button botonMoverHaciaElNorte = new Button();
        botonMoverHaciaElNorte.setText("Mover Al Norte");
        BotonMoverHaciaElNorteHandler botonMoverAlNorteHandler = new BotonMoverHaciaElNorteHandler(jugador);
        botonMoverHaciaElNorte.setOnAction(botonMoverAlNorteHandler);
        
        Button botonMoverHaciaElSur = new Button();
        botonMoverHaciaElSur.setText("Mover al Sur");
        BotonMoverHaciaElSurHandler botonMoverAlSurHandler = new BotonMoverHaciaElSurHandler(jugador);
        botonMoverHaciaElSur.setOnAction(botonMoverAlSurHandler);
        
        Button botonMoverHaciaElEste = new Button();
        botonMoverHaciaElEste.setText("Mover al Este");
        BotonMoverHaciaElEsteHandler botonMoverAlEsteHandler = new BotonMoverHaciaElEsteHandler(jugador);
        botonMoverHaciaElEste.setOnAction(botonMoverAlEsteHandler);
        
        Button botonMoverHaciaElOeste = new Button();
        botonMoverHaciaElOeste.setText("Mover al Oeste");
        BotonMoverHaciaElOesteHandler botonMoverAlOesteHandler = new BotonMoverHaciaElOesteHandler(jugador);
        botonMoverHaciaElOeste.setOnAction(botonMoverAlOesteHandler);


        VBox contenedor = new VBox(botonGolpearRecurso, botonMoverHaciaElNorte, botonMoverHaciaElSur, 
        						   botonMoverHaciaElEste, botonMoverHaciaElOeste);
        contenedor.setSpacing(10);
        contenedor.setPadding(new Insets(15));

        this.setBottom(contenedor);

    }
    
    private void setBotoneraMesaDeTrabajo(Mesa mesa) {
    	
    }

}
