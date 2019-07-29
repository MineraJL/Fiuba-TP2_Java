package Modelo.MesaDeTrabajo;

import Modelo.Fabricas.FabricaHerramientas;
import Modelo.Herramientas.Herramienta;
import Modelo.Mapa.Casillero;
import Modelo.Mapa.Ocupante;
import Modelo.Mapa.Posicion;
import Modelo.Mapa.PosicionEnlazada;

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

    public void guardarMateriaPrimaEn(Ocupante materiaPrima, int filaCasillero, int colunmaCasillero){
        this.grilla[filaCasillero][colunmaCasillero].ocuparPor(materiaPrima);
    }
    public void guardarMateriaPrimaEn(Ocupante materiaPrima, PosicionEnlazada posicion){
        this.guardarMateriaPrimaEn(materiaPrima,posicion.geti(),posicion.getj());
    }

    public Ocupante obtenerItemEn(int filaCasillero, int colunmaCasillero){
        return this.grilla[filaCasillero][colunmaCasillero].ocupante();
    }
    public ArrayList<Ocupante> obtenerItemsEn(ArrayList<Posicion> posiciones){
        ArrayList<Ocupante> itemsObtenidos = new ArrayList<Ocupante>();
        for (int i = 0; i < posiciones.size(); i++) {
            int x = posiciones.get(i).getX();
            int y = posiciones.get(i).getY();
            itemsObtenidos.add(this.obtenerItemEn(x,y));
        }
        return itemsObtenidos;
    }

}