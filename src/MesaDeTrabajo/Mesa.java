package MesaDeTrabajo;

import Herramientas.Hacha;
import Mapa.Casillero;
import Mapa.Item;
import Mapa.ItemVacio;
import Mapa.Posicion;
import MateriaPrima.MPMadera;
import MateriaPrima.MPVacio;
import MateriaPrima.MateriaPrima;
import TipoMaterial.TipoMadera;

import java.util.ArrayList;

public class Mesa {

    Casillero[][] grilla;

    public Mesa(){
        grilla = new Casillero[3][3];
        Item itemvacio = new MPVacio();
        for (int i = 0; i < grilla.length; i++) {
            for (int j = 0; j < grilla[i].length; j++) {
                grilla[i][j] = new Casillero();
                grilla[i][j].setItem(itemvacio);
            }
        }
    }

    public MateriaPrima[][] obtenerDisposicionCorrectaHachaDeMadera(){

        MateriaPrima[][] disposicion = new MateriaPrima[3][3];

        MPMadera maderita = new MPMadera();
        MPVacio vacio = new MPVacio();

        disposicion[0][0]=maderita;
        disposicion[0][1]=maderita;
        disposicion[0][2]=vacio;

        disposicion[1][0]=maderita;
        disposicion[1][1]=maderita;
        disposicion[1][2]=vacio;

        disposicion[2][1]=vacio;
        disposicion[2][1]=maderita;
        disposicion[2][2]=vacio;

        return disposicion;
    }

    public Hacha construiHerramienta(MateriaPrima[][] disposicionRecibida){
        // if(disposicionRecibida.equals(obtenerDisposicionCorrectaHachaDeMadera()))
            // en el futuro en vez de usar ese metodo obtenerDisp..., se itera una coleccion "disposicionesCorrectas"
            // obs: que devolvemos si no coincide ?
            // tal vez deberia delegarse algo aca..., a la disposicion, que deberia ser una clase que haga equals para cada elemento
                    // igual el problema persiste...
        return new Hacha(new TipoMadera());

    }

    public void guardarMateriaPrimaEn(Item materiaPrima, int filaCasillero, int colunmaCasillero){
        this.grilla[filaCasillero][colunmaCasillero].setItem(materiaPrima);
        System.out.print(materiaPrima.getClass());
        System.out.print(this.grilla[filaCasillero][colunmaCasillero].getItem());
        System.out.print(" en ");
        System.out.print(filaCasillero);
        System.out.println(colunmaCasillero);
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
/*
    public boolean equals(Mesa otraMesa){
        for (int i = 0; i < grilla.length; i++) {
            for (int j = 0; j < grilla[i].length; j++) {
                if (!grilla[i][j].getItem().equals(otraMesa.obtenerItemEn(i,j)) ){
                    return false;
                }
            }
        }
        return true;
    }
*/

}