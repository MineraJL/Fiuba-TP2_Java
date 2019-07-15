package CreadorDeMapaTest;

import CreadorDeMapa.CreadorDeMapa;
import Herramientas.PicoFino;
import Jugador.Jugador;
import Mapa.Direccion;
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

        jugador.mover(Direccion.derecha());

        PicoFino picoFino = new PicoFino(new TipoMetalYPiedra());
        // a la herramienta la tendria que tener el jugador. Pero empieza con un hacha de madera.
            // pensaba romper madera con un picoFino que no se desgaste, irme moviendo a los casilleros libres en los que
            // había madera que rompí, y al final hacer assert de que pude llegar a la última posición, pero
                // a la herramienta la tiene el jugador; empieza con hacha de madera (y eso no rompe piedra)
                        // (aunque saque la cuenta para la madera, assert de inicializarMapaConPiedra?)


        // tests en progreso..
        assertEquals(1, 1);
    }


}