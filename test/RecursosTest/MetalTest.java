package RecursosTest;
import Herramientas.*;
import Recursos.*;
import TipoMaterial.*;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;


public class MetalTest {


        // Metal Durabilidad
        @Test
        public void testMetalSeCreaConLaDurabilidadIndicada(){
            Recurso metalTest =  new Metal();
            assertEquals(50, metalTest.durabilidad());

        }

        // Metal reduce durabilidad
        @Test
        public void testMetalReduceSuDurabilidadEn4(){
            Recurso metalTest =  new Metal();
            metalTest.reducirDurabilidadEn(4);
            assertEquals(46, metalTest.durabilidad());
        }


        // GOLPES HACHA

        // Golpe hacha de madera
        @Test
        public void testMetalNoReduceSuDurabilidadSiEsGolpeadoPorHachaDeMadera(){
            TipoMadera materialMadera = new TipoMadera();
            Herramienta hacha = new Hacha(materialMadera);
            Recurso metalTest =  new Metal();
            hacha.golpear(metalTest);
            assertEquals(50, metalTest.durabilidad());
        }
        // Golpe hacha de Piedra
        @Test
        public void testMetalNoReduceSuDurabilidadSiEsGolpeadoPorHachaDePiedra(){
            TipoPiedra materialPiedra = new TipoPiedra();
            Herramienta hacha = new Hacha(materialPiedra);
            Recurso metalTest =  new Metal();
            hacha.golpear(metalTest);
            assertEquals(50, metalTest.durabilidad());
        }
        // Golpe hacha de Metal
        @Test
        public void testMetalNoReduceSuDurabilidadSiEsGolpeadoPorHachaDeMetal(){
            TipoMetal materialMetal = new TipoMetal();
            Herramienta hacha = new Hacha(materialMetal);
            Recurso metalTest =  new Metal();
            hacha.golpear(metalTest);
            assertEquals(50, metalTest.durabilidad());
        }

        // GOLPES PICO
        // Golpe Pico de Madera
        @Test
        public void testMetalNoReduceSuDurabilidadSiEsGolpeadoPorPicoMadera(){
            TipoMadera materialMadera = new TipoMadera();
            Herramienta pico = new Pico(materialMadera);
            Recurso metalTest =  new Metal();
            pico.golpear(metalTest);
            assertEquals(50, metalTest.durabilidad());
        }
        // Golpe Pico de Piedra
        @Test
        public void testMetalReduceSuDurabilidadSiEsGolpeadoPorPicoPiedra(){
            TipoPiedra materialPiedra = new TipoPiedra();
            Herramienta pico = new Pico(materialPiedra);
            Recurso metalTest =  new Metal();
            pico.golpear(metalTest);
            assertEquals(46, metalTest.durabilidad());
        }
        // Golpe Pico de Metal
        @Test
        public void testMetalNoReduceSuDurabilidadSiEsGolpeadoPorPicoMetal(){
            TipoMetal materialMetal = new TipoMetal();
            Herramienta pico = new Pico(materialMetal);
            Recurso metalTest =  new Metal();
            pico.golpear(metalTest);
            assertEquals(50, metalTest.durabilidad());
        }

        // GOLPES PICO FINO
        @Test
        public void testMetalNoReduceSuDurabilidadSiEsGolpeadoPorPicoFino(){
            TipoMetalYPiedra materialMetalYPiedra = new TipoMetalYPiedra();
            Herramienta pico = new PicoFino(materialMetalYPiedra);
            Recurso metalTest =  new Metal();
            pico.golpear(metalTest);
            assertEquals(50, metalTest.durabilidad());
        }
    }
