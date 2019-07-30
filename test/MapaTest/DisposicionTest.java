package MapaTest;

import Modelo.Mapa.Disposicion;
import Modelo.Mapa.PosicionEnlazada;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class DisposicionTest {

    @Test
    public void disposicionSeCreaDe3x3_yPosicionInicialEs00(){

        Disposicion disposicion = new Disposicion(3,3);
        PosicionEnlazada posicionInicial = disposicion.posicionInicial();

        PosicionEnlazada posicionEsperada = new PosicionEnlazada(0,0);

        assertTrue(posicionInicial.equals(posicionEsperada));
    }

    @Test
    public void disposicionSeCreaDe3x3_ySiguienteDePosicionInicialEs01(){

        Disposicion disposicion = new Disposicion(3,3);
        PosicionEnlazada posicionInicial = disposicion.posicionInicial();

        PosicionEnlazada siguienteObtenida = posicionInicial.posicionADerecha();

        PosicionEnlazada siguienteEsperada = new PosicionEnlazada(0,1);

        assertTrue(siguienteObtenida.equals(siguienteEsperada));
    }

    @Test
    public void disposicionSeCreaDe3x3_ySiguienteDe01Es02(){

        Disposicion disposicion = new Disposicion(3,3);
        PosicionEnlazada posicionInicial = disposicion.posicionInicial();

        PosicionEnlazada siguienteObtenida = posicionInicial.posicionADerecha().posicionADerecha();

        PosicionEnlazada siguienteEsperada = new PosicionEnlazada(0,2);

        assertTrue(siguienteObtenida.equals(siguienteEsperada));
    }

    @Test // importante
    public void disposicionSeCreaDe3x3_ySiguienteDe02Es10(){

        Disposicion disposicion = new Disposicion(3,3);
        PosicionEnlazada posicionInicial = disposicion.posicionInicial();

        PosicionEnlazada siguienteObtenida = posicionInicial.posicionADerecha().posicionADerecha().posicionADerecha();

        PosicionEnlazada siguienteEsperada = new PosicionEnlazada(1,0);

        assertTrue(siguienteObtenida.equals(siguienteEsperada));
    }


}
