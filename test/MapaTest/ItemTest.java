package MapaTest;
import Jugador.Jugador;
import Mapa.*;
import Recursos.*;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class ItemTest {

    @Test
    public void testItemTieneLaUbicacionDelCasilleroFilaCero(){
        Mapa mapa = new Mapa(3,3);
        Casillero casillero = new Casillero();
        mapa.setCasillero(casillero,0,0);
        Item recurso = new Diamante();
        casillero.setItem(recurso);
        assertEquals(0, recurso.getFila());
    }
    @Test
    public void testItemTieneLaUbicacionDelCasilleroColumnaCero(){
        Mapa mapa = new Mapa(3,3);
        Casillero casillero = new Casillero();
        mapa.setCasillero(casillero,0,0);
        Item recurso = new Diamante();
        casillero.setItem(recurso);
        assertEquals(0, recurso.getColumna());
    }
    @Test
    public void testItemTieneLaUbicacionDelCasilleroFilaUno(){
        Mapa mapa = new Mapa(3,3);
        Casillero casillero = new Casillero();
        mapa.setCasillero(casillero,1,0);
        Item recurso = new Diamante();
        casillero.setItem(recurso);
        assertEquals(1, recurso.getFila());
    }
    @Test
    public void testItemTieneLaUbicacionDelCasilleroColumnaUno(){
        Mapa mapa = new Mapa(3,3);
        Casillero casillero = new Casillero();
        mapa.setCasillero(casillero,0,1);
        Item recurso = new Diamante();
        casillero.setItem(recurso);
        assertEquals(1, recurso.getColumna());
    }


    @Test
    public void testItemJugador(){
        Mapa mapa = new Mapa(10,10);
        mapa.inicializarCasilleros();
        Item jugador = new Jugador();
        mapa.setItem(jugador,5,5);
        assertEquals(5, jugador.getColumna());
    }

}
