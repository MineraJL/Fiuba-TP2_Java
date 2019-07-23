package Modelo.Herramientas;

import Modelo.Desgastes.DesgasteSegunMultiplicador;
import Modelo.Inventario.*;
import Modelo.Mapa.Ocupante;
import Modelo.Recursos.Diamante;
import Modelo.Recursos.Madera;
import Modelo.Recursos.Metal;
import Modelo.Recursos.Piedra;
import Modelo.TipoMaterial.*;

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
    public void golpear(Ocupante unOcupante){
        super.golpear(unOcupante);
        this.material.golpear(unOcupante, this.fuerza);
    }

    public void golpear(Piedra material){}
    
    public void golpear(Metal material){}
    
    public void golpear(Diamante material){}

}