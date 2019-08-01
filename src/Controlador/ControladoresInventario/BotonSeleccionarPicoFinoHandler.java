package Controlador.ControladoresInventario;

import Modelo.Modelo;
import Vista.VistaInventario;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BotonSeleccionarPicoFinoHandler extends BotonSeleccionarHerramientaHandler {

	public BotonSeleccionarPicoFinoHandler(Modelo modelo, VistaInventario vistaInventario) {
		super(modelo, vistaInventario);
	}

	@Override
	public void handle(ActionEvent event) {
		try {
			this.modelo.jugador().seleccionarPicoFino();
			super.handle(event);
		} catch (Exception e) {
			
		}
	}

}
