package Controlador.ControladoresMesa;

import Modelo.Modelo;
import Vista.VistaMesa;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BotonLimpiarMesaHandler implements EventHandler<ActionEvent> {

    private Modelo modelo;
    private VistaMesa vistaMesa;

    public BotonLimpiarMesaHandler(Modelo modelo, VistaMesa vistaMesa) {
        this.modelo = modelo;
        this.vistaMesa = vistaMesa;
    }

    @Override
    public void handle(ActionEvent event) {
        this.modelo.mesa().limpiar();
        this.vistaMesa.limpiar();

    }
}
