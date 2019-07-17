package Modelo.Mapa;

public interface EstadoCasillero {

    EstadoCasillero setItem(Casillero casillero, Ocupante ocupante);

    Ocupante getOcupante();

    EstadoCasillero quitarItem();

}
