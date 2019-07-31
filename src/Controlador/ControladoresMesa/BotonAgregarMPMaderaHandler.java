package Controlador.ControladoresMesa;

import Modelo.MateriaPrima.MPMadera;
import Modelo.Modelo;
import Vista.VistaInventario;
import Vista.VistaMesa;
import javafx.event.ActionEvent;

public class BotonAgregarMPMaderaHandler extends BotonAgregarMPHandler {

    public BotonAgregarMPMaderaHandler(Modelo modelo, VistaMesa vistaMesa, VistaInventario vistaInventario) {
        super(modelo,vistaMesa, vistaInventario);
        this.materiaPrima = new MPMadera();
    }

    @Override
    public void handle(ActionEvent event) {
        super.handle(event);
    }

}