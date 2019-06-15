package MapaTest;
import Mapa.Casillero;
import Mapa.Mapa;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MapaTest{

    // ubicación y obtención de casilleros
    @Test
    public void testMapaUbicaCasilleroFila2Columna3EnLaUbicacionCorrectaFila2(){
        Mapa mapa = new Mapa(10,10);
        Casillero casillero = new Casillero();
        mapa.setCasillero(casillero,2,3);
        Casillero casilleroObtenido = mapa.getCasillero(2,3);
        assertEquals(2, casilleroObtenido.getFila());
    }

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


}
