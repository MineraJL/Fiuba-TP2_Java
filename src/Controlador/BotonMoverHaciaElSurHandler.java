package Controlador;

import Modelo.Jugador.Jugador;
import Modelo.Mapa.Direccion;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BotonMoverHaciaElSurHandler implements EventHandler<ActionEvent> {
	Jugador jugador;
	
	public BotonMoverHaciaElSurHandler(Jugador jugador) {
		this.jugador = jugador;
	}
	
	@Override
	public void handle(ActionEvent event) {
		this.jugador.mover(Direccion.abajo());	
	}

}
