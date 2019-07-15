package Eventos;

import Jugador.Jugador;
import Recursos.Recurso;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BotonGolpearRecursoHandler implements EventHandler<ActionEvent> {
	Jugador jugador;
	
	public BotonGolpearRecursoHandler(Jugador jugador) {
		this.jugador = jugador;
	}
	
	@Override
	public void handle(ActionEvent event) {
		//this.jugador.golpearRecurso(recurso);
	}

}
