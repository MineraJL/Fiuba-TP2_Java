package Modelo.MesaDeTrabajo;

import Modelo.Fabricas.FabricaHerramientas;
import Modelo.Herramientas.Herramienta;
import Modelo.Mapa.*;

import java.util.ArrayList;

public class Mesa {

    Casillero[][] grilla; // viejo
    private Mapa mapa;

    public Mesa(){

        this.mapa = new Mapa(3,3);


        grilla = new Casillero[3][3]; // viejo
        for (int i = 0; i < grilla.length; i++) {
            for (int j = 0; j < grilla[i].length; j++) {
                grilla[i][j] = new Casillero();
            }
        } // viejo
    }


    public Herramienta construiHerramienta(){
        FabricaHerramientas fabrica = new FabricaHerramientas();
        return fabrica.fabricarHerramienta(this);

    }

    public void guardarMateriaPrimaEn(Ocupante materiaPrima, int filaCasillero, int colunmaCasillero){ // viejo
        this.grilla[filaCasillero][colunmaCasillero].ocuparPor(materiaPrima); // viejo
    }
    public void guardarMateriaPrimaEn(Ocupante materiaPrima, PosicionEnlazada posicion){
        materiaPrima.ingresar(this.mapa,posicion);
        this.guardarMateriaPrimaEn(materiaPrima,posicion.geti(),posicion.getj()); // viejo
    }



    public Ocupante obtenerOcupanteEn(PosicionEnlazada posicionEnlazada){
        return this.mapa.ocupante(posicionEnlazada);
    }

    public Ocupante obtenerOcupanteEn(int filaCasillero, int colunmaCasillero){ // viejo
        return this.grilla[filaCasillero][colunmaCasillero].ocupante(); // viejo
    }
    public ArrayList<Ocupante> obtenerOcupantesEn(ArrayList<Posicion> posiciones){
        ArrayList<Ocupante> ocupantesObtenidos = new ArrayList<Ocupante>();
        for (int i = 0; i < posiciones.size(); i++) {
            int x = posiciones.get(i).getX();
            int y = posiciones.get(i).getY();
            ocupantesObtenidos.add(this.obtenerOcupanteEn(x,y));
        }
        return ocupantesObtenidos;
    }

}