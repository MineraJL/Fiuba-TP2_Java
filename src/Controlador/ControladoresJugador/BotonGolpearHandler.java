package Controlador.ControladoresJugador;

import Modelo.Excepciones.HerramientaDesgastadaExcepcion;
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
		try {
			this.jugador.golpear();
		} catch (HerramientaDesgastadaExcepcion e) {
			//mostrar mensaje por pantalla que se rompio herramienta
			e.printStackTrace();
		}
		this.vistaModelo.actualizar();
	}

}
