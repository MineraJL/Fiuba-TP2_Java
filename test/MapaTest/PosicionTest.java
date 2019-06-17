package MapaTest;

import Mapa.Direccion;
import Mapa.Posicion;
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

    // POSICION CON DIRECCION
    // Posicion en direccion norte
    @Test
    public void testPosicionDevuelveSuPosicionEnDireccionNorte(){
        Posicion posicion1 = new Posicion(2,9);
        Direccion direccion= Direccion.arriba();
        Posicion posicion2 = posicion1.siguientePosicion(direccion);
        assertEquals(10, posicion2.getY());
    }
    // Posicion en direccion sur
    @Test
    public void testPosicionDevuelveSuPosicionEnDireccionSur(){
        Posicion posicion1 = new Posicion(2,9);
        Direccion direccion= Direccion.abajo();
        Posicion posicion2 = posicion1.siguientePosicion(direccion);
        assertEquals(8, posicion2.getY());
    }
    // Posicion en direccion este
    @Test
    public void testPosicionDevuelveSuPosicionEnDireccionEste(){
        Posicion posicion1 = new Posicion(2,9);
        Direccion direccion= Direccion.derecha();
        Posicion posicion2 = posicion1.siguientePosicion(direccion);
        assertEquals(3, posicion2.getX());
    }
    // Posicion en direccion oeste
    @Test
    public void testPosicionDevuelveSuPosicionEnDireccionOeste(){
        Posicion posicion1 = new Posicion(2,9);
        Direccion direccion= Direccion.izquierda();
        Posicion posicion2 = posicion1.siguientePosicion(direccion);
        assertEquals(1, posicion2.getX());
    }
}
