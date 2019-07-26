package JugadorTest;

import Modelo.Herramientas.Hacha;
import Modelo.Jugador.Jugador;
import Modelo.Inventario.Inventario;
import Modelo.MesaDeTrabajo.Mesa;
import Modelo.Mapa.*;
import Modelo.TipoMaterial.TipoMadera;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertSame;
import static junit.framework.TestCase.assertTrue;

public class JugadorTest {
	@Test
	public void testJugadorSeCreaConHerramientaHachaDeMaderaPorDefecto() {
    	Inventario inventario = new Inventario();
    	Mesa mesa = new Mesa();
		Jugador jugador = new Jugador(inventario, mesa);
		TipoMadera madera = new TipoMadera();
		Hacha hacha = new Hacha(madera);
		
		assertEquals(hacha, jugador.herraminentaActual());	
	}
	
    @Test
    public void testOcupanteJugadorSeCreaEInicializaEnElMapa() {
        Mapa mapa = new Mapa(10,10);
        Casillero casillero = new Casillero();
    	Inventario inventario = new Inventario();
    	Mesa mesa = new Mesa();
        Jugador jugador = new Jugador(inventario, mesa);
        jugador.setCasillero(casillero);
        PosicionEnlazada posicionInicial = new PosicionEnlazada(5,5);
        jugador.ingresar(mapa, posicionInicial);

        PosicionEnlazada posicionFinal = new PosicionEnlazada(5,5);

        assertSame(mapa.getCasillero(posicionFinal),jugador.getCasillero());
    }
    
    @Test
    public void testJugadorSeMueveHaciaLaIzquierdaEnElMapaUnaVez() {
        Mapa mapa = new Mapa(10,10);
        PosicionEnlazada posicionInicial = new PosicionEnlazada(2,5);
        Casillero casillero = new Casillero(posicionInicial);
    	Inventario inventario = new Inventario();
    	Mesa mesa = new Mesa();
        Jugador jugador = new Jugador(inventario, mesa);
        jugador.setCasillero(casillero);
        jugador.ingresar(mapa, posicionInicial);

        jugador.mover(new DireccionIzquierda());
        PosicionEnlazada posicionFinal = new PosicionEnlazada(2,4);

        assertTrue(jugador.getCasillero().getPosicion().equals(posicionFinal));
    }

    @Test
    public void testOcupanteJugadorSeMueveHaciaLaDerechaEnElMapaUnaVez() {
        Mapa mapa = new Mapa(10,10);
        PosicionEnlazada posicionInicial = new PosicionEnlazada(2,5);
        Casillero casillero = new Casillero(posicionInicial);
    	Inventario inventario = new Inventario();
    	Mesa mesa = new Mesa();
        Jugador jugador = new Jugador(inventario, mesa);
        jugador.setCasillero(casillero);
        jugador.ingresar(mapa, posicionInicial);

        jugador.mover(new DireccionDerecha());
        PosicionEnlazada posicionFinal = new PosicionEnlazada(2,6);


        assertTrue(jugador.getCasillero().getPosicion().equals(posicionFinal));
    }

    @Test
    public void testJugadorSeMueveHaciaArribaEnElMapaUnaVez() {
        Mapa mapa = new Mapa(10,10);
        PosicionEnlazada posicionInicial = new PosicionEnlazada(2,5);
        Casillero casillero = new Casillero(posicionInicial);
    	Inventario inventario = new Inventario();
    	Mesa mesa = new Mesa();
        Jugador jugador = new Jugador(inventario, mesa);
        jugador.setCasillero(casillero);
        jugador.ingresar(mapa, posicionInicial);

        jugador.mover(new DireccionArriba());
        PosicionEnlazada posicionFinal = new PosicionEnlazada(1,5);

        assertTrue(jugador.getCasillero().getPosicion().equals(posicionFinal));
    }

    @Test
    public void testJugadorSeMueveHaciaAbajoEnElMapaUnaVez() {
        Mapa mapa = new Mapa(10,10);
        PosicionEnlazada posicionInicial = new PosicionEnlazada(2,5);
        Casillero casillero = new Casillero(posicionInicial);
    	Inventario inventario = new Inventario();
    	Mesa mesa = new Mesa();
        Jugador jugador = new Jugador(inventario, mesa);
        jugador.setCasillero(casillero);
        jugador.ingresar(mapa, posicionInicial);

        jugador.mover(new DireccionAbajo());
        PosicionEnlazada posicionFinal = new PosicionEnlazada(3,5);

        assertTrue(jugador.getCasillero().getPosicion().equals(posicionFinal));
    }

	/*@Test
	public void testJugadorConstruyeHachaDeMadera() {
		TipoMadera unaMadera = new TipoMadera();
		Modelo.Jugador jugador = new Modelo.Jugador();
		
		jugador.construirHacha(unaMadera);
		
		assertEquals(2, jugador.cantidadHerramientas());
	}*/
}
