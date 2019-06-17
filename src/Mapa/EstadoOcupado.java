package Mapa;

public class EstadoOcupado implements EstadoCasillero {
    private Item item;

    public EstadoOcupado(Casillero casilleroDelQueSoyEstado, Item itemNuevo) {
        this.item=itemNuevo;
        itemNuevo.cambiarCasillero(casilleroDelQueSoyEstado);

    }

    public EstadoCasillero setItem(Casillero casilleroDelQueSoyEstado, Item itemQueNoSeVaAGuardar) {
        return this;
    }

    public Item getItem(){
        return this.item;
    }

    public EstadoCasillero quitarItem(){
        return new EstadoDisponible();
    }


}

