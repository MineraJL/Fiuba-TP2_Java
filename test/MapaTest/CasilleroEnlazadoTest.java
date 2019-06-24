package MapaTest;

import Mapa.CasilleroEnlazado;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CasilleroEnlazadoTest {

    @Test
    public void testSeEnlazaCasilleroaIzquierdaYSegundokvsrkevbsvbvbvb(){
        CasilleroEnlazado casilleroA11 = new CasilleroEnlazado();
        CasilleroEnlazado casilleroA12 = new CasilleroEnlazado();
        casilleroA12.enlazarAIzquierda(casilleroA11);
        assertEquals(casilleroA11, casilleroA12.casilleroAIzquierda());
    }

    @Test
    public void testCasilleroADerecha(){
        CasilleroEnlazado casilleroA11 = new CasilleroEnlazado();
        CasilleroEnlazado casilleroA12 = new CasilleroEnlazado();
        casilleroA12.enlazarAIzquierda(casilleroA11);
        assertEquals(casilleroA12, casilleroA11.casilleroADerecha());
    }


    @Test
    public void testCasilleroAArriba(){
        CasilleroEnlazado casilleroA11 = new CasilleroEnlazado();
        CasilleroEnlazado casilleroA21 = new CasilleroEnlazado();
        casilleroA21.enlazarArriba(casilleroA11);
        assertEquals(casilleroA11, casilleroA21.casilleroArriba());
    }

    @Test
    public void testCasilleroAbajo(){
        CasilleroEnlazado casilleroA11 = new CasilleroEnlazado();
        CasilleroEnlazado casilleroA21 = new CasilleroEnlazado();
        casilleroA21.enlazarArriba(casilleroA11);
        assertEquals(casilleroA21, casilleroA11.casilleroAbajo());
    }

    @Test
    public void testCasilleroArribaEIzquierda(){
        CasilleroEnlazado casilleroA12 = new CasilleroEnlazado();
        CasilleroEnlazado casilleroA21 = new CasilleroEnlazado();
        CasilleroEnlazado casilleroA22 = new CasilleroEnlazado();
        casilleroA22.enlazarArriba(casilleroA12);
        casilleroA22.enlazarAIzquierda(casilleroA21);

        assertEquals(casilleroA12, casilleroA22.casilleroArriba());
        assertEquals(casilleroA21, casilleroA22.casilleroAIzquierda());
    }
}
