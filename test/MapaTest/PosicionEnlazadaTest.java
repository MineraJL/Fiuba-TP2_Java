package MapaTest;

import Modelo.Mapa.PosicionEnlazada;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PosicionEnlazadaTest {

    // A11 A12
    // A21 A22

    @Test
    public void testSeEnlazaPosicionIzquierda(){
        PosicionEnlazada posicionA11 = new PosicionEnlazada();
        PosicionEnlazada posicionA12 = new PosicionEnlazada();
        posicionA12.enlazarAIzquierda(posicionA11);
        assertEquals(posicionA11, posicionA12.casilleroAIzquierda());
    }

    @Test
    public void testPosicionADerecha(){
        PosicionEnlazada posicionA11 = new PosicionEnlazada();
        PosicionEnlazada posicionA12 = new PosicionEnlazada();
        posicionA12.enlazarAIzquierda(posicionA11);
        assertEquals(posicionA12, posicionA11.casilleroADerecha());
    }


    @Test
    public void testPosicionArriba(){
        PosicionEnlazada posicionA11 = new PosicionEnlazada();
        PosicionEnlazada posicionA21 = new PosicionEnlazada();
        posicionA21.enlazarArriba(posicionA11);
        assertEquals(posicionA11, posicionA21.casilleroArriba());
    }

    @Test
    public void testPosicionAbajo(){
        PosicionEnlazada posicionA11 = new PosicionEnlazada();
        PosicionEnlazada posicionA21 = new PosicionEnlazada();
        posicionA21.enlazarArriba(posicionA11);
        assertEquals(posicionA21, posicionA11.casilleroAbajo());
    }

    @Test
    public void testPosicionArribaEIzquierda(){
        PosicionEnlazada posicionA12 = new PosicionEnlazada();
        PosicionEnlazada posicionA21 = new PosicionEnlazada();
        PosicionEnlazada posicionA22 = new PosicionEnlazada();
        posicionA22.enlazarArriba(posicionA12);
        posicionA22.enlazarAIzquierda(posicionA21);

        assertEquals(posicionA12, posicionA22.casilleroArriba());
        assertEquals(posicionA21, posicionA22.casilleroAIzquierda());
    }
}
