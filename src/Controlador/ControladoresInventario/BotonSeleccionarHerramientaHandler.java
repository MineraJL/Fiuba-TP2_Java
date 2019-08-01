package Controlador.ControladoresInventario;

import Modelo.Modelo;
import Vista.VistaInventario;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BotonSeleccionarHerramientaHandler implements EventHandler<ActionEvent> {
	
	protected Modelo modelo;
	private VistaInventario vistaInventario;
	
	public BotonSeleccionarHerramientaHandler(Modelo modelo, VistaInventario vistaInventario) {
		this.modelo = modelo;
		this.vistaInventario = vistaInventario;
	}
	
	@Override
	public void handle(ActionEvent event) {
		vistaInventario.dibujar();
		
	}

}
