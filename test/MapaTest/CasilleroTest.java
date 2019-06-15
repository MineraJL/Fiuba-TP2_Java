package MapaTest;
import Mapa.*;
import Recursos.*;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class CasilleroTest {



    // UBICACION EN EL MAPA
    // No verifica que casillero se ubique en el mapa sino que tenga la ubicación deseada.
    @Test
    public void testCasilleroSeUbicaCorrectamenteEnLaFilaCero(){
        Mapa mapa = new Mapa(3,3);
        Casillero casillero = new Casillero();
        mapa.setCasillero(casillero,0,0);
        assertEquals(0, casillero.getFila());
    }
    @Test
    public void testCasilleroSeUbicaCorrectamenteEnLaColumnaCero(){
        Mapa mapa = new Mapa(3,3);
        Casillero casillero = new Casillero();
        mapa.setCasillero(casillero,0,0);
        assertEquals(0, casillero.getColumna());
    }
    @Test
    public void testCasilleroSeUbicaCorrectamenteEnLaFilaUno(){
        Mapa mapa = new Mapa(3,3);
        Casillero casillero = new Casillero();
        mapa.setCasillero(casillero,1,0);
        assertEquals(1, casillero.getFila());
    }
    @Test
    public void testCasilleroSeUbicaCorrectamenteEnLaColumnaUno(){
        Mapa mapa = new Mapa(3,3);
        Casillero casillero = new Casillero();
        mapa.setCasillero(casillero,0,1);
        assertEquals(1, casillero.getColumna());
    }

    // CONTENER ITEM
    @Test
    public void testCasilleroPuedeContenerItemRecursoMadera(){
        Item recurso = new Madera();
        Casillero casillero = new Casillero();
        casillero.setItem(recurso);
        assertEquals(recurso, casillero.getItem());
    }
    @Test
    public void testCasilleroPuedeContenerItemRecursoPiedra(){
        Item recurso = new Piedra();
        Casillero casillero = new Casillero();
        casillero.setItem(recurso);
        assertEquals(recurso, casillero.getItem());
    }
    @Test
    public void testCasilleroPuedeContenerItemRecursoMetal(){
        Item recurso = new Metal();
        Casillero casillero = new Casillero();
        casillero.setItem(recurso);
        assertEquals(recurso, casillero.getItem());
    }
    @Test
    public void testCasilleroPuedeContenerItemRecursoDiamante(){
        Item recurso = new Diamante();
        Casillero casillero = new Casillero();
        casillero.setItem(recurso);
        assertEquals(recurso, casillero.getItem());
    }
    // Eliminar item
    @Test
    public void testCasilleroPuedeQuitarItem(){
        Item recurso = new Diamante();
        Casillero casillero = new Casillero();
        casillero.setItem(recurso);
        casillero.quitarItem();
        assertEquals(null, casillero.getItem());
    }


}
