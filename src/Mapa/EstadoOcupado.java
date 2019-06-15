package Mapa;

public class EstadoOcupado implements EstadoCasillero {

    private Item item;

    public EstadoOcupado(Item itemNuevo, Casillero casilleroDelQueSoyEstado) {
        this.item=itemNuevo;
        //itemNuevo.setCasillero(casilleroDelQueSoyEstado);
        itemNuevo.setCasillero(new Casillero());
    }

    @Override
    public EstadoCasillero setItem(Item itemNuevo, Casillero casillero){
        return this;
    }
    @Override
    public Item getItem() {
        return this.item;
    }


    public EstadoCasillero quitarItem(){
        return new EstadoDisponible();
    }

}

