package Modelo.TipoMaterial;
import Modelo.Herramientas.Herramienta;
import Modelo.Inventario.InventarioHerramienta;
import Modelo.Recursos.Diamante;

public class TipoMetalYPiedra extends TipoMaterial{

    public TipoMetalYPiedra(){
    }


    @Override
    public void definirValores(Herramienta herramienta) {
        herramienta.asignarMaterial(this);
    }
    public void golpear(Diamante recurso, int fuerza){ recurso.reducirDurabilidadEn(fuerza);}
    
    @Override
	public void agregarAlInventario(InventarioHerramienta inventario, Herramienta herramienta) {
		herramienta.agregarAlInventario(inventario, this);
		
	}
}
