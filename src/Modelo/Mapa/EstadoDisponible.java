package Modelo.Mapa;

public class EstadoDisponible implements EstadoCasillero{

    public EstadoDisponible(){

    }

    public EstadoCasillero setItem(Casillero casilleroDelQueSoyEstado, Item item) {
        return new EstadoOcupado(casilleroDelQueSoyEstado,item);

    }

    public Item getItem(){
        return new ItemVacio();
    }

    public EstadoCasillero quitarItem(){
        return this;
    }


}
