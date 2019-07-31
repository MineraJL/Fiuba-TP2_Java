package Controlador.ControladoresInventario;

import Modelo.Modelo;
import Vista.VistaInventario;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class BotonSeleccionarPicoPiedraHandler extends BotonSeleccionarHerramientaHandler {

	public BotonSeleccionarPicoPiedraHandler(Modelo modelo, VistaInventario vistaInventario, Button botonSeleccionarPicoPiedra) {
		super(modelo, vistaInventario, botonSeleccionarPicoPiedra);
		this.cantidadHerramientas = modelo.inventario().cantidadPicoPiedra();
	}

	@Override
	public void handle(ActionEvent event) {
		this.modelo.jugador().seleccionarPicoPiedra();
		super.handle(event);
	}

}
