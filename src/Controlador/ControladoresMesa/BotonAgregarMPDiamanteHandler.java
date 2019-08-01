package Controlador.ControladoresMesa;

import Modelo.MateriaPrima.MPDiamante;
import Modelo.Modelo;
import Vista.VistaInventario;
import Vista.VistaMesa;
import javafx.event.ActionEvent;

public class BotonAgregarMPDiamanteHandler extends BotonAgregarMPHandler {

    public BotonAgregarMPDiamanteHandler(Modelo modelo, VistaMesa vistaMesa, VistaInventario vistaInventario) {
        super(modelo,vistaMesa, vistaInventario);
    }

    @Override
    public void handle(ActionEvent event) {
    	try {
    		this.materiaPrima = this.modelo.inventario().extraerMateriaPrimaDiamante();
    		super.handle(event);
    	} catch(Exception e) {
    		
    	}
    }
}
