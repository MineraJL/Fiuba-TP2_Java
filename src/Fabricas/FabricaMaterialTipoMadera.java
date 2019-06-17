package Fabricas;

import Mapa.Item;
import MateriaPrima.MPMadera;
import TipoMaterial.TipoMaterialInexistente;
import TipoMaterial.TipoMaterial;
import TipoMaterial.TipoMadera;

import java.util.List;

public class FabricaMaterialTipoMadera implements IFabricaMAterial {

    public FabricaMaterialTipoMadera(){}

    public TipoMaterial fabricarMaterial(List<Item> materiaPrima){
        TipoMaterial materialCreado = new TipoMaterialInexistente();
        MPMadera materia = new MPMadera();
        for (int i = 0; i < materiaPrima.size() ; i++) {
            if (  !materiaPrima.get(i).equals(materia)){
                return materialCreado;
            }
        }
        materialCreado = new TipoMadera();
        return materialCreado;
    }

}
