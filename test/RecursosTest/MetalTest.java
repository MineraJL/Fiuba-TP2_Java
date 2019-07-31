package RecursosTest;
import Modelo.Excepciones.HerramientaDesgastadaExcepcion;
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
        public void test01MetalSeCreaConDurabilidad50(){
            Recurso metal =  new Metal();
            assertEquals(50, metal.durabilidad());

        }

        // Metal reduce durabilidad
        @Test
        public void test02MetalAlSerGolpeadoReduceSuDurabilidadEn4(){
            Recurso metal =  new Metal();
            metal.reducirDurabilidadEn(4);
            assertEquals(46, metal.durabilidad());
        }


        // GOLPES HACHA

        // Golpe hacha de madera
        @Test
        public void test03MetalNoReduceSuDurabilidadSiEsGolpeadoPorHachaDeMadera() throws HerramientaDesgastadaExcepcion{
            TipoMadera materialMadera = new TipoMadera();
            Herramienta hacha = new Hacha(materialMadera);
            Recurso metal =  new Metal();
            hacha.golpear(metal);
            assertEquals(50, metal.durabilidad());
        }
        // Golpe hacha de Piedra
        @Test
        public void test04MetalNoReduceSuDurabilidadSiEsGolpeadoPorHachaDePiedra() throws HerramientaDesgastadaExcepcion{
            TipoPiedra materialPiedra = new TipoPiedra();
            Herramienta hacha = new Hacha(materialPiedra);
            Recurso metal =  new Metal();
            hacha.golpear(metal);
            assertEquals(50, metal.durabilidad());
        }
        // Golpe hacha de Metal
        @Test
        public void test05MetalNoReduceSuDurabilidadSiEsGolpeadoPorHachaDeMetal() throws HerramientaDesgastadaExcepcion{
            TipoMetal materialMetal = new TipoMetal();
            Herramienta hacha = new Hacha(materialMetal);
            Recurso metal =  new Metal();
            hacha.golpear(metal);
            assertEquals(50, metal.durabilidad());
        }

        // GOLPES PICO
        // Golpe Pico de Madera
        @Test
        public void test06MetalNoReduceSuDurabilidadSiEsGolpeadoPorPicoMadera() throws HerramientaDesgastadaExcepcion{
            TipoMadera materialMadera = new TipoMadera();
            Herramienta pico = new Pico(materialMadera);
            Recurso metal =  new Metal();
            pico.golpear(metal);
            assertEquals(50, metal.durabilidad());
        }
        // Golpe Pico de Piedra
        @Test
        public void test07MetalReduceSuDurabilidadEn4SiEsGolpeadoPorPicoPiedra() throws HerramientaDesgastadaExcepcion{
            TipoPiedra materialPiedra = new TipoPiedra();
            Herramienta pico = new Pico(materialPiedra);
            Recurso metal =  new Metal();
            pico.golpear(metal);
            assertEquals(46, metal.durabilidad());
        }
        // Golpe Pico de Metal
        @Test
        public void test08MetalNoReduceSuDurabilidadSiEsGolpeadoPorPicoMetal() throws HerramientaDesgastadaExcepcion{
            TipoMetal materialMetal = new TipoMetal();
            Herramienta pico = new Pico(materialMetal);
            Recurso metal =  new Metal();
            pico.golpear(metal);
            assertEquals(50, metal.durabilidad());
        }

        // GOLPES PICO FINO
        @Test
        public void test09MetalNoReduceSuDurabilidadSiEsGolpeadoPorPicoFino() throws HerramientaDesgastadaExcepcion{
            TipoMetalYPiedra materialMetalYPiedra = new TipoMetalYPiedra();
            Herramienta pico = new PicoFino(materialMetalYPiedra);
            Recurso metal =  new Metal();
            pico.golpear(metal);
            assertEquals(50, metal.durabilidad());
        }

        @Test
        public void test10RecursoMetalAlLlegarACeroSuDurabilidadSeTransformaEnMateriaPrimaMetal() {
        	Recurso metal = new Metal();
        	MateriaPrima mpMetal = new MPMetal();

        	metal.reducirDurabilidadEn(50);

        	assertEquals(mpMetal, metal.obtenerCasillero().ocupante());
        }

        @Test
        public void test11ocupanteMaderaDevuelveSuNombre(){
            Metal metal = new Metal();
            String nombre = metal.obtenerNombreOcupante();
            assertEquals("Metal",nombre);
        }
        
        
    }
