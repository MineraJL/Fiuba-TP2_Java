package Vista;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import Modelo.Jugador.Jugador;
import Modelo.MesaDeTrabajo.Mesa;
import Modelo.CreadorDeModelo;
import Modelo.Inventario.Inventario;

public class Aplicacion extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("TP2 AlgoCraft");
		
    	Inventario inventario = new Inventario();
    	Mesa mesa = new Mesa();
		Jugador jugador = new Jugador(inventario, mesa);
	//	Modelo.CreadorDeMapa mapa = new Modelo.CreadorDeMapa(jugador);
		CreadorDeModelo modelito = new CreadorDeModelo();
		
		ContenedorPrincipal contenedorPrincipal = new ContenedorPrincipal(stage, jugador, mesa);
        Scene escenaJuego = new Scene(contenedorPrincipal, 640, 480);
        
        ContenedorApertura contenedorApertura = new ContenedorApertura(stage, escenaJuego);
        Scene escenaInicial = new Scene(contenedorApertura, 640, 480);


        stage.setScene(escenaInicial);
        stage.setFullScreen(true);

        stage.show();
			
	}

}
