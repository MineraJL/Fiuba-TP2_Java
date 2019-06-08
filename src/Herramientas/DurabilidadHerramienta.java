package Herramientas;

import Herramientas.Hacha;
import Materiales.Madera;

public class DurabilidadHerramienta {


    public static int desgastar(Hacha herramienta, Madera material){
        return (int) (herramienta.durabilidad() - (herramienta.Fuerza() * 1));
    }
}
