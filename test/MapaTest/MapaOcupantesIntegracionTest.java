package MapaTest;

import Modelo.Excepciones.HerramientaDesgastadaExcepcion;
import Modelo.Herramientas.Hacha;
import Modelo.Inventario.Inventario;
import Modelo.Jugador.Jugador;
import Modelo.Mapa.*;
import Modelo.MateriaPrima.MPMadera;
import Modelo.MesaDeTrabajo.Mesa;
import Modelo.Recursos.Madera;
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
        jugador.establecerCasillero(casillero1);
        PosicionEnlazada posicionInicial = new PosicionEnlazada(5,5);
        jugador.ingresar(mapa, posicionInicial);

        for(int i=0; i < 10; i++){
            jugador.mover(new DireccionDerecha());}
        PosicionEnlazada posicionFinal = new PosicionEnlazada(5,9);

        assertSame(mapa.getCasillero(posicionFinal), jugador.obtenerCasillero());
    }

    @Test
    public void testJugadorSeMueveALaIzquierdaUnaCantidadDeVecesMayorALaDimensionDelMapaYSeQuedaEnSuUltimoCasillero() {
        Mapa mapa = new Mapa(10,10);
        Casillero casillero1 = new Casillero();
    	Inventario inventario = new Inventario();
    	Mesa mesa = new Mesa();
        Jugador jugador = new Jugador(inventario, mesa);
        jugador.establecerCasillero(casillero1);
        PosicionEnlazada posicionInicial = new PosicionEnlazada(5,5);
        jugador.ingresar(mapa, posicionInicial);

        for(int i=0; i < 10; i++){
            jugador.mover(new DireccionIzquierda());}
        PosicionEnlazada posicionFinal = new PosicionEnlazada(5,0);

        assertSame(mapa.getCasillero(posicionFinal), jugador.obtenerCasillero());
    }

    @Test
    public void testJugadorSeMueveArribaUnaCantidadDeVecesMayorALaDimensionDelMapaYSeQuedaEnSuUltimoCasillero() {
        Mapa mapa = new Mapa(10,10);
        Casillero casillero1 = new Casillero();
    	Inventario inventario = new Inventario();
    	Mesa mesa = new Mesa();
        Jugador jugador = new Jugador(inventario, mesa);
        jugador.establecerCasillero(casillero1);
        PosicionEnlazada posicionInicial = new PosicionEnlazada(5,5);
        jugador.ingresar(mapa, posicionInicial);

        for(int i=0; i < 10; i++){
            jugador.mover(new DireccionArriba());}
        PosicionEnlazada posicionFinal = new PosicionEnlazada(0,5);

        assertSame(mapa.getCasillero(posicionFinal), jugador.obtenerCasillero());
    }

    @Test
    public void testJugadorSeMueveAbajoUnaCantidadDeVecesMayorALaDimensionDelMapaYSeQuedaEnSuUltimoCasillero() {
        Mapa mapa = new Mapa(10,10);
        Casillero casillero1 = new Casillero();
    	Inventario inventario = new Inventario();
    	Mesa mesa = new Mesa();
        Jugador jugador = new Jugador(inventario, mesa);
        jugador.establecerCasillero(casillero1);
        PosicionEnlazada posicionInicial = new PosicionEnlazada(5,5);
        jugador.ingresar(mapa, posicionInicial);

        for(int i=0; i < 10; i++){
            jugador.mover(new DireccionAbajo());}
        PosicionEnlazada posicionFinal = new PosicionEnlazada(9,5);

        assertSame(mapa.getCasillero(posicionFinal), jugador.obtenerCasillero());
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
        jugador.establecerCasillero(casillero1);
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

        assertSame(mapa.getCasillero(posicion1), jugador.obtenerCasillero());
    }

    // Casillero ocupado / desocupado
    @Test
    public void testLuegoDeMoverOcupanteAOtroCasilleroElCasilleroOrigenQuedaDisponibleParaSerOcupado(){

        Casillero casilleroOrigen = new Casillero();

    	Inventario inventario = new Inventario();
    	Mesa mesa = new Mesa();
        Jugador jugador = new Jugador(inventario, mesa);
        jugador.establecerCasillero(casilleroOrigen);

        Mapa mapa = new Mapa(10,10);
        jugador.ingresar(mapa,new PosicionEnlazada(4,4));
        jugador.mover(new DireccionIzquierda());

        // ahora el casillero origen debe estar disponible
        Jugador otroJugador = new Jugador(inventario, mesa);
        otroJugador.establecerCasillero(casilleroOrigen);

        assertEquals(casilleroOrigen,otroJugador.obtenerCasillero());
    }


    // Jugador golpea en casillero siguiente en distintas direcciones

    @Test
    public void testGolpeaMaderaEnSiguienteAbajo_conHachaDeMadera_YLaMismaDisminuyeSuDurabilidad() throws HerramientaDesgastadaExcepcion {

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
        Madera maderaEnMapa = (Madera) mapa.getCasillero(posicionMadera).ocupante();

        assertEquals(10 - 2, maderaEnMapa.durabilidad());

    }

    @Test
    public void testGolpeaMaderaEnSiguienteArriba_conHachaDeMadera_YLaMismaDisminuyeSuDurabilidad() throws HerramientaDesgastadaExcepcion {

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
        Madera maderaEnMapa = (Madera) mapa.getCasillero(posicionMadera).ocupante();

        assertEquals(10 - 2, maderaEnMapa.durabilidad());

    }

    @Test
    public void testGolpeaMaderaEnSiguienteDerecha_conHachaDeMadera_YLaMismaDisminuyeSuDurabilidad() throws HerramientaDesgastadaExcepcion {

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
        Madera maderaEnMapa = (Madera) mapa.getCasillero(posicionMadera).ocupante();

        assertEquals(10 - 2, maderaEnMapa.durabilidad());

    }

    @Test
    public void testGolpeaMaderaEnSiguienteIzquierda_conHachaDeMadera_YLaMismaDisminuyeSuDurabilidad() throws HerramientaDesgastadaExcepcion {

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
        Madera maderaEnMapa = (Madera) mapa.getCasillero(posicionMadera).ocupante();

        assertEquals(10 - 2, maderaEnMapa.durabilidad());

    }


    //

    @Test
    public void testHachaDeMaderaGolpeaOcupanteRecursoMaderaYSeDisminuyenSusDurabilidades() throws HerramientaDesgastadaExcepcion {
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
    public void jugadorGolpeaMaderaHastaQueSuDurabilidadLlegaACeroYSeLiberaMateriaPrima() throws HerramientaDesgastadaExcepcion {

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
        Madera maderaEnMapa = (Madera) mapa.getCasillero(posicionMadera).ocupante();
        assertEquals(10 - 2, maderaEnMapa.durabilidad());

        jugador.golpear();
        assertEquals(6, maderaEnMapa.durabilidad());

        jugador.golpear();
        assertEquals(4, maderaEnMapa.durabilidad());

        jugador.golpear();
        assertEquals(2, maderaEnMapa.durabilidad());

        jugador.golpear();
        MPMadera mpMadera = (MPMadera) mapa.getCasillero(posicionMadera).ocupante();

        MPMadera mpEsperada = new MPMadera();
        assertTrue(mpMadera.equals(mpEsperada));

    }



    ////////////////////////////////////
    //////// jugador recolecta mp //////
    ////////////////////////////////////

    @Test
    public void jugadorGolpeaMaderaRecolectaLaMateriaPrimaYElCasilleroEnElQueHabiaMPQuedaDisponible() throws HerramientaDesgastadaExcepcion {

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

        jugador.recolectar();

        // Ahora el casillero está libre para ser ocupado, puede ser ocupado por ej por el jugador
        jugador.mover(new DireccionIzquierda());

        assertTrue(jugador.posicion().equals(posicionInicialMadera));

    }


}