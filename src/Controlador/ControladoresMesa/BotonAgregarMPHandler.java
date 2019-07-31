package Controlador.ControladoresMesa;

import Modelo.Mapa.PosicionEnlazada;
import Modelo.MateriaPrima.MateriaPrima;
import Modelo.Modelo;
import Vista.VistaInventario;
import Vista.VistaMesa;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public abstract class BotonAgregarMPHandler implements EventHandler<ActionEvent> {

    private Modelo modelo;
    private VistaMesa vistaMesa;
    private VistaInventario vistaInventario;
    private PosicionEnlazada posicionActual;
    protected MateriaPrima materiaPrima;

    public BotonAgregarMPHandler(Modelo modelo, VistaMesa vistaMesa, VistaInventario vistaInventario){
        this.modelo = modelo;
        this.vistaMesa = vistaMesa;
        this.vistaInventario = vistaInventario;
    }

    @Override
    public void handle(ActionEvent event) {
        this.posicionActual = this.vistaMesa.posicionActual();
        this.modelo.mesa().guardarMateriaPrimaEn(materiaPrima,posicionActual);
        this.vistaMesa.actualizar();
        this.vistaInventario.dibujar();

        //PosicionEnlazada posicionSiguiente = posicionActual.posicionADerecha();
        //this.vistaMesa.avanzarA(posicionSiguiente);


    }

}
