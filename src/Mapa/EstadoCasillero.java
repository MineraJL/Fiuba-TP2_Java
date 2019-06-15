package Mapa;

public interface EstadoCasillero {

    EstadoCasillero setItem(Item itemNuevo, Casillero casillero);

    Item getItem();

    EstadoCasillero quitarItem();
}
