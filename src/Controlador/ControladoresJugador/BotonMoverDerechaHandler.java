package Controlador.ControladoresJugador;

import Modelo.Jugador.Jugador;
import Modelo.Mapa.DireccionDerecha;
import Vista.VistaModelo;
import javafx.event.ActionEvent;

public class BotonMoverDerechaHandler extends BotonMoverDireccionHandler {

    public BotonMoverDerechaHandler(Jugador jugador, VistaModelo vistaModelo) {
        super(jugador,vistaModelo);
    }

    @Override
    public void handle(ActionEvent event) {
        super.handle(event,new DireccionDerecha());
    }

}
