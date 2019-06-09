package MaterialesTest;
import Herramientas.*;
import Recursos.*;
import TipoMaterial.*;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class MaderaTest {

    // Madera Durabilidad
    @Test
    public void testMaderaSeCreaConLaDurabilidadIndicada(){
        Madera maderaTest =  new Madera(9);
        assertEquals(9, maderaTest.durabilidad());

    }

    // Madera reduce durabilidad
    @Test
    public void testMaderaReduceSuDurabilidadEn4(){
        Madera maderaTest =  new Madera(9);
        maderaTest.reducirDurabilidadEn(4);
        assertEquals(5, maderaTest.durabilidad());
    }


    // GOLPES HACHA

    // Golpe hacha de madera
    @Test
    public void testMaderaReduceSuDurabilidadEnDosSiEsGolpeadoPorHachaDeMadera(){
        TipoMadera materialMadera = new TipoMadera();
        Herramienta hacha = new Hacha(materialMadera);
        Madera maderaTest =  new Madera(9);
        hacha.golpear(maderaTest);
        assertEquals(7, maderaTest.durabilidad());
    }
    // Golpe hacha de Piedra
    @Test
    public void testMaderaReduceSuDurabilidadEnDosSiEsGolpeadoPorHachaDePiedra(){
        TipoPiedra materialPiedra = new TipoPiedra();
        Herramienta hacha = new Hacha(materialPiedra);
        Madera maderaTest =  new Madera(9);
        hacha.golpear(maderaTest);
        assertEquals(4, maderaTest.durabilidad());
    }
    // Golpe hacha de Metal
    @Test
    public void testMaderaReduceSuDurabilidadEnDosSiEsGolpeadoPorHachaDeMetal(){
        TipoMetal materialMetal = new TipoMetal();
        Herramienta hacha = new Hacha(materialMetal);
        Madera maderaTest =  new Madera(10);
        hacha.golpear(maderaTest);
        assertEquals(0, maderaTest.durabilidad());
    }

    // GOLPES PICO
    // Golpe Pico de Madera
    @Test
    public void testMaderaNoReduceSuDurabilidadSiEsGolpeadoPorPicoMadera(){
        TipoMadera materialMadera = new TipoMadera();
        Herramienta pico = new Pico(materialMadera);
        Madera maderaTest =  new Madera(9);
        pico.golpear(maderaTest);
        assertEquals(9, maderaTest.durabilidad());
    }
    // Golpe Pico de Piedra
    @Test
    public void testMaderaNoReduceSuDurabilidadSiEsGolpeadoPorPicoPiedra(){
        TipoPiedra materialPiedra = new TipoPiedra();
        Herramienta pico = new Pico(materialPiedra);
        Madera maderaTest =  new Madera(9);
        pico.golpear(maderaTest);
        assertEquals(9, maderaTest.durabilidad());
    }
    // Golpe Pico de Metal
    @Test
    public void testMaderaNoReduceSuDurabilidadSiEsGolpeadoPorPicoMetal(){
        TipoMetal materialMetal = new TipoMetal();
        Herramienta pico = new Pico(materialMetal);
        Madera maderaTest =  new Madera(9);
        pico.golpear(maderaTest);
        assertEquals(9, maderaTest.durabilidad());
    }

    // GOLPES PICO FINO
    @Test
    public void testMaderaNoReduceSuDurabilidadSiEsGolpeadoPorPicoFino(){
        TipoMetalYPiedra materialMetalYPiedra = new TipoMetalYPiedra();
        Herramienta pico = new PicoFino(materialMetalYPiedra);
        Madera maderaTest =  new Madera(9);
        pico.golpear(maderaTest);
        assertEquals(9, maderaTest.durabilidad());
    }
}