package HerramientasTest;

import Herramientas.*;
import Recursos.*;
import TipoMaterial.*;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class HachaTest {

    // Hacha de madera Durabilidad
    @Test
    public void testHachaDeMaderaSeCreaConDurabilidadCorrespondiente(){
        TipoMaterial materialMadera = new TipoMadera();
        Herramienta hacha = new Hacha(materialMadera);
        assertEquals(100, hacha.durabilidad());

    }
    // Hacha de madera fuerza
    @Test
    public void testHachaDeMaderaSeCreaConFuerzaCorrespondiente(){
        TipoMaterial materialMadera = new TipoMadera();
        Herramienta hacha = new Hacha(materialMadera);
        assertEquals(2, hacha.fuerza());

    }
    // Hacha de Piedra Durabilidad
    @Test
    public void testHachaDePiedraSeCreaConDurabilidadCorrespondiente(){
        TipoMaterial materialPiedra = new TipoPiedra();
        Herramienta hacha = new Hacha(materialPiedra);
        assertEquals(200, hacha.durabilidad());

    }
    // Hacha de Piedra fuerza
    @Test
    public void testHachaDePiedraSeCreaConFuerzaCorrespondiente(){
        TipoMaterial materialPiedra = new TipoPiedra();
        Herramienta hacha = new Hacha(materialPiedra);
        assertEquals(5, hacha.fuerza());

    }
    // Hacha de Metal Durabilidad
    @Test
    public void testHachaDeMetalSeCreaConDurabilidadCorrespondiente(){
        TipoMaterial materialMetal = new TipoMetal();
        Herramienta hacha = new Hacha(materialMetal);
        assertEquals(400, hacha.durabilidad());

    }
    // Hacha de Metal fuerza
    @Test
    public void testHachaDeMetalSeCreaConFuerzaCorrespondiente(){
        TipoMaterial materialMetal = new TipoMetal();
        Herramienta hacha = new Hacha(materialMetal);
        assertEquals(10, hacha.fuerza());

    }


    // HACHA MADERA

    // Hacha de Madera reduce durabilidad contra madera
    @Test
    public void testHachaDeMaderaSeUsaContraRecursoMaderaYSeReduceSuDurabilidad(){
        Madera recursoMadera = new Madera();
        TipoMaterial materialMadera = new TipoMadera();
        Herramienta hacha = new Hacha(materialMadera);
        hacha.golpear(recursoMadera);
        assertEquals(98, hacha.durabilidad());
    }
    // Hacha de Madera reduce durabilidad contra Metal
    @Test
    public void testHachaDeMaderaSeUsaContraRecursoMetalYSeReduceSuDurabilidad(){
        Piedra recursoPiedra = new Piedra() ;
        TipoMaterial materialMadera = new TipoMadera();
        Herramienta hacha = new Hacha(materialMadera);
        hacha.golpear(recursoPiedra);
        assertEquals(98, hacha.durabilidad());
    }
    // Hacha de Madera reduce durabilidad contra Piedra
    @Test
    public void testHachaDeMaderaSeUsaContraRecursoPiedraYSeReduceSuDurabilidad(){
        Metal recursoMetal = new Metal() ;
        TipoMaterial materialMadera = new TipoMadera();
        Herramienta hacha = new Hacha(materialMadera);
        hacha.golpear(recursoMetal);
        assertEquals(98, hacha.durabilidad());
    }
    // Hacha de Madera reduce durabilidad contra diamante
    @Test
    public void testHachaDeMaderaSeUsaContraRecursoDiamanteYSeReduceSuDurabilidad(){
        Diamante recursoDiamante = new Diamante() ;
        TipoMaterial materialMadera = new TipoMadera();
        Herramienta hacha = new Hacha(materialMadera);
        hacha.golpear(recursoDiamante);
        assertEquals(98, hacha.durabilidad());
    }


    // HACHA PIEDRA

    // Hacha de Piedra reduce durabilidad contra Madera
    @Test
    public void testHachaDePiedraSeUsaContraRecursoMaderaYSeReduceSuDurabilidad(){
        Madera recursoMadera = new Madera() ;
        TipoMaterial materialPiedra = new TipoPiedra();
        Herramienta hacha = new Hacha(materialPiedra);
        hacha.golpear(recursoMadera);
        assertEquals(195, hacha.durabilidad());
    }
    // Hacha de Piedra reduce durabilidad contra Piedra
    @Test
    public void testHachaDePiedraSeUsaContraRecursoPiedraYSeReduceSuDurabilidad(){
        Piedra recursoPiedra = new Piedra() ;
        TipoMaterial materialPiedra = new TipoPiedra();
        Herramienta hacha = new Hacha(materialPiedra);
        hacha.golpear(recursoPiedra);
        assertEquals(195, hacha.durabilidad());
    }
    // Hacha de Piedra reduce durabilidad contra Metal
    @Test
    public void testHachaDePiedraSeUsaContraRecursoMetalYSeReduceSuDurabilidad(){
        Metal recursoMetal = new Metal() ;
        TipoMaterial materialPiedra = new TipoPiedra();
        Herramienta hacha = new Hacha(materialPiedra);
        hacha.golpear(recursoMetal);
        assertEquals(195, hacha.durabilidad());
    }
    // Hacha de Piedra reduce durabilidad contra Diamante
    @Test
    public void testHachaDePiedraSeUsaContraRecursoDiamanteYSeReduceSuDurabilidad(){
        Diamante recursoDiamante = new Diamante() ;
        TipoMaterial materialPiedra = new TipoPiedra();
        Herramienta hacha = new Hacha(materialPiedra);
        hacha.golpear(recursoDiamante);
        assertEquals(195, hacha.durabilidad());
    }

    // HACHA METAL

    // Hacha de Metal reduce durabilidad contra Madera
    @Test
    public void testHachaDeMetalSeUsaContraRecursoMaderaYSeReduceSuDurabilidad(){
        Madera recursoMadera = new Madera() ;
        TipoMaterial materialMetal = new TipoMetal();
        Herramienta hacha = new Hacha(materialMetal);
        hacha.golpear(recursoMadera);
        assertEquals(395, hacha.durabilidad());
    }
    // Hacha de Metal reduce durabilidad contra Piedra
    @Test
    public void testHachaDeMetalSeUsaContraRecursoPiedraYSeReduceSuDurabilidad(){
        Piedra recursoPiedra = new Piedra() ;
        TipoMaterial materialMetal = new TipoMetal();
        Herramienta hacha = new Hacha(materialMetal);
        hacha.golpear(recursoPiedra);
        assertEquals(395, hacha.durabilidad());
    }
    // Hacha de Metal reduce durabilidad contra Metal
    @Test
    public void testHachaDeMetalSeUsaContraRecursoMetalYSeReduceSuDurabilidad(){
        Metal recursoMetal = new Metal() ;
        TipoMaterial materialMetal = new TipoMetal();
        Herramienta hacha = new Hacha(materialMetal);
        hacha.golpear(recursoMetal);
        assertEquals(395, hacha.durabilidad());
    }
    // Hacha de Metal reduce durabilidad contra Diamante
    @Test
    public void testHachaDeMetalSeUsaContraRecursoDiamanteYSeReduceSuDurabilidad(){
        Diamante recursoDiamante = new Diamante() ;
        TipoMaterial materialMetal = new TipoMetal();
        Herramienta hacha = new Hacha(materialMetal);
        hacha.golpear(recursoDiamante);
        assertEquals(395, hacha.durabilidad());
    }

}
