package CreadorDeMapa;

import Jugador.Jugador;
import Mapa.Mapa;
import Mapa.Posicion;

public class CreadorDeMapa {
    private Mapa mapa;

    public CreadorDeMapa(Jugador jugador){
        this.mapa = new Mapa(60,80);
        this.inicializarMapa(jugador);

    }

    private void inicializarMapa(Jugador jugador){
        this.ingresarJugadorAMapa(jugador);
        //this.inicializarMapaConMadera(mapa);

    }

    private void ingresarJugadorAMapa(Jugador jugador){
        Posicion posicion = new Posicion(1,1);
        jugador.ingresar(mapa,posicion);
    }

}
