package Vista;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import Vista.ContenedorApertura;
import Vista.ContenedorPrincipal;
import CreadorDeMapa.CreadorDeMapa;
import Jugador.Jugador;
import MesaDeTrabajo.Mesa;

public class Aplicacion extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("TP2 AlgoCraft");
		
		Jugador jugador = new Jugador();
		Mesa    mesaDeTrabajo = new Mesa();
	//	CreadorDeMapa mapa = new CreadorDeMapa(jugador);
		ContenedorPrincipal contenedorPrincipal = new ContenedorPrincipal(stage, jugador, mesaDeTrabajo);
        Scene escenaJuego = new Scene(contenedorPrincipal, 640, 480);
        
        ContenedorApertura contenedorApertura = new ContenedorApertura(stage, escenaJuego);
        Scene escenaInicial = new Scene(contenedorApertura, 640, 480);


        stage.setScene(escenaInicial);
        stage.setFullScreen(true);

        stage.show();
			
	}

}
