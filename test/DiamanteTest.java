import Herramientas.Hacha;
import Herramientas.Pico;
import Herramientas.PicoFino;
import Recursos.Diamante;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DiamanteTest {


    /*/
    @Test
    public void testDiamanteSeCreaConLaDurabilidadIndicada(){
        Diamante DiamanteTest =  new Diamante(9);
        assertEquals(9, DiamanteTest.durabilidad());

    }

    @Test
    public void testDiamanteReduceSuDurabilidadEn4(){
        Diamante DiamanteTest =  new Diamante(9);
        DiamanteTest.reducirDurabilidadEn(4);
        assertEquals(5, DiamanteTest.durabilidad());
    }


    @Test
    public void testDiamanteNoReduceSuDurabilidadSiEsGolpeadoPorPico(){
        Pico pico = new Pico(4);
        Diamante DiamanteTest =  new Diamante(9);
        DiamanteTest.recibirGolpeDe(pico);
        assertEquals(9, DiamanteTest.durabilidad());
    }


    @Test
    public void testDiamanteReduceSuDurabilidadSiEsGolpeadoPorPicoFino(){
        PicoFino picoFino = new PicoFino(4);
        Diamante DiamanteTest =  new Diamante(9);
        DiamanteTest.recibirGolpeDe(picoFino);
        assertEquals(5, DiamanteTest.durabilidad());
    }


    @Test
    public void testDiamantenoReduceSuDurabilidadSiEsGolpeadoPorHacha(){
        Hacha hacha = new Hacha(4);
        Diamante DiamanteTest =  new Diamante(9);
        DiamanteTest.recibirGolpeDe(hacha);
        assertEquals(9, DiamanteTest.durabilidad());
    }
*/
}