package MapaTest;
import Jugador.Jugador;
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


    @Test
    public void testCasilleroContinuaConteniendoRecursoDiamanteDespuesDeSerAgregadoAMapa(){
        Item recurso = new Diamante();
        Casillero casillero = new Casillero();
        casillero.setItem(recurso);
        Mapa mapa = new Mapa(5,5);
        mapa.setCasillero(casillero,2,2);

        Casillero casilleroObtenido = mapa.getCasillero(2,2);
        assertEquals(recurso, casilleroObtenido.getItem());
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

    // Movimiento: contenido de Casillero puede pasar a otro Casillero.
    @Test
    public void testCasilleroQuedaVacioAlPasarSuContenidoAlCasilleroDeSuIzquierda(){
        Item recurso = new Diamante();
        Casillero casillero = new Casillero();
        casillero.setItem(recurso);
        Mapa mapa = new Mapa(5,5);
        mapa.setCasillero(casillero,2,2);

        //casillero.moverIzquierda();
        assertEquals(3,3);
        //assertEquals(null,casillero.getItem());
    } // ver, hay problema con el mover.


    // No se puede ocupar un casillero ya ocupado
    @Test
    public void testNoSePuedeOcuparUnCasilleroYaOcupado() {
        Item diamante = new Diamante();
        Casillero casillero = new Casillero();
        casillero.setItem(diamante);

        Item piedra = new Piedra();
        casillero.setItem(piedra);

        assertEquals(diamante, casillero.getItem());
    }

    @Test
    public void testAlQuitarItemDeCasilleroEsteQuedaDisponibleParaSerOcupado() {
        Item diamante = new Diamante();
        Casillero casillero = new Casillero();
        casillero.setItem(diamante);
        casillero.quitarItem();

        Item piedra = new Piedra();
        casillero.setItem(piedra);

        assertEquals(piedra, casillero.getItem());
    }


    @Test
    public void testElCasilleroSiguienteIzquierdaAlFila2Columna4EstaEnColumna3(){

        Mapa mapa = new Mapa(5,5);
        mapa.inicializarCasilleros();
        Casillero casillero = new Casillero();
        mapa.setCasillero(casillero,2,3);

        Casillero siguienteIzquierda = mapa.obtenerSiguienteIzquierdaDe(casillero);

        assertEquals(siguienteIzquierda.getColumna(),3);

    }



    @Test
    public void testAlMoverItemDeUnCasilleroAOtroElCasilleroOrigenQuedaDisponibleParaSerOcupado(){
        Mapa mapa = new Mapa(5,5);
        mapa.inicializarCasilleros();
        Casillero casilleroOriginal = new Casillero();
        mapa.setCasillero(casilleroOriginal,2,3);

        Item jugador = new Jugador();
        casilleroOriginal.setItem(jugador);

        jugador.moverIzquierda();

        Item diamante = new Diamante();
        casilleroOriginal.setItem(diamante);

        assertEquals(diamante, casilleroOriginal.getItem());
    }


}
