package Controlador.ControladoresMesa;

import Modelo.MateriaPrima.MPMetal;
import Modelo.Modelo;
import Vista.VistaInventario;
import Vista.VistaMesa;
import javafx.event.ActionEvent;

public class BotonAgregarMPMetalHandler extends BotonAgregarMPHandler {

    public BotonAgregarMPMetalHandler(Modelo modelo, VistaMesa vistaMesa, VistaInventario vistaInventario) {
        super(modelo,vistaMesa, vistaInventario);
    }

    @Override
    public void handle(ActionEvent event) {
    	try {
    		this.materiaPrima = this.modelo.inventario().extraerMateriaPrimaMetal();
    		super.handle(event);
    	}catch(Exception e) {
    		
    	}
    }
}
