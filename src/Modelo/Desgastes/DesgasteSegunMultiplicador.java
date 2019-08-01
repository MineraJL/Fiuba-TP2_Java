package Modelo.Desgastes;

import Modelo.Excepciones.DurabilidadDesgastadaExcepcion;
// solo comento para hacer un commit y crear una nueva branch a la que integrar las cosas del inventario
public class DesgasteSegunMultiplicador extends Desgaste {

    private double multiplicador;

    public DesgasteSegunMultiplicador(double multiplicadorDesgaste, int durabilidadDesgaste) {
        this.multiplicador = multiplicadorDesgaste;
        this.durabilidad = durabilidadDesgaste;
    }

    public void desgastarCon(int cantidad) throws DurabilidadDesgastadaExcepcion{

        this.durabilidad = this.durabilidad - (int)(cantidad * this.multiplicador);
        
        if (this.durabilidad < 0)
        	throw new DurabilidadDesgastadaExcepcion();

    }

}
