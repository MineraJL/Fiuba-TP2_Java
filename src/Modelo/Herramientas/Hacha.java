package Modelo.Herramientas;

import Modelo.Desgastes.DesgasteSegunMultiplicador;
import Modelo.Inventario.InventarioHerramienta;
import Modelo.Mapa.Ocupante;
import Modelo.Recursos.Madera;
import Modelo.TipoMaterial.TipoMadera;
import Modelo.TipoMaterial.TipoMaterial;
import Modelo.TipoMaterial.TipoMetal;
import Modelo.TipoMaterial.TipoPiedra;

public class Hacha extends Herramienta {


    public Hacha(TipoMaterial material){
        super(material);
        this.material.definirValores(this);
    }
    
    public void agregarAlInventario(InventarioHerramienta inventario) {
    	this.material.agregarAlInventario(inventario, this);
    }
    
    public void agregarAlInventario(InventarioHerramienta inventario, TipoMadera madera) {
    	inventario.agregarHerramienta(this, madera);
    }
    
    public void agregarAlInventario(InventarioHerramienta inventario, TipoPiedra piedra) {
    	inventario.agregarHerramienta(this, piedra);
    }
    
    public void agregarAlInventario(InventarioHerramienta inventario, TipoMetal metal) {
    	inventario.agregarHerramienta(this, metal);
    }


    // Asignar valores por material - Dispatch
    public void asignarMaterial(TipoMadera madera){
        this.asignarFuerza(2);
        this.asignarDesgaste(new DesgasteSegunMultiplicador(1,100));
    }

    public void asignarMaterial(TipoPiedra piedra){
        this.asignarFuerza(5);
        this.asignarDesgaste(new DesgasteSegunMultiplicador(1,200));
    }

    public void asignarMaterial(TipoMetal metal){
        this.asignarFuerza(10);
        this.asignarDesgaste(new DesgasteSegunMultiplicador(0.5,400));
    }
    // Fin Dispatch


    @Override
    public void golpear(Madera recursoMadera){
        super.golpear(recursoMadera);
        this.material.golpear(recursoMadera, this.fuerza);
    }


    @Override
    public void golpear(Ocupante ocupante){
        ocupante.golpeateCon(this);
    }
    
}