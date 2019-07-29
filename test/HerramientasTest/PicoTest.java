package HerramientasTest;

import Modelo.Excepciones.HerramientaDesgastadaExcepcion;
import Modelo.Herramientas.*;
import Modelo.Recursos.*;
import Modelo.TipoMaterial.*;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PicoTest {

    // Pico de madera Durabilidad
    @Test
    public void test01PicoDeMaderaSeCreaConDurabilidadCorrespondiente(){
        TipoMaterial materialMadera = new TipoMadera();
        Herramienta pico = new Pico(materialMadera);
        assertEquals(100, pico.durabilidad());

    }
    // Pico de madera fuerza
    @Test
    public void test02PicoDeMaderaSeCreaConFuerzaCorrespondiente(){
        TipoMaterial materialMadera = new TipoMadera();
        Herramienta pico = new Pico(materialMadera);
        assertEquals(2, pico.fuerza());

    }
    // Pico de Piedra Durabilidad
    @Test
    public void test03PicoDePiedraSeCreaConDurabilidadCorrespondiente(){
        TipoMaterial materialPiedra = new TipoPiedra();
        Herramienta pico = new Pico(materialPiedra);
        assertEquals(200, pico.durabilidad());

    }
    // Pico de Piedra fuerza
    @Test
    public void test04PicoDePiedraSeCreaConFuerzaCorrespondiente(){
        TipoMaterial materialPiedra = new TipoPiedra();
        Herramienta pico = new Pico(materialPiedra);
        assertEquals(4, pico.fuerza());

    }
    // Pico de Metal Durabilidad
    @Test
    public void test05PicoDeMetalSeCreaConDurabilidadCorrespondiente(){
        TipoMaterial materialMetal = new TipoMetal();
        Herramienta pico = new Pico(materialMetal);
        assertEquals(400, pico.durabilidad());

    }
    // Pico de Metal fuerza
    @Test
    public void test06PicoDeMetalSeCreaConFuerzaCorrespondiente(){
        TipoMaterial materialMetal = new TipoMetal();
        Herramienta pico = new Pico(materialMetal);
        assertEquals(12, pico.fuerza());

    }


    // PICO MADERA

    // Pico de Madera reduce durabilidad contra madera
    @Test
    public void test07PicoDeMaderaSeUsaContraRecursoMaderaYSeReduceSuDurabilidad() throws HerramientaDesgastadaExcepcion{
        Madera recursoMadera = new Madera() ;
        TipoMaterial materialMadera = new TipoMadera();
        Herramienta pico = new Pico(materialMadera);
        pico.golpear(recursoMadera);
        assertEquals(98, pico.durabilidad());
    }
    // Pico de Madera reduce durabilidad contra Metal
    @Test
    public void test08PicoDeMaderaSeUsaContraRecursoMetalYSeReduceSuDurabilidad() throws HerramientaDesgastadaExcepcion{
        Piedra recursoPiedra = new Piedra() ;
        TipoMaterial materialMadera = new TipoMadera();
        Herramienta pico = new Pico(materialMadera);
        pico.golpear(recursoPiedra);
        assertEquals(98, pico.durabilidad());
    }
    // Pico de Madera reduce durabilidad contra Piedra
    @Test
    public void test09PicoDeMaderaSeUsaContraRecursoPiedraYSeReduceSuDurabilidad() throws HerramientaDesgastadaExcepcion{
        Metal recursoMetal = new Metal() ;
        TipoMaterial materialMadera = new TipoMadera();
        Herramienta pico = new Pico(materialMadera);
        pico.golpear(recursoMetal);
        assertEquals(98, pico.durabilidad());
    }
    // Pico de Madera reduce durabilidad contra diamante
    @Test
    public void test10PicoDeMaderaSeUsaContraRecursoDiamanteYSeReduceSuDurabilidad() throws HerramientaDesgastadaExcepcion{
        Diamante recursoDiamante = new Diamante() ;
        TipoMaterial materialMadera = new TipoMadera();
        Herramienta pico = new Pico(materialMadera);
        pico.golpear(recursoDiamante);
        assertEquals(98, pico.durabilidad());
    }


    // Pico PIEDRA

    // Pico de Piedra reduce durabilidad contra Madera
    @Test
    public void test11PicoDePiedraSeUsaContraRecursoMaderaYSeReduceSuDurabilidad() throws HerramientaDesgastadaExcepcion{
        Madera recursoMadera = new Madera() ;
        TipoMaterial materialPiedra = new TipoPiedra();
        Herramienta pico = new Pico(materialPiedra);
        pico.golpear(recursoMadera);
        assertEquals(198, pico.durabilidad());
    }
    // Pico de Piedra reduce durabilidad contra Piedra
    @Test
    public void test12PicoDePiedraSeUsaContraRecursoPiedraYSeReduceSuDurabilidad() throws HerramientaDesgastadaExcepcion{
        Piedra recursoPiedra = new Piedra() ;
        TipoMaterial materialPiedra = new TipoPiedra();
        Herramienta pico = new Pico(materialPiedra);
        pico.golpear(recursoPiedra);
        assertEquals(198, pico.durabilidad());
    }
    // Pico de Piedra reduce durabilidad contra Metal
    @Test
    public void test13PicoDePiedraSeUsaContraRecursoMetalYSeReduceSuDurabilidad() throws HerramientaDesgastadaExcepcion{
        Metal recursoMetal = new Metal() ;
        TipoMaterial materialPiedra = new TipoPiedra();
        Herramienta pico = new Pico(materialPiedra);
        pico.golpear(recursoMetal);
        assertEquals(198, pico.durabilidad());
    }
    // Pico de Piedra reduce durabilidad contra Diamante
    @Test
    public void test14PicoDePiedraSeUsaContraRecursoDiamanteYSeReduceSuDurabilidad() throws HerramientaDesgastadaExcepcion{
        Diamante recursoDiamante = new Diamante() ;
        TipoMaterial materialPiedra = new TipoPiedra();
        Herramienta pico = new Pico(materialPiedra);
        pico.golpear(recursoDiamante);
        assertEquals(198, pico.durabilidad());
    }

    // PICO METAL

    // Pico de Metal no reduce durabilidad contra Madera
    @Test
    public void test15PicoDeMetalSeUsaContraRecursoMaderaYNoSeReduceSuDurabilidad() throws HerramientaDesgastadaExcepcion{
        Madera recursoMadera = new Madera() ;
        TipoMaterial materialMetal = new TipoMetal();
        Herramienta pico = new Pico(materialMetal);
        pico.golpear(recursoMadera);
        assertEquals(400, pico.durabilidad());
    }
    // Pico de Metal no reduce durabilidad contra Piedra
    @Test
    public void test16PicoDeMetalSeUsaContraRecursoPiedraYNoSeReduceSuDurabilidad() throws HerramientaDesgastadaExcepcion{
        Piedra recursoPiedra = new Piedra() ;
        TipoMaterial materialMetal = new TipoMetal();
        Herramienta pico = new Pico(materialMetal);
        pico.golpear(recursoPiedra);
        assertEquals(400, pico.durabilidad());
    }
    // Pico de Metal no reduce durabilidad contra Metal
    @Test
    public void test17PicoDeMetalSeUsaContraRecursoMetalYNoSeReduceSuDurabilidad() throws HerramientaDesgastadaExcepcion{
        Metal recursoMetal = new Metal() ;
        TipoMaterial materialMetal = new TipoMetal();
        Herramienta pico = new Pico(materialMetal);
        pico.golpear(recursoMetal);
        assertEquals(400, pico.durabilidad());
    }
    // Pico de Metal no reduce durabilidad contra Diamante
    @Test
    public void test18PicoDeMetalSeUsaContraRecursoDiamanteYNoSeReduceSuDurabilidad() throws HerramientaDesgastadaExcepcion{
        Diamante recursoDiamante = new Diamante() ;
        TipoMaterial materialMetal = new TipoMetal();
        Herramienta pico = new Pico(materialMetal);
        pico.golpear(recursoDiamante);
        assertEquals(400, pico.durabilidad());
    }
    // Pico de Metal reduce durabilidad contra Diamante
    @Test
    public void testPico19DeMetalSeGastaAlGolpeNumero10() throws HerramientaDesgastadaExcepcion{
        Diamante recursoDiamante = new Diamante() ;
        TipoMaterial materialMetal = new TipoMetal();
        Herramienta pico = new Pico(materialMetal);
        for(int i=1; i<11; i++){
            pico.golpear(recursoDiamante);
        }

        assertEquals(0, pico.durabilidad());
    }

    
    @Test(expected = HerramientaDesgastadaExcepcion.class)
    public void test20PicoDeMaderaSeUsaContraRecursoDiamanteHastaAgotarSuDurabilidad() throws HerramientaDesgastadaExcepcion{
        Diamante recursoDiamante = new Diamante() ;
        TipoMaterial material = new TipoMadera();
        Herramienta pico = new Pico(material);
        
        while(true)
        	pico.golpear(recursoDiamante);
    }
    
    @Test(expected = HerramientaDesgastadaExcepcion.class)
    public void test21PicoDePiedraSeUsaContraRecursoDiamanteHastaAgotarSuDurabilidad() throws HerramientaDesgastadaExcepcion{
        Diamante recursoDiamante = new Diamante() ;
        TipoMaterial material = new TipoPiedra();
        Herramienta pico = new Pico(material);
        
        while(true)
        	pico.golpear(recursoDiamante);
    }
   
    @Test(expected = HerramientaDesgastadaExcepcion.class)
    public void test22PicoDeMetalSeUsaContraRecursoDiamanteHastaAgotarSuDurabilidad() throws HerramientaDesgastadaExcepcion{
        Diamante recursoDiamante = new Diamante() ;
        TipoMaterial material = new TipoMetal();
        Herramienta pico = new Pico(material);
        
        while(true)
        	pico.golpear(recursoDiamante);
    }
}
