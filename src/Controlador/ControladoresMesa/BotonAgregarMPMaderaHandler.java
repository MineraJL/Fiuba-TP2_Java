package Controlador.ControladoresMesa;

import Modelo.Modelo;
import Vista.VistaMesa;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BotonAgregarMPMaderaHandler implements EventHandler<ActionEvent> {
    private Modelo modelo;
    private VistaMesa vistaMesa;

    public BotonAgregarMPMaderaHandler(Modelo modelo, VistaMesa vistaMesa) {
        this.modelo = modelo;
        this.vistaMesa = vistaMesa;
    }

    @Override
    public void handle(ActionEvent event) {
        // una línea que hable con la Disposicion (que todavía no existe) // limpiar hace new // construir manda a mesa
        this.vistaMesa.dibujar();
    }




}