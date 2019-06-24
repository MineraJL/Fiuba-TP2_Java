package CreadorDeMapa;

import Jugador.Jugador;
import Mapa.Mapa;
import Mapa.Posicion;
import Recursos.Madera;
import Recursos.Piedra;

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

    }

    private void ingresarJugadorAMapa(Jugador jugador){
        Posicion posicion = new Posicion(1,1);
        jugador.ingresar(mapa,posicion);
    }

    private void inicializarMapaConMadera(){
        // ubico 20 maderas en el mapa
        Madera madera = new Madera();
        for (int i=3;i<8;i++) {
            for (int j = 3; j < 8; j++) {
                Posicion posicion = new Posicion(i,j);
                madera.ingresar(mapa,posicion);
            }
        }

    }

    private void inicializarMapaConPiedra(){
        // ubico 7 piedras en el mapa
        Piedra piedra = new Piedra();
        for (int i=2;i<4;i++) {
            for (int j = 10; j < 13; j++) {
                Posicion posicion = new Posicion(i,j);
                piedra.ingresar(mapa,posicion);
            }
        }
        Posicion posicion = new Posicion(4,10);
        piedra.ingresar(mapa,posicion);

    }


    private void inicializarMapaConMetal(){
        // ubico 9 metales en el mapa
        Piedra piedra = new Piedra();
        for (int i=10;i<12;i++) {
            for (int j = 4; j < 9; j++) {
                Posicion posicion = new Posicion(i,j);
                piedra.ingresar(mapa,posicion);
            }
        }
        Posicion posicion = new Posicion(12,4);
        piedra.ingresar(mapa,posicion);

    }


}
