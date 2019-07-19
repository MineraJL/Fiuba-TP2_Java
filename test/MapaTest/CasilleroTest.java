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
    // Casillero norte
    @Test
    public void testCasilleroDevuelveCasilleroEnLaDireccionNorte(){

        Mapa mapa = new Mapa(5,5);
        PosicionEnlazada posicion = new PosicionEnlazada(2,2);
        Casillero casillero1= mapa.getCasillero(posicion);
        Direccion direccion= Direccion.arriba();
        Casillero casillero2 = casillero1.getCasilleroVecino(mapa,direccion);
        assertEquals(3,casillero2.getPosicion().getY());
    }
    // Casillero sur
    @Test
    public void testCasilleroDevuelveCasilleroEnLaDireccionSur(){

        Mapa mapa = new Mapa(5,5);
        PosicionEnlazada posicion = new PosicionEnlazada(2,2);
        Casillero casillero1= mapa.getCasillero(posicion);
        Direccion direccion= Direccion.abajo();
        Casillero casillero2 = casillero1.getCasilleroVecino(mapa,direccion);
        assertEquals(1,casillero2.getPosicion().getY());
    }
    // Casillero este
    @Test
    public void testCasilleroDevuelveCasilleroEnLaDireccionEste(){

        Mapa mapa = new Mapa(5,5);
        PosicionEnlazada posicion = new PosicionEnlazada(2,2);
        Casillero casillero1= mapa.getCasillero(posicion);
        Direccion direccion= Direccion.derecha();
        Casillero casillero2 = casillero1.getCasilleroVecino(mapa,direccion);
        assertEquals(3,casillero2.getPosicion().getX());
    }
    // Casillero oeste
    @Test
    public void testCasilleroDevuelveCasilleroEnLaDireccionOeste(){

        Mapa mapa = new Mapa(5,5);
        PosicionEnlazada posicion = new PosicionEnlazada(2,2);
        Casillero casillero1= mapa.getCasillero(posicion);
        Direccion direccion= Direccion.izquierda();
        Casillero casillero2 = casillero1.getCasilleroVecino(mapa,direccion);
        assertEquals(1,casillero2.getPosicion().getX());
    }
    //

    // CASILLERO ESTADO

    @Test
    public void testCasilleroConEstadoDisponibleAceptaItem(){

        Casillero casillero1 = new Casillero();
        Casillero casillero2 = new Casillero();
        Ocupante ocupante = new Jugador();

        ocupante.setCasillero(casillero2);
        casillero1.setEstado(new EstadoDisponible());

        casillero1.ocuparPor(ocupante);

        assertSame(casillero1, ocupante.getCasillero());
    }
    @Test
    public void testCasilleroConEstadoOcupadoNoAceptaItem(){

        Casillero casillero1 = new Casillero();
        Casillero casillero2 = new Casillero();
        Ocupante ocupante = new Jugador();
        ocupante.setCasillero(casillero2);

        casillero1.setEstado(new EstadoOcupado());

        casillero1.ocuparPor(ocupante);

        assertNotSame(casillero1, ocupante.getCasillero());
    }


    // Casillero acepta item si no tiene item
    @Test
    public void testCasilleroAceptaItemSiNoTieneItem(){

        Casillero casillero1 = new Casillero();
        Casillero casillero2 = new Casillero();

        Ocupante ocupante = new Jugador();
        ocupante.setCasillero(casillero2);
        casillero1.ocuparPor(ocupante);

        assertSame(casillero1, ocupante.getCasillero());
    }
    // Casillero oeste
    @Test
    public void testCasilleroNoAceptaItemSiYaTieneItem(){

        Casillero casillero1 = new Casillero();
        Casillero casillero2 = new Casillero();
        Ocupante ocupante1 = new Jugador();
        Ocupante ocupante2 = new Jugador();

        ocupante1.setCasillero(casillero2); // Le asigno al item un casillero.
        casillero1.ocuparPor(ocupante1);
        casillero1.ocuparPor(ocupante2);

        assertNotSame(casillero1, ocupante2.getCasillero());

    }


    @Test
    public void testCasilleroGuardaItemCorrectamente(){
        Casillero casillero1 = new Casillero();
        Ocupante ocupante1 = new Madera();
        casillero1.ocuparPor(ocupante1);
        assertEquals(casillero1.getOcupante(), ocupante1);
    }


}
