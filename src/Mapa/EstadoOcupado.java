package Mapa;

public class EstadoOcupado implements EstadoCasillero {

    private Item item;

    public EstadoOcupado(Item itemNuevo, Casillero casilleroDelQueSoyEstado) {
        this.item=itemNuevo;
        itemNuevo.setCasillero(casilleroDelQueSoyEstado);
    }

    @Override
    public EstadoCasillero setItem(Item itemNuevo, Casillero casillero){
        return this;
    }
    @Override
    public Item getItem() {
        return this.item;
    }

}

