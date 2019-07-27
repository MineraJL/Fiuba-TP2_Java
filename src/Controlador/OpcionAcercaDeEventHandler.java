package Controlador;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class OpcionAcercaDeEventHandler implements EventHandler<ActionEvent> {

    @Override
    public void handle(ActionEvent actionEvent) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Acerca de...");
        alert.setHeaderText("75.07 Algoritmos y  programación III.");
        String mensaje = "TP2 AlgoCraft - Grupo 12\n"+
        				 "Aldana Lescano Maier - 99839\n"+
        				 "Iván Moreno - PADRON\n"+
        				 "José Luis Minera - 90781\n"+
        				 "Martín Dabat - PADRON";
        alert.setContentText(mensaje);
        alert.show();
    }
}
