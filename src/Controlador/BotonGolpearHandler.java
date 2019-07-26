package Controlador;

import Modelo.Jugador.Jugador;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BotonGolpearHandler implements EventHandler<ActionEvent> {
	private Jugador jugador;
	
	public BotonGolpearHandler(Jugador jugador) {
		this.jugador = jugador;
	}
	
	@Override
	public void handle(ActionEvent event) {
		this.jugador.golpear();
	}

}
