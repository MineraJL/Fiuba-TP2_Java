package Controlador.ControladoresInventario;

import Modelo.Modelo;
import Modelo.Jugador.Jugador;
import Vista.VistaInventario;
import Vista.VistaModelo;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class BotonSeleccionarHachaMaderaHandler extends BotonSeleccionarHerramientaHandler {

	public BotonSeleccionarHachaMaderaHandler(Modelo modelo, VistaInventario vistaInventario, Button botonSeleccionarHachaMadera) {
		super(modelo, vistaInventario, botonSeleccionarHachaMadera);
		this.cantidadHerramientas = modelo.inventario().cantidadHachaMadera();
	}

	@Override
	public void handle(ActionEvent event) {
		this.modelo.jugador().seleccionarHachaMadera();
		super.handle(event);
	}

}
