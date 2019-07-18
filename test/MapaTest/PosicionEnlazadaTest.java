package MapaTest;

import Modelo.Mapa.PosicionEnlazada;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PosicionEnlazadaTest {

    @Test
    public void testSeEnlazaCasilleroaIzquierdaYSegundokvsrkevbsvbvbvb(){
        PosicionEnlazada casilleroA11 = new PosicionEnlazada();
        PosicionEnlazada casilleroA12 = new PosicionEnlazada();
        casilleroA12.enlazarAIzquierda(casilleroA11);
        assertEquals(casilleroA11, casilleroA12.casilleroAIzquierda());
    }

    @Test
    public void testCasilleroADerecha(){
        PosicionEnlazada casilleroA11 = new PosicionEnlazada();
        PosicionEnlazada casilleroA12 = new PosicionEnlazada();
        casilleroA12.enlazarAIzquierda(casilleroA11);
        assertEquals(casilleroA12, casilleroA11.casilleroADerecha());
    }


    @Test
    public void testCasilleroAArriba(){
        PosicionEnlazada casilleroA11 = new PosicionEnlazada();
        PosicionEnlazada casilleroA21 = new PosicionEnlazada();
        casilleroA21.enlazarArriba(casilleroA11);
        assertEquals(casilleroA11, casilleroA21.casilleroArriba());
    }

    @Test
    public void testCasilleroAbajo(){
        PosicionEnlazada casilleroA11 = new PosicionEnlazada();
        PosicionEnlazada casilleroA21 = new PosicionEnlazada();
        casilleroA21.enlazarArriba(casilleroA11);
        assertEquals(casilleroA21, casilleroA11.casilleroAbajo());
    }

    @Test
    public void testCasilleroArribaEIzquierda(){
        PosicionEnlazada casilleroA12 = new PosicionEnlazada();
        PosicionEnlazada casilleroA21 = new PosicionEnlazada();
        PosicionEnlazada casilleroA22 = new PosicionEnlazada();
        casilleroA22.enlazarArriba(casilleroA12);
        casilleroA22.enlazarAIzquierda(casilleroA21);

        assertEquals(casilleroA12, casilleroA22.casilleroArriba());
        assertEquals(casilleroA21, casilleroA22.casilleroAIzquierda());
    }
}
