package Controlador.ControladoresMesa;

import Modelo.Herramientas.Herramienta;
import Modelo.Modelo;
import Vista.VistaInventario;
import Vista.VistaMesa;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BotonConstruirHerramientaHandler implements EventHandler<ActionEvent> {

    private Modelo modelo;
    private VistaMesa vistaMesa;
    private VistaInventario vistaInventario;

    public BotonConstruirHerramientaHandler(Modelo modelo, VistaMesa vistaMesa, VistaInventario vistaInventario) {
        this.modelo = modelo;
        this.vistaMesa = vistaMesa;
        this.vistaInventario = vistaInventario;
    }

    @Override
    public void handle(ActionEvent event) {
        Herramienta herramientaConstruida = this.modelo.mesa().construiHerramienta();
        modelo.inventario().agregarElemento(herramientaConstruida);

        modelo.mesa().limpiar();
        vistaMesa.construirHerramienta();
        vistaInventario.dibujar();
    }
}