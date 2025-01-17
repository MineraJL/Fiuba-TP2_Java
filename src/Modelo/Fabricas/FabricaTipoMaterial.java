package Modelo.Fabricas;


import Modelo.Mapa.Ocupante;
import Modelo.TipoMaterial.*;

import java.util.*;

public class FabricaTipoMaterial {

    private ArrayList<IFabricaMaterial> fabricasDeMaterial;

    public FabricaTipoMaterial(){
        fabricasDeMaterial = new ArrayList<IFabricaMaterial>();
        this.fabricasDeMaterial.add(new FabricaMaterialTipoMadera());
        this.fabricasDeMaterial.add(new FabricaMaterialTipoMetal());
        this.fabricasDeMaterial.add(new FabricaMaterialTipoPiedra());
        this.fabricasDeMaterial.add(new FabricaMaterialTipoMetalYPiedra());
    }


    public TipoMaterial fabricarMaterial(List<Ocupante> materiaPrima){
        TipoMaterial vacio = new TipoMaterialInexistente();
        TipoMaterial materialCreado = new TipoMaterialInexistente();
        int i = 0;
        while (materialCreado.equals(vacio) && (i<fabricasDeMaterial.size())) {

            materialCreado = fabricasDeMaterial.get(i).fabricarMaterial(materiaPrima);
            i++;
        }
        return materialCreado;
    }






}

