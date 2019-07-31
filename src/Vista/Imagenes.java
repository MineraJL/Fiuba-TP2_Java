package Vista;

import javafx.scene.image.Image;

import java.util.ArrayList;
import java.util.HashMap;

public class Imagenes {

    private HashMap<String, Image> coleccionImagenes;

    public Imagenes(){
        this.coleccionImagenes = new HashMap<String,Image>();
        //this.cargarImagenesMapa();
        //this.cargarImagenesMesa();
    }

    public void cargarImagenesMesa() {
        Image mpmadera = new Image("file:src/Vista/Imagenes/Mesa/mesa_MPMadera.png");
        Image mppiedra = new Image("file:src/Vista/Imagenes/Mesa/mesa_MPPiedra.png");
        Image mpmetal = new Image("file:src/Vista/Imagenes/Mesa/mesa_MPMetal.png");
        Image mpdiamante = new Image("file:src/Vista/Imagenes/Mesa/mesa_MPDiamante.png");
        Image mpvacio = new Image("file:src/Vista/Imagenes/Mesa/mesa_MPVacio.png");
        coleccionImagenes.put("MPMadera",mpmadera);
        coleccionImagenes.put("MPPiedra",mppiedra);
        coleccionImagenes.put("MPMetal",mpmetal);
        coleccionImagenes.put("MPDiamante",mpdiamante);
        coleccionImagenes.put("MPVacio",mpvacio);
        coleccionImagenes.put("OcupanteVacio",mpvacio);
    }

    public void cargarImagenesMapa() {
        this.cargarImagenesRecursos();
        this.cargarImagenJugador();
        this.cargarImagenesMateriaPrima();
    }
    
    public void cargarImagenesInventario() {
    	Image fondoVacio = new Image("file:src/Vista/Imagenes/Inventario/fondo_vacio.png");
    	
        Image mpmadera = new Image("file:src/Vista/Imagenes/Mesa/mesa_MPMadera.png");
        Image mppiedra = new Image("file:src/Vista/Imagenes/Mesa/mesa_MPPiedra.png");
        Image mpmetal = new Image("file:src/Vista/Imagenes/Mesa/mesa_MPMetal.png");
        Image mpdiamante = new Image("file:src/Vista/Imagenes/Mesa/mesa_MPDiamante.png");
        
        Image hachaMadera = new Image("file:src/Vista/Imagenes/Inventario/hacha_madera.png");
        Image hachaPiedra = new Image("file:src/Vista/Imagenes/Inventario/hacha_piedra.png");
        Image hachaMetal = new Image("file:src/Vista/Imagenes/Inventario/hacha_metal.png");
        
        Image picoMadera = new Image("file:src/Vista/Imagenes/Inventario/pico_madera.png");
        Image picoPiedra = new Image("file:src/Vista/Imagenes/Inventario/pico_piedra.png");
        Image picoMetal = new Image("file:src/Vista/Imagenes/Inventario/pico_metal.png");
        
        Image picoFino = new Image("file:src/Vista/Imagenes/Inventario/pico_fino.png");
        
        coleccionImagenes.put("fondoVacio",fondoVacio);
        
        coleccionImagenes.put("MPMadera",mpmadera);
        coleccionImagenes.put("MPPiedra",mppiedra);
        coleccionImagenes.put("MPMetal",mpmetal);
        coleccionImagenes.put("MPDiamante",mpdiamante);
        
        coleccionImagenes.put("hachaMadera",hachaMadera);
        coleccionImagenes.put("hachaPiedra",hachaPiedra);
        coleccionImagenes.put("hachaMetal",hachaMetal);
        coleccionImagenes.put("picoMadera",picoMadera);
        coleccionImagenes.put("picoPiedra",picoPiedra);
        coleccionImagenes.put("picoMetal",picoMetal);
        coleccionImagenes.put("picoFino",picoFino);  
    }

    public Image getImage(String nombreOcupante){
        return coleccionImagenes.get(nombreOcupante);
    }
    
    public ArrayList<String> nombresItemsIventario(){
        ArrayList<String> itemsInventario = 
        		new ArrayList<String>();
        
        itemsInventario.add("hachaMadera");
        itemsInventario.add("hachaPiedra");
        itemsInventario.add("hachaMetal");
        itemsInventario.add("picoMadera");
        itemsInventario.add("picoPiedra");
        itemsInventario.add("picoMetal");
        itemsInventario.add("picoFino"); 
        itemsInventario.add("MPMadera");
        itemsInventario.add("MPPiedra");
        itemsInventario.add("MPMetal");
        itemsInventario.add("MPDiamante");
        itemsInventario.add("fondoVacio");
        
        return itemsInventario;
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

}
