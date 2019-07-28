package Vista;

import Controlador.*;
import Controlador.ControladoresMesa.BotonAgregarMPMaderaHandler;
import Modelo.Jugador.Jugador;
import Modelo.MesaDeTrabajo.Mesa;
import Modelo.Modelo;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ContenedorPrincipal extends BorderPane {
	
    private BarraDeMenu menuBar;
    private Canvas canvasCentral;
    private VBox contenedorCentral;
    private VistaModelo vistaModelo;
    private VistaMesa vistaMesa;

    public ContenedorPrincipal(Stage stage, Modelo modelo) {

        this.setMenu(stage);
        this.setCentro(modelo);
        this.setPanelIzquierdo(modelo);

	}

    private void setMenu(Stage stage) {
        this.menuBar = new BarraDeMenu(stage);
        this.setTop(menuBar);
    }

    public BarraDeMenu getBarraDeMenu() {
        return menuBar;
    }


    private void setPanelIzquierdo(Modelo modelo) {
        VBox botonesJugador = this.botoneraJugador(modelo.jugador());
        VBox panelMesa = this.mesa(modelo);
        panelMesa.setAlignment(Pos.BOTTOM_CENTER);

        VBox panelIzquierdo = new VBox(botonesJugador,panelMesa);

        this.setLeft(panelIzquierdo);
    }

    private VBox mesa(Modelo modelo) {
        Text tituloMesa = new Text("Mesa de Trabajo");

        Canvas canvasMesa = new Canvas(80,80);
        this.vistaMesa = new VistaMesa(modelo,canvasMesa);
        vistaMesa.dibujar();

        VBox botonesMesa = this.botonesMesa(modelo);
        botonesMesa.setSpacing(20);

        VBox panelMesa = new VBox(tituloMesa,canvasMesa,botonesMesa);
        panelMesa.setAlignment(Pos.CENTER);

        return panelMesa;
    }

    private VBox botonesMesa(Modelo modelo) {

        Text textoMP = new Text("Agregar materia prima");

        Button botonAgregarMPMadera = new Button();
        botonAgregarMPMadera.setText("madera");
        BotonAgregarMPMaderaHandler botonAgregarMPMaderaHandler = new BotonAgregarMPMaderaHandler(modelo,this.vistaMesa);
        botonAgregarMPMadera.setOnAction(botonAgregarMPMaderaHandler);

        Button botonAgregarMPPiedra = new Button();
        botonAgregarMPPiedra.setText("piedra");
        //BotonGolpearHandlerffvdffda botonGolpearHandler = new BotonGolpearHandlersdgbfdv(jugador,this.vistaModelo);
        //botonConstruirHerramienta.setOnAction(botonGolpearHandlerrhbrwgtbnrg);

        Button botonAgregarMPMetal = new Button();
        botonAgregarMPMetal.setText("metal");
        //BotonGolpearHandlerffvdffda botonGolpearHandler = new BotonGolpearHandlersdgbfdv(jugador,this.vistaModelo);
        //botonConstruirHerramienta.setOnAction(botonGolpearHandlerrhbrwgtbnrg);

        Button botonAgregarMPDiamante = new Button();
        botonAgregarMPDiamante.setText("diamante");
        //BotonGolpearHandlerffvdffda botonGolpearHandler = new BotonGolpearHandlersdgbfdv(jugador,this.vistaModelo);
        //botonConstruirHerramienta.setOnAction(botonGolpearHandlerrhbrwgtbnrg);

        Button botonAgregarMPVacio = new Button();
        botonAgregarMPVacio.setText("dejar vacío");
        //BotonGolpearHandlerffvdffda botonGolpearHandler = new BotonGolpearHandlersdgbfdv(jugador,this.vistaModelo);
        //botonConstruirHerramienta.setOnAction(botonGolpearHandlerrhbrwgtbnrg);


        Button botonLimpiarMesa = new Button();
        botonLimpiarMesa.setText("Limpiar Mesa");
        //BotonGolpearHandlerffvdffda botonGolpearHandler = new BotonGolpearHandlersdgbfdv(jugador,this.vistaModelo);
        //botonConstruirHerramienta.setOnAction(botonGolpearHandlerrhbrwgtbnrg);

        Button botonConstruirHerramienta = new Button();
        botonConstruirHerramienta.setText("Construir Herramienta");
        //BotonGolpearHandlerffvdffda botonGolpearHandler = new BotonGolpearHandlersdgbfdv(jugador,this.vistaModelo);
        //botonConstruirHerramienta.setOnAction(botonGolpearHandlerrhbrwgtbnrg);

        HBox botonesAgregarMP1 = new HBox(botonAgregarMPMadera,botonAgregarMPPiedra,botonAgregarMPMetal);
        HBox botonesAgregarMP2 = new HBox(botonAgregarMPDiamante,botonAgregarMPVacio);
        botonesAgregarMP1.setAlignment(Pos.CENTER);
        botonesAgregarMP2.setAlignment(Pos.CENTER);

        VBox agregarMP = new VBox(textoMP,botonesAgregarMP1,botonesAgregarMP2);
        agregarMP.setSpacing(10);
        agregarMP.setAlignment(Pos.CENTER);

        VBox botonesMesa = new VBox(agregarMP,botonLimpiarMesa,botonConstruirHerramienta);
        botonesMesa.setAlignment(Pos.CENTER);

        return botonesMesa;
    }


    private void setCentro(Modelo modelo){

	    canvasCentral = new Canvas(512,480);
	    this.vistaModelo = new VistaModelo(modelo,canvasCentral);
	    vistaModelo.dibujar();

	    contenedorCentral = new VBox(canvasCentral);
	    contenedorCentral.setAlignment(Pos.CENTER);

        Text textoPuntos = new Text("Tenés muchos puntos y maderitas");
        VBox contenedorConPuntos = new VBox(textoPuntos,contenedorCentral);
        contenedorConPuntos.setSpacing(30);

        this.setCenter(contenedorConPuntos);
    }




    private VBox botoneraJugador(Jugador jugador) {

        Button botonGolpear = new Button();
        botonGolpear.setText("Golpear");
        BotonGolpearHandler botonGolpearHandler = new BotonGolpearHandler(jugador,this.vistaModelo);
        botonGolpear.setOnAction(botonGolpearHandler);

        Button botonRecolectar = new Button();
        botonRecolectar.setText("Recolectar");
        BotonRecolectarHandler botonRecolectarHandler = new BotonRecolectarHandler(jugador,this.vistaModelo);
        botonRecolectar.setOnAction(botonRecolectarHandler);

        VBox botonesMover = this.botonesMover(jugador);

        VBox botoneraJugador = new VBox(botonesMover, botonGolpear, botonRecolectar);
        botoneraJugador.setSpacing(20);
        botoneraJugador.setPadding(new Insets(50));
        botoneraJugador.setAlignment(Pos.TOP_CENTER);

        return new VBox(botoneraJugador);

    }


    private VBox botonesMover(Jugador jugador) {

        Text tituloMover = new Text("Mover");

        Button botonMoverArriba = new Button();
        botonMoverArriba.setText("arriba");
        BotonMoverArribaHandler botonMoverArribaHandler = new BotonMoverArribaHandler(jugador, this.vistaModelo);
        botonMoverArriba.setOnAction(botonMoverArribaHandler);

        Button botonMoverAbajo = new Button();
        botonMoverAbajo.setText("abajo");
        BotonMoverAbajoHandler botonMoverAbajoHandler = new BotonMoverAbajoHandler(jugador, this.vistaModelo);
        botonMoverAbajo.setOnAction(botonMoverAbajoHandler);

        Button botonMoverDerecha = new Button();
        botonMoverDerecha.setText("derecha");
        BotonMoverDerechaHandler botonMoverDerechaHandler = new BotonMoverDerechaHandler(jugador, this.vistaModelo);
        botonMoverDerecha.setOnAction(botonMoverDerechaHandler);

        Button botonMoverIzquierda = new Button();
        botonMoverIzquierda.setText("izquierda");
        BotonMoverIzquierdaHandler botonMoverIzquierdaHandler = new BotonMoverIzquierdaHandler(jugador, this.vistaModelo);
        botonMoverIzquierda.setOnAction(botonMoverIzquierdaHandler);


        HBox botonesMoverLateralmente = new HBox(botonMoverIzquierda, botonMoverDerecha);
        VBox botonesMover = new VBox(tituloMover, botonMoverArriba, botonesMoverLateralmente, botonMoverAbajo);
        botonesMover.setSpacing(5);
        botonesMover.setAlignment(Pos.CENTER);

        return botonesMover;
    }





        private void setBotoneraMesaDeTrabajo(Mesa mesa) {
    	
    }

}
