package Controlador.ControladoresInventario;

import Modelo.Modelo;
import Vista.VistaInventario;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BotonSeleccionarPicoMetalHandler implements EventHandler<ActionEvent> {

	private Modelo modelo;
	private VistaInventario vistaInventario;
	
	public BotonSeleccionarPicoMetalHandler(Modelo modelo, VistaInventario vistaInventario) {
		this.modelo = modelo;
		this.vistaInventario = vistaInventario;
	}

	@Override
	public void handle(ActionEvent event) {
		this.modelo.jugador().seleccionarPicoMetal();
		
	}

}
