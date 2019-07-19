package MapaTest;

import Modelo.Inventario.Inventario;
import Modelo.Jugador.Jugador;
import Modelo.Recursos.*;
import Modelo.Mapa.*;
import Modelo.MesaDeTrabajo.Mesa;

import org.junit.Test;

import static junit.framework.TestCase.*;

public class MapaIntegracionTest {


    @Test
    public void testOcupanteJugadorSeMueveALaDerechaEnElMapaDosVeces() {
        Mapa mapa = new Mapa(10,10);
        Casillero casillero1 = new Casillero();
    	Inventario inventario = new Inventario();
    	Mesa mesa = new Mesa();
        Jugador jugador = new Jugador(inventario, mesa);
        jugador.setCasillero(casillero1);
        Posicion posicionInicial = new Posicion(5,5);
        jugador.ingresar(mapa, posicionInicial);
        // Lo muevo a la derecha 2 veces
        jugador.mover(Direccion.derecha());
        jugador.mover(Direccion.derecha());
        Posicion posicionFinal = new Posicion(7,5);

        assertSame(mapa.getCasillero(posicionFinal),jugador.getCasillero());
    }

    // MOVIMIENTO OCUPANTE JUGADOR - MAPA VACIO
    // 2 movimientos a la derecha
    @Test
    public void testOcupanteJugadorSeMueveALaDerechaEnElMapaDosVeces_sinEspecificarMapa() {
        Mapa mapa = new Mapa(10,10);
        Casillero casillero1 = new Casillero();
    	Inventario inventario = new Inventario();
    	Mesa mesa = new Mesa();
        Jugador jugador = new Jugador(inventario, mesa);
        jugador.setCasillero(casillero1);
        Posicion posicionInicial = new Posicion(5,5);
        jugador.ingresar(mapa, posicionInicial);
        // Lo muevo a la derecha 2 veces
        jugador.mover(Direccion.derecha());
        jugador.mover(Direccion.derecha());
        Posicion posicionFinal = new Posicion(7,5);

        assertSame(mapa.getCasillero(posicionFinal), jugador.getCasillero());
    }
    // 100 movimientos a la derecha
    @Test
    public void testOcupanteJugadorSeMueveALaDerechaEnElMapaCienVeces() {
        Mapa mapa = new Mapa(10,10);
        Casillero casillero1 = new Casillero();
    	Inventario inventario = new Inventario();
    	Mesa mesa = new Mesa();
        Jugador jugador = new Jugador(inventario, mesa);
        jugador.setCasillero(casillero1);
        Posicion posicionInicial = new Posicion(5,5);
        jugador.ingresar(mapa, posicionInicial);
        // Lo muevo a la derecha 100 veces
        for(int i=0; i < 100; i++){
            jugador.mover(Direccion.derecha());}
        Posicion posicionFinal = new Posicion(8,5);

        assertSame(mapa.getCasillero(posicionFinal), jugador.getCasillero());
    }
    //////
    // 2 movimientos a la izquierda
    @Test
    public void testOcupanteJugadorSeMueveALaIzquierdaEnElMapaDosVeces() {
        Mapa mapa = new Mapa(10,10);
        Casillero casillero1 = new Casillero();
    	Inventario inventario = new Inventario();
    	Mesa mesa = new Mesa();
        Jugador jugador = new Jugador(inventario, mesa);
        jugador.setCasillero(casillero1);
        Posicion posicionInicial = new Posicion(5,5);
        jugador.ingresar(mapa, posicionInicial);
        // Lo muevo a la izquierda 2 veces
        jugador.mover(Direccion.izquierda());
        jugador.mover(Direccion.izquierda());
        Posicion posicionFinal = new Posicion(3,5);

        assertSame(mapa.getCasillero(posicionFinal), jugador.getCasillero());
    }
    // 100 movimientos a la izquierda
    @Test
    public void testOcupanteJugadorSeMueveALaIzquierdaEnElMapaCienVeces() {
        Mapa mapa = new Mapa(10,10);
        Casillero casillero1 = new Casillero();
    	Inventario inventario = new Inventario();
    	Mesa mesa = new Mesa();
        Jugador jugador = new Jugador(inventario, mesa);
        jugador.setCasillero(casillero1);
        Posicion posicionInicial = new Posicion(5,5);
        jugador.ingresar(mapa, posicionInicial);
        // Lo muevo a la izquierda 100 veces
        for(int i=0; i < 100; i++){
            jugador.mover(Direccion.izquierda());}
        Posicion posicionFinal = new Posicion(1,5);

        assertSame(mapa.getCasillero(posicionFinal), jugador.getCasillero());
    }
    //////
    // 2 movimientos a arriba
    @Test
    public void testOcupanteJugadorSeMueveParaArribaEnElMapaDosVeces() {
        Mapa mapa = new Mapa(10,10);
        Casillero casillero1 = new Casillero();
    	Inventario inventario = new Inventario();
    	Mesa mesa = new Mesa();
        Jugador jugador = new Jugador(inventario, mesa);
        jugador.setCasillero(casillero1);
        Posicion posicionInicial = new Posicion(5,5);
        jugador.ingresar(mapa, posicionInicial);
        // Lo muevo para arriba 2 veces
        jugador.mover(Direccion.arriba());
        jugador.mover(Direccion.arriba());
        Posicion posicionFinal = new Posicion(5,7);

        assertSame(mapa.getCasillero(posicionFinal), jugador.getCasillero());
    }
    // 100 movimientos para arriba
    @Test
    public void testOcupanteJugadorSeMueveParaArribaEnElMapaCienVeces() {
        Mapa mapa = new Mapa(10,10);
        Casillero casillero1 = new Casillero();
    	Inventario inventario = new Inventario();
    	Mesa mesa = new Mesa();
        Jugador jugador = new Jugador(inventario, mesa);
        jugador.setCasillero(casillero1);
        Posicion posicionInicial = new Posicion(5,5);
        jugador.ingresar(mapa, posicionInicial);
        // Lo muevo para arriba 100 veces
        for(int i=0; i < 100; i++){
            jugador.mover(Direccion.arriba());}
        Posicion posicionFinal = new Posicion(5,8);

        assertSame(mapa.getCasillero(posicionFinal), jugador.getCasillero());
    }
    //////
    // 2 movimientos a abajo
    @Test
    public void testOcupanteJugadorSeMueveParaAbajoEnElMapaDosVeces() {
        Mapa mapa = new Mapa(10,10);
        Casillero casillero1 = new Casillero();
    	Inventario inventario = new Inventario();
    	Mesa mesa = new Mesa();
        Jugador jugador = new Jugador(inventario, mesa);
        jugador.setCasillero(casillero1);
        Posicion posicionInicial = new Posicion(5,5);
        jugador.ingresar(mapa, posicionInicial);
        // Lo muevo para arriba 2 veces
        jugador.mover(Direccion.abajo());
        jugador.mover(Direccion.abajo());
        Posicion posicionFinal = new Posicion(5,3);

        assertSame(mapa.getCasillero(posicionFinal), jugador.getCasillero());
    }
    // 100 movimientos para abajo
    @Test
    public void testOcupanteJugadorSeMueveParaAbajoEnElMapaCienVeces() {
        Mapa mapa = new Mapa(10,10);
        Casillero casillero1 = new Casillero();
    	Inventario inventario = new Inventario();
    	Mesa mesa = new Mesa();
        Jugador jugador = new Jugador(inventario, mesa);
        jugador.setCasillero(casillero1);
        Posicion posicionInicial = new Posicion(5,5);
        jugador.ingresar(mapa, posicionInicial);
        // Lo muevo para arriba 100 veces
        for(int i=0; i < 100; i++){
            jugador.mover(Direccion.abajo());}
        Posicion posicionFinal = new Posicion(5,1);

        assertSame(mapa.getCasillero(posicionFinal), jugador.getCasillero());
    }

    // MOVIMIENTO OCUPANTE JUGADOR - MAPA CON OCUPANTES RECURSOS
    //
    @Test
    public void testOcupanteJugadorSeMueveALaDerechaHastaChocarConOtroOcupante() {
        Mapa mapa = new Mapa(10,10);
        Casillero casillero1 = new Casillero();
    	Inventario inventario = new Inventario();
    	Mesa mesa = new Mesa();
        Jugador jugador = new Jugador(inventario, mesa);
        Madera madera = new Madera();
        jugador.setCasillero(casillero1);
        Posicion posicion1 = new Posicion(5,5); // Aca pongo al Modelo.Jugador
        Posicion posicion2 = new Posicion(6,5); // No puede moverse mas
        Posicion posicion3 = new Posicion(7,5); // Aca pongo a la Madera

        jugador.ingresar(mapa, posicion1);
        madera.ingresar(mapa, posicion3);
        // Lo muevo a la derecha 2 veces
        jugador.mover(Direccion.derecha());
        jugador.mover(Direccion.derecha());
        jugador.mover(Direccion.derecha());
        jugador.mover(Direccion.derecha());

        assertSame(mapa.getCasillero(posicion2), jugador.getCasillero());
    }

    @Test
    public void testOcupanteJugadorNoPuedeMoverseDerechaPorOtroOcupantePeroSiParaArriba() {
        Mapa mapa = new Mapa(10,10);
        Casillero casillero1 = new Casillero();
    	Inventario inventario = new Inventario();
    	Mesa mesa = new Mesa();
        Jugador jugador = new Jugador(inventario, mesa);
        Ocupante ocupante2 = new Madera();
        jugador.setCasillero(casillero1);
        Posicion posicion1 = new Posicion(5,5); // Aca pongo al Modelo.Jugador
        Posicion posicion2 = new Posicion(7,5); // Aca pongo a la Madera

        Posicion posicionFinal = new Posicion(6,6); // No puede moverse mas

        jugador.ingresar(mapa, posicion1);
        ocupante2.ingresar(mapa, posicion2);
        // Lo muevo a la derecha 2 veces
        jugador.mover(Direccion.derecha());
        jugador.mover(Direccion.derecha());
        jugador.mover(Direccion.derecha());
        jugador.mover(Direccion.derecha());

        jugador.mover(Direccion.arriba());

        assertSame(mapa.getCasillero(posicionFinal), jugador.getCasillero());
    }

    @Test
    public void testOcupanteJugadorNoPuedeMoverseDerechaPorOtroOcupantePeroSiParaAbajo() {
        Mapa mapa = new Mapa(10,10);
        Casillero casillero1 = new Casillero();
    	Inventario inventario = new Inventario();
    	Mesa mesa = new Mesa();
        Jugador jugador = new Jugador(inventario, mesa);
        Ocupante ocupante2 = new Madera();
        jugador.setCasillero(casillero1);
        Posicion posicion1 = new Posicion(5,5); // Aca pongo al Modelo.Jugador
        Posicion posicion2 = new Posicion(7,5); // Aca pongo a la Madera

        Posicion posicionFinal = new Posicion(6,4); // No puede moverse mas

        jugador.ingresar(mapa, posicion1);
        ocupante2.ingresar(mapa, posicion2);
        // Lo muevo a la derecha 2 veces
        jugador.mover(Direccion.derecha());
        jugador.mover(Direccion.derecha());
        jugador.mover(Direccion.derecha());
        jugador.mover(Direccion.derecha());

        jugador.mover(Direccion.abajo());

        assertSame(mapa.getCasillero(posicionFinal), jugador.getCasillero());
    }

    @Test
    public void testOcupanteJugadorNoPuedeMoverseDerechaPorOtroOcupantePeroSiParaArribaYDerechaDeNuevo() {
        Mapa mapa = new Mapa(10,10);
        Casillero casillero1 = new Casillero();
    	Inventario inventario = new Inventario();
    	Mesa mesa = new Mesa();
        Jugador jugador = new Jugador(inventario, mesa);
        Ocupante ocupante2 = new Madera();
        jugador.setCasillero(casillero1);
        Posicion posicion1 = new Posicion(5,5); // Aca pongo al Modelo.Jugador
        Posicion posicion2 = new Posicion(7,5); // Aca pongo a la Madera

        Posicion posicionFinal = new Posicion(7,4); // No puede moverse mas

        jugador.ingresar(mapa, posicion1);
        ocupante2.ingresar(mapa, posicion2);
        // Lo muevo a la derecha 2 veces
        jugador.mover(Direccion.derecha());
        jugador.mover(Direccion.derecha());
        jugador.mover(Direccion.derecha());
        jugador.mover(Direccion.derecha());

        jugador.mover(Direccion.abajo());

        jugador.mover(Direccion.derecha());

        assertSame(mapa.getCasillero(posicionFinal), jugador.getCasillero());
    }

    @Test
    public void testOcupanteJugadorEncerradoPorRecursos() {
        Mapa mapa = new Mapa(10,10);
        Casillero casillero1 = new Casillero();
    	Inventario inventario = new Inventario();
    	Mesa mesa = new Mesa();
        Jugador jugador = new Jugador(inventario, mesa);
        Ocupante ocupante2 = new Madera();
        Ocupante ocupante3 = new Madera();
        Ocupante ocupante4 = new Madera();
        Ocupante ocupante5 = new Madera();
        jugador.setCasillero(casillero1);
        Posicion posicion1 = new Posicion(5,5); // Aca pongo al Modelo.Jugador
        Posicion posicion2 = new Posicion(6,5); // Aca pongo a la Madera
        Posicion posicion3 = new Posicion(4,5); // Aca pongo a la Madera
        Posicion posicion4 = new Posicion(5,6); // Aca pongo a la Madera
        Posicion posicion5 = new Posicion(5,4); // Aca pongo a la Madera



        jugador.ingresar(mapa, posicion1);
        ocupante2.ingresar(mapa, posicion2);
        ocupante3.ingresar(mapa, posicion3);
        ocupante4.ingresar(mapa, posicion4);
        ocupante5.ingresar(mapa, posicion5);
        // Lo muevo a la derecha 2 veces
        jugador.mover(Direccion.derecha());
        jugador.mover(Direccion.derecha());
        jugador.mover(Direccion.derecha());
        jugador.mover(Direccion.derecha());

        jugador.mover(Direccion.abajo());
        jugador.mover(Direccion.abajo());
        jugador.mover(Direccion.abajo());

        jugador.mover(Direccion.izquierda());
        jugador.mover(Direccion.izquierda());
        jugador.mover(Direccion.izquierda());

        assertSame(mapa.getCasillero(posicion1), jugador.getCasillero());
    }

    @Test
    public void testOcupanteJugadorEsquivaOcupanteEnMapa() {
        Mapa mapa = new Mapa(10,10);
        Casillero casillero1 = new Casillero();
    	Inventario inventario = new Inventario();
    	Mesa mesa = new Mesa();
        Jugador jugador = new Jugador(inventario, mesa);
        Ocupante ocupante2 = new Madera();
        Ocupante ocupante3 = new Madera();
        Ocupante ocupante4 = new Madera();
        Ocupante ocupante5 = new Madera();
        jugador.setCasillero(casillero1);
        Posicion posicion1 = new Posicion(3,3); // Aca pongo al Modelo.Jugador
        Posicion posicion2 = new Posicion(5,3); // Aca pongo a la Madera
        Posicion posicion3 = new Posicion(6,3); // Aca pongo a la Madera
        Posicion posicion4 = new Posicion(6,4); // Aca pongo a la Madera
        Posicion posicion5 = new Posicion(6,5); // Aca pongo a la Madera

        Posicion posicionFinal = new Posicion(7,3); // Donde quiero llegar

        jugador.ingresar(mapa, posicion1);
        ocupante2.ingresar(mapa, posicion2);
        ocupante3.ingresar(mapa, posicion3);
        ocupante4.ingresar(mapa, posicion4);
        ocupante5.ingresar(mapa, posicion5);
        // Lo muevo a la derecha 2 veces
        jugador.mover(Direccion.derecha());
        jugador.mover(Direccion.derecha());
        jugador.mover(Direccion.derecha());
        jugador.mover(Direccion.derecha());

        jugador.mover(Direccion.arriba());
        jugador.mover(Direccion.derecha());
        jugador.mover(Direccion.derecha());
        jugador.mover(Direccion.derecha());

        jugador.mover(Direccion.arriba());
        jugador.mover(Direccion.derecha());
        jugador.mover(Direccion.derecha());

        jugador.mover(Direccion.arriba());
        jugador.mover(Direccion.derecha());
        jugador.mover(Direccion.derecha());

        jugador.mover(Direccion.abajo());
        jugador.mover(Direccion.abajo());
        jugador.mover(Direccion.abajo());


        assertSame(mapa.getCasillero(posicionFinal), jugador.getCasillero());
    }


    @Test
    public void testLuegoDeMoverOcupanteAOtroCasilleroElCasilleroOrigenQuedaDisponibleParaSerOcupado(){

        Casillero casilleroOrigen = new Casillero();

    	Inventario inventario = new Inventario();
    	Mesa mesa = new Mesa();
        Jugador jugador = new Jugador(inventario, mesa);
        jugador.setCasillero(casilleroOrigen);

        Mapa mapa = new Mapa(10,10);
        jugador.ingresar(mapa,new Posicion(4,4));
        jugador.mover(Direccion.izquierda());

        // ahora el casillero origen debe estar disponible
        Jugador otroJugador = new Jugador(inventario, mesa);
        otroJugador.setCasillero(casilleroOrigen);

        assertEquals(casilleroOrigen,otroJugador.getCasillero());
    }


}


