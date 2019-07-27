package Vista;

import javafx.scene.image.Image;

import java.util.HashMap;

public class Imagenes {

    private HashMap<String, Image> coleccionImagenes;

    public Imagenes(){
        this.coleccionImagenes = new HashMap<String,Image>();
        this.cargarImagenesRecursos();
        this.cargarImagenJugador();
        this.cargarImagenesMateriaPrima();
    }

    private void cargarImagenesMateriaPrima() {
        Image mpmadera = new Image("file:src/Vista/Imagenes/MateriaPrima/mpmadera.png");
        Image mppiedra = new Image("file:src/Vista/Imagenes/MateriaPrima/mppiedra.png");
        Image mpmetal = new Image("file:src/Vista/Imagenes/MateriaPrima/mpmetal.png");
        Image mpdiamante = new Image("file:src/Vista/Imagenes/MateriaPrima/mpdiamante.png");
        coleccionImagenes.put("MPMadera",mpmadera);
        coleccionImagenes.put("MPPiedra",mppiedra);
        coleccionImagenes.put("MPMetal",mpmetal);
        coleccionImagenes.put("MPDiamante",mpdiamante);
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
