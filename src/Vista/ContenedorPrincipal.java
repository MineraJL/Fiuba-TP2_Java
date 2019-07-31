package Vista;

import Controlador.ControladoresInventario.BotonSeleccionarHachaMaderaHandler;
import Controlador.ControladoresInventario.BotonSeleccionarHachaMetalHandler;
import Controlador.ControladoresInventario.BotonSeleccionarHachaPiedraHandler;
import Controlador.ControladoresInventario.BotonSeleccionarPicoFinoHandler;
import Controlador.ControladoresInventario.BotonSeleccionarPicoMaderaHandler;
import Controlador.ControladoresInventario.BotonSeleccionarPicoMetalHandler;
import Controlador.ControladoresInventario.BotonSeleccionarPicoPiedraHandler;
import Controlador.ControladoresJugador.*;
import Controlador.ControladoresMesa.*;
import Modelo.Jugador.Jugador;
import Modelo.MesaDeTrabajo.Mesa;
import Modelo.Modelo;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
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
    private VistaInventario vistaInventario;

    public ContenedorPrincipal(Stage stage, Modelo modelo) {

        this.setMenu(stage);
        this.setCentro(modelo);
        this.setPanelIzquierdo(modelo);
        this.setPanelInferior(modelo);
        
        Image imagen = new Image("Vista/Imagenes/fondo_principal.jpg");
        BackgroundImage imagenDeFondo = new BackgroundImage(imagen, BackgroundRepeat.ROUND, BackgroundRepeat.ROUND, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        this.setBackground(new Background(imagenDeFondo));

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

        VBox panelIzquierdo = new VBox(botonesJugador,panelMesa);

        this.setLeft(panelIzquierdo);
    }
    
    private void setPanelInferior(Modelo modelo) {
    	VBox panelInventario = this.inventario(modelo);
    	VBox panelInferior = new VBox(panelInventario);
    	
    	this.setBottom(panelInferior);
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
    
    private VBox inventario(Modelo modelo) {
    	Text tituloInventario = new Text("Inventario");
    	
    	Canvas canvasInventario = new Canvas(120, 120);
    	this.vistaInventario = new VistaInventario(modelo, canvasInventario);
    	
    	HBox botonesInventario = this.botonesInventario(modelo);
    	botonesInventario.setSpacing(20);
    	
    	VBox panelInventario = new VBox(tituloInventario, canvasInventario, botonesInventario);
    	panelInventario.setAlignment(Pos.BOTTOM_CENTER);
    	
    	return panelInventario;
    }

    private VBox botonesMesa(Modelo modelo) {

        Text textoMP = new Text("Agregar materia prima");

        Button botonAgregarMPMadera = new Button();
        botonAgregarMPMadera.setText("madera");
        BotonAgregarMPMaderaHandler botonAgregarMPMaderaHandler = new BotonAgregarMPMaderaHandler(modelo,this.vistaMesa);
        botonAgregarMPMadera.setOnAction(botonAgregarMPMaderaHandler);

        Button botonAgregarMPPiedra = new Button();
        botonAgregarMPPiedra.setText("piedra");
        BotonAgregarMPPiedraHandler botonAgregarMPPiedraHandler = new BotonAgregarMPPiedraHandler(modelo,this.vistaMesa);
        botonAgregarMPPiedra.setOnAction(botonAgregarMPPiedraHandler);

        Button botonAgregarMPMetal = new Button();
        botonAgregarMPMetal.setText("metal");
        BotonAgregarMPMetalHandler botonAgregarMPMetalHandler = new BotonAgregarMPMetalHandler(modelo,this.vistaMesa);
        botonAgregarMPMetal.setOnAction(botonAgregarMPMetalHandler);

        Button botonAgregarMPDiamante = new Button();
        botonAgregarMPDiamante.setText("diamante");
        BotonAgregarMPDiamanteHandler botonAgregarMPDiamanteHandler = new BotonAgregarMPDiamanteHandler(modelo,this.vistaMesa);
        botonAgregarMPDiamante.setOnAction(botonAgregarMPDiamanteHandler);

        Button botonAgregarMPVacio = new Button();
        botonAgregarMPVacio.setText("dejar vacío");
        BotonAgregarMPVacioHandler botonAgregarMPVacioHandler = new BotonAgregarMPVacioHandler(modelo,this.vistaMesa);
        botonAgregarMPVacio.setOnAction(botonAgregarMPVacioHandler);


        Button botonLimpiarMesa = new Button();
        botonLimpiarMesa.setText("Limpiar Mesa");
        BotonLimpiarMesaHandler botonLimpiarMesaHandler = new BotonLimpiarMesaHandler(modelo,this.vistaMesa);
        botonLimpiarMesa.setOnAction(botonLimpiarMesaHandler);

        Button botonConstruirHerramienta = new Button();
        botonConstruirHerramienta.setText("Construir Herramienta");
        BotonConstruirHerramientaHandler botonConstruirHerramientaHandler = new BotonConstruirHerramientaHandler(modelo,this.vistaMesa);
        botonConstruirHerramienta.setOnAction(botonConstruirHerramientaHandler);


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

    private HBox botonesInventario(Modelo modelo) {
    	Text textoSeleccionarHerramienta = new Text("Seleccionar herramienta");
    	
        Button botonSeleccionarHachaMadera = new Button();
        botonSeleccionarHachaMadera.setText("Hacha De Madera");
        BotonSeleccionarHachaMaderaHandler botonSeleccionarHachaMaderaHandler = 
        		new BotonSeleccionarHachaMaderaHandler(modelo,this.vistaInventario);
        botonSeleccionarHachaMadera.setOnAction(botonSeleccionarHachaMaderaHandler);
        
        Button botonSeleccionarHachaPiedra = new Button();
        botonSeleccionarHachaPiedra.setText("Hacha De Piedra");
        BotonSeleccionarHachaPiedraHandler botonSeleccionarHachaPiedraHandler = 
        		new BotonSeleccionarHachaPiedraHandler(modelo,this.vistaInventario);
        botonSeleccionarHachaPiedra.setOnAction(botonSeleccionarHachaPiedraHandler);
        
        Button botonSeleccionarHachaMetal = new Button();
        botonSeleccionarHachaMetal.setText("Hacha De Metal");
        BotonSeleccionarHachaMetalHandler botonSeleccionarHachaMetalHandler = 
        		new BotonSeleccionarHachaMetalHandler(modelo,this.vistaInventario);
        botonSeleccionarHachaMetal.setOnAction(botonSeleccionarHachaMetalHandler);
        
        
        Button botonSeleccionarPicoMadera = new Button();
        botonSeleccionarPicoMadera.setText("Pico De Madera");
        BotonSeleccionarPicoMaderaHandler botonSeleccionarPicoMaderaHandler = 
        		new BotonSeleccionarPicoMaderaHandler(modelo,this.vistaInventario);
        botonSeleccionarPicoMadera.setOnAction(botonSeleccionarPicoMaderaHandler);
        
        Button botonSeleccionarPicoPiedra = new Button();
        botonSeleccionarPicoPiedra.setText("Pico De Piedra");
        BotonSeleccionarPicoPiedraHandler botonSeleccionarPicoPiedraHandler = 
        		new BotonSeleccionarPicoPiedraHandler(modelo,this.vistaInventario);
        botonSeleccionarPicoPiedra.setOnAction(botonSeleccionarPicoPiedraHandler);
        
        Button botonSeleccionarPicoMetal = new Button();
        botonSeleccionarPicoMetal.setText("Pico De Metal");
        BotonSeleccionarPicoMetalHandler botonSeleccionarPicoMetalHandler = 
        		new BotonSeleccionarPicoMetalHandler(modelo,this.vistaInventario);
        botonSeleccionarPicoMetal.setOnAction(botonSeleccionarPicoMetalHandler);
        
        
        Button botonSeleccionarPicoFino = new Button();
        botonSeleccionarPicoFino.setText("Pico Fino");
        BotonSeleccionarPicoFinoHandler botonSeleccionarPicoFinoHandler = 
        		new BotonSeleccionarPicoFinoHandler(modelo,this.vistaInventario);
        botonSeleccionarPicoFino.setOnAction(botonSeleccionarPicoFinoHandler);
        
        
        HBox botonesSeleccionarHachas = new HBox(botonSeleccionarHachaMadera,
        										 botonSeleccionarHachaPiedra,
        										 botonSeleccionarHachaMetal);
        
        HBox botonesSeleccionarPicos = new HBox(botonSeleccionarPicoMadera,
        										botonSeleccionarPicoPiedra,
        										botonSeleccionarPicoMetal);
        
        HBox botonesSeleccionarPicoFino = new HBox(botonSeleccionarPicoFino);
        
        botonesSeleccionarHachas.setAlignment(Pos.CENTER);
        botonesSeleccionarPicos.setAlignment(Pos.CENTER);
        botonesSeleccionarPicoFino.setAlignment(Pos.CENTER);

        HBox botonesHerramientas = new HBox(textoSeleccionarHerramienta,
        									botonesSeleccionarHachas,
        									botonesSeleccionarPicos, 
        									botonesSeleccionarPicoFino);
        
        botonesHerramientas.setSpacing(10);
        botonesHerramientas.setAlignment(Pos.CENTER);

        return botonesHerramientas;
        
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
