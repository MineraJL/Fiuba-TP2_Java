package Fabricas;

import Mapa.Item;
import MateriaPrima.MPMadera;
import MateriaPrima.MPPiedra;
import MateriaPrima.MPMetal;
import TipoMaterial.TipoMaterial;
import TipoMaterial.TipoMaterialInexistente;
import TipoMaterial.TipoMetalYPiedra;

import java.util.List;

public class FabricaMaterialTipoMetalYPiedra implements IFabricaMAterial {

    @Override
    public TipoMaterial fabricarMaterial(List<Item> materiaPrima) {
        TipoMaterial materialCreado = new TipoMaterialInexistente();
        MPPiedra materia = new MPPiedra();
        MPMadera materiaMango = new MPMadera();

        if (!materiaPrima.get(0).equals(new MPMetal())){
            return materialCreado;
        }
        for (int i = 1; i < 3 ; i++) {
            if (  !materiaPrima.get(i).equals(materia)){
                return materialCreado;
            }
        }
        for (int i = 3; i < materiaPrima.size() ; i++) {
            if (  !materiaPrima.get(i).equals(materiaMango)){
                return materialCreado;
            }
        }
        materialCreado = new TipoMetalYPiedra();
        return materialCreado;
    }
}
