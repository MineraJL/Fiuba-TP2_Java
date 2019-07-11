package Vista;

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
import Eventos.BotonMoverHaciaElNorteHandler;

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
    
    private void setBotoneraJugador(Jugador jugador) {

        Button botonMoverHaciaElNorte = new Button();
        botonMoverHaciaElNorte.setText("Mover");
        BotonMoverHaciaElNorteHandler moveButtonHandler = new BotonMoverHaciaElNorteHandler(jugador);
        botonMoverHaciaElNorte.setOnAction(moveButtonHandler);


        VBox contenedor = new VBox(botonGolpearRecurso, botonMoverHaciaElNorte, botonMoverHaciaElSur, 
        						   botonMoverHaciaElEste, botonMoverHaciaElOeste);
        contenedor.setSpacing(10);
        contenedor.setPadding(new Insets(15));

        this.setBottom(contenedor);

    }
    
    private void setBotoneraMesaDeTrabajo(Mesa mesa) {
    	
    }

}
