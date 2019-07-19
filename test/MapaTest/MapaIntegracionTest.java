package MapaTest;

import Modelo.Jugador.Jugador;
import Modelo.Mapa.*;
import org.junit.Test;

import static junit.framework.TestCase.assertSame;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class MapaIntegracionTest {


    @Test
    public void testJugadorSeMueveHaciaLaIzquierdaEnElMapaUnaVez() {
        Mapa mapa = new Mapa(10,10);
        PosicionEnlazada posicionInicial = new PosicionEnlazada(2,5);
        Casillero casillero = new Casillero(posicionInicial);
        Jugador jugador = new Jugador();
        jugador.setCasillero(casillero);
        jugador.ingresar(mapa, posicionInicial);

        jugador.mover(new DireccionIzquierda());
        PosicionEnlazada posicionFinal = new PosicionEnlazada(1,5);

        assertTrue(jugador.getCasillero().getPosicion().equals(posicionFinal));
    }

    @Test
    public void testOcupanteJugadorSeMueveHaciaLaDerechaEnElMapaUnaVez() {
        Mapa mapa = new Mapa(10,10);
        PosicionEnlazada posicionInicial = new PosicionEnlazada(2,5);
        Casillero casillero = new Casillero(posicionInicial);
        Jugador jugador = new Jugador();
        jugador.setCasillero(casillero);
        jugador.ingresar(mapa, posicionInicial);

        jugador.mover(new DireccionDerecha());
        PosicionEnlazada posicionFinal = new PosicionEnlazada(3,5);


        assertTrue(jugador.getCasillero().getPosicion().equals(posicionFinal));
    }

    @Test
    public void testJugadorSeMueveHaciaArribaEnElMapaUnaVez() {
        Mapa mapa = new Mapa(10,10);
        PosicionEnlazada posicionInicial = new PosicionEnlazada(2,5);
        Casillero casillero = new Casillero(posicionInicial);
        Jugador jugador = new Jugador();
        jugador.setCasillero(casillero);
        jugador.ingresar(mapa, posicionInicial);

        jugador.mover(new DireccionArriba());
        PosicionEnlazada posicionFinal = new PosicionEnlazada(2,6);

        assertTrue(jugador.getCasillero().getPosicion().equals(posicionFinal));
    }

    @Test
    public void testJugadorSeMueveHaciaAbajoEnElMapaUnaVez() {
        Mapa mapa = new Mapa(10,10);
        PosicionEnlazada posicionInicial = new PosicionEnlazada(2,5);
        Casillero casillero = new Casillero(posicionInicial);
        Jugador jugador = new Jugador();
        jugador.setCasillero(casillero);
        jugador.ingresar(mapa, posicionInicial);

        jugador.mover(new DireccionAbajo());
        PosicionEnlazada posicionFinal = new PosicionEnlazada(2,4);

        assertTrue(jugador.getCasillero().getPosicion().equals(posicionFinal));
    }

    // Jugador se mueve y queda contenido en el mapa al llegar a sus bordes
    @Test
    public void testJugadorSeMueveALaDerechaUnaCantidadDeVecesMayorALaDimensionDelMapaYSeQuedaEnSuUltimoCasillero() {
        Mapa mapa = new Mapa(10,10);
        Casillero casillero1 = new Casillero();
        Jugador jugador = new Jugador();
        jugador.setCasillero(casillero1);
        PosicionEnlazada posicionInicial = new PosicionEnlazada(5,5);
        jugador.ingresar(mapa, posicionInicial);

        for(int i=0; i < 10; i++){
            jugador.mover(mapa, new DireccionDerecha());}
        PosicionEnlazada posicionFinal = new PosicionEnlazada(9,5);

        assertSame(mapa.getCasillero(posicionFinal), jugador.getCasillero());
    }

    @Test
    public void testJugadorSeMueveALaIzquierdaUnaCantidadDeVecesMayorALaDimensionDelMapaYSeQuedaEnSuUltimoCasillero() {
        Mapa mapa = new Mapa(10,10);
        Casillero casillero1 = new Casillero();
        Jugador jugador = new Jugador();
        jugador.setCasillero(casillero1);
        PosicionEnlazada posicionInicial = new PosicionEnlazada(5,5);
        jugador.ingresar(mapa, posicionInicial);

        for(int i=0; i < 10; i++){
            jugador.mover(mapa, new DireccionIzquierda());}
        PosicionEnlazada posicionFinal = new PosicionEnlazada(0,5);

        assertSame(mapa.getCasillero(posicionFinal), jugador.getCasillero());
    }

    @Test
    public void testJugadorSeMueveArribaUnaCantidadDeVecesMayorALaDimensionDelMapaYSeQuedaEnSuUltimoCasillero() {
        Mapa mapa = new Mapa(10,10);
        Casillero casillero1 = new Casillero();
        Jugador jugador = new Jugador();
        jugador.setCasillero(casillero1);
        PosicionEnlazada posicionInicial = new PosicionEnlazada(5,5);
        jugador.ingresar(mapa, posicionInicial);

        for(int i=0; i < 10; i++){
            jugador.mover(mapa, new DireccionArriba());}
        PosicionEnlazada posicionFinal = new PosicionEnlazada(5,9);

        assertSame(mapa.getCasillero(posicionFinal), jugador.getCasillero());
    }

    @Test
    public void testJugadorSeMueveAbajoUnaCantidadDeVecesMayorALaDimensionDelMapaYSeQuedaEnSuUltimoCasillero() {
        Mapa mapa = new Mapa(10,10);
        Casillero casillero1 = new Casillero();
        Jugador jugador = new Jugador();
        jugador.setCasillero(casillero1);
        PosicionEnlazada posicionInicial = new PosicionEnlazada(5,5);
        jugador.ingresar(mapa, posicionInicial);

        for(int i=0; i < 10; i++){
            jugador.mover(mapa, new DireccionAbajo());}
        PosicionEnlazada posicionFinal = new PosicionEnlazada(5,0);

        assertSame(mapa.getCasillero(posicionFinal), jugador.getCasillero());
    }
    

    /* // temp: hay que "trasponer" los movimientos (direccion -> posicion).
    // MOVIMIENTO OCUPANTE JUGADOR - MAPA CON OCUPANTES RECURSOS
    //
    @Test
    public void testOcupanteJugadorSeMueveALaDerechaHastaChocarConOtroOcupante() {
        Mapa mapa = new Mapa(10,10);
        Casillero casillero1 = new Casillero();
        Jugador jugador = new Jugador();
        Madera madera = new Madera();
        jugador.setCasillero(casillero1);
        PosicionEnlazada posicion1 = new PosicionEnlazada(5,5); // Aca pongo al Modelo.Jugador
        PosicionEnlazada posicion2 = new PosicionEnlazada(6,5); // No puede moverse mas
        PosicionEnlazada posicion3 = new PosicionEnlazada(7,5); // Aca pongo a la Madera

        jugador.ingresar(mapa, posicion1);
        madera.ingresar(mapa, posicion3);
        // Lo muevo a la derecha 2 veces
        jugador.mover(mapa, new DireccionDerecha());
        jugador.mover(mapa, new DireccionDerecha());
        jugador.mover(mapa, new DireccionDerecha());
        jugador.mover(mapa, new DireccionDerecha());

        assertSame(mapa.getCasillero(posicion2), jugador.getCasillero());
    }

    @Test
    public void testOcupanteJugadorNoPuedeMoverseDerechaPorOtroOcupantePeroSiParaArriba() {
        Mapa mapa = new Mapa(10,10);
        Casillero casillero1 = new Casillero();
        Jugador jugador = new Jugador();
        Ocupante ocupante2 = new Madera();
        jugador.setCasillero(casillero1);
        PosicionEnlazada posicion1 = new PosicionEnlazada(5,5); // Aca pongo al Modelo.Jugador
        PosicionEnlazada posicion2 = new PosicionEnlazada(7,5); // Aca pongo a la Madera

        PosicionEnlazada posicionFinal = new PosicionEnlazada(6,6); // No puede moverse mas

        jugador.ingresar(mapa, posicion1);
        ocupante2.ingresar(mapa, posicion2);
        // Lo muevo a la derecha 2 veces
        jugador.mover(mapa, new DireccionDerecha());
        jugador.mover(mapa, new DireccionDerecha());
        jugador.mover(mapa, new DireccionDerecha());
        jugador.mover(mapa, new DireccionDerecha());

        jugador.mover(mapa, new DireccionArriba());

        assertSame(mapa.getCasillero(posicionFinal), jugador.getCasillero());
    }

    @Test
    public void testOcupanteJugadorNoPuedeMoverseDerechaPorOtroOcupantePeroSiParaAbajo() {
        Mapa mapa = new Mapa(10,10);
        Casillero casillero1 = new Casillero();
        Jugador jugador = new Jugador();
        Ocupante ocupante2 = new Madera();
        jugador.setCasillero(casillero1);
        PosicionEnlazada posicion1 = new PosicionEnlazada(5,5); // Aca pongo al Modelo.Jugador
        PosicionEnlazada posicion2 = new PosicionEnlazada(7,5); // Aca pongo a la Madera

        PosicionEnlazada posicionFinal = new PosicionEnlazada(6,4); // No puede moverse mas

        jugador.ingresar(mapa, posicion1);
        ocupante2.ingresar(mapa, posicion2);
        // Lo muevo a la derecha 2 veces
        jugador.mover(mapa, new DireccionDerecha());
        jugador.mover(mapa, new DireccionDerecha());
        jugador.mover(mapa, new DireccionDerecha());
        jugador.mover(mapa, new DireccionDerecha());

        jugador.mover(mapa, new DireccionAbajo());

        assertSame(mapa.getCasillero(posicionFinal), jugador.getCasillero());
    }

    @Test
    public void testOcupanteJugadorNoPuedeMoverseDerechaPorOtroOcupantePeroSiParaArribaYDerechaDeNuevo() {
        Mapa mapa = new Mapa(10,10);
        Casillero casillero1 = new Casillero();
        Jugador jugador = new Jugador();
        Ocupante ocupante2 = new Madera();
        jugador.setCasillero(casillero1);
        PosicionEnlazada posicion1 = new PosicionEnlazada(5,5); // Aca pongo al Modelo.Jugador
        PosicionEnlazada posicion2 = new PosicionEnlazada(7,5); // Aca pongo a la Madera

        PosicionEnlazada posicionFinal = new PosicionEnlazada(7,4); // No puede moverse mas

        jugador.ingresar(mapa, posicion1);
        ocupante2.ingresar(mapa, posicion2);
        // Lo muevo a la derecha 2 veces
        jugador.mover(mapa, new DireccionDerecha());
        jugador.mover(mapa, new DireccionDerecha());
        jugador.mover(mapa, new DireccionDerecha());
        jugador.mover(mapa, new DireccionDerecha());

        jugador.mover(mapa, new DireccionAbajo());

        jugador.mover(mapa, new DireccionDerecha());

        assertSame(mapa.getCasillero(posicionFinal), jugador.getCasillero());
    }

    @Test
    public void testOcupanteJugadorEncerradoPorRecursos() {
        Mapa mapa = new Mapa(10,10);
        Casillero casillero1 = new Casillero();
        Jugador jugador = new Jugador();
        Ocupante ocupante2 = new Madera();
        Ocupante ocupante3 = new Madera();
        Ocupante ocupante4 = new Madera();
        Ocupante ocupante5 = new Madera();
        jugador.setCasillero(casillero1);
        PosicionEnlazada posicion1 = new PosicionEnlazada(5,5); // Aca pongo al Modelo.Jugador
        PosicionEnlazada posicion2 = new PosicionEnlazada(6,5); // Aca pongo a la Madera
        PosicionEnlazada posicion3 = new PosicionEnlazada(4,5); // Aca pongo a la Madera
        PosicionEnlazada posicion4 = new PosicionEnlazada(5,6); // Aca pongo a la Madera
        PosicionEnlazada posicion5 = new PosicionEnlazada(5,4); // Aca pongo a la Madera



        jugador.ingresar(mapa, posicion1);
        ocupante2.ingresar(mapa, posicion2);
        ocupante3.ingresar(mapa, posicion3);
        ocupante4.ingresar(mapa, posicion4);
        ocupante5.ingresar(mapa, posicion5);
        // Lo muevo a la derecha 2 veces
        jugador.mover(mapa, new DireccionDerecha());
        jugador.mover(mapa, new DireccionDerecha());
        jugador.mover(mapa, new DireccionDerecha());
        jugador.mover(mapa, new DireccionDerecha());

        jugador.mover(mapa, new DireccionAbajo());
        jugador.mover(mapa, new DireccionAbajo());
        jugador.mover(mapa, new DireccionAbajo());

        jugador.mover(mapa, new DireccionIzquierda());
        jugador.mover(mapa, new DireccionIzquierda());
        jugador.mover(mapa, new DireccionIzquierda());

        assertSame(mapa.getCasillero(posicion1), jugador.getCasillero());
    }

    @Test
    public void testOcupanteJugadorEsquivaOcupanteEnMapa() {
        Mapa mapa = new Mapa(10,10);
        Casillero casillero1 = new Casillero();
        Jugador jugador = new Jugador();
        Ocupante ocupante2 = new Madera();
        Ocupante ocupante3 = new Madera();
        Ocupante ocupante4 = new Madera();
        Ocupante ocupante5 = new Madera();
        jugador.setCasillero(casillero1);
        PosicionEnlazada posicion1 = new PosicionEnlazada(3,3); // Aca pongo al Modelo.Jugador
        PosicionEnlazada posicion2 = new PosicionEnlazada(5,3); // Aca pongo a la Madera
        PosicionEnlazada posicion3 = new PosicionEnlazada(6,3); // Aca pongo a la Madera
        PosicionEnlazada posicion4 = new PosicionEnlazada(6,4); // Aca pongo a la Madera
        PosicionEnlazada posicion5 = new PosicionEnlazada(6,5); // Aca pongo a la Madera

        PosicionEnlazada posicionFinal = new PosicionEnlazada(7,3); // Donde quiero llegar

        jugador.ingresar(mapa, posicion1);
        ocupante2.ingresar(mapa, posicion2);
        ocupante3.ingresar(mapa, posicion3);
        ocupante4.ingresar(mapa, posicion4);
        ocupante5.ingresar(mapa, posicion5);
        // Lo muevo a la derecha 2 veces
        jugador.mover(mapa, new DireccionDerecha());
        jugador.mover(mapa, new DireccionDerecha());
        jugador.mover(mapa, new DireccionDerecha());
        jugador.mover(mapa, new DireccionDerecha());

        jugador.mover(mapa, new DireccionArriba());
        jugador.mover(mapa, new DireccionDerecha());
        jugador.mover(mapa, new DireccionDerecha());
        jugador.mover(mapa, new DireccionDerecha());

        jugador.mover(mapa, new DireccionArriba());
        jugador.mover(mapa, new DireccionDerecha());
        jugador.mover(mapa, new DireccionDerecha());

        jugador.mover(mapa, new DireccionArriba());
        jugador.mover(mapa, new DireccionDerecha());
        jugador.mover(mapa, new DireccionDerecha());

        jugador.mover(mapa, new DireccionAbajo());
        jugador.mover(mapa, new DireccionAbajo());
        jugador.mover(mapa, new DireccionAbajo());


        assertSame(mapa.getCasillero(posicionFinal), jugador.getCasillero());
    }
    */


    // Casillero ocupado / desocupado
    @Test
    public void testLuegoDeMoverOcupanteAOtroCasilleroElCasilleroOrigenQuedaDisponibleParaSerOcupado(){

        Casillero casilleroOrigen = new Casillero();

        Jugador jugador = new Jugador();
        jugador.setCasillero(casilleroOrigen);

        Mapa mapa = new Mapa(10,10);
        jugador.ingresar(mapa,new PosicionEnlazada(4,4));
        jugador.mover(mapa, new DireccionIzquierda());

        // ahora el casillero origen debe estar disponible
        Jugador otroJugador = new Jugador();
        otroJugador.setCasillero(casilleroOrigen);

        assertEquals(casilleroOrigen,otroJugador.getCasillero());
    }




}


