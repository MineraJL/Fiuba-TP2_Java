import Herramientas.Hacha;
import Herramientas.Pico;
import Herramientas.PicoFino;
import Materiales.Madera;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MaderaTest {

    @Test
    public void testMaderaSeCreaConLaDurabilidadIndicada(){
        Madera maderaTest =  new Madera(9);
        assertEquals(9, maderaTest.durabilidad());

    }

    @Test
    public void testMaderaReduceSuDurabilidadEn4(){
        Madera maderaTest =  new Madera(9);
        maderaTest.reducirDurabilidadEn(4);
        assertEquals(5, maderaTest.durabilidad());
    }


    @Test
    public void testMaderaNoReduceSuDurabilidadSiEsGolpeadoPorPico(){
        Pico pico = new Pico(4);
        Madera maderaTest =  new Madera(9);
        maderaTest.recibirGolpeDe(pico);
        assertEquals(9, maderaTest.durabilidad());
    }


    @Test
    public void testMaderaNoReduceSuDurabilidadSiEsGolpeadoPorPicoFino(){
        PicoFino picoFino = new PicoFino(4);
        Madera maderaTest =  new Madera(9);
        maderaTest.recibirGolpeDe(picoFino);
        assertEquals(9, maderaTest.durabilidad());
    }


    @Test
    public void testMaderaReduceSuDurabilidadSiEsGolpeadoPorHacha(){
        Hacha hacha = new Hacha(4);
        Madera maderaTest =  new Madera(9);
        maderaTest.recibirGolpeDe(hacha);
        assertEquals(5, maderaTest.durabilidad());
    }

}