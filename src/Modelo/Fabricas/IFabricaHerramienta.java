package Modelo.Fabricas;

import Modelo.Herramientas.Herramienta;
import Modelo.MesaDeTrabajo.Mesa;

public interface IFabricaHerramienta {

    public Herramienta fabricarHerramienta(Mesa mesaDeTrabajo);
}
