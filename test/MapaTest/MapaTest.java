package MapaTest;
import Modelo.Mapa.Casillero;
import Modelo.Mapa.Mapa;
import Modelo.Mapa.PosicionEnlazada;
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
        assertEquals(0, casillero.getPosicion().getX());
    }

    @Test
    public void testMapaSeInicializaYCreaCasillerosConCorrespondienteCoordenadaEnXIgualAUno(){
        Mapa mapa = new Mapa(10,10);
        PosicionEnlazada posicion = new PosicionEnlazada(1,2);
        Casillero casillero= mapa.getCasillero(posicion);
        assertEquals(1, casillero.getPosicion().getX());
    }

    @Test
    public void testMapaSeInicializaYCreaCasillerosConCorrespondienteCoordenadaEnYIgualACero(){
        Mapa mapa = new Mapa(10,10);
        PosicionEnlazada posicion = new PosicionEnlazada(2,0);
        Casillero casillero= mapa.getCasillero(posicion);
        assertEquals(0, casillero.getPosicion().getY());
    }

    @Test
    public void testMapaSeInicializaYCreaCasillerosConCorrespondienteCoordenadaEnYIgualAUno(){
        Mapa mapa = new Mapa(10,10);
        PosicionEnlazada posicion = new PosicionEnlazada(2,1);
        Casillero casillero= mapa.getCasillero(posicion);
        assertEquals(1, casillero.getPosicion().getY());
    }

    // caso mapa rectangular
    @Test
    public void testMapaRectangularSeInicializaYCreaCasillerosConCorrespondienteCoordenadaEnXIgualANueve(){
        Mapa mapa = new Mapa(10,5);
        PosicionEnlazada posicion = new PosicionEnlazada(9,4);
        Casillero casillero= mapa.getCasillero(posicion);
        assertEquals(9, casillero.getPosicion().getX());
    }
    @Test
    public void testMapaRectangularSeInicializaYCreaCasillerosConCorrespondienteCoordenadaEnYIgualACuatro(){
        Mapa mapa = new Mapa(10,5);
        PosicionEnlazada posicion = new PosicionEnlazada(9,4);
        Casillero casillero= mapa.getCasillero(posicion);
        assertEquals(4, casillero.getPosicion().getY());
    }

    // Modelo.Mapa devuelve casillero con la direccion pedida
    // Casillero norte
    /* // temp: probando esto
    @Test
    public void testMapaDevuelveCasilleroEnLaDireccionNorte(){
        Mapa mapa = new Mapa(10,10);
        PosicionEnlazada posicion = new PosicionEnlazada(2,2);
        Direccion direccion = Direccion.arriba();
        Casillero casillero= mapa.getCasillero(posicion, direccion);
        assertEquals(3, casillero.getPosicion().getY());
    }
    // Casillero sur
    @Test
    public void testMapaDevuelveCasilleroEnLaDireccionSur(){
        Mapa mapa = new Mapa(10,10);
        PosicionEnlazada posicion = new PosicionEnlazada(2,2);
        Direccion direccion = Direccion.abajo();
        Casillero casillero= mapa.getCasillero(posicion, direccion);
        assertEquals(1, casillero.getPosicion().getY());
    }

    // Casillero este
    @Test
    public void testMapaDevuelveCasilleroEnLaDireccionEste(){
        Mapa mapa = new Mapa(10,10);
        PosicionEnlazada posicion = new PosicionEnlazada(2,2);
        Direccion direccion = Direccion.derecha();
        Casillero casillero= mapa.getCasillero(posicion, direccion);
        assertEquals(3, casillero.getPosicion().getX());
    }

    // Casillero oeste
    @Test
    public void testMapaDevuelveCasilleroEnLaDireccionOeste(){
        Mapa mapa = new Mapa(10,10);
        PosicionEnlazada posicion = new PosicionEnlazada(2,2);
        Direccion direccion = Direccion.izquierda();
        Casillero casillero= mapa.getCasillero(posicion, direccion);
        assertEquals(1, casillero.getPosicion().getX());
    }*/

}
