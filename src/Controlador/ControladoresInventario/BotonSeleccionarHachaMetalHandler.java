package Controlador.ControladoresInventario;

import Modelo.Modelo;
import Vista.VistaInventario;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BotonSeleccionarHachaMetalHandler extends BotonSeleccionarHerramientaHandler {

	public BotonSeleccionarHachaMetalHandler(Modelo modelo, VistaInventario vistaInventario) {
		super(modelo, vistaInventario);
	}

	@Override
	public void handle(ActionEvent event) {
		try {
			this.modelo.jugador().seleccionarHachaMetal();
			super.handle(event);
		} catch(Exception e) {
			
		}
	}

}
