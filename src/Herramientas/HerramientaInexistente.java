package Herramientas;

import Desgastes.Desgaste;
import Recursos.*;
import TipoMaterial.TipoMaterial;
import TipoMaterial.*;

public class HerramientaInexistente {



    public HerramientaInexistente(TipoMaterial material){
    }

    public HerramientaInexistente(){
    }




    public void asignarMaterial(TipoMaterial material){}
    public void asignarMaterial(TipoMadera madera){}
    public void asignarMaterial(TipoPiedra piedra){}
    public void asignarMaterial(TipoMetal metal){}
    public void asignarMaterial(TipoMetalYPiedra metalYPiedra){}


    // Set
    public void asignarFuerza(int fuerza){}
    public void asignarDesgaste(Desgaste desgaste){}





    // Get
    public int fuerza() {return 0;}

    public int durabilidad(){return 0;}


    // Dispatch
    public void golpear(Recurso recurso) {}
    // Fin dispatch

    public void golpear(Madera material){}
    public void golpear(Piedra material){}
    public void golpear(Metal material){}
    public void golpear(Diamante material){}
}
