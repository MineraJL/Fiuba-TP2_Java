package RecursosTest;
import Modelo.Herramientas.*;
import Modelo.MateriaPrima.MPMetal;
import Modelo.MateriaPrima.MateriaPrima;
import Modelo.Recursos.*;
import Modelo.TipoMaterial.*;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;


public class MetalTest {


        // Metal Durabilidad
        @Test
        public void testMetalSeCreaConDurabilidad50(){
            Recurso metal =  new Metal();
            assertEquals(50, metal.durabilidad());

        }

        // Metal reduce durabilidad
        @Test
        public void testMetalAlSerGolpeadoReduceSuDurabilidadEn4(){
            Recurso metal =  new Metal();
            metal.reducirDurabilidadEn(4);
            assertEquals(46, metal.durabilidad());
        }


        // GOLPES HACHA

        // Golpe hacha de madera
        @Test
        public void testMetalNoReduceSuDurabilidadSiEsGolpeadoPorHachaDeMadera(){
            TipoMadera materialMadera = new TipoMadera();
            Herramienta hacha = new Hacha(materialMadera);
            Recurso metal =  new Metal();
            hacha.golpear(metal);
            assertEquals(50, metal.durabilidad());
        }
        // Golpe hacha de Piedra
        @Test
        public void testMetalNoReduceSuDurabilidadSiEsGolpeadoPorHachaDePiedra(){
            TipoPiedra materialPiedra = new TipoPiedra();
            Herramienta hacha = new Hacha(materialPiedra);
            Recurso metal =  new Metal();
            hacha.golpear(metal);
            assertEquals(50, metal.durabilidad());
        }
        // Golpe hacha de Metal
        @Test
        public void testMetalNoReduceSuDurabilidadSiEsGolpeadoPorHachaDeMetal(){
            TipoMetal materialMetal = new TipoMetal();
            Herramienta hacha = new Hacha(materialMetal);
            Recurso metal =  new Metal();
            hacha.golpear(metal);
            assertEquals(50, metal.durabilidad());
        }

        // GOLPES PICO
        // Golpe Pico de Madera
        @Test
        public void testMetalNoReduceSuDurabilidadSiEsGolpeadoPorPicoMadera(){
            TipoMadera materialMadera = new TipoMadera();
            Herramienta pico = new Pico(materialMadera);
            Recurso metal =  new Metal();
            pico.golpear(metal);
            assertEquals(50, metal.durabilidad());
        }
        // Golpe Pico de Piedra
        @Test
        public void testMetalReduceSuDurabilidadEn4SiEsGolpeadoPorPicoPiedra(){
            TipoPiedra materialPiedra = new TipoPiedra();
            Herramienta pico = new Pico(materialPiedra);
            Recurso metal =  new Metal();
            pico.golpear(metal);
            assertEquals(46, metal.durabilidad());
        }
        // Golpe Pico de Metal
        @Test
        public void testMetalNoReduceSuDurabilidadSiEsGolpeadoPorPicoMetal(){
            TipoMetal materialMetal = new TipoMetal();
            Herramienta pico = new Pico(materialMetal);
            Recurso metal =  new Metal();
            pico.golpear(metal);
            assertEquals(50, metal.durabilidad());
        }

        // GOLPES PICO FINO
        @Test
        public void testMetalNoReduceSuDurabilidadSiEsGolpeadoPorPicoFino(){
            TipoMetalYPiedra materialMetalYPiedra = new TipoMetalYPiedra();
            Herramienta pico = new PicoFino(materialMetalYPiedra);
            Recurso metal =  new Metal();
            pico.golpear(metal);
            assertEquals(50, metal.durabilidad());
        }
        
        @Test
        public void testRecursoMetalAlLlegarACeroSuDurabilidadSeTransformaEnMateriaPrimaMetal() {
        	Recurso metal = new Metal();
        	MateriaPrima mpMetal = new MPMetal();
        	
        	metal.reducirDurabilidadEn(50);
        	
        	assertEquals(mpMetal, metal.getCasillero().getOcupante());
        }
    }
