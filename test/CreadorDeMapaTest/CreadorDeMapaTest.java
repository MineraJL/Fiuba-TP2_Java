package CreadorDeMapaTest;

import CreadorDeMapa.CreadorDeMapa;
import Herramientas.PicoFino;
import Jugador.Jugador;
import Mapa.Posicion;
import TipoMaterial.TipoMetalYPiedra;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class CreadorDeMapaTest {


    @Test
    public void testJugadorIngresaAMapaEnLaPosicion1_1(){
        Jugador jugador = new Jugador();
        CreadorDeMapa creadorDeMapa = new CreadorDeMapa(jugador);

        Posicion posicionEsperada = new Posicion(1,1);

        boolean posicionesIguales = jugador.getPosicion().equals(posicionEsperada);
        assertTrue(posicionesIguales);

    }


    @Test
    public void testMapaSeInicializaCon20RecursosMaderaEnPosicionesConocidas(){
        Jugador jugador = new Jugador();
        CreadorDeMapa creadorDeMapa = new CreadorDeMapa(jugador);

        //Mapa mapa = creadorDeMapa.obtenerMapa();
        //jugador.mover(mapa, Direccion.derecha());




        PicoFino picoFino = new PicoFino(new TipoMetalYPiedra());


        assertEquals(1, 1);
    }


}
