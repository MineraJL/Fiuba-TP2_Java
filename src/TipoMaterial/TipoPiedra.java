package TipoMaterial;

import Herramientas.Herramienta;
import Inventario.InventarioHerramienta;
import Recursos.Madera;
import Recursos.Metal;
import Recursos.Piedra;

public class TipoPiedra extends TipoMaterial{

    public TipoPiedra(){
    }

    @Override
    public void definirValores(Herramienta herramienta) {
        herramienta.asignarMaterial(this);
    }

    public void golpear(Madera recurso, int fuerza){ recurso.reducirDurabilidadEn(fuerza);}
    public void golpear(Piedra recurso, int fuerza){recurso.reducirDurabilidadEn(fuerza);}
    public void golpear(Metal recurso, int fuerza){recurso.reducirDurabilidadEn(fuerza);}
    
    @Override
	public void agregarAlInventario(InventarioHerramienta inventario, Herramienta herramienta) {
		herramienta.agregarAlInventario(inventario, this);
		
	}

}
