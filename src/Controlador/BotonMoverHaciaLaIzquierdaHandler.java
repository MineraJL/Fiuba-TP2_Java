package Controlador;

import Modelo.Jugador.Jugador;
import Modelo.Mapa.DireccionIzquierda;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BotonMoverHaciaLaIzquierdaHandler implements EventHandler<ActionEvent> {
	Jugador jugador;
	
	public BotonMoverHaciaLaIzquierdaHandler(Jugador jugador) {
		this.jugador = jugador;
	}
	
	@Override
	public void handle(ActionEvent event) {
		this.jugador.mover(new DireccionIzquierda());
	}

}
