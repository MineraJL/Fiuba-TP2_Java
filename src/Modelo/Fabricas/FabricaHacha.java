package Modelo.Fabricas;

import Modelo.Herramientas.Hacha;
import Modelo.Herramientas.Herramienta;
import Modelo.Herramientas.HerramientaInexistente;
import Modelo.Mapa.Ocupante;
import Modelo.Mapa.Posicion;
import Modelo.MesaDeTrabajo.Mesa;
import Modelo.TipoMaterial.TipoMaterial;

import java.util.ArrayList;
import java.util.List;


public class FabricaHacha implements IFabricaHerramienta {

    private ArrayList<Posicion> modeloForma;

    public FabricaHacha(){
        this.modeloForma = new ArrayList<Posicion>();
        this.generarForma();
    }

    private void generarForma(){
        this.modeloForma.add(new Posicion(0,0));
        this.modeloForma.add(new Posicion(0,1));
        this.modeloForma.add(new Posicion(1,0));
        this.modeloForma.add(new Posicion(1,1));
        this.modeloForma.add(new Posicion(2,1));
    }

    @Override
    public Herramienta fabricarHerramienta(Mesa mesaDeTrabajo){
        Herramienta herramientaCreada = new HerramientaInexistente();
        FabricaTipoMaterial fabricaTipoMaterial = new FabricaTipoMaterial();
        if (formaEsCorrecta(mesaDeTrabajo)){
            TipoMaterial tipoMaterial = fabricaTipoMaterial.fabricarMaterial(this.obtenerElementosComponentes(mesaDeTrabajo));
            herramientaCreada = new Hacha(tipoMaterial);
        }
        return herramientaCreada;
    }

    private boolean formaEsCorrecta(Mesa mesa){
        return true;
    }


    private List<Ocupante> obtenerElementosComponentes(Mesa mesa){
        return mesa.obtenerItemsEn(this.modeloForma);
    }
}