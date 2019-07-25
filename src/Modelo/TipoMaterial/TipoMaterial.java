package Modelo.TipoMaterial;

import Modelo.Herramientas.Herramienta;
import Modelo.Inventario.InventarioHerramienta;
import Modelo.Recursos.Diamante;
import Modelo.Recursos.Madera;
import Modelo.Recursos.Metal;
import Modelo.Recursos.Piedra;

public abstract class TipoMaterial {


    public abstract void definirValores(Herramienta herramienta);
    public abstract void agregarAlInventario(InventarioHerramienta inventario, Herramienta herramienta);

    /*public void golpear(Ocupante unOcupante, int fuerza, Hacha herramienta) {
    	unOcupante.serGolpeadoCon(this, fuerza, herramienta);
    }
    
    public void golpear(Ocupante unOcupante, int fuerza, Pico herramienta) {
    	unOcupante.serGolpeadoCon(this, fuerza, herramienta);
    }
    
    public void golpear(Ocupante unOcupante, int fuerza, PicoFino herramienta) {
    	unOcupante.serGolpeadoCon(this, fuerza, herramienta);
    }*/ // temp: comento esto temporalmente
    
    public void golpear(Madera madera, int fuerza){}
    public void golpear(Piedra piedra, int fuerza){}
    public void golpear(Metal metal,int fuerza ){}
    public void golpear(Diamante diamante, int fuerza){}

    @Override
    public boolean equals(Object obj){
        return this.getClass() == obj.getClass();
    }
}
