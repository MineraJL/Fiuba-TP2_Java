package Controlador;

import Modelo.Jugador.Jugador;
import Vista.VistaModelo;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BotonRecolectarHandler implements EventHandler<ActionEvent> {

    private Jugador jugador;
    private VistaModelo vistaModelo;

    public BotonRecolectarHandler(Jugador jugador, VistaModelo vistaModelo) {
        this.jugador = jugador;
        this.vistaModelo = vistaModelo;
    }

    @Override
    public void handle(ActionEvent event) {
        this.jugador.recolectar();
        this.vistaModelo.actualizar();
    }

}
