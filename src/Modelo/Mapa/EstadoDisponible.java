package Modelo.Mapa;

public class EstadoDisponible implements EstadoCasillero{

    public EstadoDisponible(){

    }

    public EstadoCasillero ocuparPor(Casillero casilleroDelQueSoyEstado, Ocupante ocupante) {
        return new EstadoOcupado(casilleroDelQueSoyEstado, ocupante);

    }

    public Ocupante ocupante(){
        return new OcupanteVacio();
    }

    public EstadoCasillero desocupar(){
        return this;
    }


}
