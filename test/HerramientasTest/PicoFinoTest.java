package HerramientasTest;

import Modelo.Herramientas.*;
import Modelo.Recursos.*;
import Modelo.TipoMaterial.*;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PicoFinoTest {



        // PicoFino de Metal y Piedra Durabilidad
        @Test
        public void testHachaDeMaderaSeCreaConDurabilidadCorrespondiente(){
            TipoMaterial materialTest = new TipoMetalYPiedra();
            Herramienta picoFino = new PicoFino(materialTest);
            assertEquals(1000, picoFino.durabilidad());

        }
        // PicoFino de Metal y Piedra fuerza
        @Test
        public void testHachaDeMaderaSeCreaConFuerzaCorrespondiente(){
            TipoMaterial materialTest = new TipoMetalYPiedra();
            Herramienta picoFino = new PicoFino(materialTest);
            assertEquals(20, picoFino.fuerza());

        }


        // PICO FINO MADERA

        // Pico fino no reduce durabilidad contra madera
        @Test
        public void testPicoFinoSeUsaContraRecursoMaderaYNoSeReduceSuDurabilidad(){
            Madera recursoMadera = new Madera() ;
            TipoMaterial materialTest = new TipoMetalYPiedra();
            Herramienta picoFino = new PicoFino(materialTest);
            picoFino.golpear(recursoMadera);
            assertEquals(1000, picoFino.durabilidad());
        }
        // Pico fino no  reduce durabilidad contra Metal
        @Test
        public void testPicoFinoSeUsaContraRecursoMetalYSeReduceSuDurabilidad(){
            Piedra recursoPiedra = new Piedra() ;
            TipoMaterial materialTest = new TipoMetalYPiedra();
            Herramienta picoFino = new PicoFino(materialTest);
            picoFino.golpear(recursoPiedra);
            assertEquals(1000, picoFino.durabilidad());
        }
        // Pico fino no reduce durabilidad contra Piedra
        @Test
        public void testPicoFinoSeUsaContraRecursoPiedraYSeReduceSuDurabilidad(){
            Metal recursoMetal = new Metal() ;
            TipoMaterial materialTest = new TipoMetalYPiedra();
            Herramienta picoFino = new PicoFino(materialTest);
            picoFino.golpear(recursoMetal);
            assertEquals(1000, picoFino.durabilidad());
        }
        // Pico fino reduce durabilidad contra diamante
        @Test
        public void testPicoFinoSeUsaContraRecursoDiamanteYSeReduceSuDurabilidad(){
            Diamante recursoDiamante = new Diamante() ;
            TipoMaterial materialTest = new TipoMetalYPiedra();
            Herramienta picoFino = new PicoFino(materialTest);
            picoFino.golpear(recursoDiamante);
            assertEquals(1000-(int)(1000*0.1), picoFino.durabilidad());
        }


    }