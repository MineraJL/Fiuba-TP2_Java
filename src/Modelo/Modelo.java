package Modelo;

import Modelo.CreadorDeMapa.CreadorDeMapa;
import Modelo.Inventario.Inventario;
import Modelo.Jugador.Jugador;
import Modelo.Mapa.Mapa;
import Modelo.MesaDeTrabajo.Mesa;

public class Modelo {

    private Inventario inventario;
    private Mesa mesa;

    private Jugador jugador;
    private Mapa mapa;

    public Modelo() {

        this.inventario = new Inventario();
        this.mesa = new Mesa();

        this.jugador = new Jugador(inventario);
        CreadorDeMapa creadorDeMapa = new CreadorDeMapa();
        creadorDeMapa.ingresarJugadorAMapa(jugador);

        this.mapa=creadorDeMapa.obtenerMapaConRecursos();
    }

    public Inventario inventario(){return inventario;}
    public Mesa mesa(){return mesa;}
    public Jugador jugador(){return jugador;}
    public Mapa mapa(){return mapa;}

    public int cantFilasMapa(){return this.mapa.cantidadFilas();}
    public int cantColumnasMapa(){return this.mapa.cantidadColumnas();}

}
