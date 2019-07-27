package Controlador;

import Modelo.Jugador.Jugador;
import Modelo.Mapa.DireccionAbajo;
import Vista.VistaModelo;
import javafx.event.ActionEvent;

public class BotonMoverAbajoHandler extends BotonMoverDireccionHandler {

	public BotonMoverAbajoHandler(Jugador jugador, VistaModelo vistaModelo) {
		super(jugador,vistaModelo);
	}
	
	@Override
	public void handle(ActionEvent event) {
		super.handle(event,new DireccionAbajo());
	}

}
