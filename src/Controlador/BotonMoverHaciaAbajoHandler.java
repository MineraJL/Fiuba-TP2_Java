package Controlador;

import Modelo.Jugador.Jugador;
import Modelo.Mapa.DireccionAbajo;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BotonMoverHaciaAbajoHandler implements EventHandler<ActionEvent> {
	Jugador jugador;
	
	public BotonMoverHaciaAbajoHandler(Jugador jugador) {
		this.jugador = jugador;
	}
	
	@Override
	public void handle(ActionEvent event) {
		this.jugador.mover(new DireccionAbajo());
	}

}
