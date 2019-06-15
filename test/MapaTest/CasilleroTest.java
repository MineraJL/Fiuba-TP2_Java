package MapaTest;
import Jugador.Jugador;
import Mapa.*;
import Recursos.*;
import javafx.geometry.Pos;
import org.junit.Test;

import static junit.framework.TestCase.*;


public class CasilleroTest {



    // Seteo Filas y columnas
    @Test
    public void testCasilleroSeteaFilaEnCero(){
        Casillero casillero = new Casillero();
        casillero.setPosicion(0,0);
        assertEquals(0, casillero.getFila());
    }
    @Test
    public void testCasilleroSeteaColumnaEnCero(){
        Casillero casillero = new Casillero();
        casillero.setPosicion(0,0);
        assertEquals(0, casillero.getColumna());
    }
    @Test
    public void testCasilleroSeteaFilaEnUno(){
        Casillero casillero = new Casillero();
        casillero.setPosicion(1,1);
        assertEquals(1, casillero.getFila());
    }
    @Test
    public void testCasilleroSeteaColumnaEnUno(){
        Casillero casillero = new Casillero();
        casillero.setPosicion(1,1);
        assertEquals(1, casillero.getColumna());
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
        Casillero casillero1= mapa.getCasillero(2,2);
        Direccion direccion= Direccion.norte();
        Casillero casillero2 = casillero1.getCasilleroVecino(mapa,direccion);
        assertEquals(3,casillero2.getColumna());
    }
    // Casillero sur
    @Test
    public void testCasilleroDevuelveCasilleroEnLaDireccionSur(){

        Mapa mapa = new Mapa(5,5);
        Casillero casillero1= mapa.getCasillero(2,2);
        Direccion direccion= Direccion.sur();
        Casillero casillero2 = casillero1.getCasilleroVecino(mapa,direccion);
        assertEquals(1,casillero2.getColumna());
    }
    // Casillero este
    @Test
    public void testCasilleroDevuelveCasilleroEnLaDireccionEste(){

        Mapa mapa = new Mapa(5,5);
        Casillero casillero1= mapa.getCasillero(2,2);
        Direccion direccion= Direccion.este();
        Casillero casillero2 = casillero1.getCasilleroVecino(mapa,direccion);
        assertEquals(3,casillero2.getFila());
    }
    // Casillero oeste
    @Test
    public void testCasilleroDevuelveCasilleroEnLaDireccionOeste(){

        Mapa mapa = new Mapa(5,5);
        Casillero casillero1= mapa.getCasillero(2,2);
        Direccion direccion= Direccion.oeste();
        Casillero casillero2 = casillero1.getCasilleroVecino(mapa,direccion);
        assertEquals(1,casillero2.getFila());
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


}
