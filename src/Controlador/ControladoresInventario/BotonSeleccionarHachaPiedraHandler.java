package Controlador.ControladoresInventario;

import Modelo.Modelo;
import Vista.VistaInventario;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BotonSeleccionarHachaPiedraHandler implements EventHandler<ActionEvent> {
	
	private Modelo modelo;
	private VistaInventario vistaInventario;
	
	public BotonSeleccionarHachaPiedraHandler(Modelo modelo, VistaInventario vistaInventario) {
		this.modelo = modelo;
		this.vistaInventario = vistaInventario;
	}

	@Override
	public void handle(ActionEvent event) {
		this.modelo.jugador().seleccionarHachaPiedra();
		
	}

}
