package Herramientas;

import Recursos.Madera;

public class DurabilidadHerramienta {


    public static int desgastar(Hacha herramienta, Madera material){
        return (int) (herramienta.durabilidad() - (herramienta.fuerza() * 1));
    }
}
