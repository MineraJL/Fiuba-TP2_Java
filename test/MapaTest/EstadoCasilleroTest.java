package MapaTest;

import Modelo.Inventario.Inventario;
import Modelo.Jugador.Jugador;
import Modelo.Mapa.*;
import Modelo.MesaDeTrabajo.Mesa;
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

    	Inventario inventario = new Inventario();
    	Mesa mesa = new Mesa();
        Ocupante ocupante1 = new Jugador(inventario, mesa);
        Ocupante ocupante2 = new Jugador(inventario, mesa);
        ocupante2.setCasillero(casillero3);
        ocupante1.setCasillero(casillero2);


        estado.ocuparPor(casillero1, ocupante1);
        casillero1.ocuparPor(ocupante2);

        assertSame(casillero1, ocupante2.getCasillero());
    }

    // Estado no tiene que setear ocupado al casillero
    @Test
    public void testEstadoOcupadoNoCambiaCasilleroDelItem(){
        EstadoCasillero estado = new EstadoOcupado();
        Casillero casillero1 = new Casillero();
        Casillero casillero2 = new Casillero();

    	Inventario inventario = new Inventario();
    	Mesa mesa = new Mesa();
        Ocupante ocupante1 = new Jugador(inventario, mesa);
        ocupante1.setCasillero(casillero2);

        estado.ocuparPor(casillero1, ocupante1);

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

    	Inventario inventario = new Inventario();
    	Mesa mesa = new Mesa();
        Ocupante ocupante1 = new Jugador(inventario, mesa);
        Ocupante ocupante2 = new Jugador(inventario, mesa);
        ocupante2.setCasillero(casillero3);
        ocupante1.setCasillero(casillero2);


        estado.ocuparPor(casillero1, ocupante1);
        casillero1.ocuparPor(ocupante2);

        assertSame(casillero1, ocupante1.getCasillero());
    }


    // Estado no tiene que setear ocupado al casillero
    @Test
    public void testEstadoDisponibleCambiaCasilleroDelItem(){
        EstadoCasillero estado = new EstadoDisponible();
        Casillero casillero1 = new Casillero();
        Casillero casillero2 = new Casillero();

    	Inventario inventario = new Inventario();
    	Mesa mesa = new Mesa();
        Ocupante ocupante1 = new Jugador(inventario, mesa);
        ocupante1.setCasillero(casillero2);

        estado.ocuparPor(casillero1, ocupante1);

        assertSame(casillero1, ocupante1.getCasillero());
    }



    @Test
    public void testEstadoDisponibleGuardaItemCorrectamente(){
        EstadoCasillero estado = new EstadoDisponible();

        Ocupante ocupante1 = new Madera();

        Casillero c = new Casillero();

        EstadoCasillero  nuevoEstado = estado.ocuparPor(c, ocupante1);

        assertSame(nuevoEstado.getOcupante(), ocupante1);
    }
}
