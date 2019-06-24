package CreadorDeMapa;

import Jugador.Jugador;
import Mapa.Mapa;
import Mapa.Posicion;
import Recursos.Madera;

public class CreadorDeMapa {
    private Mapa mapa;

    public CreadorDeMapa(Jugador jugador){
        this.mapa = new Mapa(60,80);
        this.inicializarMapa(jugador);

    }

    private void inicializarMapa(Jugador jugador){
        this.ingresarJugadorAMapa(jugador);
        this.inicializarMapaConMadera(mapa);

    }

    private void ingresarJugadorAMapa(Jugador jugador){
        Posicion posicion = new Posicion(1,1);
        jugador.ingresar(mapa,posicion);
    }

    private void inicializarMapaConMadera(Mapa mapa){
        // ubico 20 maderas en el mapa
        Madera madera = new Madera();
        for (int i=3;i<8;i++) {
            for (int j = 3; j < 8; j++) {
                Posicion posicion = new Posicion(i,j);
                madera.ingresar(mapa,posicion);
            }
        }

    }
}
