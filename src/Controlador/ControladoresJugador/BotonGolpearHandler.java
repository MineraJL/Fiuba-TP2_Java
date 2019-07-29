package Controlador.ControladoresJugador;

import Modelo.Jugador.Jugador;
import Vista.VistaModelo;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BotonGolpearHandler implements EventHandler<ActionEvent> {
	private Jugador jugador;
	private VistaModelo vistaModelo;
	
	public BotonGolpearHandler(Jugador jugador, VistaModelo vistaModelo) {
		this.jugador = jugador;
		this.vistaModelo = vistaModelo;
	}
	
	@Override
	public void handle(ActionEvent event) {
		this.jugador.golpear();
		this.vistaModelo.actualizar();
	}

}
