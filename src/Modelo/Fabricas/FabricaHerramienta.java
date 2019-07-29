package Modelo.Fabricas;

import Modelo.Herramientas.Herramienta;
import Modelo.Mapa.Ocupante;
import Modelo.Mapa.PosicionEnlazada;
import Modelo.MateriaPrima.MPVacio;
import Modelo.MesaDeTrabajo.Mesa;

import java.util.ArrayList;
import java.util.List;

public abstract class FabricaHerramienta implements IFabricaHerramienta {


    protected ArrayList<PosicionEnlazada> modeloForma;
    protected ArrayList<PosicionEnlazada> modeloFondo;

    protected boolean formaEsCorrecta(Mesa mesa){
    	List<Ocupante> elementosDeLaMesa = mesa.obtenerOcupantesEn(this.modeloForma);
        MPVacio vacio = new MPVacio();
        
        for (int i = 0; i < elementosDeLaMesa.size(); i++)
        	if (elementosDeLaMesa.get(i).equals(vacio))
        		return false;
        
        elementosDeLaMesa = mesa.obtenerOcupantesEn(this.modeloFondo);
        for (int i = 0; i < elementosDeLaMesa.size(); i++)
        	if (!elementosDeLaMesa.get(i).equals(vacio))
        		return false;
    	
        return true;
    }

	@Override
	public abstract Herramienta fabricarHerramienta(Mesa mesaDeTrabajo);

}
