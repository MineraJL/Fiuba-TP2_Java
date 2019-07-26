package Modelo.TipoMaterial;

import Modelo.Herramientas.Herramienta;
import Modelo.Inventario.InventarioHerramienta;

public class TipoMaterialInexistente extends TipoMaterial {
    @Override
    public void definirValores(Herramienta herramienta) {}

	@Override
	public void agregarAlInventario(InventarioHerramienta inventario, Herramienta herramienta) {}
}
