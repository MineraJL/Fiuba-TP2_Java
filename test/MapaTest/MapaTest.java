package MapaTest;

import Modelo.Mapa.Casillero;
import Modelo.Mapa.Mapa;
import Modelo.Mapa.Ocupante;
import Modelo.Mapa.PosicionEnlazada;
import Modelo.Recursos.Madera;
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

    // Metodo para vista
    @Test
    public void testMetodoOcupanteDevuelveElOcupantePedido(){
        Mapa mapa = new Mapa(5,5);
        PosicionEnlazada posicionMadera = new PosicionEnlazada(2,3);
        Madera madera = new Madera();

        madera.ingresar(mapa,posicionMadera);

        Ocupante maderaEnMapa = mapa.ocupante(2,3);

        assertEquals(madera,maderaEnMapa);
    }


}
