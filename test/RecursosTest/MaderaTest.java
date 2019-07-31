package RecursosTest;
import Modelo.Excepciones.HerramientaDesgastadaExcepcion;
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
    public void test01MaderaSeCreaConDurabilidad10(){
        Recurso madera =  new Madera();
        assertEquals(10, madera.durabilidad());

    }

    // Madera reduce durabilidad
    @Test
    public void test02MaderaAlSerGolpeadoReduceSuDurabilidadEn4(){
        Recurso madera =  new Madera();
        madera.reducirDurabilidadEn(4);
        assertEquals(6, madera.durabilidad());
    }


    // GOLPES HACHA

    // Golpe hacha de madera
    @Test
    public void test04MaderaReduceSuDurabilidadEnDosSiEsGolpeadoPorHachaDeMadera() throws HerramientaDesgastadaExcepcion{
        TipoMadera materialMadera = new TipoMadera();
        Herramienta hacha = new Hacha(materialMadera);
        Recurso madera =  new Madera();
        hacha.golpear(madera);
        assertEquals(8, madera.durabilidad());
    }
    // Golpe hacha de Piedra
    @Test
    public void test05MaderaReduceSuDurabilidadEnCincoSiEsGolpeadoPorHachaDePiedra() throws HerramientaDesgastadaExcepcion{
        TipoPiedra materialPiedra = new TipoPiedra();
        Herramienta hacha = new Hacha(materialPiedra);
        Recurso madera =  new Madera();
        hacha.golpear(madera);
        assertEquals(5, madera.durabilidad());
    }
    // Golpe hacha de Metal
    @Test
    public void test06MaderaReduceSuDurabilidadEnDiezSiEsGolpeadoPorHachaDeMetal() throws HerramientaDesgastadaExcepcion{
        TipoMetal materialMetal = new TipoMetal();
        Herramienta hacha = new Hacha(materialMetal);
        Recurso madera =  new Madera();
        hacha.golpear(madera);
        assertEquals(0, madera.durabilidad());
    }

    // GOLPES PICO
    // Golpe Pico de Madera
    @Test
    public void test07MaderaNoReduceSuDurabilidadSiEsGolpeadoPorPicoMadera() throws HerramientaDesgastadaExcepcion{
        TipoMadera materialMadera = new TipoMadera();
        Herramienta pico = new Pico(materialMadera);
        Recurso madera =  new Madera();
        pico.golpear(madera);
        assertEquals(10, madera.durabilidad());
    }
    // Golpe Pico de Piedra
    @Test
    public void test08MaderaNoReduceSuDurabilidadSiEsGolpeadoPorPicoPiedra() throws HerramientaDesgastadaExcepcion{
        TipoPiedra materialPiedra = new TipoPiedra();
        Herramienta pico = new Pico(materialPiedra);
        Recurso madera =  new Madera();
        pico.golpear(madera);
        assertEquals(10, madera.durabilidad());
    }
    // Golpe Pico de Metal
    @Test
    public void test09MaderaNoReduceSuDurabilidadSiEsGolpeadoPorPicoMetal() throws HerramientaDesgastadaExcepcion{
        TipoMetal materialMetal = new TipoMetal();
        Herramienta pico = new Pico(materialMetal);
        Recurso madera =  new Madera();
        pico.golpear(madera);
        assertEquals(10, madera.durabilidad());
    }

    // GOLPES PICO FINO
    @Test
    public void test10MaderaNoReduceSuDurabilidadSiEsGolpeadoPorPicoFino() throws HerramientaDesgastadaExcepcion{
        TipoMetalYPiedra materialMetalYPiedra = new TipoMetalYPiedra();
        Herramienta pico = new PicoFino(materialMetalYPiedra);
        Recurso madera =  new Madera();
        pico.golpear(madera);
        assertEquals(10, madera.durabilidad());
    }
    
    @Test
    public void test11RecursoMaderaAlLlegarACeroSuDurabilidadSeTransformaEnMateriaPrimaMadera() {
        Recurso madera = new Madera();
        MateriaPrima mpMadera = new MPMadera();

        madera.reducirDurabilidadEn(10);

        assertEquals(mpMadera, madera.obtenerCasillero().ocupante());
    }

    @Test 
    public void test12ocupanteMaderaDevuelveSuNombre(){
        Madera madera = new Madera();
        String nombre = madera.obtenerNombreOcupante();
        assertEquals("Madera",nombre);
    }


}