package Modelo.CreadorDeMapa;

import Modelo.Jugador.Jugador;
import Modelo.Mapa.Mapa;
import Modelo.Mapa.PosicionEnlazada;
import Modelo.Recursos.Diamante;
import Modelo.Recursos.Madera;
import Modelo.Recursos.Metal;
import Modelo.Recursos.Piedra;

public class CreadorDeMapa {
    private Mapa mapa;

    public CreadorDeMapa(){
        this.mapa = new Mapa(60,80);
        this.inicializarMapaConRecursos();

    }

    private void inicializarMapaConRecursos(){
        this.inicializarMapaConRecursosNecesariosParaJugar();
        this.agregarMaderasAdicionales();
    }

    private void inicializarMapaConRecursosNecesariosParaJugar(){
        this.inicializarMapaConMadera();
        this.inicializarMapaConPiedra();
        this.inicializarMapaConMetal();
        this.inicializarMapaConDiamante();
    }

    public void ingresarJugadorAMapa(Jugador jugador){
        PosicionEnlazada posicion = new PosicionEnlazada(0,0);
        jugador.ingresar(mapa,posicion);
    }

    private void inicializarMapaConMadera(){
        // ubico 20 maderas en el mapa
        for (int i=3;i<7;i++) {
            for (int j = 3; j < 8; j++) {
                PosicionEnlazada posicion = new PosicionEnlazada(i,j);
                Madera madera = new Madera();
                madera.ingresar(mapa,posicion);
            }
        }
    }

    private void inicializarMapaConPiedra(){
        // ubico 7 piedras en el mapa
        for (int i=2;i<4;i++) {
            for (int j = 10; j < 13; j++) {
                PosicionEnlazada posicion = new PosicionEnlazada(i,j);
                Piedra piedra = new Piedra();
                piedra.ingresar(mapa,posicion);
            }
        }
        PosicionEnlazada posicion = new PosicionEnlazada(4,10);
        Piedra piedra = new Piedra();
        piedra.ingresar(mapa,posicion);

    }


    private void inicializarMapaConMetal(){
        // ubico 9 metales en el mapa
        for (int i=10;i<12;i++) {
            for (int j = 4; j < 9; j++) {
                PosicionEnlazada posicion = new PosicionEnlazada(i,j);
                Metal metal = new Metal();
                metal.ingresar(mapa,posicion);
            }
        }
        PosicionEnlazada posicion = new PosicionEnlazada(12,4);
        Metal metal = new Metal();
        metal.ingresar(mapa,posicion);

    }

    private void inicializarMapaConDiamante(){
        // ubico 8 diamantes en el mapa
        for (int i=13;i<15;i++) {
            for (int j = 11; j < 15; j++) {
                PosicionEnlazada posicion = new PosicionEnlazada(i,j);
                Diamante diamante = new Diamante();
                diamante.ingresar(mapa,posicion);
            }
        }

    }

    private void agregarMaderasAdicionales(){
        // ubico 4 maderas adicionales en el mapa
        for (int i=7;i<9;i++) {
            for (int j = 13; j < 15; j++) {
                PosicionEnlazada posicion = new PosicionEnlazada(i,j);
                Madera maderaAdicional = new Madera();
                maderaAdicional.ingresar(mapa,posicion);
            }
        }
    }

    public Mapa obtenerMapaConRecursos(){
        return this.mapa;
    }

}
