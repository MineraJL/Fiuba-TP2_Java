package Controlador.ControladoresMesa;

import Modelo.MateriaPrima.MPMadera;
import Modelo.Modelo;
import Vista.VistaInventario;
import Vista.VistaMesa;
import javafx.event.ActionEvent;

public class BotonAgregarMPMaderaHandler extends BotonAgregarMPHandler {

    public BotonAgregarMPMaderaHandler(Modelo modelo, VistaMesa vistaMesa, VistaInventario vistaInventario) {
        super(modelo,vistaMesa, vistaInventario);
    }

    @Override
    public void handle(ActionEvent event) {
    	try {
    		this.materiaPrima = this.modelo.inventario().extraerMateriaPrimaMadera();
    		super.handle(event);
    	}catch(Exception e) {
    		
    	}
    }

}