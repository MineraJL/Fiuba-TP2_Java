package Controlador.ControladoresInventario;

import Modelo.Modelo;
import Vista.VistaInventario;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class BotonSeleccionarPicoMaderaHandler extends BotonSeleccionarHerramientaHandler {
	
	public BotonSeleccionarPicoMaderaHandler(Modelo modelo, VistaInventario vistaInventario, Button botonSeleccionarPicoMadera) {
		super(modelo, vistaInventario, botonSeleccionarPicoMadera);
		cantidadHerramientas = modelo.inventario().cantidadPicoMadera();
	}

	@Override
	public void handle(ActionEvent event) {
		this.modelo.jugador().seleccionarPicoMadera();
		super.handle(event);
	}
}
