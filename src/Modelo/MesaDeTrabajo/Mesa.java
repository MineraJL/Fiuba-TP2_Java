package Modelo.MesaDeTrabajo;

import Modelo.Fabricas.FabricaHerramientas;
import Modelo.Herramientas.Herramienta;
import Modelo.Mapa.Casillero;
import Modelo.Mapa.Item;
import Modelo.Mapa.Posicion;

import java.util.ArrayList;

public class Mesa {

    Casillero[][] grilla;

    public Mesa(){
        grilla = new Casillero[3][3];
        for (int i = 0; i < grilla.length; i++) {
            for (int j = 0; j < grilla[i].length; j++) {
                grilla[i][j] = new Casillero();
            }
        }
    }


    public Herramienta construiHerramienta(){
        FabricaHerramientas fabrica = new FabricaHerramientas();
        return fabrica.fabricarHerramienta(this);

    }

    public void guardarMateriaPrimaEn(Item materiaPrima, int filaCasillero, int colunmaCasillero){
        this.grilla[filaCasillero][colunmaCasillero].setItem(materiaPrima);
    }

    public Item obtenerItemEn(int filaCasillero, int colunmaCasillero){
        return this.grilla[filaCasillero][colunmaCasillero].getItem();
    }
    public ArrayList<Item> obtenerItemsEn(ArrayList<Posicion> posiciones){
        ArrayList<Item> itemsObtenidos = new ArrayList<Item>();
        for (int i = 0; i < posiciones.size(); i++) {
            int x = posiciones.get(i).getX();
            int y = posiciones.get(i).getY();
            itemsObtenidos.add(this.obtenerItemEn(x,y));
        }
        return itemsObtenidos;
    }

}