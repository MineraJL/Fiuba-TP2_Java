package Controlador.ControladoresMesa;

import Modelo.MateriaPrima.MPDiamante;
import Modelo.Modelo;
import Vista.VistaMesa;
import javafx.event.ActionEvent;

public class BotonAgregarMPDiamanteHandler extends BotonAgregarMPHandler {

    public BotonAgregarMPDiamanteHandler(Modelo modelo, VistaMesa vistaMesa) {
        super(modelo,vistaMesa);
        this.materiaPrima = new MPDiamante();
    }

    @Override
    public void handle(ActionEvent event) {
        super.handle(event);
    }
}
