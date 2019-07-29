package Modelo.MesaDeTrabajo;

import Modelo.Fabricas.FabricaHerramientas;
import Modelo.Herramientas.Herramienta;
import Modelo.Mapa.*;

import java.util.ArrayList;

public class Mesa {

    private Mapa mapa;
    private PosicionEnlazadaMesa posicionEnlazadaMesa;

    public Mesa(){
        this.mapa = new Mapa(3,3);
        this.posicionEnlazadaMesa = new PosicionEnlazadaMesa(0,0);
    }

    public PosicionEnlazadaMesa posicionInicial(){
        return this.posicionEnlazadaMesa;
    }

    public PosicionEnlazadaMesa siguiente(){
        return posicionEnlazadaMesa.siguiente();
    }

    private void enlazarPosicionesMesa(){
        for ()
    }


    public void guardarMateriaPrimaEn(Ocupante materiaPrima, int fila, int columna){
        this.guardarMateriaPrimaEn(materiaPrima,new PosicionEnlazada(fila,columna));
    }
    public void guardarMateriaPrimaEn(Ocupante materiaPrima, PosicionEnlazada posicion){
        materiaPrima.ingresar(this.mapa,posicion);
    }


    public Ocupante obtenerOcupanteEn(PosicionEnlazada posicionEnlazada){
        return this.mapa.ocupante(posicionEnlazada);
    }


    public ArrayList<Ocupante> obtenerOcupantesEn(ArrayList<PosicionEnlazada> posiciones){
        ArrayList<Ocupante> ocupantesObtenidos = new ArrayList<Ocupante>();
        for (int k = 0; k < posiciones.size(); k++) {
            PosicionEnlazada posicion = posiciones.get(k);
            ocupantesObtenidos.add(this.obtenerOcupanteEn(posicion));
        }
        return ocupantesObtenidos;
    }


    public Herramienta construiHerramienta(){
        FabricaHerramientas fabrica = new FabricaHerramientas();
        return fabrica.fabricarHerramienta(this);

    }

}