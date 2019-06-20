package Fabricas;

import Herramientas.Herramienta;
import MesaDeTrabajo.Mesa;

public interface IFabricaHerramienta {

    public Herramienta fabricarHerramienta(Mesa mesaDeTrabajo);
}
