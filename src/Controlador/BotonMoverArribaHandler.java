package Controlador;

import Modelo.Jugador.Jugador;
import Modelo.Mapa.DireccionArriba;
import Vista.VistaModelo;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BotonMoverArribaHandler implements EventHandler<ActionEvent> {
	private Jugador jugador;
	private VistaModelo vistaModelo;
	
	public BotonMoverArribaHandler(Jugador jugador, VistaModelo vistaModelo) {
		this.jugador = jugador;
		this.vistaModelo = vistaModelo;
	}
	
	@Override
	public void handle(ActionEvent event) {
		this.jugador.mover(new DireccionArriba());
		this.vistaModelo.actualizar();
	}

}
