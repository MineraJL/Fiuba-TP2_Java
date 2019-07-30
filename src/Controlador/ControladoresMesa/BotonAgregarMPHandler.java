package Controlador.ControladoresMesa;

import Modelo.Mapa.PosicionEnlazada;
import Modelo.MateriaPrima.MateriaPrima;
import Modelo.Modelo;
import Vista.VistaMesa;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public abstract class BotonAgregarMPHandler implements EventHandler<ActionEvent> {

    private Modelo modelo;
    private VistaMesa vistaMesa;
    private PosicionEnlazada posicionActual;
    protected MateriaPrima materiaPrima;

    public BotonAgregarMPHandler(Modelo modelo, VistaMesa vistaMesa){
        this.modelo = modelo;
        this.vistaMesa = vistaMesa;
    }

    @Override
    public void handle(ActionEvent event) {
        this.posicionActual = this.vistaMesa.posicionActual();
        this.modelo.mesa().guardarMateriaPrimaEn(materiaPrima,posicionActual);
        this.vistaMesa.actualizar();

        //PosicionEnlazada posicionSiguiente = posicionActual.posicionADerecha();
        //this.vistaMesa.avanzarA(posicionSiguiente);


    }

}
