import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PiedraTest {
    @Test
    public void testPiedraSeCreaConLaDurabilidadIndicada(){
        Piedra piedraTest =  new Piedra(9);
        assertEquals(9, piedraTest.durabilidad());

    }

    @Test
    public void testPiedraReduceSuDurabilidadEn4(){
        Piedra piedraTest =  new Piedra(9);
        piedraTest.reducirDurabilidadEn(4);
        assertEquals(5, piedraTest.durabilidad());
    }


    @Test
    public void testPiedraReduceSuDurabilidadSiEsGolpeadoPorPico(){
        Pico pico = new Pico(4);
        Piedra piedraTest =  new Piedra(9);
        piedraTest.recibirGolpeDe(pico);
        assertEquals(5, piedraTest.durabilidad());
    }


    @Test
    public void testPiedraNoReduceSuDurabilidadSiEsGolpeadoPorPicoFino(){
        PicoFino picoFino = new PicoFino(4);
        Piedra piedraTest =  new Piedra(9);
        piedraTest.recibirGolpeDe(picoFino);
        assertEquals(9, piedraTest.durabilidad());
    }


    @Test
    public void testPiedraNoReduceSuDurabilidadSiEsGolpeadoPorHacha(){
        Hacha hacha = new Hacha(4);
        Piedra piedraTest =  new Piedra(9);
        piedraTest.recibirGolpeDe(hacha);
        assertEquals(9, piedraTest.durabilidad());
    }

}