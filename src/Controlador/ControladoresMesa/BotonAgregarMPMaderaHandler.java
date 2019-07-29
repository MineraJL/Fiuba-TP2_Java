package Controlador.ControladoresMesa;

import Modelo.Mapa.PosicionEnlazada;
import Modelo.MateriaPrima.MPMadera;
import Modelo.MateriaPrima.MateriaPrima;
import Modelo.Modelo;
import Vista.VistaMesa;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BotonAgregarMPMaderaHandler implements EventHandler<ActionEvent> {
    private Modelo modelo;
    private VistaMesa vistaMesa;
    private PosicionEnlazada posicionActual;
    private MateriaPrima materiaPrima;

    public BotonAgregarMPMaderaHandler(Modelo modelo, VistaMesa vistaMesa) {
        this.modelo = modelo;
        this.vistaMesa = vistaMesa;

        this.materiaPrima = new MPMadera();
    }

    @Override
    public void handle(ActionEvent event) {
        // una línea que hable con la Disposicion (que todavía no existe) // limpiar hace new // construir manda a mesa

        this.posicionActual = this.vistaMesa.posicionActual();
        this.modelo.mesa().guardarMateriaPrimaEn(materiaPrima,posicionActual);
        this.vistaMesa.dibujar(posicionActual);
    }




}