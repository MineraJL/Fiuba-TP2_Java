package Controlador.ControladoresInventario;

import Modelo.Modelo;
import Vista.VistaInventario;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class BotonSeleccionarHerramientaHandler implements EventHandler<ActionEvent> {
	
	protected Modelo modelo;
	private VistaInventario vistaInventario;
	protected Button botonHerramienta;
	protected int cantidadHerramientas;
	
	public BotonSeleccionarHerramientaHandler(Modelo modelo, VistaInventario vistaInventario, Button botonHerramienta) {
		this.modelo = modelo;
		this.vistaInventario = vistaInventario;
		this.botonHerramienta = botonHerramienta;
	}
	
	@Override
	public void handle(ActionEvent event) {
		vistaInventario.dibujar();
		vistaInventario.setearEstadoBotones(botonHerramienta, cantidadHerramientas);
		
	}

}
