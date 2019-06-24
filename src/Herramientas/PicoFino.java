package Herramientas;
import Desgastes.DesgastePorUsos;
import Recursos.*;
import Desgastes.DesgasteSegunMultiplicador;
import Inventario.InventarioHerramienta;
import Recursos.Diamante;
import TipoMaterial.*;

public class PicoFino extends Herramienta {


    public PicoFino(TipoMaterial material){
        super(material);
        this.material.definirValores(this);
    }

    public void agregarAlInventario(InventarioHerramienta inventario) {
    	inventario.agregarHerramienta(this);
    }

    // Asignar valores por material - Dispatch
    public void asignarMaterial(TipoMetalYPiedra metalYPiedra){
        this.asignarFuerza(20);
        this.asignarDesgaste(new DesgasteSegunMultiplicador(0.1,1000));
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

    public void golpear(Diamante recursoDiamante) {
        //super.golpear(recursoDiamante);
        this.desgaste.desgastarCon(this.durabilidad());
        this.material.golpear(recursoDiamante, this.fuerza);
    }
    public void golpear(Madera material){
    }
    public void golpear(Piedra material){
    }
    public void golpear(Metal material){
    }

}