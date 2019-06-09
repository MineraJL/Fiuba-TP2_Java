package Herramientas;

import Materiales.Madera;

public class DurabilidadHerramienta {


    public static int desgastar(Hacha herramienta, Madera material){
        return (int) (herramienta.durabilidad() - (herramienta.fuerza() * 1));
    }
}
