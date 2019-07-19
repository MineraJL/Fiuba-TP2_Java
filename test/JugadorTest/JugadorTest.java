package JugadorTest;

import Modelo.Herramientas.Hacha;
import Modelo.Jugador.Jugador;
import Modelo.Mapa.*;
import Modelo.TipoMaterial.TipoMadera;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertSame;

public class JugadorTest {
	@Test
	public void testJugadorSeCreaConHerramientaHachaDeMaderaPorDefecto() {
		Jugador jugador = new Jugador();
		TipoMadera madera = new TipoMadera();
		Hacha hacha = new Hacha(madera);
		
		assertEquals(hacha, jugador.herraminentaActual());	
	}
	
    @Test
    public void testOcupanteJugadorSeCreaEInicializaEnElMapa() {
        Mapa mapa = new Mapa(10,10);
        Casillero casillero = new Casillero();
        Jugador jugador = new Jugador();
        jugador.setCasillero(casillero);
        PosicionEnlazada posicionInicial = new PosicionEnlazada(5,5);
        jugador.ingresar(mapa, posicionInicial);

        PosicionEnlazada posicionFinal = new PosicionEnlazada(5,5);

        assertSame(mapa.getCasillero(posicionFinal),jugador.getCasillero());
    }
	
    @Test
    public void testItemJugadorSeMueveALaDerechaEnElMapaDosVeces() {
        Mapa mapa = new Mapa(10,10);
        Casillero casillero1 = new Casillero();
        Jugador jugador = new Jugador();
        jugador.setCasillero(casillero1);
        PosicionEnlazada posicionInicial = new PosicionEnlazada(5,5);
        jugador.ingresar(mapa, posicionInicial);
        // Lo muevo a la derecha 2 veces
        jugador.mover(mapa, Direccion.derecha());
        jugador.mover(mapa, Direccion.derecha());
        PosicionEnlazada posicionFinal = new PosicionEnlazada(7,5);

        assertSame(mapa.getCasillero(posicionFinal),jugador.getCasillero());
    }
	
	/*@Test
	public void testJugadorConstruyeHachaDeMadera() {
		TipoMadera unaMadera = new TipoMadera();
		Modelo.Jugador jugador = new Modelo.Jugador();
		
		jugador.construirHacha(unaMadera);
		
		assertEquals(2, jugador.cantidadHerramientas());
	}*/
}
