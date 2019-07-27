package Controlador;

import Modelo.Jugador.Jugador;
import Modelo.Mapa.DireccionIzquierda;
import Vista.VistaModelo;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BotonMoverIzquierdaHandler implements EventHandler<ActionEvent> {
	private Jugador jugador;
	private VistaModelo vistaModelo;
	
	public BotonMoverIzquierdaHandler(Jugador jugador, VistaModelo vistaModelo) {
		this.jugador = jugador;
		this.vistaModelo = vistaModelo;
	}
	
	@Override
	public void handle(ActionEvent event) {
		this.jugador.mover(new DireccionIzquierda());
		this.vistaModelo.actualizar();
	}

}
