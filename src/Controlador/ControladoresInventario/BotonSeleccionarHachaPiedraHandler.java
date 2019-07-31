package Controlador.ControladoresInventario;

import Modelo.Modelo;
import Vista.VistaInventario;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BotonSeleccionarHachaPiedraHandler extends BotonSeleccionarHerramientaHandler {
	
	public BotonSeleccionarHachaPiedraHandler(Modelo modelo, VistaInventario vistaInventario) {
		super(modelo, vistaInventario);
	}

	@Override
	public void handle(ActionEvent event) {
		this.modelo.jugador().seleccionarHachaPiedra();
		super.handle(event);
		
	}

}
