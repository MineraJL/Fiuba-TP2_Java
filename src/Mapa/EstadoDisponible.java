package Mapa;

public class EstadoDisponible implements EstadoCasillero{

    public EstadoDisponible(){

    }

    @Override
    public EstadoCasillero setItem(Item itemNuevo, Casillero casilleroDelQueSoyEstado) {
        return new EstadoOcupado(itemNuevo, casilleroDelQueSoyEstado);
    }

    @Override
    public Item getItem() {
        return null;
    }
}
