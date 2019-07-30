package Controlador.ControladoresMesa;

import Modelo.MateriaPrima.MPMadera;
import Modelo.Modelo;
import Vista.VistaMesa;
import javafx.event.ActionEvent;

public class BotonAgregarMPMaderaHandler extends BotonAgregarMPHandler {

    public BotonAgregarMPMaderaHandler(Modelo modelo, VistaMesa vistaMesa) {
        super(modelo,vistaMesa);
        this.materiaPrima = new MPMadera();
    }

    @Override
    public void handle(ActionEvent event) {
        super.handle(event);
    }

}