package MapaTest;
import Jugador.Jugador;
import Mapa.*;
import Recursos.*;
import org.junit.Test;

import static junit.framework.TestCase.*;



public class ItemTest {


    // UBICACION ITEM
    @Test
    public void testItemTieneLaMismaFilaDelCasilleroSeteadoEnCero() {
        Casillero casillero1 = new Casillero();
        casillero1.setPosicion(0, 0);
        Item item = new Jugador();
        item.setCasillero(casillero1);
        assertEquals(0, item.getPosicion().getX());
    }
    @Test
    public void testItemTieneLaMismaColumnaDelCasilleroSeteadoEnCero() {
        Casillero casillero1 = new Casillero();
        casillero1.setPosicion(0, 0);
        Item item = new Jugador();
        item.setCasillero(casillero1);
        assertEquals(0,  item.getPosicion().getY());
    }
    @Test
    public void testItemTieneLaMismaFilaDelCasilleroSeteadoEnUno() {
        Casillero casillero1 = new Casillero();
        casillero1.setPosicion(1, 0);
        Item item = new Jugador();
        item.setCasillero(casillero1);
        assertEquals(1, item.getPosicion().getX());
    }
    @Test
    public void testItemTieneLaMismaColumnaDelCasilleroSeteadoEnUno() {
        Casillero casillero1 = new Casillero();
        casillero1.setPosicion(0, 1);
        Item item = new Jugador();
        item.setCasillero(casillero1);
        assertEquals(1, item.getPosicion().getY());
    }
    //


    // ITEM TIENE EL CASILLERO SETEADO
    @Test
    public void testItemTieneElCasilleroSeteado() {
        Casillero casillero1 = new Casillero();
        casillero1.setPosicion(0, 0);
        Item item = new Jugador();
        item.setCasillero(casillero1);
        assertSame(casillero1,item.getCasillero());
    }
    @Test
    public void testItemTieneElUltimoCasilleroSeteado() {
        Casillero casillero1 = new Casillero();
        Casillero casillero2 = new Casillero();
        casillero1.setPosicion(0, 0);
        Item item1 = new Jugador();
        item1.setCasillero(casillero2);
        item1.setCasillero(casillero1);
        assertSame(casillero1,item1.getCasillero());
    }

    // Item al ingresar al mapa en una posicion, se le asigna casillero de la posicion
    @Test
    public void testItemIngresaAlMapaEnCasilleroLibre() {
        Mapa mapa = new Mapa(10,10);

        Casillero casillero1 = new Casillero();
        Item item = new Jugador();
        item.setCasillero(casillero1);

        Posicion posicion = new Posicion(3,3);

        item.ingresar(mapa,posicion);

        assertSame(mapa.getCasillero(posicion),item.getCasillero());
    }
    // Item no ingresa al mapa si en la posicion ya hay un item.
    @Test
    public void testItemNoIngresaAlMapaEnCasilleroOcupado() {
        Mapa mapa = new Mapa(10,10);

        Casillero casillero1 = new Casillero();
        Casillero casillero2 = new Casillero();
        Item item1 = new Jugador();
        Item item2 = new Jugador();
        item1.setCasillero(casillero1);
        item2.setCasillero(casillero2);

        Posicion posicion = new Posicion(3,3);

        item1.ingresar(mapa,posicion);
        item2.ingresar(mapa,posicion);

        assertNotSame(mapa.getCasillero(posicion),item2.getCasillero());
    }




}
