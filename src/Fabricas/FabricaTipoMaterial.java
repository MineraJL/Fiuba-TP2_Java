package Fabricas;


import Mapa.Item;
import TipoMaterial.*;

import java.util.*;

public class FabricaTipoMaterial {

    private ArrayList<IFabricaMAterial> fabricasDeMaterial;

    public FabricaTipoMaterial(){
        fabricasDeMaterial = new ArrayList<IFabricaMAterial>();
        this.fabricasDeMaterial.add(new FabricaMaterialTipoMadera());
        this.fabricasDeMaterial.add(new FabricaMaterialTipoMetal());
        this.fabricasDeMaterial.add(new FabricaMaterialTipoPiedra());
        this.fabricasDeMaterial.add(new FabricaMaterialTipoMetalYPiedra());
    }


    public TipoMaterial fabricarMaterial(List<Item> materiaPrima){
        TipoMaterial vacio = new TipoMaterialInexistente();
        TipoMaterial materialCreado = new TipoMaterialInexistente();
        int i = 0;
        while (materialCreado.equals(vacio) && (i<materiaPrima.size())) {

            materialCreado = fabricasDeMaterial.get(i).fabricarMaterial(materiaPrima);
            i++;
        }

        return materialCreado;
    }






}

