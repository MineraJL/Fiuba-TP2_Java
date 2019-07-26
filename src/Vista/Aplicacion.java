package Vista;


import Modelo.Modelo;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Aplicacion extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("TP2 AlgoCraft");

		Modelo modelo = new Modelo();
		
		ContenedorPrincipal contenedorPrincipal = new ContenedorPrincipal(stage, modelo.jugador(), modelo.mesa());
        Scene escenaJuego = new Scene(contenedorPrincipal, 640, 480);
        
        ContenedorApertura contenedorApertura = new ContenedorApertura(stage, escenaJuego);
        Scene escenaInicial = new Scene(contenedorApertura, 640, 480);


        stage.setScene(escenaInicial);
        stage.setFullScreen(true);

        stage.show();
			
	}

}
