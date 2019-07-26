package HerramientasTest;

import Modelo.Herramientas.*;
import Modelo.Recursos.*;
import Modelo.TipoMaterial.*;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PicoTest {

    // Pico de madera Durabilidad
    @Test
    public void testPicoDeMaderaSeCreaConDurabilidadCorrespondiente(){
        TipoMaterial materialMadera = new TipoMadera();
        Herramienta pico = new Pico(materialMadera);
        assertEquals(100, pico.durabilidad());

    }
    // Pico de madera fuerza
    @Test
    public void testPicoDeMaderaSeCreaConFuerzaCorrespondiente(){
        TipoMaterial materialMadera = new TipoMadera();
        Herramienta pico = new Pico(materialMadera);
        assertEquals(2, pico.fuerza());

    }
    // Pico de Piedra Durabilidad
    @Test
    public void testPicoDePiedraSeCreaConDurabilidadCorrespondiente(){
        TipoMaterial materialPiedra = new TipoPiedra();
        Herramienta pico = new Pico(materialPiedra);
        assertEquals(200, pico.durabilidad());

    }
    // Pico de Piedra fuerza
    @Test
    public void testPicoDePiedraSeCreaConFuerzaCorrespondiente(){
        TipoMaterial materialPiedra = new TipoPiedra();
        Herramienta pico = new Pico(materialPiedra);
        assertEquals(4, pico.fuerza());

    }
    // Pico de Metal Durabilidad
    @Test
    public void testPicoDeMetalSeCreaConDurabilidadCorrespondiente(){
        TipoMaterial materialMetal = new TipoMetal();
        Herramienta pico = new Pico(materialMetal);
        assertEquals(400, pico.durabilidad());

    }
    // Pico de Metal fuerza
    @Test
    public void testPicoDeMetalSeCreaConFuerzaCorrespondiente(){
        TipoMaterial materialMetal = new TipoMetal();
        Herramienta pico = new Pico(materialMetal);
        assertEquals(12, pico.fuerza());

    }


    // PICO MADERA

    // Pico de Madera reduce durabilidad contra madera
    @Test
    public void testPicoDeMaderaSeUsaContraRecursoMaderaYSeReduceSuDurabilidad(){
        Madera recursoMadera = new Madera() ;
        TipoMaterial materialMadera = new TipoMadera();
        Herramienta pico = new Pico(materialMadera);
        pico.golpear(recursoMadera);
        assertEquals(98, pico.durabilidad());
    }
    // Pico de Madera reduce durabilidad contra Metal
    @Test
    public void testPicoDeMaderaSeUsaContraRecursoMetalYSeReduceSuDurabilidad(){
        Piedra recursoPiedra = new Piedra() ;
        TipoMaterial materialMadera = new TipoMadera();
        Herramienta pico = new Pico(materialMadera);
        pico.golpear(recursoPiedra);
        assertEquals(98, pico.durabilidad());
    }
    // Pico de Madera reduce durabilidad contra Piedra
    @Test
    public void testPicoDeMaderaSeUsaContraRecursoPiedraYSeReduceSuDurabilidad(){
        Metal recursoMetal = new Metal() ;
        TipoMaterial materialMadera = new TipoMadera();
        Herramienta pico = new Pico(materialMadera);
        pico.golpear(recursoMetal);
        assertEquals(98, pico.durabilidad());
    }
    // Pico de Madera reduce durabilidad contra diamante
    @Test
    public void testPicoDeMaderaSeUsaContraRecursoDiamanteYSeReduceSuDurabilidad(){
        Diamante recursoDiamante = new Diamante() ;
        TipoMaterial materialMadera = new TipoMadera();
        Herramienta pico = new Pico(materialMadera);
        pico.golpear(recursoDiamante);
        assertEquals(98, pico.durabilidad());
    }


    // Pico PIEDRA

    // Pico de Piedra reduce durabilidad contra Madera
    @Test
    public void testPicoDePiedraSeUsaContraRecursoMaderaYSeReduceSuDurabilidad(){
        Madera recursoMadera = new Madera() ;
        TipoMaterial materialPiedra = new TipoPiedra();
        Herramienta pico = new Pico(materialPiedra);
        pico.golpear(recursoMadera);
        assertEquals(198, pico.durabilidad());
    }
    // Pico de Piedra reduce durabilidad contra Piedra
    @Test
    public void testPicoDePiedraSeUsaContraRecursoPiedraYSeReduceSuDurabilidad(){
        Piedra recursoPiedra = new Piedra() ;
        TipoMaterial materialPiedra = new TipoPiedra();
        Herramienta pico = new Pico(materialPiedra);
        pico.golpear(recursoPiedra);
        assertEquals(198, pico.durabilidad());
    }
    // Pico de Piedra reduce durabilidad contra Metal
    @Test
    public void testPicoDePiedraSeUsaContraRecursoMetalYSeReduceSuDurabilidad(){
        Metal recursoMetal = new Metal() ;
        TipoMaterial materialPiedra = new TipoPiedra();
        Herramienta pico = new Pico(materialPiedra);
        pico.golpear(recursoMetal);
        assertEquals(198, pico.durabilidad());
    }
    // Pico de Piedra reduce durabilidad contra Diamante
    @Test
    public void testPicoDePiedraSeUsaContraRecursoDiamanteYSeReduceSuDurabilidad(){
        Diamante recursoDiamante = new Diamante() ;
        TipoMaterial materialPiedra = new TipoPiedra();
        Herramienta pico = new Pico(materialPiedra);
        pico.golpear(recursoDiamante);
        assertEquals(198, pico.durabilidad());
    }

    // PICO METAL

    // Pico de Metal no reduce durabilidad contra Madera
    @Test
    public void testPicoDeMetalSeUsaContraRecursoMaderaYNoSeReduceSuDurabilidad(){
        Madera recursoMadera = new Madera() ;
        TipoMaterial materialMetal = new TipoMetal();
        Herramienta pico = new Pico(materialMetal);
        pico.golpear(recursoMadera);
        assertEquals(400, pico.durabilidad());
    }
    // Pico de Metal no reduce durabilidad contra Piedra
    @Test
    public void testPicoDeMetalSeUsaContraRecursoPiedraYNoSeReduceSuDurabilidad(){
        Piedra recursoPiedra = new Piedra() ;
        TipoMaterial materialMetal = new TipoMetal();
        Herramienta pico = new Pico(materialMetal);
        pico.golpear(recursoPiedra);
        assertEquals(400, pico.durabilidad());
    }
    // Pico de Metal no reduce durabilidad contra Metal
    @Test
    public void testPicoDeMetalSeUsaContraRecursoMetalYNoSeReduceSuDurabilidad(){
        Metal recursoMetal = new Metal() ;
        TipoMaterial materialMetal = new TipoMetal();
        Herramienta pico = new Pico(materialMetal);
        pico.golpear(recursoMetal);
        assertEquals(400, pico.durabilidad());
    }
    // Pico de Metal no reduce durabilidad contra Diamante
    @Test
    public void testPicoDeMetalSeUsaContraRecursoDiamanteYNoSeReduceSuDurabilidad(){
        Diamante recursoDiamante = new Diamante() ;
        TipoMaterial materialMetal = new TipoMetal();
        Herramienta pico = new Pico(materialMetal);
        pico.golpear(recursoDiamante);
        assertEquals(400, pico.durabilidad());
    }
    // Pico de Metal reduce durabilidad contra Diamante
    @Test
    public void testPicoDeMetalSeGastaAlGolpeNumero10(){
        Diamante recursoDiamante = new Diamante() ;
        TipoMaterial materialMetal = new TipoMetal();
        Herramienta pico = new Pico(materialMetal);
        for(int i=1; i<11; i++){
            pico.golpear(recursoDiamante);
        }

        assertEquals(0, pico.durabilidad());
    }

}
