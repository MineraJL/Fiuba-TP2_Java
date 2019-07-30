package Controlador.ControladoresMesa;

import Modelo.MateriaPrima.MPPiedra;
import Modelo.Modelo;
import Vista.VistaMesa;
import javafx.event.ActionEvent;

public class BotonAgregarMPPiedraHandler extends BotonAgregarMPHandler {

    public BotonAgregarMPPiedraHandler(Modelo modelo, VistaMesa vistaMesa) {
        super(modelo,vistaMesa);
        this.materiaPrima = new MPPiedra();
    }

    @Override
    public void handle(ActionEvent event) {
        super.handle(event);
    }
}
