package Fabricas;

import Herramientas.Herramienta;
import Herramientas.HerramientaInexistente;
import Mapa.Item;
import MesaDeTrabajo.Mesa;

import java.util.ArrayList;

public class FabricaHerramientas {


    private ArrayList<FabricaHerramientas> fabricasDeHerramienta;
    public FabricaHerramientas(){
        this.fabricasDeHerramienta = new ArrayList<FabricaHerramientas>();
        this.fabricasDeHerramienta.add(new FabricaHacha());
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
