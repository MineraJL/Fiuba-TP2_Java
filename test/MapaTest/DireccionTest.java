package MapaTest;

import Modelo.Mapa.*;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DireccionTest {

    // a11 a12
    // a21 a22

    @Test
    public void testSiguienteDeDireccionIzquierdaDevuelveElSiguienteHaciaIzquierda(){
        PosicionEnlazada posicionA11 = new PosicionEnlazada(1,1);
        PosicionEnlazada posicionA12 = new PosicionEnlazada(1,2);
        posicionA12.enlazarAIzquierda(posicionA11);

        Direccion direccion = new DireccionIzquierda();
        PosicionEnlazada pSiguiente = direccion.siguiente(posicionA12);

        assertEquals(posicionA11,pSiguiente);
    }

    @Test
    public void testSiguienteDeDireccionDerechaDevuelveElSiguienteHaciaDerecha(){
        PosicionEnlazada posicionA11 = new PosicionEnlazada(1,1);
        PosicionEnlazada posicionA12 = new PosicionEnlazada(1,2);
        posicionA12.enlazarAIzquierda(posicionA11);

        Direccion direccion = new DireccionDerecha();
        PosicionEnlazada pSiguiente = direccion.siguiente(posicionA11);

        assertEquals(posicionA12,pSiguiente);
    }

    @Test
    public void testSiguienteDeDireccionArribaDevuelveElSiguienteHaciaArriba(){
        PosicionEnlazada posicionA11 = new PosicionEnlazada(1,1); // (1,1) <- (2,1) izquierda
        PosicionEnlazada posicionA21 = new PosicionEnlazada(2,1);
        posicionA21.enlazarArriba(posicionA11);

        Direccion direccion = new DireccionArriba();
        PosicionEnlazada pSiguiente = direccion.siguiente(posicionA21);

        assertEquals(posicionA11,pSiguiente);
    }

    @Test
    public void testSiguienteDeDireccionAbajoDevuelveElSiguienteHaciaAbajo(){
        PosicionEnlazada posicionA11 = new PosicionEnlazada(1,1); // (1,1) -> (2,1) derecha
        PosicionEnlazada posicionA21 = new PosicionEnlazada(2,1);
        posicionA21.enlazarArriba(posicionA11);

        Direccion direccion = new DireccionAbajo();
        PosicionEnlazada pSiguiente = direccion.siguiente(posicionA11);

        assertEquals(posicionA21,pSiguiente);
    }
}
