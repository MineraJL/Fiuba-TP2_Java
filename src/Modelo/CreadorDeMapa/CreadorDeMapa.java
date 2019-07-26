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

    public CreadorDeMapa(Jugador jugador){
        this.mapa = new Mapa(60,80);
        this.inicializarMapa(jugador);

    }

    private void inicializarMapa(Jugador jugador){
        this.ingresarJugadorAMapa(jugador);
        this.inicializarMapaConMadera();
        this.inicializarMapaConPiedra();
        this.inicializarMapaConMetal();
        this.inicializarMapaConDiamante();

    }

    private void ingresarJugadorAMapa(Jugador jugador){
        PosicionEnlazada posicion = new PosicionEnlazada(1,1);
        jugador.ingresar(mapa,posicion);
    }

    private void inicializarMapaConMadera(){
        // ubico 20 maderas en el mapa
        Madera madera = new Madera();
        for (int i=3;i<8;i++) {
            for (int j = 3; j < 8; j++) {
                PosicionEnlazada posicion = new PosicionEnlazada(i,j);
                madera.ingresar(mapa,posicion);
            }
        }

    }

    private void inicializarMapaConPiedra(){
        // ubico 7 piedras en el mapa
        Piedra piedra = new Piedra();
        for (int i=2;i<4;i++) {
            for (int j = 10; j < 13; j++) {
                PosicionEnlazada posicion = new PosicionEnlazada(i,j);
                piedra.ingresar(mapa,posicion);
            }
        }
        PosicionEnlazada posicion = new PosicionEnlazada(4,10);
        piedra.ingresar(mapa,posicion);

    }


    private void inicializarMapaConMetal(){
        // ubico 9 metales en el mapa
        Metal metal = new Metal();
        for (int i=10;i<12;i++) {
            for (int j = 4; j < 9; j++) {
                PosicionEnlazada posicion = new PosicionEnlazada(i,j);
                metal.ingresar(mapa,posicion);
            }
        }
        PosicionEnlazada posicion = new PosicionEnlazada(12,4);
        metal.ingresar(mapa,posicion);

    }

    private void inicializarMapaConDiamante(){
        // ubico 9 diamantes en el mapa
        Diamante diamante = new Diamante();
        for (int i=45;i<48;i++) {
            for (int j = 50; j < 53; j++) {
                PosicionEnlazada posicion = new PosicionEnlazada(i,j);
                diamante.ingresar(mapa,posicion);
            }
        }
        PosicionEnlazada posicion = new PosicionEnlazada(12,4);
        diamante.ingresar(mapa,posicion);

    }


}
