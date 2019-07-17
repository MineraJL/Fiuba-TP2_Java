package Controlador;

import Modelo.Jugador.Jugador;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BotonGolpearRecursoHandler implements EventHandler<ActionEvent> {
	Jugador jugador;
	
	public BotonGolpearRecursoHandler(Jugador jugador) {
		this.jugador = jugador;
	}
	
	@Override
	public void handle(ActionEvent event) {
		this.jugador.golpear();
	}

}