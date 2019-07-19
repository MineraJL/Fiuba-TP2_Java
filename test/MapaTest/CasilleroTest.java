package MapaTest;
import Modelo.Jugador.Jugador;
import Modelo.Mapa.*;
import Modelo.Recursos.*;
import org.junit.Test;

import static junit.framework.TestCase.*;


public class CasilleroTest {



    // Seteo Filas y columnas
    @Test
    public void testCasilleroSeteaPosicionFilaEnCero(){
        Casillero casillero = new Casillero();
        casillero.setPosicion(0,0);
        assertEquals(0, casillero.getPosicion().getX());
    }
    @Test
    public void testCasilleroSeteaPosicionColumnaEnCero(){
        Casillero casillero = new Casillero();
        casillero.setPosicion(0,0);
        assertEquals(0, casillero.getPosicion().getY());
    }
    @Test
    public void testCasilleroSeteaPosicionFilaEnUno(){
        Casillero casillero = new Casillero();
        casillero.setPosicion(1,1);
        assertEquals(1, casillero.getPosicion().getX());
    }
    @Test
    public void testCasilleroSeteaPosicionColumnaEnUno(){
        Casillero casillero = new Casillero();
        casillero.setPosicion(1,1);
        assertEquals(1, casillero.getPosicion().getY());
    }
    //

    @Test
    public void testCasilleroDevuelvePosicionAsignadaFilaEnCero(){
        Casillero casillero = new Casillero();
        casillero.setPosicion(0,0);
        PosicionEnlazada posicion = casillero.getPosicion();
        assertEquals(0, posicion.getX());
    }
    @Test
    public void testCasilleroDevuelvePosicionAsignadaColumnaEnCero(){
        Casillero casillero = new Casillero();
        casillero.setPosicion(0,0);
        PosicionEnlazada posicion = casillero.getPosicion();
        assertEquals(0, posicion.getY());
    }
    @Test
    public void testCasilleroDevuelvePosicionAsignadaFilaEnUno(){
        Casillero casillero = new Casillero();
        casillero.setPosicion(1,1);
        PosicionEnlazada posicion = casillero.getPosicion();
        assertEquals(1, posicion.getX());
    }
    @Test
    public void testCasilleroDevuelvePosicionAsignadaColumnaEnUno(){
        Casillero casillero = new Casillero();
        casillero.setPosicion(1,1);
        PosicionEnlazada posicion = casillero.getPosicion();
        assertEquals(1, posicion.getY());
    }


    // CASILLERO SIGUIENTE

    @Test
    public void testCasilleroDevuelveCasilleroEnDireccionArriba(){

        Mapa mapa = new Mapa(5,5);
        Casillero casillero = mapa.getCasillero(new PosicionEnlazada(2,2));
        Casillero casilleroVecino = casillero.obtenerCasilleroVecino(mapa,new DireccionArriba());
        assertEquals(3,casilleroVecino.getPosicion().getY());
    }

    @Test
    public void testCasilleroDevuelveCasilleroEnDireccionAbajo(){

        Mapa mapa = new Mapa(5,5);
        PosicionEnlazada posicion = new PosicionEnlazada(2,2);
        Casillero casillero= mapa.getCasillero(posicion);
        Casillero casilleroVecino = casillero.obtenerCasilleroVecino(mapa,new DireccionAbajo());
        assertEquals(1,casilleroVecino.getPosicion().getY());
    }

    @Test
    public void testCasilleroDevuelveCasilleroEnLaDireccionDerecha(){

        Mapa mapa = new Mapa(5,5);
        PosicionEnlazada posicion = new PosicionEnlazada(2,2);
        Casillero casillero= mapa.getCasillero(posicion);
        Casillero casilleroVecino = casillero.obtenerCasilleroVecino(mapa,new DireccionDerecha());
        assertEquals(3,casilleroVecino.getPosicion().getX());
    }

    @Test
    public void testCasilleroDevuelveCasilleroEnLaDireccionIzquierda(){

        Mapa mapa = new Mapa(5,5);
        PosicionEnlazada posicion = new PosicionEnlazada(2,2);
        Casillero casillero= mapa.getCasillero(posicion);
        Casillero casilleroVecino = casillero.obtenerCasilleroVecino(mapa,new DireccionIzquierda());
        assertEquals(1,casilleroVecino.getPosicion().getX());
    }

    // Casillero acepta o no ocupante

    @Test
    public void testCasilleroAceptaOcupanteSiNoTieneOcupante(){

        Casillero casillero = new Casillero();
        Ocupante ocupante = new Jugador();

        casillero.ocuparPor(ocupante);

        assertSame(casillero, ocupante.getCasillero());
    }
    @Test
    public void testCasilleroNoAceptaOcupanteSiYaTieneOcupante(){

        Casillero casillero = new Casillero();
        Ocupante ocupante1 = new Jugador();
        Ocupante ocupante2 = new Jugador();

        casillero.ocuparPor(ocupante1);
        casillero.ocuparPor(ocupante2);

        assertNotSame(casillero, ocupante2.getCasillero());

    }

    @Test
    public void testCasilleroGuardaOcupanteCorrectamente(){
        Casillero casillero = new Casillero();
        Ocupante ocupante = new Madera();
        casillero.ocuparPor(ocupante);
        assertEquals(casillero.getOcupante(), ocupante);
    }


}
