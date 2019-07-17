package RecursosTest;
import Modelo.Herramientas.*;
import Modelo.MateriaPrima.MPMadera;
import Modelo.MateriaPrima.MateriaPrima;
import Modelo.Recursos.*;
import Modelo.TipoMaterial.*;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class MaderaTest {

    // Madera Durabilidad
    @Test
    public void testMaderaSeCreaConLaDurabilidadIndicada(){
        Recurso maderaTest =  new Madera();
        assertEquals(10, maderaTest.durabilidad());

    }

    // Madera reduce durabilidad
    @Test
    public void testMaderaReduceSuDurabilidadEn4(){
        Recurso maderaTest =  new Madera();
        maderaTest.reducirDurabilidadEn(4);
        assertEquals(6, maderaTest.durabilidad());
    }

    //Igualdad
    @Test
    public void testUnaMaderaEsIgualAOtraMadera(){
        Madera unaMadera =  new Madera();
        Madera otraMadera =  new Madera();
        assertEquals(unaMadera, otraMadera);
    }


    // GOLPES HACHA

    // Golpe hacha de madera
    @Test
    public void testMaderaReduceSuDurabilidadEnDosSiEsGolpeadoPorHachaDeMadera(){
        TipoMadera materialMadera = new TipoMadera();
        Herramienta hacha = new Hacha(materialMadera);
        Recurso maderaTest =  new Madera();
        hacha.golpear(maderaTest);
        assertEquals(8, maderaTest.durabilidad());
    }
    // Golpe hacha de Piedra
    @Test
    public void testMaderaReduceSuDurabilidadEnDosSiEsGolpeadoPorHachaDePiedra(){
        TipoPiedra materialPiedra = new TipoPiedra();
        Herramienta hacha = new Hacha(materialPiedra);
        Recurso maderaTest =  new Madera();
        hacha.golpear(maderaTest);
        assertEquals(5, maderaTest.durabilidad());
    }
    // Golpe hacha de Metal
    @Test
    public void testMaderaReduceSuDurabilidadEnDosSiEsGolpeadoPorHachaDeMetal(){
        TipoMetal materialMetal = new TipoMetal();
        Herramienta hacha = new Hacha(materialMetal);
        Recurso maderaTest =  new Madera();
        hacha.golpear(maderaTest);
        assertEquals(0, maderaTest.durabilidad());
    }

    // GOLPES PICO
    // Golpe Pico de Madera
    @Test
    public void testMaderaNoReduceSuDurabilidadSiEsGolpeadoPorPicoMadera(){
        TipoMadera materialMadera = new TipoMadera();
        Herramienta pico = new Pico(materialMadera);
        Recurso maderaTest =  new Madera();
        pico.golpear(maderaTest);
        assertEquals(10, maderaTest.durabilidad());
    }
    // Golpe Pico de Piedra
    @Test
    public void testMaderaNoReduceSuDurabilidadSiEsGolpeadoPorPicoPiedra(){
        TipoPiedra materialPiedra = new TipoPiedra();
        Herramienta pico = new Pico(materialPiedra);
        Recurso maderaTest =  new Madera();
        pico.golpear(maderaTest);
        assertEquals(10, maderaTest.durabilidad());
    }
    // Golpe Pico de Metal
    @Test
    public void testMaderaNoReduceSuDurabilidadSiEsGolpeadoPorPicoMetal(){
        TipoMetal materialMetal = new TipoMetal();
        Herramienta pico = new Pico(materialMetal);
        Recurso maderaTest =  new Madera();
        pico.golpear(maderaTest);
        assertEquals(10, maderaTest.durabilidad());
    }

    // GOLPES PICO FINO
    @Test
    public void testMaderaNoReduceSuDurabilidadSiEsGolpeadoPorPicoFino(){
        TipoMetalYPiedra materialMetalYPiedra = new TipoMetalYPiedra();
        Herramienta pico = new PicoFino(materialMetalYPiedra);
        Recurso maderaTest =  new Madera();
        pico.golpear(maderaTest);
        assertEquals(10, maderaTest.durabilidad());
    }
    
    @Test
    public void testRecursoMaderaSeTransformaEnMateriaPrimaMadera() {
        	Recurso madera = new Madera();
        	MateriaPrima mpMadera = new MPMadera();
        	
        	while (madera.durabilidad() > 0)
        		madera.reducirDurabilidadEn(7);
        	
        	assertEquals(mpMadera, madera.getCasillero().getItem());
        }
}