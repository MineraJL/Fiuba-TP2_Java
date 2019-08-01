package MapaTest;
import Modelo.Inventario.Inventario;
import Modelo.Jugador.Jugador;
import Modelo.Mapa.*;
import Modelo.MesaDeTrabajo.Mesa;
import Modelo.Recursos.*;
import org.junit.Test;

import static junit.framework.TestCase.*;


public class CasilleroTest {



    // Seteo Filas y columnas
    @Test
    public void testCasilleroSeteaPosicionFilaEnCero(){
        Casillero casillero = new Casillero();
        casillero.establecerPosicion(0,0);
        assertEquals(0, casillero.posicion().geti());
    }
    @Test
    public void testCasilleroSeteaPosicionColumnaEnCero(){
        Casillero casillero = new Casillero();
        casillero.establecerPosicion(0,0);
        assertEquals(0, casillero.posicion().getj());
    }
    @Test
    public void testCasilleroSeteaPosicionFilaEnUno(){
        Casillero casillero = new Casillero();
        casillero.establecerPosicion(1,1);
        assertEquals(1, casillero.posicion().geti());
    }
    @Test
    public void testCasilleroSeteaPosicionColumnaEnUno(){
        Casillero casillero = new Casillero();
        casillero.establecerPosicion(1,1);
        assertEquals(1, casillero.posicion().getj());
    }
    //

    @Test
    public void testCasilleroDevuelvePosicionAsignadaFilaEnCero(){
        Casillero casillero = new Casillero();
        casillero.establecerPosicion(0,0);
        PosicionEnlazada posicion = casillero.posicion();
        assertEquals(0, posicion.geti());
    }
    @Test
    public void testCasilleroDevuelvePosicionAsignadaColumnaEnCero(){
        Casillero casillero = new Casillero();
        casillero.establecerPosicion(0,0);
        PosicionEnlazada posicion = casillero.posicion();
        assertEquals(0, posicion.getj());
    }
    @Test
    public void testCasilleroDevuelvePosicionAsignadaFilaEnUno(){
        Casillero casillero = new Casillero();
        casillero.establecerPosicion(1,1);
        PosicionEnlazada posicion = casillero.posicion();
        assertEquals(1, posicion.geti());
    }
    @Test
    public void testCasilleroDevuelvePosicionAsignadaColumnaEnUno(){
        Casillero casillero = new Casillero();
        casillero.establecerPosicion(1,1);
        PosicionEnlazada posicion = casillero.posicion();
        assertEquals(1, posicion.getj());
    }


    // CASILLERO SIGUIENTE

    @Test
    public void testCasilleroDevuelveCasilleroEnDireccionArriba(){

        Mapa mapa = new Mapa(5,5);
        Casillero casillero = mapa.obtenerCasillero(new PosicionEnlazada(2,2));
        Casillero casilleroVecino = casillero.obtenerCasilleroVecino(mapa,new DireccionArriba());
        PosicionEnlazada posicionEsperada = new PosicionEnlazada(1,2);
        assertTrue(posicionEsperada.equals(casilleroVecino.posicion()));
    }

    @Test
    public void testCasilleroDevuelveCasilleroEnDireccionAbajo(){

        Mapa mapa = new Mapa(5,5);
        PosicionEnlazada posicion = new PosicionEnlazada(2,2);
        Casillero casillero= mapa.obtenerCasillero(posicion);
        Casillero casilleroVecino = casillero.obtenerCasilleroVecino(mapa,new DireccionAbajo());
        PosicionEnlazada posicionEsperada = new PosicionEnlazada(3,2);
        assertTrue(posicionEsperada.equals(casilleroVecino.posicion()));
    }

    @Test
    public void testCasilleroDevuelveCasilleroEnLaDireccionDerecha(){

        Mapa mapa = new Mapa(5,5);
        PosicionEnlazada posicion = new PosicionEnlazada(2,2);
        Casillero casillero= mapa.obtenerCasillero(posicion);
        Casillero casilleroVecino = casillero.obtenerCasilleroVecino(mapa,new DireccionDerecha());
        PosicionEnlazada posicionEsperada = new PosicionEnlazada(2,3);
        assertTrue(posicionEsperada.equals(casilleroVecino.posicion()));
    }

    @Test
    public void testCasilleroDevuelveCasilleroEnLaDireccionIzquierda(){

        Mapa mapa = new Mapa(5,5);
        PosicionEnlazada posicion = new PosicionEnlazada(2,2);
        Casillero casillero= mapa.obtenerCasillero(posicion);
        Casillero casilleroVecino = casillero.obtenerCasilleroVecino(mapa,new DireccionIzquierda());
        PosicionEnlazada posicionEsperada = new PosicionEnlazada(2,1);
        assertTrue(posicionEsperada.equals(casilleroVecino.posicion()));
    }

    // Casillero acepta o no ocupante

    @Test
    public void testCasilleroAceptaOcupanteSiNoTieneOcupante(){

        Casillero casillero = new Casillero();
        
    	Inventario inventario = new Inventario();
        Ocupante ocupante = new Jugador(inventario);

        casillero.ocuparPor(ocupante);

        assertSame(casillero, ocupante.obtenerCasillero());
    }
    @Test
    public void testCasilleroNoAceptaOcupanteSiYaTieneOcupante(){

        Casillero casillero = new Casillero();
        
    	Inventario inventario = new Inventario();
        Ocupante ocupante1 = new Jugador(inventario);
        Ocupante ocupante2 = new Jugador(inventario);

        casillero.ocuparPor(ocupante1);
        casillero.ocuparPor(ocupante2);

        assertNotSame(casillero, ocupante2.obtenerCasillero());

    }

    @Test
    public void testCasilleroGuardaOcupanteCorrectamente(){
        Casillero casillero = new Casillero();
        Ocupante ocupante = new Madera();
        casillero.ocuparPor(ocupante);
        assertEquals(casillero.ocupante(), ocupante);
    }


}
