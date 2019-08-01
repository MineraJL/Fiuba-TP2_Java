package Vista;

import Controlador.BotonComenzarEventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class ContenedorApertura extends VBox {

    Stage stage;

    public ContenedorApertura(Stage stage, Scene proximaEscena) {

        super();

        this.stage = stage;

        this.setAlignment(Pos.CENTER);
        this.setSpacing(20);
        this.setPadding(new Insets(25));
        Image imagen = new Image("Vista/Imagenes/inicio2.png");
        System.out.println(imagen.getHeight());
        BackgroundImage imagenDeFondo = new BackgroundImage(imagen, BackgroundRepeat.ROUND, BackgroundRepeat.ROUND, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        this.setBackground(new Background(imagenDeFondo));

        Button botonComenzar = new Button();
        botonComenzar.setText("Entrar");

        Label etiqueta = new Label();
        etiqueta.setFont(Font.font("Tahoma", FontWeight.BOLD, 18));

        etiqueta.setText("Te damos la bienvenida a la aplicación AlgoCraft de Algoritmos y Programación III. Hacé click en comenzar");
        etiqueta.setTextFill(Color.web("#66A7C5"));

        BotonComenzarEventHandler botonComenzarHandler = new BotonComenzarEventHandler(stage, proximaEscena);
        botonComenzar.setOnAction(botonComenzarHandler);

        this.getChildren().addAll(etiqueta, botonComenzar);
    }

}