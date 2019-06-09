package Jugador;

import Herramientas.*;
import Materiales.*;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class JugadorTest {
	@Test
	public void testJugadorSeCreaConHerramientaHachaDeMaderaPorDefecto() {
		Madera unaMadera = new Madera();
		Hacha hacha = new Hacha(unaMadera);
		Jugador jugador = new Jugador();
		
		assertEquals(hacha, jugador.herraminentaActual());	
	}
	
	@Test
	public void testJugadorConstruyeHachaDeMadera() {
		Madera unaMadera = new Madera();
		Hacha hacha = new Hacha(unaMadera);
		Jugador jugador = new Jugador();
		
		jugador.construirHacha(unaMadera);
		
		assertEquals(hacha, jugador.herraminentaActual());
	}
	
	@Test
	public void testJugadorConstruyePicoDePiedra() {
		Piedra unaPiedra = new Piedra();
		Pico pico = new Pico(unaPiedra);
		Jugador jugador = new Jugador();
		
		jugador.construirPico(unaPiedra);
		
		assertEquals(pico, jugador.herraminentaActual());
	}
	
	
	@Test
	public void testJugadorConstruyePicoFino() {
		PicoFino picoFino = new PicoFino();
		Jugador jugador = new Jugador();
		
		jugador.construirPicoFino();
		
		assertEquals(picoFino, jugador.herraminentaActual());
	}
	
	@Test
	public void testJugadorUsaPicoDeMetalYSeRompeAlDecimoUso() {
		Jugador jugador = new Jugador();
		PicoFino picoFino = new PicoFino();
		Metal unMetal = new Metal();
		
		jugador.cambiarHerramienta(picoFino);
		
		for(int i = 1; i < 10; i++)
			jugador.usarHerramienta(unMetal);
		
		assertEquals(un.Metal, jugador.usarHerramienta(unMetal));
	}
	
	@Test
	public void testJugadorCambiaHachaDeMaderaPorPicoFino() {
		Jugador jugador = new Jugador();
		PicoFino picoFino = new PicoFino();
		
		jugador.cambiarHerramienta(picoFino);
		
		assertEquals(picoFino, jugador.herraminentaActual());
	}

}
