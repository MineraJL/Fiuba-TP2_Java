package RecursosTest;
import Modelo.Herramientas.*;
import Modelo.Recursos.*;
import Modelo.MateriaPrima.*;
import Modelo.TipoMaterial.*;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class DiamanteTest {
    
        // Diamante Durabilidad
        @Test
        public void testDiamanteSeCreaConDurabilidad100(){
        	Diamante DiamanteTest =  new Diamante();
            assertEquals(100, DiamanteTest.durabilidad());

        }

        // Diamante reduce durabilidad
        @Test
        public void testDiamanteAlSerGolpeadoReduceSuDurabilidadEn10(){
            Diamante diamante =  new Diamante();
            diamante.reducirDurabilidadEn(10);
            assertEquals(90, diamante.durabilidad());
        }


        // GOLPES HACHA

        // Golpe hacha de madera
        @Test
        public void testDiamanteNoReduceSuDurabilidadSiEsGolpeadoPorHachaDeMadera(){
            TipoMadera materialMadera = new TipoMadera();
            Herramienta hacha = new Hacha(materialMadera);
            Recurso diamante =  new Diamante();
            hacha.golpear(diamante);
            assertEquals(100, diamante.durabilidad());
        }
        // Golpe hacha de Piedra
        @Test
        public void testDiamanteNoReduceSuDurabilidadSiEsGolpeadoPorHachaDePiedra(){
            TipoPiedra materialPiedra = new TipoPiedra();
            Herramienta hacha = new Hacha(materialPiedra);
            Recurso diamante =  new Diamante();
            hacha.golpear(diamante);
            assertEquals(100, diamante.durabilidad());
        }
        // Golpe hacha de Metal
        @Test
        public void testDiamanteNoReduceSuDurabilidadSiEsGolpeadoPorHachaDeMetal(){
            TipoMetal materialMetal = new TipoMetal();
            Herramienta hacha = new Hacha(materialMetal);
            Recurso diamante =  new Diamante();
            hacha.golpear(diamante);
            assertEquals(100, diamante.durabilidad());
        }

        // GOLPES PICO
        // Golpe Pico de Madera
        @Test
        public void testDiamanteNoReduceSuDurabilidadSiEsGolpeadoPorPicoMadera(){
            TipoMadera materialMadera = new TipoMadera();
            Herramienta pico = new Pico(materialMadera);
            Recurso diamante =  new Diamante();
            pico.golpear(diamante);
            assertEquals(100, diamante.durabilidad());
        }
        // Golpe Pico de Piedra
        @Test
        public void testDiamanteNoReduceSuDurabilidadSiEsGolpeadoPorPicoPiedra(){
            TipoPiedra materialPiedra = new TipoPiedra();
            Herramienta pico = new Pico(materialPiedra);
            Recurso diamante =  new Diamante();
            pico.golpear(diamante);
            assertEquals(100, diamante.durabilidad());
        }
        // Golpe Pico de Metal
        @Test
        public void testDiamanteNoReduceSuDurabilidadSiEsGolpeadoPorPicoMetal(){
            TipoMetal materialMetal = new TipoMetal();
            Herramienta pico = new Pico(materialMetal);
            Recurso diamante =  new Diamante();
            pico.golpear(diamante);
            assertEquals(100, diamante.durabilidad());
        }

        // GOLPES PICO FINO
        @Test
        public void testDiamanteReduceSuDurabilidadEn20SiEsGolpeadoPorPicoFino(){
            TipoMetalYPiedra materialMetalYPiedra = new TipoMetalYPiedra();
            Herramienta pico = new PicoFino(materialMetalYPiedra);
            Recurso diamante =  new Diamante();
            pico.golpear(diamante);
            assertEquals(80, diamante.durabilidad());
        }
        
        @Test
        public void testRecursoDiamanteAlLlegarACeroSuDurabilidadSeTransformaEnMateriaPrimaDiamante() {
        	Recurso diamante = new Diamante();
        	MateriaPrima mpDiamante = new MPDiamante();

        	diamante.reducirDurabilidadEn(100);
        	
        	assertEquals(mpDiamante, diamante.getCasillero().getOcupante());
        }
    }
