package Modelo.TipoMaterial;

import Modelo.Herramientas.Herramienta;
import Modelo.Inventario.InventarioHerramienta;
import Modelo.Recursos.Madera;
import Modelo.Recursos.Piedra;

public class TipoMadera extends TipoMaterial{

    public TipoMadera(){
    }

    public void golpear(Madera recurso, int fuerza){ recurso.reducirDurabilidadEn(fuerza);}
    public void golpear(Piedra recurso, int fuerza){recurso.reducirDurabilidadEn(fuerza);}


    @Override
    public void definirValores(Herramienta herramienta) {
        herramienta.asignarMaterial(this);
    }

	@Override
	public void agregarAlInventario(InventarioHerramienta inventario, Herramienta herramienta) {
		herramienta.agregarAlInventario(inventario, this);
		
	}

}
