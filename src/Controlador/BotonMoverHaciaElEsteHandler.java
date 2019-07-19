package Controlador;

import Modelo.Jugador.Jugador;
import Modelo.Mapa.DireccionDerecha;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BotonMoverHaciaElEsteHandler implements EventHandler<ActionEvent> {
	Jugador jugador;
	
	public BotonMoverHaciaElEsteHandler(Jugador jugador) {
		this.jugador = jugador;
	}
	
	@Override
	public void handle(ActionEvent event) {
		this.jugador.mover(new DireccionDerecha());
	}

}
