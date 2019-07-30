package Controlador.ControladoresMesa;

import Modelo.Modelo;
import Vista.VistaMesa;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BotonConstruirHerramientaHandler implements EventHandler<ActionEvent> {

    private Modelo modelo;
    private VistaMesa vistaMesa;

    public BotonConstruirHerramientaHandler(Modelo modelo, VistaMesa vistaMesa) {
        this.modelo = modelo;
        this.vistaMesa = vistaMesa;
    }

    @Override
    public void handle(ActionEvent event) {
        //Herramienta herramientaConstruida = this.modelo.mesa().construiHerramienta(); // hay que
        //modelo.inventario().agregarElemento(herramientaConstruida); // hacer esto pero primero

        //modelo.mesa().limpiar();  // modificar que mesa pase disposicion en vez de a sí misma
        vistaMesa.construirHerramienta();
    }
}