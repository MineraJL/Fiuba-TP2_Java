package MapaTest;
import Modelo.Jugador.Jugador;
import Modelo.Mapa.*;
import org.junit.Test;

import static junit.framework.TestCase.*;



public class ItemTest {


    // UBICACION ITEM
    @Test
    public void testItemTieneLaMismaFilaDelCasilleroSeteadoEnCero() {
        Casillero casillero1 = new Casillero();
        casillero1.setPosicion(0, 0);
        Ocupante ocupante = new Jugador();
        ocupante.setCasillero(casillero1);
        assertEquals(0, ocupante.getPosicion().getX());
    }
    @Test
    public void testItemTieneLaMismaColumnaDelCasilleroSeteadoEnCero() {
        Casillero casillero1 = new Casillero();
        casillero1.setPosicion(0, 0);
        Ocupante ocupante = new Jugador();
        ocupante.setCasillero(casillero1);
        assertEquals(0,  ocupante.getPosicion().getY());
    }
    @Test
    public void testItemTieneLaMismaFilaDelCasilleroSeteadoEnUno() {
        Casillero casillero1 = new Casillero();
        casillero1.setPosicion(1, 0);
        Ocupante ocupante = new Jugador();
        ocupante.setCasillero(casillero1);
        assertEquals(1, ocupante.getPosicion().getX());
    }
    @Test
    public void testItemTieneLaMismaColumnaDelCasilleroSeteadoEnUno() {
        Casillero casillero1 = new Casillero();
        casillero1.setPosicion(0, 1);
        Ocupante ocupante = new Jugador();
        ocupante.setCasillero(casillero1);
        assertEquals(1, ocupante.getPosicion().getY());
    }
    //


    // ITEM TIENE EL CASILLERO SETEADO
    @Test
    public void testItemTieneElCasilleroSeteado() {
        Casillero casillero1 = new Casillero();
        casillero1.setPosicion(0, 0);
        Ocupante ocupante = new Jugador();
        ocupante.setCasillero(casillero1);
        assertSame(casillero1, ocupante.getCasillero());
    }
    @Test
    public void testItemTieneElUltimoCasilleroSeteado() {
        Casillero casillero1 = new Casillero();
        Casillero casillero2 = new Casillero();
        casillero1.setPosicion(0, 0);
        Ocupante ocupante1 = new Jugador();
        ocupante1.setCasillero(casillero2);
        ocupante1.setCasillero(casillero1);
        assertSame(casillero1, ocupante1.getCasillero());
    }

    // Ocupante al ingresar al mapa en una posicion, se le asigna casillero de la posicion
    @Test
    public void testItemIngresaAlMapaEnCasilleroLibre() {
        Mapa mapa = new Mapa(10,10);

        Casillero casillero1 = new Casillero();
        Ocupante ocupante = new Jugador();
        ocupante.setCasillero(casillero1);

        Posicion posicion = new Posicion(3,3);

        ocupante.ingresar(mapa,posicion);

        assertSame(mapa.getCasillero(posicion), ocupante.getCasillero());
    }
    // Ocupante no ingresa al mapa si en la posicion ya hay un item.
    @Test
    public void testItemNoIngresaAlMapaEnCasilleroOcupado() {
        Mapa mapa = new Mapa(10,10);

        Casillero casillero1 = new Casillero();
        Casillero casillero2 = new Casillero();
        Ocupante ocupante1 = new Jugador();
        Ocupante ocupante2 = new Jugador();
        ocupante1.setCasillero(casillero1);
        ocupante2.setCasillero(casillero2);

        Posicion posicion = new Posicion(3,3);

        ocupante1.ingresar(mapa,posicion);
        ocupante2.ingresar(mapa,posicion);

        assertNotSame(mapa.getCasillero(posicion), ocupante2.getCasillero());
    }




}
