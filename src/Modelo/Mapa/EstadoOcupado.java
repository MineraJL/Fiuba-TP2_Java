package Modelo.Mapa;

public class EstadoOcupado implements EstadoCasillero {
    private Ocupante ocupante;

    public EstadoOcupado(Casillero casilleroDelQueSoyEstado, Ocupante ocupanteNuevo) {
        this.ocupante = ocupanteNuevo;
        ocupanteNuevo.establecerCasillero(casilleroDelQueSoyEstado);

    }

    public EstadoCasillero ocuparPor(Casillero casilleroDelQueSoyEstado, Ocupante ocupanteQueNoSeVaAGuardar) {
        return this;
    }

    public Ocupante ocupante(){
        return this.ocupante;
    }

    public EstadoCasillero desocupar(){
        return new EstadoDisponible();
    }

    public EstadoOcupado(){} // existe por lo de los bordes.


}

