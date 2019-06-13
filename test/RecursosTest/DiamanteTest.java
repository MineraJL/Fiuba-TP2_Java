package RecursosTest;
import Herramientas.*;
import Recursos.*;
import TipoMaterial.*;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class DiamanteTest {



        // Diamante Durabilidad
        @Test
        public void testDiamanteSeCreaConLaDurabilidadIndicada(){
        	Diamante DiamanteTest =  new Diamante();
            assertEquals(100, DiamanteTest.durabilidad());

        }

        // Diamante reduce durabilidad
        @Test
        public void testDiamanteReduceSuDurabilidadEn10(){
            Diamante diamanteTest =  new Diamante();
            diamanteTest.reducirDurabilidadEn(10);
            assertEquals(90, diamanteTest.durabilidad());
        }


        // GOLPES HACHA

        // Golpe hacha de madera
        @Test
        public void testDiamanteNoReduceSuDurabilidadSiEsGolpeadoPorHachaDeMadera(){
            TipoMadera materialMadera = new TipoMadera();
            Herramienta hacha = new Hacha(materialMadera);
            Recurso diamanteTest =  new Diamante();
            hacha.golpear(diamanteTest);
            assertEquals(100, diamanteTest.durabilidad());
        }
        // Golpe hacha de Piedra
        @Test
        public void testDiamanteNoReduceSuDurabilidadSiEsGolpeadoPorHachaDePiedra(){
            TipoPiedra materialPiedra = new TipoPiedra();
            Herramienta hacha = new Hacha(materialPiedra);
            Recurso diamanteTest =  new Diamante();
            hacha.golpear(diamanteTest);
            assertEquals(100, diamanteTest.durabilidad());
        }
        // Golpe hacha de Metal
        @Test
        public void testDiamanteNoReduceSuDurabilidadSiEsGolpeadoPorHachaDeMetal(){
            TipoMetal materialMetal = new TipoMetal();
            Herramienta hacha = new Hacha(materialMetal);
            Recurso diamanteTest =  new Diamante();
            hacha.golpear(diamanteTest);
            assertEquals(100, diamanteTest.durabilidad());
        }

        // GOLPES PICO
        // Golpe Pico de Madera
        @Test
        public void testDiamanteNoReduceSuDurabilidadSiEsGolpeadoPorPicoMadera(){
            TipoMadera materialMadera = new TipoMadera();
            Herramienta pico = new Pico(materialMadera);
            Recurso diamanteTest =  new Diamante();
            pico.golpear(diamanteTest);
            assertEquals(100, diamanteTest.durabilidad());
        }
        // Golpe Pico de Piedra
        @Test
        public void testDiamanteNoReduceSuDurabilidadSiEsGolpeadoPorPicoPiedra(){
            TipoPiedra materialPiedra = new TipoPiedra();
            Herramienta pico = new Pico(materialPiedra);
            Recurso diamanteTest =  new Diamante();
            pico.golpear(diamanteTest);
            assertEquals(100, diamanteTest.durabilidad());
        }
        // Golpe Pico de Metal
        @Test
        public void testDiamanteNoReduceSuDurabilidadSiEsGolpeadoPorPicoMetal(){
            TipoMetal materialMetal = new TipoMetal();
            Herramienta pico = new Pico(materialMetal);
            Recurso diamanteTest =  new Diamante();
            pico.golpear(diamanteTest);
            assertEquals(100, diamanteTest.durabilidad());
        }

        // GOLPES PICO FINO
        @Test
        public void testDiamanteReduceSuDurabilidadSiEsGolpeadoPorPicoFino(){
            TipoMetalYPiedra materialMetalYPiedra = new TipoMetalYPiedra();
            Herramienta pico = new PicoFino(materialMetalYPiedra);
            Recurso diamanteTest =  new Diamante();
            pico.golpear(diamanteTest);
            assertEquals(80, diamanteTest.durabilidad());
        }
    }
