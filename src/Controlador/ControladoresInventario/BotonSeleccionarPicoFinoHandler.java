package Controlador.ControladoresInventario;

import Modelo.Modelo;
import Vista.VistaInventario;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class BotonSeleccionarPicoFinoHandler extends BotonSeleccionarHerramientaHandler {

	public BotonSeleccionarPicoFinoHandler(Modelo modelo, VistaInventario vistaInventario, Button botonSeleccionarPicoFino) {
		super(modelo, vistaInventario, botonSeleccionarPicoFino);
		cantidadHerramientas = modelo.inventario().cantidadPicoFino();
	}

	@Override
	public void handle(ActionEvent event) {
		this.modelo.jugador().seleccionarPicoFino();
		super.handle(event);
	}
}
