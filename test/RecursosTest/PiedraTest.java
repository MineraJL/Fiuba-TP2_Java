package RecursosTest;

import Modelo.Herramientas.*;
import Modelo.MateriaPrima.MPPiedra;
import Modelo.MateriaPrima.MateriaPrima;
import Modelo.Recursos.*;
import Modelo.TipoMaterial.*;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;



public class PiedraTest {
    // Piedra Durabilidad
    @Test
    public void testPiedraSeCreaConLaDurabilidadIndicada() {
        Recurso piedraTest = new Piedra();
        assertEquals(30, piedraTest.durabilidad());

    }

    // Piedra reduce durabilidad
    @Test
    public void testPiedraReduceSuDurabilidadEn4() {
        Recurso piedraTest = new Piedra();
        piedraTest.reducirDurabilidadEn(4);
        assertEquals(26, piedraTest.durabilidad());
    }


    // GOLPES HACHA

    // Golpe hacha de madera
    @Test
    public void testPiedraNoReduceSuDurabilidadSiEsGolpeadoPorHachaDeMadera() {
        TipoMadera materialMadera = new TipoMadera();
        Herramienta hacha = new Hacha(materialMadera);
        Recurso piedraTest = new Piedra();
        hacha.golpear(piedraTest);
        assertEquals(30, piedraTest.durabilidad());
    }

    // Golpe hacha de Piedra
    @Test
    public void testPiedraNoReduceSuDurabilidadSiEsGolpeadoPorHachaDePiedra() {
        TipoPiedra materialPiedra = new TipoPiedra();
        Herramienta hacha = new Hacha(materialPiedra);
        Recurso piedraTest = new Piedra();
        hacha.golpear(piedraTest);
        assertEquals(30, piedraTest.durabilidad());
    }

    // Golpe hacha de Metal
    @Test
    public void testPiedraNoReduceSuDurabilidadEnDosSiEsGolpeadoPorHachaDeMetal() {
        TipoMetal materialMetal = new TipoMetal();
        Herramienta hacha = new Hacha(materialMetal);
        Recurso piedraTest = new Piedra();
        hacha.golpear(piedraTest);
        assertEquals(30, piedraTest.durabilidad());
    }

    // GOLPES PICO
    // Golpe Pico de Madera
    @Test
    public void testPiedraReduceSuDurabilidadSiEsGolpeadoPorPicoMadera() {
        TipoMadera materialMadera = new TipoMadera();
        Herramienta pico = new Pico(materialMadera);
        Recurso piedraTest = new Piedra();
        pico.golpear(piedraTest);
        assertEquals(28, piedraTest.durabilidad());
    }

    // Golpe Pico de Piedra
    @Test
    public void testPiedraReduceSuDurabilidadSiEsGolpeadoPorPicoPiedra() {
        TipoPiedra materialPiedra = new TipoPiedra();
        Herramienta pico = new Pico(materialPiedra);
        Recurso piedraTest = new Piedra();
        pico.golpear(piedraTest);
        assertEquals(26, piedraTest.durabilidad());
    }

    // Golpe Pico de Metal
    @Test
    public void testPiedraReduceSuDurabilidadSiEsGolpeadoPorPicoMetal() {
        TipoMetal materialMetal = new TipoMetal();
        Herramienta pico = new Pico(materialMetal);
        Recurso piedraTest = new Piedra();
        pico.golpear(piedraTest);
        assertEquals(18, piedraTest.durabilidad());
    }

    // GOLPES PICO FINO
    @Test
    public void testPiedraNoReduceSuDurabilidadSiEsGolpeadoPorPicoFino() {
        TipoMetalYPiedra materialMetalYPiedra = new TipoMetalYPiedra();
        Herramienta pico = new PicoFino(materialMetalYPiedra);
        Recurso piedraTest = new Piedra();
        pico.golpear(piedraTest);
        assertEquals(30, piedraTest.durabilidad());
    }
    
    @Test
    public void testRecursoPiedraSeTransformaEnMateriaPrimaPiedra() {
    	Recurso piedra = new Piedra();
    	MateriaPrima mpPiedra = new MPPiedra();
    	
    	while (piedra.durabilidad() > 0)
    		piedra.reducirDurabilidadEn(10);
    	
    	assertEquals(mpPiedra, piedra.getCasillero().getItem());
    }
}
        
