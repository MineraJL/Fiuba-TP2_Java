package MapaTest;
import Modelo.Inventario.Inventario;
import Modelo.Jugador.Jugador;
import Modelo.Mapa.*;
import Modelo.MesaDeTrabajo.Mesa;

import org.junit.Test;

import static junit.framework.TestCase.*;



public class OcupanteTest {


    // UBICACION OCUPANTE
    @Test
    public void testOcupanteTieneLaMismaFilaDelCasilleroSeteadoEnCero() {
        Casillero casillero1 = new Casillero();
        casillero1.setPosicion(0, 0);
    	Inventario inventario = new Inventario();
    	Mesa mesa = new Mesa();
        Ocupante ocupante = new Jugador(inventario, mesa);
        ocupante.setCasillero(casillero1);
        assertEquals(0, ocupante.getPosicion().geti());
    }
    @Test
    public void testOcupanteTieneLaMismaColumnaDelCasilleroSeteadoEnCero() {
        Casillero casillero1 = new Casillero();
        casillero1.setPosicion(0, 0);
    	Inventario inventario = new Inventario();
    	Mesa mesa = new Mesa();
        Ocupante ocupante = new Jugador(inventario, mesa);
        ocupante.setCasillero(casillero1);
        assertEquals(0,  ocupante.getPosicion().getj());
    }
    @Test
    public void testOcupanteTieneLaMismaFilaDelCasilleroSeteadoEnUno() {
        Casillero casillero1 = new Casillero();
        casillero1.setPosicion(1, 0);
    	Inventario inventario = new Inventario();
    	Mesa mesa = new Mesa();
        Ocupante ocupante = new Jugador(inventario, mesa);
        ocupante.setCasillero(casillero1);
        assertEquals(1, ocupante.getPosicion().geti());
    }
    @Test
    public void testOcupanteTieneLaMismaColumnaDelCasilleroSeteadoEnUno() {
        Casillero casillero1 = new Casillero();
        casillero1.setPosicion(0, 1);
    	Inventario inventario = new Inventario();
    	Mesa mesa = new Mesa();
        Ocupante ocupante = new Jugador(inventario, mesa);
        ocupante.setCasillero(casillero1);
        assertEquals(1, ocupante.getPosicion().getj());
    }
    //


    // OCUPANTE TIENE EL CASILLERO SETEADO
    @Test
    public void testOcupanteTieneElCasilleroSeteado() {
        Casillero casillero1 = new Casillero();
        casillero1.setPosicion(0, 0);
    	Inventario inventario = new Inventario();
    	Mesa mesa = new Mesa();
        Ocupante ocupante = new Jugador(inventario, mesa);
        ocupante.setCasillero(casillero1);
        assertSame(casillero1, ocupante.getCasillero());
    }
    @Test
    public void testOcupanteTieneElUltimoCasilleroSeteado() {
        Casillero casillero1 = new Casillero();
        Casillero casillero2 = new Casillero();
        casillero1.setPosicion(0, 0);
    	Inventario inventario = new Inventario();
    	Mesa mesa = new Mesa();
        Ocupante ocupante1 = new Jugador(inventario, mesa);
        ocupante1.setCasillero(casillero2);
        ocupante1.setCasillero(casillero1);
        assertSame(casillero1, ocupante1.getCasillero());
    }

    // Ocupante al ingresar al mapa en una posicion, se le asigna casillero de la posicion
    @Test
    public void testOcupanteIngresaAlMapaEnCasilleroLibre() {
        Mapa mapa = new Mapa(10,10);

        Casillero casillero1 = new Casillero();
    	Inventario inventario = new Inventario();
    	Mesa mesa = new Mesa();
        Ocupante ocupante = new Jugador(inventario, mesa);
        ocupante.setCasillero(casillero1);

        PosicionEnlazada posicion = new PosicionEnlazada(3,3);

        ocupante.ingresar(mapa,posicion);

        assertSame(mapa.getCasillero(posicion), ocupante.getCasillero());
    }
    // Ocupante no ingresa al mapa si en la posicion ya hay un ocupante.
    @Test
    public void testOcupanteNoIngresaAlMapaEnCasilleroOcupado() {
        Mapa mapa = new Mapa(10,10);

        Casillero casillero1 = new Casillero();
        Casillero casillero2 = new Casillero();
    	Inventario inventario = new Inventario();
    	Mesa mesa = new Mesa();
        Ocupante ocupante1 = new Jugador(inventario, mesa);
        Ocupante ocupante2 = new Jugador(inventario, mesa);
        ocupante1.setCasillero(casillero1);
        ocupante2.setCasillero(casillero2);

        PosicionEnlazada posicion = new PosicionEnlazada(3,3);

        ocupante1.ingresar(mapa,posicion);
        ocupante2.ingresar(mapa,posicion);

        assertNotSame(mapa.getCasillero(posicion), ocupante2.getCasillero());
    }




}
