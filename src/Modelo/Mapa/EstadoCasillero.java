package Modelo.Mapa;

public interface EstadoCasillero {

    EstadoCasillero ocuparPor(Casillero casillero, Ocupante ocupante);

    Ocupante ocupante();

    EstadoCasillero desocupar();

}
