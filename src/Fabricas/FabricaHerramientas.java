package Fabricas;

import Herramientas.Herramienta;
import Herramientas.HerramientaInexistente;
import Mapa.Item;
import MesaDeTrabajo.Mesa;

import java.util.ArrayList;

public class FabricaHerramientas {


    private ArrayList<IFabricaHerramienta> fabricasDeHerramienta;

    public FabricaHerramientas(){
        this.fabricasDeHerramienta = new ArrayList<IFabricaHerramienta>();
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
