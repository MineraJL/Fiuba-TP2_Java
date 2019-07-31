package Controlador.ControladoresMesa;

import Modelo.MateriaPrima.MPPiedra;
import Modelo.Modelo;
import Vista.VistaInventario;
import Vista.VistaMesa;
import javafx.event.ActionEvent;

public class BotonAgregarMPPiedraHandler extends BotonAgregarMPHandler {

    public BotonAgregarMPPiedraHandler(Modelo modelo, VistaMesa vistaMesa, VistaInventario vistaInventario) {
        super(modelo,vistaMesa, vistaInventario);
        this.materiaPrima = new MPPiedra();
    }

    @Override
    public void handle(ActionEvent event) {
    	try {
    		this.materiaPrima = this.modelo.inventario().extraerMateriaPrimaPiedra();
    		super.handle(event);
    	}catch(Exception e) {
    		
    	}
    }
}
