package Modelo.MesaDeTrabajo;

import Modelo.Fabricas.FabricaHerramientas;
import Modelo.Herramientas.Herramienta;
import Modelo.Mapa.*;

import java.util.ArrayList;

public class Mesa {

    //private Mapa mapa;
    //private PosicionEnlazadaMesa posicionEnlazadaMesa;
    private Disposicion disposicion;

    public Mesa(){
        //this.mapa = new Mapa(3,3);
        //this.posicionEnlazadaMesa = new PosicionEnlazadaMesa(0,0);
        this.disposicion = new Disposicion(3,3);
    }

    public PosicionEnlazada posicionInicial(){
        return this.disposicion.posicionInicial();
    }

    public void limpiar(){
        this.disposicion = new Disposicion(3,3);
    }


    public void guardarMateriaPrimaEn(Ocupante materiaPrima, int fila, int columna){
        this.guardarMateriaPrimaEn(materiaPrima,new PosicionEnlazada(fila,columna));
    }
    public void guardarMateriaPrimaEn(Ocupante materiaPrima, PosicionEnlazada posicion){
        //materiaPrima.ingresar(this.disposicion,posicion); // hacer que esta línea funcione
        this.disposicion.obtenerCasillero(posicion).ocuparPor(materiaPrima); // temp: línea temporal, debe funcionar la de arriba
    }


    public Ocupante obtenerOcupanteEn(PosicionEnlazada posicionEnlazada){
        return this.disposicion.ocupante(posicionEnlazada);
    }


    public ArrayList<Ocupante> obtenerOcupantesEn(ArrayList<PosicionEnlazada> posiciones){
        ArrayList<Ocupante> ocupantesObtenidos = new ArrayList<Ocupante>();
        for (int k = 0; k < posiciones.size(); k++) {
            PosicionEnlazada posicion = posiciones.get(k);
            ocupantesObtenidos.add(this.obtenerOcupanteEn(posicion));
        }
        return ocupantesObtenidos;
    }


    public Herramienta construiHerramienta(){ // deberia recibir disposicion, hay que cambiar lo que reciben fbrcs
        FabricaHerramientas fabrica = new FabricaHerramientas();
        return fabrica.fabricarHerramienta(this);

    }

}