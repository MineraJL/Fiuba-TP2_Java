package MapaTest;
import Modelo.Inventario.Inventario;
import Modelo.Jugador.Jugador;
import Modelo.Mapa.*;
import Modelo.MesaDeTrabajo.Mesa;

import org.junit.Test;

import static junit.framework.TestCase.*;

public class MapaTest{

    // CREACION MAPA
    // Modelo.Mapa instancia los Casilleros con ubicacion correcta
    // X igual a 0
    @Test
    public void testMapaSeInicializaYCreaCasillerosConCorrespondienteCoordenadaEnXIgualACero(){
        Mapa mapa = new Mapa(10,10);
        Posicion posicion = new Posicion(0,2);
        Casillero casillero= mapa.getCasillero(posicion);
        assertEquals(0, casillero.getPosicion().getX());
    }
    // X igual a 1
    @Test
    public void testMapaSeInicializaYCreaCasillerosConCorrespondienteCoordenadaEnXIgualAUno(){
        Mapa mapa = new Mapa(10,10);
        Posicion posicion = new Posicion(1,2);
        Casillero casillero= mapa.getCasillero(posicion);
        assertEquals(1, casillero.getPosicion().getX());
    }
    // Y igual a 0
    @Test
    public void testMapaSeInicializaYCreaCasillerosConCorrespondienteCoordenadaEnYIgualACero(){
        Mapa mapa = new Mapa(10,10);
        Posicion posicion = new Posicion(2,0);
        Casillero casillero= mapa.getCasillero(posicion);
        assertEquals(0, casillero.getPosicion().getY());
    }
    // Y igual a 1
    @Test
    public void testMapaSeInicializaYCreaCasillerosConCorrespondienteCoordenadaEnYIgualAUno(){
        Mapa mapa = new Mapa(10,10);
        Posicion posicion = new Posicion(2,1);
        Casillero casillero= mapa.getCasillero(posicion);
        assertEquals(1, casillero.getPosicion().getY());
    }

    // Modelo.Mapa devuelve casillero con la direccion pedida
    // Casillero norte
    @Test
    public void testMapaDevuelveCasilleroEnLaDireccionNorte(){
        Mapa mapa = new Mapa(10,10);
        Posicion posicion = new Posicion(2,2);
        Direccion direccion = Direccion.arriba();
        Casillero casillero= mapa.getCasillero(posicion, direccion);
        assertEquals(3, casillero.getPosicion().getY());
    }
    // Casillero sur
    @Test
    public void testMapaDevuelveCasilleroEnLaDireccionSur(){
        Mapa mapa = new Mapa(10,10);
        Posicion posicion = new Posicion(2,2);
        Direccion direccion = Direccion.abajo();
        Casillero casillero= mapa.getCasillero(posicion, direccion);
        assertEquals(1, casillero.getPosicion().getY());
    }

    // Casillero este
    @Test
    public void testMapaDevuelveCasilleroEnLaDireccionEste(){
        Mapa mapa = new Mapa(10,10);
        Posicion posicion = new Posicion(2,2);
        Direccion direccion = Direccion.derecha();
        Casillero casillero= mapa.getCasillero(posicion, direccion);
        assertEquals(3, casillero.getPosicion().getX());
    }

    // Casillero oeste
    @Test
    public void testMapaDevuelveCasilleroEnLaDireccionOeste(){
        Mapa mapa = new Mapa(10,10);
        Posicion posicion = new Posicion(2,2);
        Direccion direccion = Direccion.izquierda();
        Casillero casillero= mapa.getCasillero(posicion, direccion);
        assertEquals(1, casillero.getPosicion().getX());
    }

    // MAPA CREA "BORDES" CON CASILLEROS CON ESTADO OCUPADO EN LOS BORDES. LOS ITEMS NO PUEDEN INGRESAR A ESOS CASILLEROS POR EL ESTADO
    // Sobre X=0
    @Test
    public void testMapaGeneraUnBordeConCasilleroConEstadoOcupadoSobreXIgualCero(){
        Mapa mapa = new Mapa(10,10);
        Casillero casillero2= new Casillero();
    	Inventario inventario = new Inventario();
    	Mesa mesa = new Mesa();
        Ocupante ocupante = new Jugador(inventario, mesa);
        ocupante.setCasillero(casillero2);
        Posicion posicion = new Posicion(0,7);

        ocupante.ingresar(mapa,posicion);
        Casillero casillero= mapa.getCasillero(posicion);


        assertNotSame(casillero, ocupante.getCasillero());
    }
    // Sobre X maxima
    @Test
    public void testMapaGeneraUnBordeConCasilleroConEstadoOcupadoSobreXMaxima(){
        Mapa mapa = new Mapa(10,10);
        Casillero casillero2= new Casillero();
    	Inventario inventario = new Inventario();
    	Mesa mesa = new Mesa();
        Ocupante ocupante = new Jugador(inventario, mesa);
        ocupante.setCasillero(casillero2);
        Posicion posicion = new Posicion(9,7);

        ocupante.ingresar(mapa,posicion);
        Casillero casillero= mapa.getCasillero(posicion);


        assertNotSame(casillero, ocupante.getCasillero());
    }
    // Sobre Y=0
    @Test
    public void testMapaGeneraUnBordeConCasilleroConEstadoOcupadoSobreYIgualCero(){
        Mapa mapa = new Mapa(10,10);
        Casillero casillero2= new Casillero();
    	Inventario inventario = new Inventario();
    	Mesa mesa = new Mesa();
        Ocupante ocupante = new Jugador(inventario, mesa);
        ocupante.setCasillero(casillero2);
        Posicion posicion = new Posicion(7,0);

        ocupante.ingresar(mapa,posicion);
        Casillero casillero= mapa.getCasillero(posicion);


        assertNotSame(casillero, ocupante.getCasillero());
    }
    // Sobre Y maxima
    @Test
    public void testMapaGeneraUnBordeConCasilleroConEstadoOcupadoSobreYMaxima(){
        Mapa mapa = new Mapa(10,10);
        Casillero casillero2= new Casillero();
    	Inventario inventario = new Inventario();
    	Mesa mesa = new Mesa();
        Ocupante ocupante = new Jugador(inventario, mesa);
        ocupante.setCasillero(casillero2);
        Posicion posicion = new Posicion(7,9);

        ocupante.ingresar(mapa,posicion);
        Casillero casillero= mapa.getCasillero(posicion);


        assertNotSame(casillero, ocupante.getCasillero());
    }

}
