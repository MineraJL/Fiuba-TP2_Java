package HerramientasTest;

import Modelo.Excepciones.HerramientaDesgastadaExcepcion;
import Modelo.Herramientas.*;
import Modelo.Recursos.*;
import Modelo.TipoMaterial.*;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class HachaTest {

    // Hacha de madera Durabilidad
    @Test
    public void test01HachaDeMaderaSeCreaConDurabilidadCorrespondiente(){
        TipoMaterial materialMadera = new TipoMadera();
        Herramienta hacha = new Hacha(materialMadera);
        assertEquals(100, hacha.durabilidad());

    }
    // Hacha de madera fuerza
    @Test
    public void test02HachaDeMaderaSeCreaConFuerzaCorrespondiente(){
        TipoMaterial materialMadera = new TipoMadera();
        Herramienta hacha = new Hacha(materialMadera);
        assertEquals(2, hacha.fuerza());

    }
    // Hacha de Piedra Durabilidad
    @Test
    public void test03HachaDePiedraSeCreaConDurabilidadCorrespondiente(){
        TipoMaterial materialPiedra = new TipoPiedra();
        Herramienta hacha = new Hacha(materialPiedra);
        assertEquals(200, hacha.durabilidad());

    }
    // Hacha de Piedra fuerza
    @Test
    public void test04HachaDePiedraSeCreaConFuerzaCorrespondiente(){
        TipoMaterial materialPiedra = new TipoPiedra();
        Herramienta hacha = new Hacha(materialPiedra);
        assertEquals(5, hacha.fuerza());

    }
    // Hacha de Metal Durabilidad
    @Test
    public void test05HachaDeMetalSeCreaConDurabilidadCorrespondiente(){
        TipoMaterial materialMetal = new TipoMetal();
        Herramienta hacha = new Hacha(materialMetal);
        assertEquals(400, hacha.durabilidad());

    }
    // Hacha de Metal fuerza
    @Test
    public void test06HachaDeMetalSeCreaConFuerzaCorrespondiente(){
        TipoMaterial materialMetal = new TipoMetal();
        Herramienta hacha = new Hacha(materialMetal);
        assertEquals(10, hacha.fuerza());

    }


    // HACHA MADERA

    // Hacha de Madera reduce durabilidad contra madera
    @Test
    public void test07HachaDeMaderaSeUsaContraRecursoMaderaYSeReduceSuDurabilidad() throws HerramientaDesgastadaExcepcion{
        Madera recursoMadera = new Madera();
        TipoMaterial materialMadera = new TipoMadera();
        Herramienta hacha = new Hacha(materialMadera);
        hacha.golpear(recursoMadera);
        assertEquals(98, hacha.durabilidad());
    }
    // Hacha de Madera reduce durabilidad contra Metal
    @Test
    public void test08HachaDeMaderaSeUsaContraRecursoMetalYSeReduceSuDurabilidad() throws HerramientaDesgastadaExcepcion{
        Piedra recursoPiedra = new Piedra() ;
        TipoMaterial materialMadera = new TipoMadera();
        Herramienta hacha = new Hacha(materialMadera);
        hacha.golpear(recursoPiedra);
        assertEquals(98, hacha.durabilidad());
    }
    // Hacha de Madera reduce durabilidad contra Piedra
    @Test
    public void test09HachaDeMaderaSeUsaContraRecursoPiedraYSeReduceSuDurabilidad() throws HerramientaDesgastadaExcepcion{
        Metal recursoMetal = new Metal() ;
        TipoMaterial materialMadera = new TipoMadera();
        Herramienta hacha = new Hacha(materialMadera);
        hacha.golpear(recursoMetal);
        assertEquals(98, hacha.durabilidad());
    }
    // Hacha de Madera reduce durabilidad contra diamante
    @Test
    public void test10HachaDeMaderaSeUsaContraRecursoDiamanteYSeReduceSuDurabilidad() throws HerramientaDesgastadaExcepcion{
        Diamante recursoDiamante = new Diamante() ;
        TipoMaterial materialMadera = new TipoMadera();
        Herramienta hacha = new Hacha(materialMadera);
        hacha.golpear(recursoDiamante);
        assertEquals(98, hacha.durabilidad());
    }


    // HACHA PIEDRA

    // Hacha de Piedra reduce durabilidad contra Madera
    @Test
    public void test11HachaDePiedraSeUsaContraRecursoMaderaYSeReduceSuDurabilidad() throws HerramientaDesgastadaExcepcion{
        Madera recursoMadera = new Madera() ;
        TipoMaterial materialPiedra = new TipoPiedra();
        Herramienta hacha = new Hacha(materialPiedra);
        hacha.golpear(recursoMadera);
        assertEquals(195, hacha.durabilidad());
    }
    // Hacha de Piedra reduce durabilidad contra Piedra
    @Test
    public void test12HachaDePiedraSeUsaContraRecursoPiedraYSeReduceSuDurabilidad() throws HerramientaDesgastadaExcepcion{
        Piedra recursoPiedra = new Piedra() ;
        TipoMaterial materialPiedra = new TipoPiedra();
        Herramienta hacha = new Hacha(materialPiedra);
        hacha.golpear(recursoPiedra);
        assertEquals(195, hacha.durabilidad());
    }
    // Hacha de Piedra reduce durabilidad contra Metal
    @Test
    public void test13HachaDePiedraSeUsaContraRecursoMetalYSeReduceSuDurabilidad() throws HerramientaDesgastadaExcepcion{
        Metal recursoMetal = new Metal() ;
        TipoMaterial materialPiedra = new TipoPiedra();
        Herramienta hacha = new Hacha(materialPiedra);
        hacha.golpear(recursoMetal);
        assertEquals(195, hacha.durabilidad());
    }
    // Hacha de Piedra reduce durabilidad contra Diamante
    @Test
    public void test14HachaDePiedraSeUsaContraRecursoDiamanteYSeReduceSuDurabilidad() throws HerramientaDesgastadaExcepcion{
        Diamante recursoDiamante = new Diamante() ;
        TipoMaterial materialPiedra = new TipoPiedra();
        Herramienta hacha = new Hacha(materialPiedra);
        hacha.golpear(recursoDiamante);
        assertEquals(195, hacha.durabilidad());
    }

    // HACHA METAL

    // Hacha de Metal reduce durabilidad contra Madera
    @Test
    public void test15HachaDeMetalSeUsaContraRecursoMaderaYSeReduceSuDurabilidad() throws HerramientaDesgastadaExcepcion{
        Madera recursoMadera = new Madera() ;
        TipoMaterial materialMetal = new TipoMetal();
        Herramienta hacha = new Hacha(materialMetal);
        hacha.golpear(recursoMadera);
        assertEquals(395, hacha.durabilidad());
    }
    // Hacha de Metal reduce durabilidad contra Piedra
    @Test
    public void test16HachaDeMetalSeUsaContraRecursoPiedraYSeReduceSuDurabilidad() throws HerramientaDesgastadaExcepcion{
        Piedra recursoPiedra = new Piedra() ;
        TipoMaterial materialMetal = new TipoMetal();
        Herramienta hacha = new Hacha(materialMetal);
        hacha.golpear(recursoPiedra);
        assertEquals(395, hacha.durabilidad());
    }
    // Hacha de Metal reduce durabilidad contra Metal
    @Test
    public void test17HachaDeMetalSeUsaContraRecursoMetalYSeReduceSuDurabilidad() throws HerramientaDesgastadaExcepcion{
        Metal recursoMetal = new Metal() ;
        TipoMaterial materialMetal = new TipoMetal();
        Herramienta hacha = new Hacha(materialMetal);
        hacha.golpear(recursoMetal);
        assertEquals(395, hacha.durabilidad());
    }
    // Hacha de Metal reduce durabilidad contra Diamante
    @Test
    public void test18HachaDeMetalSeUsaContraRecursoDiamanteYSeReduceSuDurabilidad() throws HerramientaDesgastadaExcepcion{
        Diamante recursoDiamante = new Diamante() ;
        TipoMaterial materialMetal = new TipoMetal();
        Herramienta hacha = new Hacha(materialMetal);
        hacha.golpear(recursoDiamante);
        assertEquals(395, hacha.durabilidad());
    }
    
    @Test(expected = HerramientaDesgastadaExcepcion.class)
    public void test19HachaDeMedareaSeUsaContraRecursoDiamanteHastaAgotarSuDurabilidad() throws HerramientaDesgastadaExcepcion{
        Diamante recursoDiamante = new Diamante() ;
        TipoMaterial material = new TipoMadera();
        Herramienta hacha = new Hacha(material);
        
        while(true)
        	hacha.golpear(recursoDiamante);
    }
    
    @Test(expected = HerramientaDesgastadaExcepcion.class)
    public void test20HachaDePiedraSeUsaContraRecursoDiamanteHastaAgotarSuDurabilidad() throws HerramientaDesgastadaExcepcion{
        Diamante recursoDiamante = new Diamante() ;
        TipoMaterial material = new TipoPiedra();
        Herramienta hacha = new Hacha(material);
        
        while(true)
        	hacha.golpear(recursoDiamante);
    }
    
    @Test(expected = HerramientaDesgastadaExcepcion.class)
    public void test21HachaDeMetalSeUsaContraRecursoDiamanteHastaAgotarSuDurabilidad() throws HerramientaDesgastadaExcepcion{
        Diamante recursoDiamante = new Diamante() ;
        TipoMaterial material = new TipoMetal();
        Herramienta hacha = new Hacha(material);
        
        while(true)
        	hacha.golpear(recursoDiamante);
    }

}
