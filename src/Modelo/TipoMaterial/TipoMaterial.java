package Modelo.TipoMaterial;

import Modelo.Herramientas.Herramienta;
import Modelo.Inventario.InventarioHerramienta;
import Modelo.Mapa.Ocupante;
import Modelo.Recursos.Diamante;
import Modelo.Recursos.Madera;
import Modelo.Recursos.Metal;
import Modelo.Recursos.Piedra;
import Modelo.Recursos.Recurso;

public abstract class TipoMaterial {


    public abstract void definirValores(Herramienta herramienta);
    public abstract void agregarAlInventario(InventarioHerramienta inventario, Herramienta herramienta);

    public void golpear(Ocupante unOcupante, int fuerza) {unOcupante.serGolpeadoCon(this, fuerza);}
    public void golpear(Madera madera, int fuerza){}
    public void golpear(Piedra piedra, int fuerza){}
    public void golpear(Metal metal,int fuerza ){}
    public void golpear(Diamante diamante, int fuerza){}

    @Override
    public boolean equals(Object obj){
        return this.getClass() == obj.getClass();
    }
}
