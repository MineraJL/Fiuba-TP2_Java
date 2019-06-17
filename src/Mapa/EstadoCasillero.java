package Mapa;

public interface EstadoCasillero {

    EstadoCasillero setItem(Casillero casillero, Item item);

    Item getItem();

    EstadoCasillero quitarItem();

}
