package Controlador;

import Modelo.Jugador.Jugador;
import Modelo.Mapa.DireccionDerecha;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BotonMoverHaciaLaDerechaHandler implements EventHandler<ActionEvent> {
	private Jugador jugador;
	
	public BotonMoverHaciaLaDerechaHandler(Jugador jugador) {
		this.jugador = jugador;
	}
	
	@Override
	public void handle(ActionEvent event) {
		this.jugador.mover(new DireccionDerecha());
	}

}
