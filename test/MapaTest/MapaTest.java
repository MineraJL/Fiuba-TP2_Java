package MapaTest;

import Modelo.Mapa.*;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MapaTest{

    // CREACION MAPA
    // Modelo.Mapa instancia los Casilleros con ubicacion correcta

    @Test
    public void testMapaSeInicializaYCreaCasillerosConCorrespondienteCoordenadaEnXIgualACero(){
        Mapa mapa = new Mapa(10,10);
        PosicionEnlazada posicion = new PosicionEnlazada(0,2);
        Casillero casillero= mapa.getCasillero(posicion);
        assertEquals(0, casillero.getPosicion().geti());
    }

    @Test
    public void testMapaSeInicializaYCreaCasillerosConCorrespondienteCoordenadaEnXIgualAUno(){
        Mapa mapa = new Mapa(10,10);
        PosicionEnlazada posicion = new PosicionEnlazada(1,2);
        Casillero casillero= mapa.getCasillero(posicion);
        assertEquals(1, casillero.getPosicion().geti());
    }

    @Test
    public void testMapaSeInicializaYCreaCasillerosConCorrespondienteCoordenadaEnYIgualACero(){
        Mapa mapa = new Mapa(10,10);
        PosicionEnlazada posicion = new PosicionEnlazada(2,0);
        Casillero casillero= mapa.getCasillero(posicion);
        assertEquals(0, casillero.getPosicion().getj());
    }

    @Test
    public void testMapaSeInicializaYCreaCasillerosConCorrespondienteCoordenadaEnYIgualAUno(){
        Mapa mapa = new Mapa(10,10);
        PosicionEnlazada posicion = new PosicionEnlazada(2,1);
        Casillero casillero= mapa.getCasillero(posicion);
        assertEquals(1, casillero.getPosicion().getj());
    }

    // caso mapa rectangular
    @Test
    public void testMapaRectangularSeInicializaYCreaCasillerosConCorrespondienteCoordenadaEnXIgualANueve(){
        Mapa mapa = new Mapa(10,5);
        PosicionEnlazada posicion = new PosicionEnlazada(9,4);
        Casillero casillero= mapa.getCasillero(posicion);
        assertEquals(9, casillero.getPosicion().geti());
    }
    @Test
    public void testMapaRectangularSeInicializaYCreaCasillerosConCorrespondienteCoordenadaEnYIgualACuatro(){
        Mapa mapa = new Mapa(10,5);
        PosicionEnlazada posicion = new PosicionEnlazada(9,4);
        Casillero casillero= mapa.getCasillero(posicion);
        assertEquals(4, casillero.getPosicion().getj());
    }


}
