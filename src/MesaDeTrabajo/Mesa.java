package MesaDeTrabajo;

import Herramientas.Hacha;
import Mapa.Casillero;
import Mapa.Item;
import Mapa.ItemVacio;
import MateriaPrima.MPMadera;
import MateriaPrima.MPVacio;
import MateriaPrima.MateriaPrima;
import TipoMaterial.TipoMadera;

public class Mesa {

    Casillero[][] grilla;

    public Mesa(){
        grilla = new Casillero[3][3];
        Item itemvacio = new ItemVacio();
        for (int i = 0; i < grilla.length; i++) {
            for (int j = 0; j < grilla[i].length; j++) {
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
    }

    public Item obtenerItemEn(int filaCasillero, int colunmaCasillero){
        return this.grilla[filaCasillero][colunmaCasillero].getItem();
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