package Controlador.ControladoresInventario;

import Modelo.Modelo;
import Vista.VistaInventario;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BotonSeleccionarPicoMaderaHandler extends BotonSeleccionarHerramientaHandler {
	
	public BotonSeleccionarPicoMaderaHandler(Modelo modelo, VistaInventario vistaInventario) {
		super(modelo, vistaInventario);
	}

	@Override
	public void handle(ActionEvent event) {
		try {
			this.modelo.jugador().seleccionarPicoMadera();
			super.handle(event);
		} catch (Exception e) {
			
		}
	}

}
