package MapaTest;

import Modelo.Jugador.Jugador;
import Modelo.Mapa.*;
import Modelo.Recursos.Madera;
import org.junit.Test;

import static junit.framework.TestCase.assertSame;

public class EstadoCasilleroTest {

    // CASILLERO OCUPADO
    // Estado no tiene que setear ocupado al casillero
    @Test
    public void testEstadoOcupadoNoSeteaOcupadoAlCasilleroRecibido(){
        EstadoCasillero estado = new EstadoOcupado();
        Casillero casillero1 = new Casillero();
        Casillero casillero2 = new Casillero();
        Casillero casillero3 = new Casillero();

        Ocupante ocupante1 = new Jugador();
        Ocupante ocupante2 = new Jugador();
        ocupante2.setCasillero(casillero3);
        ocupante1.setCasillero(casillero2);


        estado.setItem(casillero1, ocupante1);
        casillero1.setItem(ocupante2);

        assertSame(casillero1, ocupante2.getCasillero());
    }

    // Estado no tiene que setear ocupado al casillero
    @Test
    public void testEstadoOcupadoNoCambiaCasilleroDelItem(){
        EstadoCasillero estado = new EstadoOcupado();
        Casillero casillero1 = new Casillero();
        Casillero casillero2 = new Casillero();

        Ocupante ocupante1 = new Jugador();
        ocupante1.setCasillero(casillero2);

        estado.setItem(casillero1, ocupante1);

        assertSame(casillero2, ocupante1.getCasillero());
    }

    // CASILLERO DISPONIBLE
    // Estado tiene que setear ocupado al casillero
    @Test
    public void testEstadoDisponibleSeteaOcupadoAlCasilleroRecibido(){
        EstadoCasillero estado = new EstadoDisponible();
        Casillero casillero1 = new Casillero();
        Casillero casillero2 = new Casillero();
        Casillero casillero3 = new Casillero();

        Ocupante ocupante1 = new Jugador();
        Ocupante ocupante2 = new Jugador();
        ocupante2.setCasillero(casillero3);
        ocupante1.setCasillero(casillero2);


        estado.setItem(casillero1, ocupante1);
        casillero1.setItem(ocupante2);

        assertSame(casillero1, ocupante1.getCasillero());
    }


    // Estado no tiene que setear ocupado al casillero
    @Test
    public void testEstadoDisponibleCambiaCasilleroDelItem(){
        EstadoCasillero estado = new EstadoDisponible();
        Casillero casillero1 = new Casillero();
        Casillero casillero2 = new Casillero();

        Ocupante ocupante1 = new Jugador();
        ocupante1.setCasillero(casillero2);

        estado.setItem(casillero1, ocupante1);

        assertSame(casillero1, ocupante1.getCasillero());
    }



    @Test
    public void testEstadoDisponibleGuardaItemCorrectamente(){
        EstadoCasillero estado = new EstadoDisponible();

        Ocupante ocupante1 = new Madera();

        Casillero c = new Casillero();

        EstadoCasillero  nuevoEstado = estado.setItem(c, ocupante1);

        assertSame(nuevoEstado.getOcupante(), ocupante1);
    }
}
