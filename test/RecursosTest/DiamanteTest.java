package RecursosTest;
import Modelo.Excepciones.HerramientaDesgastadaExcepcion;
import Modelo.Herramientas.*;
import Modelo.Recursos.*;
import Modelo.MateriaPrima.*;
import Modelo.TipoMaterial.*;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class DiamanteTest {
    
        // Diamante Durabilidad
        @Test
        public void test01DiamanteSeCreaConDurabilidad100(){
        	Diamante DiamanteTest =  new Diamante();
            assertEquals(100, DiamanteTest.durabilidad());

        }

        // Diamante reduce durabilidad
        @Test
        public void test02DiamanteAlSerGolpeadoReduceSuDurabilidadEn10(){
            Diamante diamante =  new Diamante();
            diamante.reducirDurabilidadEn(10);
            assertEquals(90, diamante.durabilidad());
        }


        // GOLPES HACHA

        // Golpe hacha de madera
        @Test
        public void test03DiamanteNoReduceSuDurabilidadSiEsGolpeadoPorHachaDeMadera() throws HerramientaDesgastadaExcepcion{
            TipoMadera materialMadera = new TipoMadera();
            Herramienta hacha = new Hacha(materialMadera);
            Recurso diamante =  new Diamante();
            hacha.golpear(diamante);
            assertEquals(100, diamante.durabilidad());
        }
        // Golpe hacha de Piedra
        @Test
        public void test04DiamanteNoReduceSuDurabilidadSiEsGolpeadoPorHachaDePiedra() throws HerramientaDesgastadaExcepcion{
            TipoPiedra materialPiedra = new TipoPiedra();
            Herramienta hacha = new Hacha(materialPiedra);
            Recurso diamante =  new Diamante();
            hacha.golpear(diamante);
            assertEquals(100, diamante.durabilidad());
        }
        // Golpe hacha de Metal
        @Test
        public void test05DiamanteNoReduceSuDurabilidadSiEsGolpeadoPorHachaDeMetal() throws HerramientaDesgastadaExcepcion{
            TipoMetal materialMetal = new TipoMetal();
            Herramienta hacha = new Hacha(materialMetal);
            Recurso diamante =  new Diamante();
            hacha.golpear(diamante);
            assertEquals(100, diamante.durabilidad());
        }

        // GOLPES PICO
        // Golpe Pico de Madera
        @Test
        public void test06DiamanteNoReduceSuDurabilidadSiEsGolpeadoPorPicoMadera() throws HerramientaDesgastadaExcepcion{
            TipoMadera materialMadera = new TipoMadera();
            Herramienta pico = new Pico(materialMadera);
            Recurso diamante =  new Diamante();
            pico.golpear(diamante);
            assertEquals(100, diamante.durabilidad());
        }
        // Golpe Pico de Piedra
        @Test
        public void test07DiamanteNoReduceSuDurabilidadSiEsGolpeadoPorPicoPiedra() throws HerramientaDesgastadaExcepcion{
            TipoPiedra materialPiedra = new TipoPiedra();
            Herramienta pico = new Pico(materialPiedra);
            Recurso diamante =  new Diamante();
            pico.golpear(diamante);
            assertEquals(100, diamante.durabilidad());
        }
        // Golpe Pico de Metal
        @Test
        public void test08DiamanteNoReduceSuDurabilidadSiEsGolpeadoPorPicoMetal() throws HerramientaDesgastadaExcepcion{
            TipoMetal materialMetal = new TipoMetal();
            Herramienta pico = new Pico(materialMetal);
            Recurso diamante =  new Diamante();
            pico.golpear(diamante);
            assertEquals(100, diamante.durabilidad());
        }

        // GOLPES PICO FINO
        @Test
        public void test09DiamanteReduceSuDurabilidadEn20SiEsGolpeadoPorPicoFino() throws HerramientaDesgastadaExcepcion{
            TipoMetalYPiedra materialMetalYPiedra = new TipoMetalYPiedra();
            Herramienta pico = new PicoFino(materialMetalYPiedra);
            Recurso diamante =  new Diamante();
            pico.golpear(diamante);
            assertEquals(80, diamante.durabilidad());
        }
        
        @Test
        public void test10RecursoDiamanteAlLlegarACeroSuDurabilidadSeTransformaEnMateriaPrimaDiamante() {
        	Recurso diamante = new Diamante();
        	MateriaPrima mpDiamante = new MPDiamante();

        	diamante.reducirDurabilidadEn(100);
        	
        	assertEquals(mpDiamante, diamante.getCasillero().ocupante());
        }

        @Test
        public void test11ocupanteDiamanteDevuelveSuNombre(){
            Diamante diamante = new Diamante();
            String nombre = diamante.obtenerNombreOcupante();
            assertEquals("Diamante",nombre);

        }
    }
