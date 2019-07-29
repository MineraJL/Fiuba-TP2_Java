package Controlador.ControladoresJugador;

import Modelo.Jugador.Jugador;
import Modelo.Mapa.DireccionArriba;
import Vista.VistaModelo;
import javafx.event.ActionEvent;

public class BotonMoverArribaHandler extends BotonMoverDireccionHandler {

	public BotonMoverArribaHandler(Jugador jugador, VistaModelo vistaModelo) {
		super(jugador,vistaModelo);
	}

	@Override
	public void handle(ActionEvent event) {
		super.handle(event,new DireccionArriba());
	}


}
