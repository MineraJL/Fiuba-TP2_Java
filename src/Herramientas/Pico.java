package Herramientas;

import Desgastes.DesgastePorUsos;
import Desgastes.DesgasteSegunMultiplicador;
import Inventario.InventarioHerramienta;
import Recursos.Metal;
import Recursos.Piedra;
import TipoMaterial.TipoMadera;
import TipoMaterial.TipoMaterial;
import TipoMaterial.TipoMetal;
import TipoMaterial.TipoPiedra;

public class Pico extends Herramienta {

    public Pico(TipoMaterial material) {
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
        this.asignarFuerza(4);
        this.asignarDesgaste(new DesgasteSegunMultiplicador(0.66,200));
    }

    public void asignarMaterial(TipoMetal metal){
        this.asignarFuerza(12);
        this.asignarDesgaste(new DesgastePorUsos(10, 400));
    }
    // Fin Dispatch


    @Override
    public void golpear(Piedra recursoPiedra) {
        super.golpear(recursoPiedra);
        this.material.golpear(recursoPiedra, this.fuerza);
    }

    @Override
    public void golpear(Metal recursoMetal) {
        super.golpear(recursoMetal);
        this.material.golpear(recursoMetal, this.fuerza);
    }
}