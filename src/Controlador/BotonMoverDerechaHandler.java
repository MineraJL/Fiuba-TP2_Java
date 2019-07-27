package Controlador;

import Modelo.Jugador.Jugador;
import Modelo.Mapa.DireccionDerecha;
import Vista.VistaModelo;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BotonMoverDerechaHandler implements EventHandler<ActionEvent> {
	private Jugador jugador;
	private VistaModelo vistaModelo;
	
	public BotonMoverDerechaHandler(Jugador jugador, VistaModelo vistaModelo) {
		this.jugador = jugador;
		this.vistaModelo=vistaModelo;
	}
	
	@Override
	public void handle(ActionEvent event) {
		this.jugador.mover(new DireccionDerecha());
		this.vistaModelo.actualizar();
	}



}
