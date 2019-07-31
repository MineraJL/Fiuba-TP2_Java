package Controlador.ControladoresInventario;

import Modelo.Modelo;
import Vista.VistaInventario;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class BotonSeleccionarHachaPiedraHandler extends BotonSeleccionarHerramientaHandler {
	
	public BotonSeleccionarHachaPiedraHandler(Modelo modelo, VistaInventario vistaInventario, Button botonSeleccionarHachaPiedra) {
		super(modelo, vistaInventario, botonSeleccionarHachaPiedra);
		cantidadHerramientas = modelo.inventario().cantidadHachaPiedra();
	}

	@Override
	public void handle(ActionEvent event) {
		this.modelo.jugador().seleccionarHachaPiedra();
		super.handle(event);
	}

}
