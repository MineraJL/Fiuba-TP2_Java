package Modelo.Mapa;

public interface EstadoCasillero {

    EstadoCasillero ocuparPor(Casillero casillero, Ocupante ocupante);

    Ocupante getOcupante();

    EstadoCasillero desocupar();

}
