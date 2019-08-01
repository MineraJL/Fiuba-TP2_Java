package Controlador.ControladoresJugador;

import Modelo.Jugador.Jugador;
import Vista.VistaInventario;
import Vista.VistaModelo;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BotonRecolectarHandler implements EventHandler<ActionEvent> {

    private Jugador jugador;
    private VistaModelo vistaModelo;
    private VistaInventario vistaInventario;

    public BotonRecolectarHandler(Jugador jugador, VistaModelo vistaModelo, VistaInventario vistaInventario) {
        this.jugador = jugador;
        this.vistaModelo = vistaModelo;
        this.vistaInventario = vistaInventario;
    }

    @Override
    public void handle(ActionEvent event) {
        this.jugador.recolectar();
        this.vistaModelo.actualizar();
        this.vistaInventario.dibujar();
    }

}
