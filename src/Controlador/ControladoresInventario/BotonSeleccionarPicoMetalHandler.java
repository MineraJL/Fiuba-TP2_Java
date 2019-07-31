package Controlador.ControladoresInventario;

import Modelo.Modelo;
import Vista.VistaInventario;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class BotonSeleccionarPicoMetalHandler extends BotonSeleccionarHerramientaHandler {

	public BotonSeleccionarPicoMetalHandler(Modelo modelo, VistaInventario vistaInventario, Button botonSeleccionarPicoMetal) {
		super(modelo, vistaInventario, botonSeleccionarPicoMetal);
		cantidadHerramientas = modelo.inventario().cantidadPicoMetal();
	}

	@Override
	public void handle(ActionEvent event) {
		this.modelo.jugador().seleccionarPicoMetal();
		super.handle(event);
	}

}
