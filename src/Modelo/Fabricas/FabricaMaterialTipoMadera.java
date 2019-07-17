package Modelo.Fabricas;

import Modelo.Mapa.Item;
import Modelo.MateriaPrima.MPMadera;
import Modelo.TipoMaterial.TipoMaterialInexistente;
import Modelo.TipoMaterial.TipoMaterial;
import Modelo.TipoMaterial.TipoMadera;

import java.util.List;

public class FabricaMaterialTipoMadera implements IFabricaMaterial {

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
