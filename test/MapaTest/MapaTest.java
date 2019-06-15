package MapaTest;
import Mapa.*;
import org.junit.Test;

import static junit.framework.TestCase.*;

public class MapaTest{

    // CREACION MAPA
    // Mapa instancia los Casilleros con ubicacion correcta
    // X igual a 0
    @Test
    public void testMapaSeInicializaYCreaCasillerosConCorrespondienteCoordenadaEnXIgualACero(){
        Mapa mapa = new Mapa(10,10);
        Posicion posicion = new Posicion(0,2);
        Casillero casillero= mapa.getCasillero(posicion);
        assertEquals(0, casillero.getPosicion().getX());
    }
    // X igual a 1
    @Test
    public void testMapaSeInicializaYCreaCasillerosConCorrespondienteCoordenadaEnXIgualAUno(){
        Mapa mapa = new Mapa(10,10);
        Posicion posicion = new Posicion(1,2);
        Casillero casillero= mapa.getCasillero(posicion);
        assertEquals(1, casillero.getPosicion().getX());
    }
    // Y igual a 0
    @Test
    public void testMapaSeInicializaYCreaCasillerosConCorrespondienteCoordenadaEnYIgualACero(){
        Mapa mapa = new Mapa(10,10);
        Posicion posicion = new Posicion(2,0);
        Casillero casillero= mapa.getCasillero(posicion);
        assertEquals(0, casillero.getPosicion().getY());
    }
    // Y igual a 1
    @Test
    public void testMapaSeInicializaYCreaCasillerosConCorrespondienteCoordenadaEnYIgualAUno(){
        Mapa mapa = new Mapa(10,10);
        Posicion posicion = new Posicion(2,1);
        Casillero casillero= mapa.getCasillero(posicion);
        assertEquals(1, casillero.getPosicion().getY());
    }

    // Mapa devuelve casillero con la direccion pedida
    // Casillero norte
    @Test
    public void testMapaDevuelveCasilleroEnLaDireccionNorte(){
        Mapa mapa = new Mapa(10,10);
        Posicion posicion = new Posicion(2,2);
        Direccion direccion = Direccion.norte();
        Casillero casillero= mapa.getCasillero(posicion, direccion);
        assertEquals(3, casillero.getPosicion().getY());
    }
    // Casillero sur
    @Test
    public void testMapaDevuelveCasilleroEnLaDireccionSur(){
        Mapa mapa = new Mapa(10,10);
        Posicion posicion = new Posicion(2,2);
        Direccion direccion = Direccion.sur();
        Casillero casillero= mapa.getCasillero(posicion, direccion);
        assertEquals(1, casillero.getPosicion().getY());
    }

    // Casillero este
    @Test
    public void testMapaDevuelveCasilleroEnLaDireccionEste(){
        Mapa mapa = new Mapa(10,10);
        Posicion posicion = new Posicion(2,2);
        Direccion direccion = Direccion.este();
        Casillero casillero= mapa.getCasillero(posicion, direccion);
        assertEquals(3, casillero.getPosicion().getX());
    }

    // Casillero oeste
    @Test
    public void testMapaDevuelveCasilleroEnLaDireccionOeste(){
        Mapa mapa = new Mapa(10,10);
        Posicion posicion = new Posicion(2,2);
        Direccion direccion = Direccion.oeste();
        Casillero casillero= mapa.getCasillero(posicion, direccion);
        assertEquals(1, casillero.getPosicion().getX());
    }


}
