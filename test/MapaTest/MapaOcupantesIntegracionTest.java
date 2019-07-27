package MapaTest;

import Modelo.Herramientas.Hacha;
import Modelo.Inventario.Inventario;
import Modelo.Jugador.Jugador;
import Modelo.Mapa.*;
import Modelo.MateriaPrima.MPMadera;
import Modelo.MesaDeTrabajo.Mesa;
import Modelo.Recursos.Madera;
import Modelo.Recursos.Piedra;
import Modelo.TipoMaterial.TipoMadera;
import org.junit.Test;

import static junit.framework.TestCase.assertSame;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class MapaOcupantesIntegracionTest {

    // Jugador se mueve y queda contenido en el mapa al llegar a sus bordes
    @Test
    public void testJugadorSeMueveALaDerechaUnaCantidadDeVecesMayorALaDimensionDelMapaYSeQuedaEnSuUltimoCasillero() {
        Mapa mapa = new Mapa(10,10);
        Casillero casillero1 = new Casillero();
    	Inventario inventario = new Inventario();
    	Mesa mesa = new Mesa();
        Jugador jugador = new Jugador(inventario, mesa);
        jugador.setCasillero(casillero1);
        PosicionEnlazada posicionInicial = new PosicionEnlazada(5,5);
        jugador.ingresar(mapa, posicionInicial);

        for(int i=0; i < 10; i++){
            jugador.mover(new DireccionDerecha());}
        PosicionEnlazada posicionFinal = new PosicionEnlazada(5,9);

        assertSame(mapa.getCasillero(posicionFinal), jugador.getCasillero());
    }

    @Test
    public void testJugadorSeMueveALaIzquierdaUnaCantidadDeVecesMayorALaDimensionDelMapaYSeQuedaEnSuUltimoCasillero() {
        Mapa mapa = new Mapa(10,10);
        Casillero casillero1 = new Casillero();
    	Inventario inventario = new Inventario();
    	Mesa mesa = new Mesa();
        Jugador jugador = new Jugador(inventario, mesa);
        jugador.setCasillero(casillero1);
        PosicionEnlazada posicionInicial = new PosicionEnlazada(5,5);
        jugador.ingresar(mapa, posicionInicial);

        for(int i=0; i < 10; i++){
            jugador.mover(new DireccionIzquierda());}
        PosicionEnlazada posicionFinal = new PosicionEnlazada(5,0);

        assertSame(mapa.getCasillero(posicionFinal), jugador.getCasillero());
    }

    @Test
    public void testJugadorSeMueveArribaUnaCantidadDeVecesMayorALaDimensionDelMapaYSeQuedaEnSuUltimoCasillero() {
        Mapa mapa = new Mapa(10,10);
        Casillero casillero1 = new Casillero();
    	Inventario inventario = new Inventario();
    	Mesa mesa = new Mesa();
        Jugador jugador = new Jugador(inventario, mesa);
        jugador.setCasillero(casillero1);
        PosicionEnlazada posicionInicial = new PosicionEnlazada(5,5);
        jugador.ingresar(mapa, posicionInicial);

        for(int i=0; i < 10; i++){
            jugador.mover(new DireccionArriba());}
        PosicionEnlazada posicionFinal = new PosicionEnlazada(0,5);

        assertSame(mapa.getCasillero(posicionFinal), jugador.getCasillero());
    }

    @Test
    public void testJugadorSeMueveAbajoUnaCantidadDeVecesMayorALaDimensionDelMapaYSeQuedaEnSuUltimoCasillero() {
        Mapa mapa = new Mapa(10,10);
        Casillero casillero1 = new Casillero();
    	Inventario inventario = new Inventario();
    	Mesa mesa = new Mesa();
        Jugador jugador = new Jugador(inventario, mesa);
        jugador.setCasillero(casillero1);
        PosicionEnlazada posicionInicial = new PosicionEnlazada(5,5);
        jugador.ingresar(mapa, posicionInicial);

        for(int i=0; i < 10; i++){
            jugador.mover(new DireccionAbajo());}
        PosicionEnlazada posicionFinal = new PosicionEnlazada(9,5);

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
        jugador.mover(new DireccionDerecha());
        jugador.mover(new DireccionDerecha());
        jugador.mover(new DireccionDerecha());
        jugador.mover(new DireccionDerecha());

        jugador.mover(new DireccionAbajo());
        jugador.mover(new DireccionAbajo());
        jugador.mover(new DireccionAbajo());

        jugador.mover(new DireccionIzquierda());
        jugador.mover(new DireccionIzquierda());
        jugador.mover(new DireccionIzquierda());

        assertSame(mapa.getCasillero(posicion1), jugador.getCasillero());
    }

    // MOVIMIENTO OCUPANTE JUGADOR - MAPA CON OCUPANTES RECURSOS
    //
    /*@Test
    public void testOcupanteJugadorSeMueveALaDerechaHastaChocarConOtroOcupante() {
        Mapa mapa = new Mapa(10,10);
        Casillero casillero1 = new Casillero();
    	Inventario inventario = new Inventario();
    	Mesa mesa = new Mesa();
        Jugador jugador = new Jugador(inventario, mesa);
        Madera madera = new Madera();
        jugador.setCasillero(casillero1);
        PosicionEnlazada posicion1 = new PosicionEnlazada(5,5); // Aca pongo al Modelo.Jugador
        PosicionEnlazada posicion2 = new PosicionEnlazada(6,5); // No puede moverse mas
        PosicionEnlazada posicion3 = new PosicionEnlazada(7,5); // Aca pongo a la Madera

        jugador.ingresar(mapa, posicion1);
        madera.ingresar(mapa, posicion3);
        // Lo muevo a la derecha 2 veces
        jugador.mover(new DireccionDerecha());
        jugador.mover(new DireccionDerecha());
        jugador.mover(new DireccionDerecha());
        jugador.mover(new DireccionDerecha());

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
        PosicionEnlazada posicion1 = new PosicionEnlazada(5,5); // Aca pongo al Modelo.Jugador
        PosicionEnlazada posicion2 = new PosicionEnlazada(7,5); // Aca pongo a la Madera

        PosicionEnlazada posicionFinal = new PosicionEnlazada(6,6); // No puede moverse mas

        jugador.ingresar(mapa, posicion1);
        ocupante2.ingresar(mapa, posicion2);
        // Lo muevo a la derecha 2 veces
        jugador.mover(new DireccionDerecha());
        jugador.mover(new DireccionDerecha());
        jugador.mover(new DireccionDerecha());
        jugador.mover(new DireccionDerecha());

        jugador.mover(new DireccionArriba());

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
        PosicionEnlazada posicion1 = new PosicionEnlazada(5,5); // Aca pongo al Modelo.Jugador
        PosicionEnlazada posicion2 = new PosicionEnlazada(7,5); // Aca pongo a la Madera

        PosicionEnlazada posicionFinal = new PosicionEnlazada(6,4); // No puede moverse mas

        jugador.ingresar(mapa, posicion1);
        ocupante2.ingresar(mapa, posicion2);
        // Lo muevo a la derecha 2 veces
        jugador.mover(new DireccionDerecha());
        jugador.mover(new DireccionDerecha());
        jugador.mover(new DireccionDerecha());
        jugador.mover(new DireccionDerecha());

        jugador.mover(new DireccionAbajo());

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
        PosicionEnlazada posicion1 = new PosicionEnlazada(5,5); // Aca pongo al Modelo.Jugador
        PosicionEnlazada posicion2 = new PosicionEnlazada(7,5); // Aca pongo a la Madera

        PosicionEnlazada posicionFinal = new PosicionEnlazada(7,4); // No puede moverse mas

        jugador.ingresar(mapa, posicion1);
        ocupante2.ingresar(mapa, posicion2);
        // Lo muevo a la derecha 2 veces
        jugador.mover(new DireccionDerecha());
        jugador.mover(new DireccionDerecha());
        jugador.mover(new DireccionDerecha());
        jugador.mover(new DireccionDerecha());

        jugador.mover(new DireccionAbajo());

        jugador.mover(new DireccionDerecha());

        assertSame(mapa.getCasillero(posicionFinal), jugador.getCasillero());
    }*/



    /*@Test
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
        jugador.mover(new DireccionDerecha());
        jugador.mover(new DireccionDerecha());
        jugador.mover(new DireccionDerecha());
        jugador.mover(new DireccionDerecha());

        jugador.mover(new DireccionArriba());
        jugador.mover(new DireccionDerecha());
        jugador.mover(new DireccionDerecha());
        jugador.mover(new DireccionDerecha());

        jugador.mover(new DireccionArriba());
        jugador.mover(new DireccionDerecha());
        jugador.mover(new DireccionDerecha());

        jugador.mover(new DireccionArriba());
        jugador.mover(new DireccionDerecha());
        jugador.mover(new DireccionDerecha());

        jugador.mover(new DireccionAbajo());
        jugador.mover(new DireccionAbajo());
        jugador.mover(new DireccionAbajo());


        assertSame(mapa.getCasillero(posicionFinal), jugador.getCasillero());
    }*/



    // Casillero ocupado / desocupado
    @Test
    public void testLuegoDeMoverOcupanteAOtroCasilleroElCasilleroOrigenQuedaDisponibleParaSerOcupado(){

        Casillero casilleroOrigen = new Casillero();

    	Inventario inventario = new Inventario();
    	Mesa mesa = new Mesa();
        Jugador jugador = new Jugador(inventario, mesa);
        jugador.setCasillero(casilleroOrigen);

        Mapa mapa = new Mapa(10,10);
        jugador.ingresar(mapa,new PosicionEnlazada(4,4));
        jugador.mover(new DireccionIzquierda());

        // ahora el casillero origen debe estar disponible
        Jugador otroJugador = new Jugador(inventario, mesa);
        otroJugador.setCasillero(casilleroOrigen);

        assertEquals(casilleroOrigen,otroJugador.getCasillero());
    }



    // Jugador golpea distintos Ocupantes
    // Jugador golpea en casillero siguiente en distintas direcciones

    @Test
    public void testGolpeaMaderaEnSiguienteAbajo_conHachaDeMadera_YLaMismaDisminuyeSuDurabilidad() {

        // J * *
        // * * *
        // * * M

        Inventario inventario = new Inventario();
        Mesa mesa = new Mesa(); //
        Mapa mapa = new Mapa(3, 3);
        Madera madera = new Madera();
        PosicionEnlazada posicionMadera = new PosicionEnlazada(2, 2);
        madera.ingresar(mapa, posicionMadera);

        Jugador jugador = new Jugador(inventario, mesa);
        jugador.ingresar(mapa, new PosicionEnlazada(0, 0));

        jugador.mover(new DireccionDerecha());
        jugador.mover(new DireccionDerecha());
        jugador.mover(new DireccionAbajo());

        jugador.golpear();
        Madera maderaEnMapa = (Madera) mapa.getCasillero(posicionMadera).getOcupante();

        assertEquals(10 - 2, maderaEnMapa.durabilidad());

    }

    @Test
    public void testGolpeaMaderaEnSiguienteArriba_conHachaDeMadera_YLaMismaDisminuyeSuDurabilidad() {

        // M * *
        // * * *
        // J * *

        Inventario inventario = new Inventario();
        Mesa mesa = new Mesa(); //
        Mapa mapa = new Mapa(3, 3);
        Madera madera = new Madera();
        PosicionEnlazada posicionMadera = new PosicionEnlazada(0, 0);
        madera.ingresar(mapa, posicionMadera);

        Jugador jugador = new Jugador(inventario, mesa);
        jugador.ingresar(mapa, new PosicionEnlazada(2, 0));

        jugador.mover(new DireccionArriba());

        jugador.golpear();
        Madera maderaEnMapa = (Madera) mapa.getCasillero(posicionMadera).getOcupante();

        assertEquals(10 - 2, maderaEnMapa.durabilidad());

    }

    @Test
    public void testGolpeaMaderaEnSiguienteDerecha_conHachaDeMadera_YLaMismaDisminuyeSuDurabilidad() {

        // J * M
        // * * *
        // * * *

        Inventario inventario = new Inventario();
        Mesa mesa = new Mesa(); //
        Mapa mapa = new Mapa(3, 3);
        Madera madera = new Madera();
        PosicionEnlazada posicionMadera = new PosicionEnlazada(0, 2);
        madera.ingresar(mapa, posicionMadera);

        Jugador jugador = new Jugador(inventario, mesa);
        jugador.ingresar(mapa, new PosicionEnlazada(0, 0));

        jugador.mover(new DireccionDerecha());

        jugador.golpear();
        Madera maderaEnMapa = (Madera) mapa.getCasillero(posicionMadera).getOcupante();

        assertEquals(10 - 2, maderaEnMapa.durabilidad());

    }

    @Test
    public void testGolpeaMaderaEnSiguienteIzquierda_conHachaDeMadera_YLaMismaDisminuyeSuDurabilidad() {

        // M * J
        // * * *
        // * * *

        Inventario inventario = new Inventario();
        Mesa mesa = new Mesa(); //
        Mapa mapa = new Mapa(3, 3);
        Madera madera = new Madera();
        PosicionEnlazada posicionMadera = new PosicionEnlazada(0, 0);
        madera.ingresar(mapa, posicionMadera);

        Jugador jugador = new Jugador(inventario, mesa);
        jugador.ingresar(mapa, new PosicionEnlazada(0, 2));

        jugador.mover(new DireccionIzquierda());

        jugador.golpear();
        Madera maderaEnMapa = (Madera) mapa.getCasillero(posicionMadera).getOcupante();

        assertEquals(10 - 2, maderaEnMapa.durabilidad());

    }


    //

    @Test
    public void testHachaDeMaderaGolpeaOcupanteRecursoMaderaYSeDisminuyenSusDurabilidades() {
        TipoMadera maderaHerramienta = new TipoMadera();
        Hacha hacha = new Hacha(maderaHerramienta);
        Madera madera = new Madera();

        madera.golpeateCon(hacha);

        assertEquals(10 - 2, madera.durabilidad());
        assertEquals(100 - 2, hacha.durabilidad());

    }

    ///////////////////////////////////////////
    // jugador golpea hasta que se libera mp //
    ///////////////////////////////////////////

    @Test
    public void jugadorGolpeaMaderaHastaQueSuDurabilidadLlegaACeroYSeLiberaMateriaPrima() {

        // M * J
        // * * *
        // * * *

        Inventario inventario = new Inventario();
        Mesa mesa = new Mesa(); //

        Mapa mapa = new Mapa(3, 3);
        Madera madera = new Madera();
        PosicionEnlazada posicionMadera = new PosicionEnlazada(0, 0);
        madera.ingresar(mapa, posicionMadera);

        Jugador jugador = new Jugador(inventario, mesa);
        jugador.ingresar(mapa, new PosicionEnlazada(0, 2));

        jugador.mover(new DireccionIzquierda());

        jugador.golpear();
        Madera maderaEnMapa = (Madera) mapa.getCasillero(posicionMadera).getOcupante();
        assertEquals(10 - 2, maderaEnMapa.durabilidad());

        jugador.golpear();
        assertEquals(6, maderaEnMapa.durabilidad());

        jugador.golpear();
        assertEquals(4, maderaEnMapa.durabilidad());

        jugador.golpear();
        assertEquals(2, maderaEnMapa.durabilidad());

        jugador.golpear();
        MPMadera mpMadera = (MPMadera) mapa.getCasillero(posicionMadera).getOcupante();

        MPMadera mpEsperada = new MPMadera();
        assertTrue(mpMadera.equals(mpEsperada));

    }


    ////////////////////////////////////
    //////// jugador recolecta mp //////
    ////////////////////////////////////

    @Test
    public void jugadorGolpeaMaderaRecolectaLaMateriaPrimaYElCasilleroEnElQueHabiaMPQuedaDisponible() {

        // M * J
        // * * *
        // * * *

        Inventario inventario = new Inventario();
        Mesa mesa = new Mesa(); //

        Mapa mapa = new Mapa(3, 3);
        Madera madera = new Madera();
        PosicionEnlazada posicionInicialMadera = new PosicionEnlazada(0, 0);
        madera.ingresar(mapa, posicionInicialMadera);

        Jugador jugador = new Jugador(inventario, mesa);
        jugador.ingresar(mapa, new PosicionEnlazada(0, 2));

        jugador.mover(new DireccionIzquierda());

        jugador.golpear();
        jugador.golpear();
        jugador.golpear();
        jugador.golpear();
        jugador.golpear();

        //assertTrue(jugador.getTemporalBorrarEsto().getPosicion().equals(posicionInicialMadera));

        // Ahora el casillero quedo disponible para ser ocupado, asi que puede ser ocupado por jugador
        //jugador.mover(new DireccionIzquierda());

        //assertTrue(jugador.getPosicion().equals(new PosicionEnlazada(0,1))); // esta mal que esto pase

        // esto es lo que deberia pasar:
        //jugador.mover(new DireccionIzquierda());
        //assertTrue(jugador.getPosicion().equals(posicionInicialMadera));

        Piedra piedra = new Piedra();
        piedra.ingresar(mapa,posicionInicialMadera);

        assertTrue(piedra.getPosicion().equals(posicionInicialMadera));

    }




}