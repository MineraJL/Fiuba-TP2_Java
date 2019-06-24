package TipoMaterial;

import Herramientas.Herramienta;
import Inventario.InventarioHerramienta;
import Recursos.Diamante;
import Recursos.Madera;
import Recursos.Metal;
import Recursos.Piedra;

public abstract class TipoMaterial {


    public abstract void definirValores(Herramienta herramienta);
    public abstract void agregarAlInventario(InventarioHerramienta inventario, Herramienta herramienta);


    public void golpear(Madera madera, int fuerza){}
    public void golpear(Piedra piedra, int fuerza){}
    public void golpear(Metal metal,int fuerza ){}
    public void golpear(Diamante diamante, int fuerza){}
}
