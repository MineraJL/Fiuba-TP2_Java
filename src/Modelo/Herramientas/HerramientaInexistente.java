package Modelo.Herramientas;

import Modelo.Desgastes.DesgasteSegunMultiplicador;
import Modelo.Inventario.InventarioHerramienta;
import Modelo.Mapa.Ocupante;
import Modelo.TipoMaterial.TipoMaterialInexistente;

public class HerramientaInexistente extends Herramienta {


    public HerramientaInexistente() {
        super(new TipoMaterialInexistente());
        this.asignarMaterial(new TipoMaterialInexistente());
    }


    public void asignarMaterial(TipoMaterialInexistente inexistente){
        this.asignarFuerza(0);
        this.asignarDesgaste(new DesgasteSegunMultiplicador(0,1));
    }

    // Get

    public int durabilidad(){return 0;}

	@Override
	public void agregarAlInventario(InventarioHerramienta inventario) {

	}

	@Override
    public void golpear(Ocupante ocupante){}
}
