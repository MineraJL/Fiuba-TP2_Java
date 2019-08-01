package Controlador.ControladoresMesa;

import Modelo.MateriaPrima.MPVacio;
import Modelo.Modelo;
import Vista.VistaInventario;
import Vista.VistaMesa;
import javafx.event.ActionEvent;

public class BotonAgregarMPVacioHandler extends BotonAgregarMPHandler {

    public BotonAgregarMPVacioHandler(Modelo modelo, VistaMesa vistaMesa, VistaInventario vistaInventario) {
        super(modelo, vistaMesa, vistaInventario);
        this.materiaPrima = new MPVacio();
    }

    @Override
    public void handle(ActionEvent event) {
        super.handle(event);
    }
}
