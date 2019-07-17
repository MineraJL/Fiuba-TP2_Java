package Modelo.Mapa;

public class EstadoDisponible implements EstadoCasillero{

    public EstadoDisponible(){

    }

    public EstadoCasillero setItem(Casillero casilleroDelQueSoyEstado, Ocupante ocupante) {
        return new EstadoOcupado(casilleroDelQueSoyEstado, ocupante);

    }

    public Ocupante getOcupante(){
        return new OcupanteVacio();
    }

    public EstadoCasillero quitarItem(){
        return this;
    }


}
