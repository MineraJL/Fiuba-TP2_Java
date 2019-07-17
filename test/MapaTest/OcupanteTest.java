package MapaTest;
import Modelo.Jugador.Jugador;
import Modelo.Mapa.*;
import org.junit.Test;

import static junit.framework.TestCase.*;



public class OcupanteTest {


    // UBICACION OCUPANTE
    @Test
    public void testOcupanteTieneLaMismaFilaDelCasilleroSeteadoEnCero() {
        Casillero casillero1 = new Casillero();
        casillero1.setPosicion(0, 0);
        Ocupante ocupante = new Jugador();
        ocupante.setCasillero(casillero1);
        assertEquals(0, ocupante.getPosicion().getX());
    }
    @Test
    public void testOcupanteTieneLaMismaColumnaDelCasilleroSeteadoEnCero() {
        Casillero casillero1 = new Casillero();
        casillero1.setPosicion(0, 0);
        Ocupante ocupante = new Jugador();
        ocupante.setCasillero(casillero1);
        assertEquals(0,  ocupante.getPosicion().getY());
    }
    @Test
    public void testOcupanteTieneLaMismaFilaDelCasilleroSeteadoEnUno() {
        Casillero casillero1 = new Casillero();
        casillero1.setPosicion(1, 0);
        Ocupante ocupante = new Jugador();
        ocupante.setCasillero(casillero1);
        assertEquals(1, ocupante.getPosicion().getX());
    }
    @Test
    public void testOcupanteTieneLaMismaColumnaDelCasilleroSeteadoEnUno() {
        Casillero casillero1 = new Casillero();
        casillero1.setPosicion(0, 1);
        Ocupante ocupante = new Jugador();
        ocupante.setCasillero(casillero1);
        assertEquals(1, ocupante.getPosicion().getY());
    }
    //


    // OCUPANTE TIENE EL CASILLERO SETEADO
    @Test
    public void testOcupanteTieneElCasilleroSeteado() {
        Casillero casillero1 = new Casillero();
        casillero1.setPosicion(0, 0);
        Ocupante ocupante = new Jugador();
        ocupante.setCasillero(casillero1);
        assertSame(casillero1, ocupante.getCasillero());
    }
    @Test
    public void testOcupanteTieneElUltimoCasilleroSeteado() {
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
    public void testOcupanteIngresaAlMapaEnCasilleroLibre() {
        Mapa mapa = new Mapa(10,10);

        Casillero casillero1 = new Casillero();
        Ocupante ocupante = new Jugador();
        ocupante.setCasillero(casillero1);

        Posicion posicion = new Posicion(3,3);

        ocupante.ingresar(mapa,posicion);

        assertSame(mapa.getCasillero(posicion), ocupante.getCasillero());
    }
    // Ocupante no ingresa al mapa si en la posicion ya hay un ocupante.
    @Test
    public void testOcupanteNoIngresaAlMapaEnCasilleroOcupado() {
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