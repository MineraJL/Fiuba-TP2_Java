package MapaTest;

import Modelo.Mapa.PosicionEnlazada;
import org.junit.Test;

import static junit.framework.TestCase.*;

public class PosicionEnlazadaTest {

    // A11 A12
    // A21 A22

    // enlaces
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

    // borde
    @Test
    public void testUnaPosicionEstaEnlazadaConsigoMismaAMenosQueSeLaEnlaceConOtra(){
        PosicionEnlazada posicionA11 = new PosicionEnlazada(1,1);

        assertEquals(posicionA11,posicionA11.posicionAIzquierda());
        assertEquals(posicionA11,posicionA11.posicionADerecha());
        assertEquals(posicionA11,posicionA11.posicionArriba());
        assertEquals(posicionA11,posicionA11.posicionAbajo());

    }

    // coordenadas

    @Test
    public void testPosicionTieneCoordenadaEnXConLaQueSeCreoIgualDos(){
        PosicionEnlazada posicion = new PosicionEnlazada(2,3);
        assertEquals(2, posicion.getX());
    }

    @Test
    public void testPosicionTieneCoordenadaEnYConLaQueSeCreoIgualATres(){
        PosicionEnlazada posicion = new PosicionEnlazada(2,3);
        assertEquals(3, posicion.getY());
    }

    // equals
    @Test
    public void testPosicionEsIgualAOtraSiTienenMismoValorDeXyDeY(){
        PosicionEnlazada posicion1 = new PosicionEnlazada(4,5);
        PosicionEnlazada posicion2 = new PosicionEnlazada(4,5);

        assertTrue(posicion1.equals(posicion2));

    }

    @Test
    public void testPosicionNoEsIgualAOtraSiTienenDiferentesValoresDeXyDeY(){
        PosicionEnlazada posicion1 = new PosicionEnlazada(4,5);
        PosicionEnlazada posicion2 = new PosicionEnlazada(2,5);

        assertFalse(posicion1.equals(posicion2));

    }

}
