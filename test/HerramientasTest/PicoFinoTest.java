package HerramientasTest;

import Modelo.Excepciones.HerramientaDesgastadaExcepcion;
import Modelo.Herramientas.*;
import Modelo.Recursos.*;
import Modelo.TipoMaterial.*;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PicoFinoTest {



        // PicoFino de Metal y Piedra Durabilidad
        @Test
        public void test01HachaDeMaderaSeCreaConDurabilidadCorrespondiente(){
            TipoMaterial materialTest = new TipoMetalYPiedra();
            Herramienta picoFino = new PicoFino(materialTest);
            assertEquals(1000, picoFino.durabilidad());

        }
        // PicoFino de Metal y Piedra fuerza
        @Test
        public void test02HachaDeMaderaSeCreaConFuerzaCorrespondiente(){
            TipoMaterial materialTest = new TipoMetalYPiedra();
            Herramienta picoFino = new PicoFino(materialTest);
            assertEquals(20, picoFino.fuerza());

        }


        // PICO FINO MADERA

        // Pico fino no reduce durabilidad contra madera
        @Test
        public void test03PicoFinoSeUsaContraRecursoMaderaYNoSeReduceSuDurabilidad() throws HerramientaDesgastadaExcepcion{
            Madera recursoMadera = new Madera() ;
            TipoMaterial materialTest = new TipoMetalYPiedra();
            Herramienta picoFino = new PicoFino(materialTest);
            picoFino.golpear(recursoMadera);
            assertEquals(1000, picoFino.durabilidad());
        }
        // Pico fino no  reduce durabilidad contra Metal
        @Test
        public void test04PicoFinoSeUsaContraRecursoMetalYSeReduceSuDurabilidad() throws HerramientaDesgastadaExcepcion{
            Piedra recursoPiedra = new Piedra() ;
            TipoMaterial materialTest = new TipoMetalYPiedra();
            Herramienta picoFino = new PicoFino(materialTest);
            picoFino.golpear(recursoPiedra);
            assertEquals(1000, picoFino.durabilidad());
        }
        // Pico fino no reduce durabilidad contra Piedra
        @Test
        public void test05PicoFinoSeUsaContraRecursoPiedraYSeReduceSuDurabilidad() throws HerramientaDesgastadaExcepcion{
            Metal recursoMetal = new Metal() ;
            TipoMaterial materialTest = new TipoMetalYPiedra();
            Herramienta picoFino = new PicoFino(materialTest);
            picoFino.golpear(recursoMetal);
            assertEquals(1000, picoFino.durabilidad());
        }
        // Pico fino reduce durabilidad contra diamante
        @Test
        public void test06PicoFinoSeUsaContraRecursoDiamanteYSeReduceSuDurabilidad() throws HerramientaDesgastadaExcepcion{
            Diamante recursoDiamante = new Diamante() ;
            TipoMaterial materialTest = new TipoMetalYPiedra();
            Herramienta picoFino = new PicoFino(materialTest);
            picoFino.golpear(recursoDiamante);
            assertEquals(1000-(int)(1000*0.1), picoFino.durabilidad());
        }
  /*
         @Test(expected = HerramientaDesgastadaExcepcion.class)
         public void test07PicoFinoSeUsaContraRecursoMaderaHastaAgotarSuDurabilidad() throws HerramientaDesgastadaExcepcion{
             Madera recursoMadera= new Madera() ;
             TipoMaterial materialTest = new TipoMetalYPiedra();
             Herramienta picoFino = new PicoFino(materialTest);
             
             while(true)
             	picoFino.golpear(recursoMadera);
         }
*/
    }