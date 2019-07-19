package MapaTest;

import Modelo.Mapa.PosicionEnlazada;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PosicionEnlazadaTest {

    // A11 A12
    // A21 A22

    @Test
    public void testSeEnlazaPosicionIzquierda(){
        PosicionEnlazada posicionA11 = new PosicionEnlazada(1,1);
        PosicionEnlazada posicionA12 = new PosicionEnlazada(1,2);
        posicionA12.enlazarAIzquierda(posicionA11);
        assertEquals(posicionA11, posicionA12.posicionAIzquierda());
    }

    @Test
    public void testPosicionADerecha(){
        PosicionEnlazada posicionA11 = new PosicionEnlazada(1,1);
        PosicionEnlazada posicionA12 = new PosicionEnlazada(1,2);
        posicionA12.enlazarAIzquierda(posicionA11);
        assertEquals(posicionA12, posicionA11.posicionADerecha());
    }


    @Test
    public void testPosicionArriba(){
        PosicionEnlazada posicionA11 = new PosicionEnlazada(1,1);
        PosicionEnlazada posicionA21 = new PosicionEnlazada(2,1);
        posicionA21.enlazarArriba(posicionA11);
        assertEquals(posicionA11, posicionA21.posicionArriba());
    }

    @Test
    public void testPosicionAbajo(){
        PosicionEnlazada posicionA11 = new PosicionEnlazada(1,1);
        PosicionEnlazada posicionA21 = new PosicionEnlazada(2,1);
        posicionA21.enlazarArriba(posicionA11);
        assertEquals(posicionA21, posicionA11.posicionAbajo());
    }

    @Test
    public void testPosicionArribaEIzquierda(){
        PosicionEnlazada posicionA12 = new PosicionEnlazada(1,2);
        PosicionEnlazada posicionA21 = new PosicionEnlazada(2,1);
        PosicionEnlazada posicionA22 = new PosicionEnlazada(2,2);
        posicionA22.enlazarArriba(posicionA12);
        posicionA22.enlazarAIzquierda(posicionA21);

        assertEquals(posicionA12, posicionA22.posicionArriba());
        assertEquals(posicionA21, posicionA22.posicionAIzquierda());
    }
}
