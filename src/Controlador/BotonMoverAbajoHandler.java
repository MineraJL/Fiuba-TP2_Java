package Controlador;

import Modelo.Jugador.Jugador;
import Modelo.Mapa.DireccionAbajo;
import Vista.VistaModelo;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BotonMoverAbajoHandler implements EventHandler<ActionEvent> {
	private Jugador jugador;
	private VistaModelo vistaModelo;
	
	public BotonMoverAbajoHandler(Jugador jugador, VistaModelo vistaModelo) {
		this.jugador = jugador;
		this.vistaModelo = vistaModelo;
	}
	
	@Override
	public void handle(ActionEvent event) {
		this.jugador.mover(new DireccionAbajo());
		this.vistaModelo.actualizar();
	}

}
