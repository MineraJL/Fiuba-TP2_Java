package Controlador;

import Modelo.Jugador.Jugador;
import Modelo.Mapa.DireccionArriba;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BotonMoverHaciaArribaHandler implements EventHandler<ActionEvent> {
	private Jugador jugador;
	
	public BotonMoverHaciaArribaHandler(Jugador jugador) {
		this.jugador = jugador;
	}
	
	@Override
	public void handle(ActionEvent event) {
		this.jugador.mover(new DireccionArriba());
	}

}
