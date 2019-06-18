package Fabricas;

import Herramientas.Herramienta;
import Herramientas.HerramientaInexistente;
import MateriaPrima.MateriaPrima;
import MesaDeTrabajo.Mesa;


public class FabricaHacha extends FabricaHerramientas {

    protected Mesa modeloMesa;

    public FabricaHacha(){
        this.modeloMesa = new Mesa();
        this.modeloMesa.guardarMateriaPrimaEn(new MateriaPrima(),0,0);
    }

    @Override
    public Herramienta fabricarHerramienta(Mesa mesaDeTrabajo){
        Herramienta herramientaCreada = new HerramientaInexistente();

        return herramientaCreada;
    }
}
