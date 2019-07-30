package Controlador.ControladoresMesa;

import Modelo.MateriaPrima.MPMetal;
import Modelo.Modelo;
import Vista.VistaMesa;
import javafx.event.ActionEvent;

public class BotonAgregarMPMetalHandler extends BotonAgregarMPHandler {

    public BotonAgregarMPMetalHandler(Modelo modelo, VistaMesa vistaMesa) {
        super(modelo,vistaMesa);
        this.materiaPrima = new MPMetal();
    }

    @Override
    public void handle(ActionEvent event) {
        super.handle(event);
    }
}
