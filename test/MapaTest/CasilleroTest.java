package MapaTest;
import Jugador.Jugador;
import Mapa.*;
import Recursos.*;
import MateriaPrima.*;
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
        Posicion posicion = casillero.getPosicion();
        assertEquals(0, posicion.getX());
    }
    @Test
    public void testCasilleroDevuelvePosicionAsignadaColumnaEnCero(){
        Casillero casillero = new Casillero();
        casillero.setPosicion(0,0);
        Posicion posicion = casillero.getPosicion();
        assertEquals(0, posicion.getY());
    }
    @Test
    public void testCasilleroDevuelvePosicionAsignadaFilaEnUno(){
        Casillero casillero = new Casillero();
        casillero.setPosicion(1,1);
        Posicion posicion = casillero.getPosicion();
        assertEquals(1, posicion.getX());
    }
    @Test
    public void testCasilleroDevuelvePosicionAsignadaColumnaEnUno(){
        Casillero casillero = new Casillero();
        casillero.setPosicion(1,1);
        Posicion posicion = casillero.getPosicion();
        assertEquals(1, posicion.getY());
    }


    // CASILLERO SIGUIENTE
    // Casillero norte
    @Test
    public void testCasilleroDevuelveCasilleroEnLaDireccionNorte(){

        Mapa mapa = new Mapa(5,5);
        Posicion posicion = new Posicion(2,2);
        Casillero casillero1= mapa.getCasillero(posicion);
        Direccion direccion= Direccion.arriba();
        Casillero casillero2 = casillero1.getCasilleroVecino(mapa,direccion);
        assertEquals(3,casillero2.getPosicion().getY());
    }
    // Casillero sur
    @Test
    public void testCasilleroDevuelveCasilleroEnLaDireccionSur(){

        Mapa mapa = new Mapa(5,5);
        Posicion posicion = new Posicion(2,2);
        Casillero casillero1= mapa.getCasillero(posicion);
        Direccion direccion= Direccion.abajo();
        Casillero casillero2 = casillero1.getCasilleroVecino(mapa,direccion);
        assertEquals(1,casillero2.getPosicion().getY());
    }
    // Casillero este
    @Test
    public void testCasilleroDevuelveCasilleroEnLaDireccionEste(){

        Mapa mapa = new Mapa(5,5);
        Posicion posicion = new Posicion(2,2);
        Casillero casillero1= mapa.getCasillero(posicion);
        Direccion direccion= Direccion.derecha();
        Casillero casillero2 = casillero1.getCasilleroVecino(mapa,direccion);
        assertEquals(3,casillero2.getPosicion().getX());
    }
    // Casillero oeste
    @Test
    public void testCasilleroDevuelveCasilleroEnLaDireccionOeste(){

        Mapa mapa = new Mapa(5,5);
        Posicion posicion = new Posicion(2,2);
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
        Item item = new Jugador();

        item.setCasillero(casillero2);
        casillero1.setEstado(new EstadoDisponible());

        casillero1.setItem(item);

        assertSame(casillero1,item.getCasillero());
    }
    @Test
    public void testCasilleroConEstadoOcupadoNoAceptaItem(){

        Casillero casillero1 = new Casillero();
        Casillero casillero2 = new Casillero();
        Item item = new Jugador();
        item.setCasillero(casillero2);

        casillero1.setEstado(new EstadoOcupado());

        casillero1.setItem(item);

        assertNotSame(casillero1,item.getCasillero());
    }


    // Casillero acepta item si no tiene item
    @Test
    public void testCasilleroAceptaItemSiNoTieneItem(){

        Casillero casillero1 = new Casillero();
        Casillero casillero2 = new Casillero();

        Item item = new Jugador();
        item.setCasillero(casillero2);
        casillero1.setItem(item);

        assertSame(casillero1,item.getCasillero());
    }
    // Casillero oeste
    @Test
    public void testCasilleroNoAceptaItemSiYaTieneItem(){

        Casillero casillero1 = new Casillero();
        Casillero casillero2 = new Casillero();
        Item item1 = new Jugador();
        Item item2 = new Jugador();

        item1.setCasillero(casillero2); // Le asigno al item un casillero.
        casillero1.setItem(item1);
        casillero1.setItem(item2);

        assertNotSame(casillero1,item2.getCasillero());

    }


    @Test
    public void testCasilleroGuardaItemCorrectamente(){
        Casillero casillero1 = new Casillero();
        Item item1 = new Madera();
        casillero1.setItem(item1);
        assertEquals(casillero1.getItem(),item1);
    }


}
