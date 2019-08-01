package CreadorDeMapaTest;

import Modelo.CreadorDeMapa.CreadorDeMapa;
import Modelo.Herramientas.PicoFino;
import Modelo.Inventario.Inventario;
import Modelo.Jugador.Jugador;
import Modelo.Mapa.DireccionDerecha;
import Modelo.Mapa.PosicionEnlazada;
import Modelo.MesaDeTrabajo.Mesa;
import Modelo.TipoMaterial.TipoMetalYPiedra;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class CreadorDeMapaTest {


    @Test
    public void testJugadorIngresaAMapaEnLaPosicion0_0(){
    	Inventario inventario = new Inventario();
        Jugador jugador = new Jugador(inventario);
        CreadorDeMapa creadorDeMapa = new CreadorDeMapa();

        creadorDeMapa.ingresarJugadorAMapa(jugador);

        PosicionEnlazada posicionEsperada = new PosicionEnlazada(0,0);
        assertTrue(jugador.posicion().equals(posicionEsperada));

    }



}
