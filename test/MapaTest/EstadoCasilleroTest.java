package MapaTest;

import Jugador.Jugador;
import Mapa.*;
import Recursos.Madera;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertSame;
import static org.junit.Assert.assertNotSame;

public class EstadoCasilleroTest {

    // CASILLERO OCUPADO
    // Estado no tiene que setear ocupado al casillero
    @Test
    public void testEstadoOcupadoNoSeteaOcupadoAlCasilleroRecibido(){
        EstadoCasillero estado = new EstadoOcupado();
        Casillero casillero1 = new Casillero();
        Casillero casillero2 = new Casillero();
        Casillero casillero3 = new Casillero();

        Item item1 = new Jugador();
        Item item2 = new Jugador();
        item2.setCasillero(casillero3);
        item1.setCasillero(casillero2);


        estado.setItem(casillero1,item1);
        casillero1.setItem(item2);

        assertSame(casillero1,item2.getCasillero());
    }

    // Estado no tiene que setear ocupado al casillero
    @Test
    public void testEstadoOcupadoNoCambiaCasilleroDelItem(){
        EstadoCasillero estado = new EstadoOcupado();
        Casillero casillero1 = new Casillero();
        Casillero casillero2 = new Casillero();

        Item item1 = new Jugador();
        item1.setCasillero(casillero2);

        estado.setItem(casillero1,item1);

        assertSame(casillero2,item1.getCasillero());
    }

    // CASILLERO DISPONIBLE
    // Estado tiene que setear ocupado al casillero
    @Test
    public void testEstadoDisponibleSeteaOcupadoAlCasilleroRecibido(){
        EstadoCasillero estado = new EstadoDisponible();
        Casillero casillero1 = new Casillero();
        Casillero casillero2 = new Casillero();
        Casillero casillero3 = new Casillero();

        Item item1 = new Jugador();
        Item item2 = new Jugador();
        item2.setCasillero(casillero3);
        item1.setCasillero(casillero2);


        estado.setItem(casillero1,item1);
        casillero1.setItem(item2);

        assertSame(casillero1,item1.getCasillero());
    }


    // Estado no tiene que setear ocupado al casillero
    @Test
    public void testEstadoDisponibleCambiaCasilleroDelItem(){
        EstadoCasillero estado = new EstadoDisponible();
        Casillero casillero1 = new Casillero();
        Casillero casillero2 = new Casillero();

        Item item1 = new Jugador();
        item1.setCasillero(casillero2);

        estado.setItem(casillero1,item1);

        assertSame(casillero1,item1.getCasillero());
    }



    @Test
    public void testEstadoDisponibleGuardaItemCorrectamente(){
        EstadoCasillero estado = new EstadoDisponible();

        Item item1 = new Madera();

        Casillero c = new Casillero();

        EstadoCasillero  nuevoEstado = estado.setItem(c,item1);

        assertSame(nuevoEstado.getItem(),item1);
    }
}
