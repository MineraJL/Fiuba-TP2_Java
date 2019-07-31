package Controlador.ControladoresInventario;

import Modelo.Modelo;
import Modelo.Jugador.Jugador;
import Vista.VistaInventario;
import Vista.VistaModelo;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BotonSeleccionarHachaMaderaHandler extends BotonSeleccionarHerramientaHandler {

	public BotonSeleccionarHachaMaderaHandler(Modelo modelo, VistaInventario vistaInventario) {
		super(modelo, vistaInventario);
	}

	@Override
	public void handle(ActionEvent event) {
		try {
			this.modelo.jugador().seleccionarHachaMadera();
			super.handle(event);
		} catch (Exception e) {
		}
	}

}
