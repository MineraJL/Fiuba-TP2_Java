package Modelo.Herramientas;

import Modelo.Desgastes.DesgastePorUsos;
import Modelo.Desgastes.DesgasteSegunMultiplicador;
import Modelo.Inventario.InventarioHerramienta;
import Modelo.Mapa.Ocupante;
import Modelo.Recursos.*;
import Modelo.TipoMaterial.TipoMadera;
import Modelo.TipoMaterial.TipoMaterial;
import Modelo.TipoMaterial.TipoMetal;
import Modelo.TipoMaterial.TipoPiedra;

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
    public void golpear(Ocupante unOcupante){
        super.golpear(unOcupante);
        this.material.golpear(unOcupante, this.fuerza);
    }
}