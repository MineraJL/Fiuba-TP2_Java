package HerramientasTest;

import Herramientas.*;
import Recursos.*;
import TipoMaterial.*;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PicoTest {

    // Pico de madera Durabilidad
    @Test
    public void testPicoDeMaderaSeCreaConDurabilidadCorrespondiente(){
        TipoMadera materialMadera = new TipoMadera();
        Herramienta pico = new Pico(materialMadera);
        assertEquals(100, pico.durabilidad());

    }
    // Pico de madera fuerza
    @Test
    public void testPicoDeMaderaSeCreaConFuerzaCorrespondiente(){
        TipoMadera materialMadera = new TipoMadera();
        Herramienta pico = new Pico(materialMadera);
        assertEquals(2, pico.fuerza());

    }
    // Pico de Piedra Durabilidad
    @Test
    public void testPicoDePiedraSeCreaConDurabilidadCorrespondiente(){
        TipoPiedra materialPiedra = new TipoPiedra();
        Herramienta pico = new Pico(materialPiedra);
        assertEquals(200, pico.durabilidad());

    }
    // Pico de Piedra fuerza
    @Test
    public void testPicoDePiedraSeCreaConFuerzaCorrespondiente(){
        TipoPiedra materialPiedra = new TipoPiedra();
        Herramienta pico = new Pico(materialPiedra);
        assertEquals(4, pico.fuerza());

    }
    // Pico de Metal Durabilidad
    @Test
    public void testPicoDeMetalSeCreaConDurabilidadCorrespondiente(){
        TipoMetal materialMetal = new TipoMetal();
        Herramienta pico = new Pico(materialMetal);
        assertEquals(400, pico.durabilidad());

    }
    // Pico de Metal fuerza
    @Test
    public void testPicoDeMetalSeCreaConFuerzaCorrespondiente(){
        TipoMetal materialMetal = new TipoMetal();
        Herramienta pico = new Pico(materialMetal);
        assertEquals(12, pico.fuerza());

    }


    // PICO MADERA

    // Pico de Madera reduce durabilidad contra madera
    @Test
    public void testPicoDeMaderaSeUsaContraRecursoMaderaYSeReduceSuDurabilidad(){
        Madera recursoMadera = new Madera() ;
        TipoMadera materialMadera = new TipoMadera();
        Herramienta pico = new Pico(materialMadera);
        pico.golpear(recursoMadera);
        assertEquals(98, pico.durabilidad());
    }
    // Pico de Madera reduce durabilidad contra Metal
    @Test
    public void testPicoDeMaderaSeUsaContraRecursoMetalYSeReduceSuDurabilidad(){
        Piedra recursoPiedra = new Piedra() ;
        TipoMadera materialMadera = new TipoMadera();
        Herramienta pico = new Pico(materialMadera);
        pico.golpear(recursoPiedra);
        assertEquals(98, pico.durabilidad());
    }
    // Pico de Madera reduce durabilidad contra Piedra
    @Test
    public void testPicoDeMaderaSeUsaContraRecursoPiedraYSeReduceSuDurabilidad(){
        Metal recursoMetal = new Metal() ;
        TipoMadera materialMadera = new TipoMadera();
        Herramienta pico = new Pico(materialMadera);
        pico.golpear(recursoMetal);
        assertEquals(98, pico.durabilidad());
    }
    // Pico de Madera reduce durabilidad contra diamante
    @Test
    public void testPicoDeMaderaSeUsaContraRecursoDiamanteYSeReduceSuDurabilidad(){
        Diamante recursoDiamante = new Diamante() ;
        TipoMadera materialMadera = new TipoMadera();
        Herramienta pico = new Pico(materialMadera);
        pico.golpear(recursoDiamante);
        assertEquals(98, pico.durabilidad());
    }


    // Pico PIEDRA

    // Pico de Piedra reduce durabilidad contra Madera
    @Test
    public void testPicoDePiedraSeUsaContraRecursoMaderaYSeReduceSuDurabilidad(){
        Madera recursoMadera = new Madera() ;
        TipoPiedra materialPiedra = new TipoPiedra();
        Herramienta pico = new Pico(materialPiedra);
        pico.golpear(recursoMadera);
        assertEquals(198, pico.durabilidad());
    }
    // Pico de Piedra reduce durabilidad contra Piedra
    @Test
    public void testPicoDePiedraSeUsaContraRecursoPiedraYSeReduceSuDurabilidad(){
        Piedra recursoPiedra = new Piedra() ;
        TipoPiedra materialPiedra = new TipoPiedra();
        Herramienta pico = new Pico(materialPiedra);
        pico.golpear(recursoPiedra);
        assertEquals(198, pico.durabilidad());
    }
    // Pico de Piedra reduce durabilidad contra Metal
    @Test
    public void testPicoDePiedraSeUsaContraRecursoMetalYSeReduceSuDurabilidad(){
        Metal recursoMetal = new Metal() ;
        TipoPiedra materialPiedra = new TipoPiedra();
        Herramienta pico = new Pico(materialPiedra);
        pico.golpear(recursoMetal);
        assertEquals(198, pico.durabilidad());
    }
    // Pico de Piedra reduce durabilidad contra Diamante
    @Test
    public void testPicoDePiedraSeUsaContraRecursoDiamanteYSeReduceSuDurabilidad(){
        Diamante recursoDiamante = new Diamante() ;
        TipoPiedra materialPiedra = new TipoPiedra();
        Herramienta pico = new Pico(materialPiedra);
        pico.golpear(recursoDiamante);
        assertEquals(198, pico.durabilidad());
    }

    // PICO METAL

    // Pico de Metal no reduce durabilidad contra Madera
    @Test
    public void testPicoDeMetalSeUsaContraRecursoMaderaYNoSeReduceSuDurabilidad(){
        Madera recursoMadera = new Madera() ;
        TipoMetal materialMetal = new TipoMetal();
        Herramienta pico = new Pico(materialMetal);
        pico.golpear(recursoMadera);
        assertEquals(400, pico.durabilidad());
    }
    // Pico de Metal no reduce durabilidad contra Piedra
    @Test
    public void testPicoDeMetalSeUsaContraRecursoPiedraYNoSeReduceSuDurabilidad(){
        Piedra recursoPiedra = new Piedra() ;
        TipoMetal materialMetal = new TipoMetal();
        Herramienta pico = new Pico(materialMetal);
        pico.golpear(recursoPiedra);
        assertEquals(400, pico.durabilidad());
    }
    // Pico de Metal no reduce durabilidad contra Metal
    @Test
    public void testPicoDeMetalSeUsaContraRecursoMetalYNoSeReduceSuDurabilidad(){
        Metal recursoMetal = new Metal() ;
        TipoMetal materialMetal = new TipoMetal();
        Herramienta pico = new Pico(materialMetal);
        pico.golpear(recursoMetal);
        assertEquals(400, pico.durabilidad());
    }
    // Pico de Metal no reduce durabilidad contra Diamante
    @Test
    public void testPicoDeMetalSeUsaContraRecursoDiamanteYNoSeReduceSuDurabilidad(){
        Diamante recursoDiamante = new Diamante() ;
        TipoMetal materialMetal = new TipoMetal();
        Herramienta pico = new Pico(materialMetal);
        pico.golpear(recursoDiamante);
        assertEquals(400, pico.durabilidad());
    }
    // Pico de Metal reduce durabilidad contra Diamante
    @Test
    public void testPicoDeMetalSeGastaAlGolpeNumero10(){
        Diamante recursoDiamante = new Diamante() ;
        TipoMetal materialMetal = new TipoMetal();
        Herramienta pico = new Pico(materialMetal);
        for(int i=1; i<11; i++){
            pico.golpear(recursoDiamante);
        }
;
        assertEquals(0, pico.durabilidad());
    }

}
