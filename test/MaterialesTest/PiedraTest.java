package MaterialesTest;

import Herramientas.*;
import Recursos.*;
import TipoMaterial.*;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


    


public class PiedraTest {
    // Piedra Durabilidad
    @Test
    public void testPiedraSeCreaConLaDurabilidadIndicada(){
        Piedra piedraTest =  new Piedra(30);
        assertEquals(30, piedraTest.durabilidad());

    }

    // Piedra reduce durabilidad
    @Test
    public void testPiedraReduceSuDurabilidadEn4(){
        Piedra piedraTest =  new Piedra(30);
        piedraTest.reducirDurabilidadEn(4);
        assertEquals(26, piedraTest.durabilidad());
    }


    // GOLPES HACHA

    // Golpe hacha de madera
    @Test
    public void testPiedraNoReduceSuDurabilidadSiEsGolpeadoPorHachaDeMadera(){
        TipoMadera materialMadera = new TipoMadera();
        Herramienta hacha = new Hacha(materialMadera);
        Piedra piedraTest =  new Piedra(30);
        hacha.golpear(piedraTest);
        assertEquals(30, piedraTest.durabilidad());
    }
    // Golpe hacha de Piedra
    @Test
    public void testPiedraNoReduceSuDurabilidadSiEsGolpeadoPorHachaDePiedra(){
        TipoPiedra materialPiedra = new TipoPiedra();
        Herramienta hacha = new Hacha(materialPiedra);
        Piedra piedraTest =  new Piedra(30);
        hacha.golpear(piedraTest);
        assertEquals(30, piedraTest.durabilidad());
    }
    // Golpe hacha de Metal
    @Test
    public void testPiedraNoReduceSuDurabilidadEnDosSiEsGolpeadoPorHachaDeMetal(){
        TipoMetal materialMetal = new TipoMetal();
        Herramienta hacha = new Hacha(materialMetal);
        Piedra piedraTest =  new Piedra(30);
        hacha.golpear(piedraTest);
        assertEquals(30, piedraTest.durabilidad());
    }

    // GOLPES PICO
    // Golpe Pico de Madera
    @Test
    public void testPiedraReduceSuDurabilidadSiEsGolpeadoPorPicoMadera(){
        TipoMadera materialMadera = new TipoMadera();
        Herramienta pico = new Pico(materialMadera);
        Piedra piedraTest =  new Piedra(30);
        pico.golpear(piedraTest);
        assertEquals(28, piedraTest.durabilidad());
    }
    // Golpe Pico de Piedra
    @Test
    public void testPiedraReduceSuDurabilidadSiEsGolpeadoPorPicoPiedra(){
        TipoPiedra materialPiedra = new TipoPiedra();
        Herramienta pico = new Pico(materialPiedra);
        Piedra piedraTest =  new Piedra(30);
        pico.golpear(piedraTest);
        assertEquals(26, piedraTest.durabilidad());
    }
    // Golpe Pico de Metal
    @Test
    public void testPiedraReduceSuDurabilidadSiEsGolpeadoPorPicoMetal(){
        TipoMetal materialMetal = new TipoMetal();
        Herramienta pico = new Pico(materialMetal);
        Piedra piedraTest =  new Piedra(30);
        pico.golpear(piedraTest);
        assertEquals(18, piedraTest.durabilidad());
    }

    // GOLPES PICO FINO
    @Test
    public void testPiedraNoReduceSuDurabilidadSiEsGolpeadoPorPicoFino(){
        TipoMetalYPiedra materialMetalYPiedra = new TipoMetalYPiedra();
        Herramienta pico = new PicoFino(materialMetalYPiedra);
        Piedra piedraTest =  new Piedra(30);
        pico.golpear(piedraTest);
        assertEquals(30, piedraTest.durabilidad());
    }





}
    /*
    @Test
    public void testPiedraSeCreaConLaDurabilidadIndicada(){
        Piedra piedraTest =  new Piedra(9);
        assertEquals(9, piedraTest.durabilidad());

    }

    @Test
    public void testPiedraReduceSuDurabilidadEn4(){
        Piedra piedraTest =  new Piedra(9);
        piedraTest.reducirDurabilidadEn(4);
        assertEquals(5, piedraTest.durabilidad());
    }


    @Test
    public void testPiedraReduceSuDurabilidadSiEsGolpeadoPorPico(){
        Pico pico = new Pico(4);
        Piedra piedraTest =  new Piedra(9);
        piedraTest.recibirGolpeDe(pico);
        assertEquals(5, piedraTest.durabilidad());
    }


    @Test
    public void testPiedraNoReduceSuDurabilidadSiEsGolpeadoPorPicoFino(){
        PicoFino picoFino = new PicoFino(4);
        Piedra piedraTest =  new Piedra(9);
        piedraTest.recibirGolpeDe(picoFino);
        assertEquals(9, piedraTest.durabilidad());
    }


    @Test
    public void testPiedraNoReduceSuDurabilidadSiEsGolpeadoPorHacha(){
        Hacha hacha = new Hacha(4);
        Piedra piedraTest =  new Piedra(9);
        piedraTest.recibirGolpeDe(hacha);
        assertEquals(9, piedraTest.durabilidad());
    }
*/
        
