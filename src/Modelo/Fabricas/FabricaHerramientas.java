package Modelo.Fabricas;

import Modelo.Herramientas.Herramienta;
import Modelo.Herramientas.HerramientaInexistente;
import Modelo.MesaDeTrabajo.Mesa;

import java.util.ArrayList;

public class FabricaHerramientas {


    private ArrayList<FabricaHerramienta> fabricasDeHerramienta;

    public FabricaHerramientas(){
        this.fabricasDeHerramienta = new ArrayList<FabricaHerramienta>();
        this.fabricasDeHerramienta.add(new FabricaHacha());
        this.fabricasDeHerramienta.add(new FabricaPico());
        this.fabricasDeHerramienta.add(new FabricaPicoFino());
    }


    public Herramienta fabricarHerramienta(Mesa mesaDeTrabajo){
        Herramienta herramientaCreada = new HerramientaInexistente();
        Herramienta vacio = new HerramientaInexistente();
        int i = 0;
        while (herramientaCreada.equals(vacio) && (i<fabricasDeHerramienta.size())) {

            herramientaCreada = fabricasDeHerramienta.get(i).fabricarHerramienta(mesaDeTrabajo);
            i++;
        }

        return herramientaCreada;
    }
}
