package MapaTest;

import Mapa.*;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DireccionTest {

    // DIRECCIONES
    // Direccion norte
    @Test
    public void testDireccionNorteDevuelvePosicionConMasUnoEnY(){
        Posicion posicion = new Posicion(1,1);
        Direccion direccion= Direccion.norte();
        Posicion posicion1= direccion.proximaPosicion(posicion);
        assertEquals(2, posicion1.getY());
    }
    @Test
    public void testDireccionNorteDevuelvePosicionConMismoValorEnX(){
        Posicion posicion = new Posicion(1,1);
        Direccion direccion= Direccion.norte();
        Posicion posicion1= direccion.proximaPosicion(posicion);
        assertEquals(1, posicion1.getX());
    }
    // Direccion sur
    @Test
    public void testDireccionSurDevuelvePosicionConMenosUnoEnY(){
        Posicion posicion = new Posicion(1,1);
        Direccion direccion= Direccion.sur();
        Posicion posicion1= direccion.proximaPosicion(posicion);
        assertEquals(0, posicion1.getY());
    }
    @Test
    public void testDireccionSurDevuelvePosicionConMismoValorEnX(){
        Posicion posicion = new Posicion(1,1);
        Direccion direccion= Direccion.sur();
        Posicion posicion1= direccion.proximaPosicion(posicion);
        assertEquals(1, posicion1.getX());
    }
    // Direccion este
    @Test
    public void testDireccionEsteDevuelvePosicionConMasUnoEnX(){
        Posicion posicion = new Posicion(1,1);
        Direccion direccion= Direccion.este();
        Posicion posicion1= direccion.proximaPosicion(posicion);
        assertEquals(2, posicion1.getX());
    }
    @Test
    public void testDireccionEsteDevuelvePosicionConMismoValorEnY(){
        Posicion posicion = new Posicion(1,1);
        Direccion direccion= Direccion.este();
        Posicion posicion1= direccion.proximaPosicion(posicion);
        assertEquals(1, posicion1.getY());
    }
    // Direccion Oeste
    @Test
    public void testDireccionOesteDevuelvePosicionConMenosUnoEnX(){
        Posicion posicion = new Posicion(1,1);
        Direccion direccion= Direccion.oeste();
        Posicion posicion1= direccion.proximaPosicion(posicion);
        assertEquals(0, posicion1.getX());
    }
    @Test
    public void testDireccionOesteDevuelvePosicionConMismoValorEnY(){
        Posicion posicion = new Posicion(1,1);
        Direccion direccion= Direccion.oeste();
        Posicion posicion1= direccion.proximaPosicion(posicion);
        assertEquals(1, posicion1.getY());
    }
}
