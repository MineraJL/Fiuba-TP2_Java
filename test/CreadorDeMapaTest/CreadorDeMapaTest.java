package CreadorDeMapaTest;

import CreadorDeMapa.CreadorDeMapa;
import Jugador.Jugador;
import Mapa.Posicion;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CreadorDeMapaTest {


    @Test
    public void testJugadorIngresaAMapaEnLaPosicion1_1(){
        Jugador jugador = new Jugador();
        CreadorDeMapa creadorDeMapa = new CreadorDeMapa(jugador);

        Posicion posicionEsperada = new Posicion(1,1);

        boolean posicionesIguales = jugador.getPosicion().equals(posicionEsperada);
        assertEquals(true, posicionesIguales);

    }

    /*
    @Test
    public void testMapaSeInicializaCon20RecursosMaderaEnPosicionesConocidas(){
        Jugador jugador = new Jugador();
        Mapa mapa = new Mapa(60,80);
        CreadorDeMapa creadorDeMapa = new CreadorDeMapa(mapa, jugador);

        PicoFino picoFino = new PicoFino(new TipoMetalYPiedra());


        assertEquals(1, 1);
    }*/


}
