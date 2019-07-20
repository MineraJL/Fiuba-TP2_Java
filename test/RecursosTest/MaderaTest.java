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
    public void testMaderaSeCreaConDurabilidad10(){
        Recurso madera =  new Madera();
        assertEquals(10, madera.durabilidad());

    }

    // Madera reduce durabilidad
    @Test
    public void testMaderaAlSerGolpeadoReduceSuDurabilidadEn4(){
        Recurso madera =  new Madera();
        madera.serGolpeadoCon(4);
        assertEquals(6, madera.durabilidad());
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
        Recurso madera =  new Madera();
        hacha.golpear(madera);
        assertEquals(8, madera.durabilidad());
    }
    // Golpe hacha de Piedra
    @Test
    public void testMaderaReduceSuDurabilidadEnCincoSiEsGolpeadoPorHachaDePiedra(){
        TipoPiedra materialPiedra = new TipoPiedra();
        Herramienta hacha = new Hacha(materialPiedra);
        Recurso madera =  new Madera();
        hacha.golpear(madera);
        assertEquals(5, madera.durabilidad());
    }
    // Golpe hacha de Metal
    @Test
    public void testMaderaReduceSuDurabilidadEnDiezSiEsGolpeadoPorHachaDeMetal(){
        TipoMetal materialMetal = new TipoMetal();
        Herramienta hacha = new Hacha(materialMetal);
        Recurso madera =  new Madera();
        hacha.golpear(madera);
        assertEquals(0, madera.durabilidad());
    }

    // GOLPES PICO
    // Golpe Pico de Madera
    @Test
    public void testMaderaNoReduceSuDurabilidadSiEsGolpeadoPorPicoMadera(){
        TipoMadera materialMadera = new TipoMadera();
        Herramienta pico = new Pico(materialMadera);
        Recurso madera =  new Madera();
        pico.golpear(madera);
        assertEquals(10, madera.durabilidad());
    }
    // Golpe Pico de Piedra
    @Test
    public void testMaderaNoReduceSuDurabilidadSiEsGolpeadoPorPicoPiedra(){
        TipoPiedra materialPiedra = new TipoPiedra();
        Herramienta pico = new Pico(materialPiedra);
        Recurso madera =  new Madera();
        pico.golpear(madera);
        assertEquals(10, madera.durabilidad());
    }
    // Golpe Pico de Metal
    @Test
    public void testMaderaNoReduceSuDurabilidadSiEsGolpeadoPorPicoMetal(){
        TipoMetal materialMetal = new TipoMetal();
        Herramienta pico = new Pico(materialMetal);
        Recurso madera =  new Madera();
        pico.golpear(madera);
        assertEquals(10, madera.durabilidad());
    }

    // GOLPES PICO FINO
    @Test
    public void testMaderaNoReduceSuDurabilidadSiEsGolpeadoPorPicoFino(){
        TipoMetalYPiedra materialMetalYPiedra = new TipoMetalYPiedra();
        Herramienta pico = new PicoFino(materialMetalYPiedra);
        Recurso madera =  new Madera();
        pico.golpear(madera);
        assertEquals(10, madera.durabilidad());
    }
    
    @Test
    public void testRecursoMaderaAlLlegarACeroSuDurabilidadSeTransformaEnMateriaPrimaMadera() {
        Recurso madera = new Madera();
        MateriaPrima mpMadera = new MPMadera();

        madera.serGolpeadoCon(10);

        assertEquals(mpMadera, madera.getCasillero().getOcupante());
    }


}