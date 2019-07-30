package Controlador.ControladoresJugador;

import Modelo.Jugador.Jugador;
import Modelo.Mapa.DireccionIzquierda;
import Vista.VistaModelo;
import javafx.event.ActionEvent;

public class BotonMoverIzquierdaHandler extends BotonMoverDireccionHandler {

	public BotonMoverIzquierdaHandler(Jugador jugador, VistaModelo vistaModelo) {
		super(jugador,vistaModelo);
	}

	@Override
	public void handle(ActionEvent event) {
		super.handle(event,new DireccionIzquierda());
	}


}
