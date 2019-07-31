package Controlador.ControladoresMesa;

import Modelo.MateriaPrima.MPDiamante;
import Modelo.Modelo;
import Vista.VistaInventario;
import Vista.VistaMesa;
import javafx.event.ActionEvent;

public class BotonAgregarMPDiamanteHandler extends BotonAgregarMPHandler {

    public BotonAgregarMPDiamanteHandler(Modelo modelo, VistaMesa vistaMesa, VistaInventario vistaInventario) {
        super(modelo,vistaMesa, vistaInventario);
        this.materiaPrima = new MPDiamante();
    }

    @Override
    public void handle(ActionEvent event) {
        super.handle(event);
    }
}
