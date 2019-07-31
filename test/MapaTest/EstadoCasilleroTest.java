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
        ocupante2.establecerCasillero(casillero3);
        ocupante1.establecerCasillero(casillero2);


        estado.ocuparPor(casillero1, ocupante1);
        casillero1.ocuparPor(ocupante2);

        assertSame(casillero1, ocupante2.obtenerCasillero());
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
        ocupante1.establecerCasillero(casillero2);

        estado.ocuparPor(casillero1, ocupante1);

        assertSame(casillero2, ocupante1.obtenerCasillero());
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
        ocupante2.establecerCasillero(casillero3);
        ocupante1.establecerCasillero(casillero2);


        estado.ocuparPor(casillero1, ocupante1);
        casillero1.ocuparPor(ocupante2);

        assertSame(casillero1, ocupante1.obtenerCasillero());
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
        ocupante1.establecerCasillero(casillero2);

        estado.ocuparPor(casillero1, ocupante1);

        assertSame(casillero1, ocupante1.obtenerCasillero());
    }



    @Test
    public void testEstadoDisponibleGuardaItemCorrectamente(){
        EstadoCasillero estado = new EstadoDisponible();

        Ocupante ocupante1 = new Madera();

        Casillero c = new Casillero();

        EstadoCasillero  nuevoEstado = estado.ocuparPor(c, ocupante1);

        assertSame(nuevoEstado.ocupante(), ocupante1);
    }
}
