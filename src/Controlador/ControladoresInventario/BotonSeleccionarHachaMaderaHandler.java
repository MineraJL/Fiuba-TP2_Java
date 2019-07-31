package Controlador.ControladoresInventario;

import Modelo.Modelo;
import Modelo.Jugador.Jugador;
import Vista.VistaInventario;
import Vista.VistaModelo;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BotonSeleccionarHachaMaderaHandler implements EventHandler<ActionEvent> {
	
	private Modelo modelo;
	private VistaInventario vistaInventario;

	public BotonSeleccionarHachaMaderaHandler(Modelo modelo, VistaInventario vistaInventario) {
		this.modelo = modelo;
		this.vistaInventario = vistaInventario;
	}

	@Override
	public void handle(ActionEvent event) {
		this.modelo.jugador().seleccionarHachaMadera();
		
	}

}
