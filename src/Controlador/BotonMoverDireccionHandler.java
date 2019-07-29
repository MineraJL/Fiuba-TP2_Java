package Controlador;

import Modelo.Jugador.Jugador;
import Modelo.Mapa.Direccion;
import Vista.VistaModelo;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public abstract class BotonMoverDireccionHandler implements EventHandler<ActionEvent> {

    private Jugador jugador;
    private VistaModelo vistaModelo;

    public BotonMoverDireccionHandler(Jugador jugador, VistaModelo vistaModelo) {
        this.jugador = jugador;
        this.vistaModelo = vistaModelo;
    }

    @Override
    public void handle(ActionEvent event) {
        this.vistaModelo.actualizar();
    }

    public void handle(ActionEvent event, Direccion direccion){
        this.jugador.mover(direccion);
        this.vistaModelo.actualizar();
    }


}
