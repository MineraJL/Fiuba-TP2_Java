package Mapa;

public class EstadoDisponible implements EstadoCasillero{

    public EstadoDisponible(){

    }


    public void setItem(Casillero casillero, Item item) {
        casillero.setEstado(new EstadoOcupado());
        item.cambiarCasillero(casillero);
    }

}
