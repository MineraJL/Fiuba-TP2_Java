package MapaTest;
import Mapa.*;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MapaTest{

    // CREACION MAPA
    // Mapa instancia los Casilleros con ubicacion correcta
    // X igual a 0
    @Test
    public void testMapaSeInicializaYCreaCasillerosConCorrespondienteCoordenadaEnXIgualACero(){
        Mapa mapa = new Mapa(10,10);
        Posicion posicion = new Posicion(0,2);
        Casillero casillero= mapa.getCasillero(posicion);
        assertEquals(0, casillero.getFila());
    }
    // X igual a 1
    @Test
    public void testMapaSeInicializaYCreaCasillerosConCorrespondienteCoordenadaEnXIgualAUno(){
        Mapa mapa = new Mapa(10,10);
        Posicion posicion = new Posicion(1,2);
        Casillero casillero= mapa.getCasillero(posicion);
        assertEquals(1, casillero.getFila());
    }
    // Y igual a 0
    @Test
    public void testMapaSeInicializaYCreaCasillerosConCorrespondienteCoordenadaEnYIgualACero(){
        Mapa mapa = new Mapa(10,10);
        Posicion posicion = new Posicion(2,0);
        Casillero casillero= mapa.getCasillero(posicion);
        assertEquals(0, casillero.getColumna());
    }
    // Y igual a 1
    @Test
    public void testMapaSeInicializaYCreaCasillerosConCorrespondienteCoordenadaEnYIgualAUno(){
        Mapa mapa = new Mapa(10,10);
        Posicion posicion = new Posicion(2,1);
        Casillero casillero= mapa.getCasillero(posicion);
        assertEquals(1, casillero.getColumna());
    }

    // Mapa devuelve casillero con la direccion pedida
    // Casillero norte
    @Test
    public void testMapaDevuelveCasilleroEnLaDireccionNorte(){
        Mapa mapa = new Mapa(10,10);
        Posicion posicion = new Posicion(0,2);
        Casillero casillero= mapa.getCasillero(posicion);
        assertEquals(0, casillero.getFila());
    }
    // Casillero sur
    @Test
    public void testMapaDevuelveCasilleroEnLaDireccionSur(){
        Mapa mapa = new Mapa(10,10);
        Posicion posicion = new Posicion(0,2);
        Casillero casillero= mapa.getCasillero(posicion);
        assertEquals(0, casillero.getFila());
    }

    // Casillero este
    @Test
    public void testMapaDevuelveCasilleroEnLaDireccionEste(){
        Mapa mapa = new Mapa(10,10);
        Posicion posicion = new Posicion(0,2);
        Casillero casillero= mapa.getCasillero(posicion);
        assertEquals(0, casillero.getFila());
    }

    // Casillero oeste
    @Test
    public void testMapaDevuelveCasilleroEnLaDireccionOeste(){
        Mapa mapa = new Mapa(10,10);
        Posicion posicion = new Posicion(0,2);
        Casillero casillero= mapa.getCasillero(posicion);
        assertEquals(0, casillero.getFila());
    }



/*
    @Test
    public void testMapaUbicaCasilleroFila2Columna3EnLaUbicacionCorrectaColumna3(){
        Mapa mapa = new Mapa(10,10);
        Casillero casillero = new Casillero();
        mapa.setCasillero(casillero,2,3);
        Casillero casilleroObtenido = mapa.getCasillero(2,3);
        assertEquals(3, casilleroObtenido.getColumna());
    }

    @Test // caso borde
    public void testMapaUbicaAUnSegundoCasilleroEnLaUbicacionCorrectaFila4(){
        Mapa mapa = new Mapa(10,10);
        Casillero casillero = new Casillero();
        mapa.setCasillero(casillero,2,3);

        Casillero casillero2 = new Casillero();
        mapa.setCasillero(casillero2,4,1);
        Casillero casilleroObtenido2 = mapa.getCasillero(4,1);
        assertEquals(4, casilleroObtenido2.getFila());
    }

    @Test // caso borde
    public void testLuegoDeUbicarMasCasillerosMapaSigueConteniendoAlPrimerCasilleroUbicadoEnFila2(){
        Mapa mapa = new Mapa(10,10);
        Casillero casillero = new Casillero();
        mapa.setCasillero(casillero,2,3);
        Casillero casilleroObtenido = mapa.getCasillero(2,3);

        Casillero casillero2 = new Casillero();
        mapa.setCasillero(casillero2,4,1);
        Casillero casilleroObtenido2 = mapa.getCasillero(4,1);
        assertEquals(2, casilleroObtenido.getFila());
    }

        // inicialización del mapa
    @Test
    public void testLuegoDeInicializarCasillerosElCasilleroFila2Columna3ExisteEnMapaFila2(){
        Mapa mapa = new Mapa(10,10);
        mapa.inicializarCasilleros();
        Casillero casilleroObtenido = mapa.getCasillero(2,3);
        assertEquals(2, casilleroObtenido.getFila());
    }
    @Test
    public void testLuegoDeInicializarCasillerosElCasilleroFila2Columna3ExisteEnMapaColumna3(){
        Mapa mapa = new Mapa(10,10);
        mapa.inicializarCasilleros();
        Casillero casilleroObtenido = mapa.getCasillero(2,3);
        assertEquals(3, casilleroObtenido.getColumna());
    }


    @Test
    public void testLuegoDeInicializarCasillerosSePuedeEstablecerYObtenerUnCasilleroCorrectamente(){
        Mapa mapa = new Mapa(3,3);
        mapa.inicializarCasilleros();
        Casillero casillero = new Casillero();
        mapa.setCasillero(casillero,0,1);

        Casillero casilleroObtenido = mapa.getCasillero(0,1);
        assertEquals(casillero, casilleroObtenido); // sigue siendo el mismo.
    }
*/

}
