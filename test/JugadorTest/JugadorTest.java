package JugadorTest;

import Herramientas.*;
import Jugador.*;
import TipoMaterial.*;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class JugadorTest {
	@Test
	public void testJugadorSeCreaConHerramientaHachaDeMaderaPorDefecto() {
		Jugador jugador = new Jugador();
		
		assertEquals(1, jugador.cantidadHerramientas());	
	}
	
	@Test
	public void testJugadorConstruyeHachaDeMadera() {
		TipoMadera unaMadera = new TipoMadera();
		Jugador jugador = new Jugador();
		
		jugador.construirHacha(unaMadera);
		
		assertEquals(2, jugador.cantidadHerramientas());
	}
}
