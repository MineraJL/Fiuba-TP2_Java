package Controlador;

import Jugador.Jugador;
import Mapa.Direccion;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BotonMoverHaciaElOesteHandler implements EventHandler<ActionEvent> {
	Jugador jugador;
	
	public BotonMoverHaciaElOesteHandler(Jugador jugador) {
		this.jugador = jugador;
	}
	
	@Override
	public void handle(ActionEvent event) {
		this.jugador.mover(Direccion.izquierda());	
	}

}
