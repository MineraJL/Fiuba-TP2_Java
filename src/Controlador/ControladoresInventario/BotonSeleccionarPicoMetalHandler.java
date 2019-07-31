package Controlador.ControladoresInventario;

import Modelo.Modelo;
import Vista.VistaInventario;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BotonSeleccionarPicoMetalHandler extends BotonSeleccionarHerramientaHandler {

	public BotonSeleccionarPicoMetalHandler(Modelo modelo, VistaInventario vistaInventario) {
		super(modelo, vistaInventario);
	}

	@Override
	public void handle(ActionEvent event) {
		this.modelo.jugador().seleccionarPicoMetal();
		super.handle(event);
	}

}
