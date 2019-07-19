package MapaTest;

import Modelo.Mapa.Posicion;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PosicionTest {

    // POSICION
    // Coordenada X
    @Test
    public void testPosicionTieneCoordenadaEnXConLaQueSeCreoIgualAUno(){
        Posicion posicion = new Posicion(1,2);
        assertEquals(1, posicion.getX());
    }
    @Test
    public void testPosicionTieneCoordenadaEnXConLaQueSeCreoIgualANueve(){
        Posicion posicion = new Posicion(9,2);
        assertEquals(9, posicion.getX());
    }
    // Coordenada Y
    @Test
    public void testPosicionTieneCoordenadaEnYConLaQueSeCreoIgualAUno(){
        Posicion posicion = new Posicion(2,1);
        assertEquals(1, posicion.getY());
    }
    @Test
    public void testPosicionTieneCoordenadaEnYConLaQueSeCreoIgualANueve(){
        Posicion posicion = new Posicion(2,9);
        assertEquals(9, posicion.getY());
    }
}
