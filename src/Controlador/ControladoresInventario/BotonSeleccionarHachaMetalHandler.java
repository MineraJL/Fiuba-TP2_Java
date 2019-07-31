package Controlador.ControladoresInventario;

import Modelo.Modelo;
import Vista.VistaInventario;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class BotonSeleccionarHachaMetalHandler extends BotonSeleccionarHerramientaHandler {

	public BotonSeleccionarHachaMetalHandler(Modelo modelo, VistaInventario vistaInventario, Button botonSeleccionarHachaMetal) {
		super(modelo, vistaInventario, botonSeleccionarHachaMetal);
		cantidadHerramientas = modelo.inventario().cantidadHachaMetal();
	}

	@Override
	public void handle(ActionEvent event) {
		this.modelo.jugador().seleccionarHachaMetal();
		super.handle(event);
	}

}
