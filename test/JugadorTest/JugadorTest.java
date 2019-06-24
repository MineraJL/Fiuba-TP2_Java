package JugadorTest;

import Herramientas.*;
import Inventario.Inventario;
import Jugador.*;
import Mapa.Casillero;
import Mapa.Direccion;
import Mapa.Item;
import Mapa.Mapa;
import Mapa.Posicion;
import TipoMaterial.*;

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
    public void testItemJugadorSeCreaEInicializaEnElMapa() {
        Mapa mapa = new Mapa(10,10);
        Casillero casillero1 = new Casillero();
        Jugador jugador = new Jugador();
        jugador.setCasillero(casillero1);
        Posicion posicionInicial = new Posicion(5,5);
        jugador.ingresar(mapa, posicionInicial);

        Posicion posicionFinal = new Posicion(5,5);

        assertSame(mapa.getCasillero(posicionFinal),jugador.getCasillero());
    }
	
    @Test
    public void testItemJugadorSeMueveALaDerechaEnElMapaDosVeces() {
        Mapa mapa = new Mapa(10,10);
        Casillero casillero1 = new Casillero();
        Jugador jugador = new Jugador();
        jugador.setCasillero(casillero1);
        Posicion posicionInicial = new Posicion(5,5);
        jugador.ingresar(mapa, posicionInicial);
        // Lo muevo a la derecha 2 veces
        jugador.mover(mapa, Direccion.derecha());
        jugador.mover(mapa, Direccion.derecha());
        Posicion posicionFinal = new Posicion(7,5);

        assertSame(mapa.getCasillero(posicionFinal),jugador.getCasillero());
    }
	
	/*@Test
	public void testJugadorConstruyeHachaDeMadera() {
		TipoMadera unaMadera = new TipoMadera();
		Jugador jugador = new Jugador();
		
		jugador.construirHacha(unaMadera);
		
		assertEquals(2, jugador.cantidadHerramientas());
	}*/
}
