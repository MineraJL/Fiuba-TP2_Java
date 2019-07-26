package Vista;

import javafx.scene.image.Image;

import java.util.HashMap;

public class Imagenes {

    HashMap<String, Image> coleccionImagenes;

    public Imagenes(){
        this.coleccionImagenes = new HashMap<String,Image>();
        this.cargarImagenesRecursos();
        this.cargarImagenJugador();
    }

    private void cargarImagenJugador() {
        Image jugador = new Image("file:src/Vista/Imagenes/jugador.png");
        coleccionImagenes.put("Jugador",jugador);
    }

    private void cargarImagenesRecursos() {

        Image pasto = new Image("file:src/Vista/Imagenes/pasto.png");
        Image madera = new Image("file:src/Vista/Imagenes/madera.png");
        Image piedra = new Image("file:src/Vista/Imagenes/piedra.png");
        Image metal = new Image("file:src/Vista/Imagenes/metal.png");
        Image diamante = new Image("file:src/Vista/Imagenes/diamante.png");

        coleccionImagenes.put("OcupanteVacio",pasto);
        coleccionImagenes.put("Madera",madera);
        coleccionImagenes.put("Piedra",piedra);
        coleccionImagenes.put("Metal",metal);
        coleccionImagenes.put("Diamante",diamante);

    }

    public Image getImage(String nombreOcupante){
        return coleccionImagenes.get(nombreOcupante);
    }


}
