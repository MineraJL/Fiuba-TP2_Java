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
    public void testPiedraSeCreaConDurabilidad30() {
        Recurso piedra = new Piedra();
        assertEquals(30, piedra.durabilidad());

    }

    // Piedra reduce durabilidad
    @Test
    public void testPiedraAlSerGolpeadoReduceSuDurabilidadEn4() {
        Recurso piedra = new Piedra();
        piedra.serGolpeadoCon(4);
        assertEquals(26, piedra.durabilidad());
    }


    // GOLPES HACHA

    // Golpe hacha de madera
    @Test
    public void testPiedraNoReduceSuDurabilidadSiEsGolpeadoPorHachaDeMadera() {
        TipoMadera materialMadera = new TipoMadera();
        Herramienta hacha = new Hacha(materialMadera);
        Recurso piedra = new Piedra();
        hacha.golpear(piedra);
        assertEquals(30, piedra.durabilidad());
    }

    // Golpe hacha de Piedra
    @Test
    public void testPiedraNoReduceSuDurabilidadSiEsGolpeadoPorHachaDePiedra() {
        TipoPiedra materialPiedra = new TipoPiedra();
        Herramienta hacha = new Hacha(materialPiedra);
        Recurso piedra = new Piedra();
        hacha.golpear(piedra);
        assertEquals(30, piedra.durabilidad());
    }

    // Golpe hacha de Metal
    @Test
    public void testPiedraNoReduceSuDurabilidadEnDosSiEsGolpeadoPorHachaDeMetal() {
        TipoMetal materialMetal = new TipoMetal();
        Herramienta hacha = new Hacha(materialMetal);
        Recurso piedra = new Piedra();
        hacha.golpear(piedra);
        assertEquals(30, piedra.durabilidad());
    }

    // GOLPES PICO
    // Golpe Pico de Madera
    @Test
    public void testPiedraReduceSuDurabilidadEn2SiEsGolpeadoPorPicoMadera() {
        TipoMadera materialMadera = new TipoMadera();
        Herramienta pico = new Pico(materialMadera);
        Recurso piedra = new Piedra();
        pico.golpear(piedra);
        assertEquals(28, piedra.durabilidad());
    }

    // Golpe Pico de Piedra
    @Test
    public void testPiedraReduceSuDurabilidadEn4SiEsGolpeadoPorPicoPiedra() {
        TipoPiedra materialPiedra = new TipoPiedra();
        Herramienta pico = new Pico(materialPiedra);
        Recurso piedra = new Piedra();
        pico.golpear(piedra);
        assertEquals(26, piedra.durabilidad());
    }

    // Golpe Pico de Metal
    @Test
    public void testPiedraReduceSuDurabilidadEn12SiEsGolpeadoPorPicoMetal() {
        TipoMetal materialMetal = new TipoMetal();
        Herramienta pico = new Pico(materialMetal);
        Recurso piedra = new Piedra();
        pico.golpear(piedra);
        assertEquals(18, piedra.durabilidad());
    }

    // GOLPES PICO FINO
    @Test
    public void testPiedraNoReduceSuDurabilidadSiEsGolpeadoPorPicoFino() {
        TipoMetalYPiedra materialMetalYPiedra = new TipoMetalYPiedra();
        Herramienta pico = new PicoFino(materialMetalYPiedra);
        Recurso piedra = new Piedra();
        pico.golpear(piedra);
        assertEquals(30, piedra.durabilidad());
    }
    
    @Test
    public void testRecursoPiedraSeTransformaEnMateriaPrimaPiedra() {
    	Recurso piedra = new Piedra();
    	MateriaPrima mpPiedra = new MPPiedra();
    	
    	piedra.serGolpeadoCon(30);
    	
    	assertEquals(mpPiedra, piedra.getCasillero().getOcupante());
    }
}
        
