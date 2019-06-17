package MapaTest;

import Jugador.Jugador;
import Recursos.*;
import Mapa.*;
import org.junit.Test;

import static junit.framework.TestCase.*;

public class MapaIntegracionTest {

    // MOVIMIENTO ITEM JUGADOR - MAPA VACIO
    // 2 movimientos a la derecha
    @Test
    public void testItemJugadorSeMueveALaDerechaEnElMapaDosVeces() {
        Mapa mapa = new Mapa(10,10);
        Casillero casillero1 = new Casillero();
        Item item = new Jugador();
        item.setCasillero(casillero1);
        Posicion posicionInicial = new Posicion(5,5);
        item.ingresar(mapa, posicionInicial);
        // Lo muevo a la derecha 2 veces
        item.mover(mapa, Direccion.derecha());
        item.mover(mapa, Direccion.derecha());
        Posicion posicionFinal = new Posicion(7,5);

        assertSame(mapa.getCasillero(posicionFinal),item.getCasillero());
    }
    // 100 movimientos a la derecha
    @Test
    public void testItemJugadorSeMueveALaDerechaEnElMapaCienVeces() {
        Mapa mapa = new Mapa(10,10);
        Casillero casillero1 = new Casillero();
        Item item = new Jugador();
        item.setCasillero(casillero1);
        Posicion posicionInicial = new Posicion(5,5);
        item.ingresar(mapa, posicionInicial);
        // Lo muevo a la derecha 100 veces
        for(int i=0; i < 100; i++){item.mover(mapa, Direccion.derecha());}
        Posicion posicionFinal = new Posicion(8,5);

        assertSame(mapa.getCasillero(posicionFinal),item.getCasillero());
    }
    //////
    // 2 movimientos a la izquierda
    @Test
    public void testItemJugadorSeMueveALaIzquierdaEnElMapaDosVeces() {
        Mapa mapa = new Mapa(10,10);
        Casillero casillero1 = new Casillero();
        Item item = new Jugador();
        item.setCasillero(casillero1);
        Posicion posicionInicial = new Posicion(5,5);
        item.ingresar(mapa, posicionInicial);
        // Lo muevo a la izquierda 2 veces
        item.mover(mapa, Direccion.izquierda());
        item.mover(mapa, Direccion.izquierda());
        Posicion posicionFinal = new Posicion(3,5);

        assertSame(mapa.getCasillero(posicionFinal),item.getCasillero());
    }
    // 100 movimientos a la izquierda
    @Test
    public void testItemJugadorSeMueveALaIzquierdaEnElMapaCienVeces() {
        Mapa mapa = new Mapa(10,10);
        Casillero casillero1 = new Casillero();
        Item item = new Jugador();
        item.setCasillero(casillero1);
        Posicion posicionInicial = new Posicion(5,5);
        item.ingresar(mapa, posicionInicial);
        // Lo muevo a la izquierda 100 veces
        for(int i=0; i < 100; i++){item.mover(mapa, Direccion.izquierda());}
        Posicion posicionFinal = new Posicion(1,5);

        assertSame(mapa.getCasillero(posicionFinal),item.getCasillero());
    }
    //////
    // 2 movimientos a arriba
    @Test
    public void testItemJugadorSeMueveParaArribaEnElMapaDosVeces() {
        Mapa mapa = new Mapa(10,10);
        Casillero casillero1 = new Casillero();
        Item item = new Jugador();
        item.setCasillero(casillero1);
        Posicion posicionInicial = new Posicion(5,5);
        item.ingresar(mapa, posicionInicial);
        // Lo muevo para arriba 2 veces
        item.mover(mapa, Direccion.arriba());
        item.mover(mapa, Direccion.arriba());
        Posicion posicionFinal = new Posicion(5,7);

        assertSame(mapa.getCasillero(posicionFinal),item.getCasillero());
    }
    // 100 movimientos para arriba
    @Test
    public void testItemJugadorSeMueveParaArribaEnElMapaCienVeces() {
        Mapa mapa = new Mapa(10,10);
        Casillero casillero1 = new Casillero();
        Item item = new Jugador();
        item.setCasillero(casillero1);
        Posicion posicionInicial = new Posicion(5,5);
        item.ingresar(mapa, posicionInicial);
        // Lo muevo para arriba 100 veces
        for(int i=0; i < 100; i++){item.mover(mapa, Direccion.arriba());}
        Posicion posicionFinal = new Posicion(5,8);

        assertSame(mapa.getCasillero(posicionFinal),item.getCasillero());
    }
    //////
    // 2 movimientos a abajo
    @Test
    public void testItemJugadorSeMueveParaAbajoEnElMapaDosVeces() {
        Mapa mapa = new Mapa(10,10);
        Casillero casillero1 = new Casillero();
        Item item = new Jugador();
        item.setCasillero(casillero1);
        Posicion posicionInicial = new Posicion(5,5);
        item.ingresar(mapa, posicionInicial);
        // Lo muevo para arriba 2 veces
        item.mover(mapa, Direccion.abajo());
        item.mover(mapa, Direccion.abajo());
        Posicion posicionFinal = new Posicion(5,3);

        assertSame(mapa.getCasillero(posicionFinal),item.getCasillero());
    }
    // 100 movimientos para abajo
    @Test
    public void testItemJugadorSeMueveParaAbajoEnElMapaCienVeces() {
        Mapa mapa = new Mapa(10,10);
        Casillero casillero1 = new Casillero();
        Item item = new Jugador();
        item.setCasillero(casillero1);
        Posicion posicionInicial = new Posicion(5,5);
        item.ingresar(mapa, posicionInicial);
        // Lo muevo para arriba 100 veces
        for(int i=0; i < 100; i++){item.mover(mapa, Direccion.abajo());}
        Posicion posicionFinal = new Posicion(5,1);

        assertSame(mapa.getCasillero(posicionFinal),item.getCasillero());
    }

    // MOVIMIENTO ITEM RECURSO NO SE MUEVE - MAPA VACIO
    // ITEM MADERA - NO SE MUEVE
    // 2 movimientos a la derecha
    @Test
    public void testItemMaderaSeMueveALaDerechaEnElMapaDosVeces() {
        Mapa mapa = new Mapa(10,10);
        Casillero casillero1 = new Casillero();
        Item item = new Madera();
        item.setCasillero(casillero1);
        Posicion posicionInicial = new Posicion(5,5);
        item.ingresar(mapa, posicionInicial);
        // Lo muevo a la derecha 2 veces
        item.mover(mapa, Direccion.derecha());
        item.mover(mapa, Direccion.derecha());

        assertSame(mapa.getCasillero(posicionInicial),item.getCasillero());
    }
    // 100 movimientos a la derecha
    @Test
    public void testItemMaderaSeMueveALaDerechaEnElMapaCienVeces() {
        Mapa mapa = new Mapa(10,10);
        Casillero casillero1 = new Casillero();
        Item item = new Madera();
        item.setCasillero(casillero1);
        Posicion posicionInicial = new Posicion(5,5);
        item.ingresar(mapa, posicionInicial);
        // Lo muevo a la derecha 100 veces
        for(int i=0; i < 100; i++){item.mover(mapa, Direccion.derecha());}

        assertSame(mapa.getCasillero(posicionInicial),item.getCasillero());
    }
    //////
    // 2 movimientos a la izquierda
    @Test
    public void testItemMaderaSeMueveALaIzquierdaEnElMapaDosVeces() {
        Mapa mapa = new Mapa(10,10);
        Casillero casillero1 = new Casillero();
        Item item = new Madera();
        item.setCasillero(casillero1);
        Posicion posicionInicial = new Posicion(5,5);
        item.ingresar(mapa, posicionInicial);
        // Lo muevo a la izquierda 2 veces
        item.mover(mapa, Direccion.izquierda());
        item.mover(mapa, Direccion.izquierda());

        assertSame(mapa.getCasillero(posicionInicial),item.getCasillero());
    }
    // 100 movimientos a la izquierda
    @Test
    public void testItemMaderaSeMueveALaIzquierdaEnElMapaCienVeces() {
        Mapa mapa = new Mapa(10,10);
        Casillero casillero1 = new Casillero();
        Item item = new Madera();
        item.setCasillero(casillero1);
        Posicion posicionInicial = new Posicion(5,5);
        item.ingresar(mapa, posicionInicial);
        // Lo muevo a la izquierda 100 veces
        for(int i=0; i < 100; i++){item.mover(mapa, Direccion.izquierda());}

        assertSame(mapa.getCasillero(posicionInicial),item.getCasillero());
    }
    //////
    // 2 movimientos a arriba
    @Test
    public void testItemMaderaSeMueveParaArribaEnElMapaDosVeces() {
        Mapa mapa = new Mapa(10,10);
        Casillero casillero1 = new Casillero();
        Item item = new Madera();
        item.setCasillero(casillero1);
        Posicion posicionInicial = new Posicion(5,5);
        item.ingresar(mapa, posicionInicial);
        // Lo muevo para arriba 2 veces
        item.mover(mapa, Direccion.arriba());
        item.mover(mapa, Direccion.arriba());

        assertSame(mapa.getCasillero(posicionInicial),item.getCasillero());
    }
    // 100 movimientos para arriba
    @Test
    public void testItemMaderaSeMueveParaArribaEnElMapaCienVeces() {
        Mapa mapa = new Mapa(10,10);
        Casillero casillero1 = new Casillero();
        Item item = new Madera();
        item.setCasillero(casillero1);
        Posicion posicionInicial = new Posicion(5,5);
        item.ingresar(mapa, posicionInicial);
        // Lo muevo para arriba 100 veces
        for(int i=0; i < 100; i++){item.mover(mapa, Direccion.arriba());}

        assertSame(mapa.getCasillero(posicionInicial),item.getCasillero());
    }
    //////
    // 2 movimientos a abajo
    @Test
    public void testItemMaderaSeMueveParaAbajoEnElMapaDosVeces() {
        Mapa mapa = new Mapa(10,10);
        Casillero casillero1 = new Casillero();
        Item item = new Madera();
        item.setCasillero(casillero1);
        Posicion posicionInicial = new Posicion(5,5);
        item.ingresar(mapa, posicionInicial);
        // Lo muevo para arriba 2 veces
        item.mover(mapa, Direccion.abajo());
        item.mover(mapa, Direccion.abajo());

        assertSame(mapa.getCasillero(posicionInicial),item.getCasillero());
    }
    // 100 movimientos para abajo
    @Test
    public void testItemMaderaSeMueveParaAbajoEnElMapaCienVeces() {
        Mapa mapa = new Mapa(10,10);
        Casillero casillero1 = new Casillero();
        Item item = new Madera();
        item.setCasillero(casillero1);
        Posicion posicionInicial = new Posicion(5,5);
        item.ingresar(mapa, posicionInicial);
        // Lo muevo para arriba 100 veces
        for(int i=0; i < 100; i++){item.mover(mapa, Direccion.abajo());}

        assertSame(mapa.getCasillero(posicionInicial),item.getCasillero());
    }


    // MOVIMIENTO ITEM RECURSO NO SE MUEVE - MAPA VACIO
    // ITEM METAL - NO SE MUEVE
    // 2 movimientos a la derecha
    @Test
    public void testItemMetalSeMueveALaDerechaEnElMapaDosVeces() {
        Mapa mapa = new Mapa(10,10);
        Casillero casillero1 = new Casillero();
        Item item = new Metal();
        item.setCasillero(casillero1);
        Posicion posicionInicial = new Posicion(5,5);
        item.ingresar(mapa, posicionInicial);
        // Lo muevo a la derecha 2 veces
        item.mover(mapa, Direccion.derecha());
        item.mover(mapa, Direccion.derecha());

        assertSame(mapa.getCasillero(posicionInicial),item.getCasillero());
    }
    // 100 movimientos a la derecha
    @Test
    public void testItemMetalSeMueveALaDerechaEnElMapaCienVeces() {
        Mapa mapa = new Mapa(10,10);
        Casillero casillero1 = new Casillero();
        Item item = new Metal();
        item.setCasillero(casillero1);
        Posicion posicionInicial = new Posicion(5,5);
        item.ingresar(mapa, posicionInicial);
        // Lo muevo a la derecha 100 veces
        for(int i=0; i < 100; i++){item.mover(mapa, Direccion.derecha());}

        assertSame(mapa.getCasillero(posicionInicial),item.getCasillero());
    }
    //////
    // 2 movimientos a la izquierda
    @Test
    public void testItemMetalSeMueveALaIzquierdaEnElMapaDosVeces() {
        Mapa mapa = new Mapa(10,10);
        Casillero casillero1 = new Casillero();
        Item item = new Metal();
        item.setCasillero(casillero1);
        Posicion posicionInicial = new Posicion(5,5);
        item.ingresar(mapa, posicionInicial);
        // Lo muevo a la izquierda 2 veces
        item.mover(mapa, Direccion.izquierda());
        item.mover(mapa, Direccion.izquierda());

        assertSame(mapa.getCasillero(posicionInicial),item.getCasillero());
    }
    // 100 movimientos a la izquierda
    @Test
    public void testItemMetalSeMueveALaIzquierdaEnElMapaCienVeces() {
        Mapa mapa = new Mapa(10,10);
        Casillero casillero1 = new Casillero();
        Item item = new Metal();
        item.setCasillero(casillero1);
        Posicion posicionInicial = new Posicion(5,5);
        item.ingresar(mapa, posicionInicial);
        // Lo muevo a la izquierda 100 veces
        for(int i=0; i < 100; i++){item.mover(mapa, Direccion.izquierda());}

        assertSame(mapa.getCasillero(posicionInicial),item.getCasillero());
    }
    //////
    // 2 movimientos a arriba
    @Test
    public void testItemMetalSeMueveParaArribaEnElMapaDosVeces() {
        Mapa mapa = new Mapa(10,10);
        Casillero casillero1 = new Casillero();
        Item item = new Metal();
        item.setCasillero(casillero1);
        Posicion posicionInicial = new Posicion(5,5);
        item.ingresar(mapa, posicionInicial);
        // Lo muevo para arriba 2 veces
        item.mover(mapa, Direccion.arriba());
        item.mover(mapa, Direccion.arriba());

        assertSame(mapa.getCasillero(posicionInicial),item.getCasillero());
    }
    // 100 movimientos para arriba
    @Test
    public void testItemMetalSeMueveParaArribaEnElMapaCienVeces() {
        Mapa mapa = new Mapa(10,10);
        Casillero casillero1 = new Casillero();
        Item item = new Metal();
        item.setCasillero(casillero1);
        Posicion posicionInicial = new Posicion(5,5);
        item.ingresar(mapa, posicionInicial);
        // Lo muevo para arriba 100 veces
        for(int i=0; i < 100; i++){item.mover(mapa, Direccion.arriba());}

        assertSame(mapa.getCasillero(posicionInicial),item.getCasillero());
    }

    //////
    // 2 movimientos a abajo
    @Test
    public void testItemMetalSeMueveParaAbajoEnElMapaDosVeces() {
        Mapa mapa = new Mapa(10,10);
        Casillero casillero1 = new Casillero();
        Item item = new Metal();
        item.setCasillero(casillero1);
        Posicion posicionInicial = new Posicion(5,5);
        item.ingresar(mapa, posicionInicial);
        // Lo muevo para arriba 2 veces
        item.mover(mapa, Direccion.abajo());
        item.mover(mapa, Direccion.abajo());

        assertSame(mapa.getCasillero(posicionInicial),item.getCasillero());
    }
    // 100 movimientos para abajo
    @Test
    public void testItemMetalSeMueveParaAbajoEnElMapaCienVeces() {
        Mapa mapa = new Mapa(10,10);
        Casillero casillero1 = new Casillero();
        Item item = new Metal();
        item.setCasillero(casillero1);
        Posicion posicionInicial = new Posicion(5,5);
        item.ingresar(mapa, posicionInicial);
        // Lo muevo para arriba 100 veces
        for(int i=0; i < 100; i++){item.mover(mapa, Direccion.abajo());}

        assertSame(mapa.getCasillero(posicionInicial),item.getCasillero());
    }

    // MOVIMIENTO ITEM RECURSO NO SE MUEVE - MAPA VACIO
    // ITEM PIEDRA - NO SE MUEVE
    // 2 movimientos a la derecha
    @Test
    public void testItemPiedraSeMueveALaDerechaEnElMapaDosVeces() {
        Mapa mapa = new Mapa(10,10);
        Casillero casillero1 = new Casillero();
        Item item = new Piedra();
        item.setCasillero(casillero1);
        Posicion posicionInicial = new Posicion(5,5);
        item.ingresar(mapa, posicionInicial);
        // Lo muevo a la derecha 2 veces
        item.mover(mapa, Direccion.derecha());
        item.mover(mapa, Direccion.derecha());

        assertSame(mapa.getCasillero(posicionInicial),item.getCasillero());
    }
    // 100 movimientos a la derecha
    @Test
    public void testItemPiedraSeMueveALaDerechaEnElMapaCienVeces() {
        Mapa mapa = new Mapa(10,10);
        Casillero casillero1 = new Casillero();
        Item item = new Piedra();
        item.setCasillero(casillero1);
        Posicion posicionInicial = new Posicion(5,5);
        item.ingresar(mapa, posicionInicial);
        // Lo muevo a la derecha 100 veces
        for(int i=0; i < 100; i++){item.mover(mapa, Direccion.derecha());}

        assertSame(mapa.getCasillero(posicionInicial),item.getCasillero());
    }
    //////
    // 2 movimientos a la izquierda
    @Test
    public void testItemPiedraSeMueveALaIzquierdaEnElMapaDosVeces() {
        Mapa mapa = new Mapa(10,10);
        Casillero casillero1 = new Casillero();
        Item item = new Piedra();
        item.setCasillero(casillero1);
        Posicion posicionInicial = new Posicion(5,5);
        item.ingresar(mapa, posicionInicial);
        // Lo muevo a la izquierda 2 veces
        item.mover(mapa, Direccion.izquierda());
        item.mover(mapa, Direccion.izquierda());

        assertSame(mapa.getCasillero(posicionInicial),item.getCasillero());
    }
    // 100 movimientos a la izquierda
    @Test
    public void testItemPiedraSeMueveALaIzquierdaEnElMapaCienVeces() {
        Mapa mapa = new Mapa(10,10);
        Casillero casillero1 = new Casillero();
        Item item = new Piedra();
        item.setCasillero(casillero1);
        Posicion posicionInicial = new Posicion(5,5);
        item.ingresar(mapa, posicionInicial);
        // Lo muevo a la izquierda 100 veces
        for(int i=0; i < 100; i++){item.mover(mapa, Direccion.izquierda());}

        assertSame(mapa.getCasillero(posicionInicial),item.getCasillero());
    }
    //////
    // 2 movimientos a arriba
    @Test
    public void testItemPiedraSeMueveParaArribaEnElMapaDosVeces() {
        Mapa mapa = new Mapa(10,10);
        Casillero casillero1 = new Casillero();
        Item item = new Piedra();
        item.setCasillero(casillero1);
        Posicion posicionInicial = new Posicion(5,5);
        item.ingresar(mapa, posicionInicial);
        // Lo muevo para arriba 2 veces
        item.mover(mapa, Direccion.arriba());
        item.mover(mapa, Direccion.arriba());

        assertSame(mapa.getCasillero(posicionInicial),item.getCasillero());
    }
    // 100 movimientos para arriba
    @Test
    public void testItemPiedraSeMueveParaArribaEnElMapaCienVeces() {
        Mapa mapa = new Mapa(10,10);
        Casillero casillero1 = new Casillero();
        Item item = new Piedra();
        item.setCasillero(casillero1);
        Posicion posicionInicial = new Posicion(5,5);
        item.ingresar(mapa, posicionInicial);
        // Lo muevo para arriba 100 veces
        for(int i=0; i < 100; i++){item.mover(mapa, Direccion.arriba());}

        assertSame(mapa.getCasillero(posicionInicial),item.getCasillero());
    }

    //////
    // 2 movimientos a abajo
    @Test
    public void testItemPiedraSeMueveParaAbajoEnElMapaDosVeces() {
        Mapa mapa = new Mapa(10,10);
        Casillero casillero1 = new Casillero();
        Item item = new Piedra();
        item.setCasillero(casillero1);
        Posicion posicionInicial = new Posicion(5,5);
        item.ingresar(mapa, posicionInicial);
        // Lo muevo para arriba 2 veces
        item.mover(mapa, Direccion.abajo());
        item.mover(mapa, Direccion.abajo());

        assertSame(mapa.getCasillero(posicionInicial),item.getCasillero());
    }
    // 100 movimientos para abajo
    @Test
    public void testItemPiedraSeMueveParaAbajoEnElMapaCienVeces() {
        Mapa mapa = new Mapa(10,10);
        Casillero casillero1 = new Casillero();
        Item item = new Piedra();
        item.setCasillero(casillero1);
        Posicion posicionInicial = new Posicion(5,5);
        item.ingresar(mapa, posicionInicial);
        // Lo muevo para arriba 100 veces
        for(int i=0; i < 100; i++){item.mover(mapa, Direccion.abajo());}

        assertSame(mapa.getCasillero(posicionInicial),item.getCasillero());
    }


    // MOVIMIENTO ITEM JUGADOR - MAPA CON ITEMS RECURSOS
    //
    @Test
    public void testItemJugadorSeMueveALaDerechaHastaChocarConOtroItem() {
        Mapa mapa = new Mapa(10,10);
        Casillero casillero1 = new Casillero();
        Item item1 = new Jugador();
        Item item2 = new Madera();
        item1.setCasillero(casillero1);
        Posicion posicion1 = new Posicion(5,5); // Aca pongo al Jugador
        Posicion posicion2 = new Posicion(6,5); // No puede moverse mas
        Posicion posicion3 = new Posicion(7,5); // Aca pongo a la Madera

        item1.ingresar(mapa, posicion1);
        item2.ingresar(mapa, posicion3);
        // Lo muevo a la derecha 2 veces
        item1.mover(mapa, Direccion.derecha());
        item1.mover(mapa, Direccion.derecha());
        item1.mover(mapa, Direccion.derecha());
        item1.mover(mapa, Direccion.derecha());

        assertSame(mapa.getCasillero(posicion2),item1.getCasillero());
    }

    @Test
    public void testItemJugadorNoPuedeMoverseDerechaPorOtroItemPeroSiParaArriba() {
        Mapa mapa = new Mapa(10,10);
        Casillero casillero1 = new Casillero();
        Item item1 = new Jugador();
        Item item2 = new Madera();
        item1.setCasillero(casillero1);
        Posicion posicion1 = new Posicion(5,5); // Aca pongo al Jugador
        Posicion posicion2 = new Posicion(7,5); // Aca pongo a la Madera

        Posicion posicionFinal = new Posicion(6,6); // No puede moverse mas

        item1.ingresar(mapa, posicion1);
        item2.ingresar(mapa, posicion2);
        // Lo muevo a la derecha 2 veces
        item1.mover(mapa, Direccion.derecha());
        item1.mover(mapa, Direccion.derecha());
        item1.mover(mapa, Direccion.derecha());
        item1.mover(mapa, Direccion.derecha());

        item1.mover(mapa, Direccion.arriba());

        assertSame(mapa.getCasillero(posicionFinal),item1.getCasillero());
    }

    @Test
    public void testItemJugadorNoPuedeMoverseDerechaPorOtroItemPeroSiParaAbajo() {
        Mapa mapa = new Mapa(10,10);
        Casillero casillero1 = new Casillero();
        Item item1 = new Jugador();
        Item item2 = new Madera();
        item1.setCasillero(casillero1);
        Posicion posicion1 = new Posicion(5,5); // Aca pongo al Jugador
        Posicion posicion2 = new Posicion(7,5); // Aca pongo a la Madera

        Posicion posicionFinal = new Posicion(6,4); // No puede moverse mas

        item1.ingresar(mapa, posicion1);
        item2.ingresar(mapa, posicion2);
        // Lo muevo a la derecha 2 veces
        item1.mover(mapa, Direccion.derecha());
        item1.mover(mapa, Direccion.derecha());
        item1.mover(mapa, Direccion.derecha());
        item1.mover(mapa, Direccion.derecha());

        item1.mover(mapa, Direccion.abajo());

        assertSame(mapa.getCasillero(posicionFinal),item1.getCasillero());
    }

    @Test
    public void testItemJugadorNoPuedeMoverseDerechaPorOtroItemPeroSiParaArribaYDerechaDeNuevo() {
        Mapa mapa = new Mapa(10,10);
        Casillero casillero1 = new Casillero();
        Item item1 = new Jugador();
        Item item2 = new Madera();
        item1.setCasillero(casillero1);
        Posicion posicion1 = new Posicion(5,5); // Aca pongo al Jugador
        Posicion posicion2 = new Posicion(7,5); // Aca pongo a la Madera

        Posicion posicionFinal = new Posicion(7,4); // No puede moverse mas

        item1.ingresar(mapa, posicion1);
        item2.ingresar(mapa, posicion2);
        // Lo muevo a la derecha 2 veces
        item1.mover(mapa, Direccion.derecha());
        item1.mover(mapa, Direccion.derecha());
        item1.mover(mapa, Direccion.derecha());
        item1.mover(mapa, Direccion.derecha());

        item1.mover(mapa, Direccion.abajo());

        item1.mover(mapa, Direccion.derecha());

        assertSame(mapa.getCasillero(posicionFinal),item1.getCasillero());
    }

    @Test
    public void testItemJugadorEncerradoPorRecursos() {
        Mapa mapa = new Mapa(10,10);
        Casillero casillero1 = new Casillero();
        Item item1 = new Jugador();
        Item item2 = new Madera();
        Item item3 = new Madera();
        Item item4 = new Madera();
        Item item5 = new Madera();
        item1.setCasillero(casillero1);
        Posicion posicion1 = new Posicion(5,5); // Aca pongo al Jugador
        Posicion posicion2 = new Posicion(6,5); // Aca pongo a la Madera
        Posicion posicion3 = new Posicion(4,5); // Aca pongo a la Madera
        Posicion posicion4 = new Posicion(5,6); // Aca pongo a la Madera
        Posicion posicion5 = new Posicion(5,4); // Aca pongo a la Madera



        item1.ingresar(mapa, posicion1);
        item2.ingresar(mapa, posicion2);
        item3.ingresar(mapa, posicion3);
        item4.ingresar(mapa, posicion4);
        item5.ingresar(mapa, posicion5);
        // Lo muevo a la derecha 2 veces
        item1.mover(mapa, Direccion.derecha());
        item1.mover(mapa, Direccion.derecha());
        item1.mover(mapa, Direccion.derecha());
        item1.mover(mapa, Direccion.derecha());

        item1.mover(mapa, Direccion.abajo());
        item1.mover(mapa, Direccion.abajo());
        item1.mover(mapa, Direccion.abajo());

        item1.mover(mapa, Direccion.izquierda());
        item1.mover(mapa, Direccion.izquierda());
        item1.mover(mapa, Direccion.izquierda());

        assertSame(mapa.getCasillero(posicion1),item1.getCasillero());
    }

    @Test
    public void testItemJugadorEsquivaItemEnMapa() {
        Mapa mapa = new Mapa(10,10);
        Casillero casillero1 = new Casillero();
        Item item1 = new Jugador();
        Item item2 = new Madera();
        Item item3 = new Madera();
        Item item4 = new Madera();
        Item item5 = new Madera();
        item1.setCasillero(casillero1);
        Posicion posicion1 = new Posicion(3,3); // Aca pongo al Jugador
        Posicion posicion2 = new Posicion(5,3); // Aca pongo a la Madera
        Posicion posicion3 = new Posicion(6,3); // Aca pongo a la Madera
        Posicion posicion4 = new Posicion(6,4); // Aca pongo a la Madera
        Posicion posicion5 = new Posicion(6,5); // Aca pongo a la Madera

        Posicion posicionFinal = new Posicion(7,3); // Donde quiero llegar

        item1.ingresar(mapa, posicion1);
        item2.ingresar(mapa, posicion2);
        item3.ingresar(mapa, posicion3);
        item4.ingresar(mapa, posicion4);
        item5.ingresar(mapa, posicion5);
        // Lo muevo a la derecha 2 veces
        item1.mover(mapa, Direccion.derecha());
        item1.mover(mapa, Direccion.derecha());
        item1.mover(mapa, Direccion.derecha());
        item1.mover(mapa, Direccion.derecha());

        item1.mover(mapa, Direccion.arriba());
        item1.mover(mapa, Direccion.derecha());
        item1.mover(mapa, Direccion.derecha());
        item1.mover(mapa, Direccion.derecha());

        item1.mover(mapa, Direccion.arriba());
        item1.mover(mapa, Direccion.derecha());
        item1.mover(mapa, Direccion.derecha());

        item1.mover(mapa, Direccion.arriba());
        item1.mover(mapa, Direccion.derecha());
        item1.mover(mapa, Direccion.derecha());

        item1.mover(mapa, Direccion.abajo());
        item1.mover(mapa, Direccion.abajo());
        item1.mover(mapa, Direccion.abajo());


        assertSame(mapa.getCasillero(posicionFinal),item1.getCasillero());
    }


    @Test
    public void testLuegoDeMoverItemAOtroCasilleroElCasilleroOrigenQuedaDisponibleParaSerOcupado(){

        Casillero casilleroOrigen = new Casillero();

        Item jugador = new Jugador();
        jugador.setCasillero(casilleroOrigen);

        Mapa mapa = new Mapa(10,10);
        jugador.ingresar(mapa,new Posicion(4,4));
        jugador.mover(mapa, Direccion.izquierda());

        // ahora el casillero origen debe estar disponible
        Item otroJugador = new Jugador();
        otroJugador.setCasillero(casilleroOrigen);

        assertEquals(casilleroOrigen,otroJugador.getCasillero());
    }


}


