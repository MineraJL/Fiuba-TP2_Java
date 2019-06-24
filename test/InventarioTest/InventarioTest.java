package InventarioTest;

import Herramientas.*;
import Inventario.Inventario;
import MateriaPrima.*;
import TipoMaterial.*;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class InventarioTest {
	@Test
	public void testInventarioSeCreaElMismoYSeLeAgregaUnaHachaDeMadera() {
		TipoMadera madera = new TipoMadera();
		Hacha unHacha = new Hacha(madera);
		Inventario unInventario = new Inventario();
		
		unInventario.agregarElemento(unHacha);
		
		assertEquals(unHacha, unInventario.extraerHachaMadera());
	}
	
	@Test
	public void testInventarioSeCreaElMismoYSeLeAgregaUnaHachaDePiedra() {
		TipoPiedra piedra = new TipoPiedra();
		Hacha unHacha = new Hacha(piedra);
		Inventario unInventario = new Inventario();
		
		unInventario.agregarElemento(unHacha);
		
		assertEquals(unHacha, unInventario.extraerHachaPiedra());
	}
	
	@Test
	public void testInventarioSeCreaElMismoYSeLeAgregaUnaHachaDeMetal() {
		TipoMetal metal = new TipoMetal();
		Hacha unHacha = new Hacha(metal);
		Inventario unInventario = new Inventario();
		
		unInventario.agregarElemento(unHacha);
		
		assertEquals(unHacha, unInventario.extraerHachaMetal());
	} 
	
	@Test
	public void testInventarioSeCreaElMismoYSeLeAgregaUnPicoDeMadera() {
		TipoMadera madera = new TipoMadera();
		Pico unPico = new Pico(madera);
		Inventario unInventario = new Inventario();
		
		unInventario.agregarElemento(unPico);
		
		assertEquals(unPico, unInventario.extraerPicoMadera());
	}
	
	@Test
	public void testInventarioSeCreaElMismoYSeLeAgregaUnPicoDePiedra() {
		TipoPiedra piedra = new TipoPiedra();
		Pico unPico = new Pico(piedra);
		Inventario unInventario = new Inventario();
		
		unInventario.agregarElemento(unPico);
		
		assertEquals(unPico, unInventario.extraerPicoPiedra());
	}
	
	@Test
	public void testInventarioSeCreaElMismoYSeLeAgregaUnPicoDeMetal() {
		TipoMetal metal = new TipoMetal();
		Pico unPico = new Pico(metal);
		Inventario unInventario = new Inventario();
		
		unInventario.agregarElemento(unPico);
		
		assertEquals(unPico, unInventario.extraerPicoMetal());
	}
	
	@Test
	public void testInventarioSeCreaElMismoYSeLeAgregaUnPicoFino() {
		TipoMetalYPiedra metalYPiedra = new TipoMetalYPiedra();
		PicoFino unPicoFino = new PicoFino(metalYPiedra);
		Inventario unInventario = new Inventario();
		
		unInventario.agregarElemento(unPicoFino);
		
		assertEquals(unPicoFino, unInventario.extraerPicoFino());
	}
	
	@Test
	public void testInventarioSeCreaElMismoYSeLeAgregaUnaMaderaComoMateriaPrima() {
		MPMadera materiaPrima = new MPMadera();
		Inventario unInventario = new Inventario();
		
		unInventario.agregarElemento(materiaPrima);
		
		assertEquals(materiaPrima, unInventario.extraerMateriaPrimaMadera());
	}
	
	@Test
	public void testInventarioSeCreaElMismoYSeLeAgregaUnMetalComoMateriaPrima() {
		MPMetal materiaPrima = new MPMetal();
		Inventario unInventario = new Inventario();
		
		unInventario.agregarElemento(materiaPrima);
		
		assertEquals(materiaPrima, unInventario.extraerMateriaPrimaMetal());
	}
	
	@Test
	public void testInventarioSeCreaElMismoYSeLeAgregaUnDiamanteComoMateriaPrima() {
		MPDiamante materiaPrima = new MPDiamante();
		Inventario unInventario = new Inventario();
		
		unInventario.agregarElemento(materiaPrima);
		
		assertEquals(materiaPrima, unInventario.extraerMateriaPrimaDiamante());
	}

}
