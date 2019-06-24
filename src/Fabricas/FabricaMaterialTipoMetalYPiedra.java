package Fabricas;

import Mapa.Item;
import MateriaPrima.MPMadera;
import MateriaPrima.MPPiedra;
import MateriaPrima.MPMetal;
import TipoMaterial.TipoMaterial;
import TipoMaterial.TipoMaterialInexistente;
import TipoMaterial.TipoMetalYPiedra;

import java.util.List;

public class FabricaMaterialTipoMetalYPiedra implements IFabricaMaterial {

    @Override
    public TipoMaterial fabricarMaterial(List<Item> materiaPrima) {
        TipoMaterial materialCreado = new TipoMaterialInexistente();
        MPMetal materia = new MPMetal();
        MPMadera materiaMango = new MPMadera();

        if (!materiaPrima.get(0).equals(new MPPiedra())){
            return materialCreado;
        }
        for (int i = 1; i < 4 ; i++) {
            if (  !materiaPrima.get(i).equals(materia)){
                return materialCreado;
            }
        }
        for (int i = 4; i < materiaPrima.size() ; i++) {
            if (  !materiaPrima.get(i).equals(materiaMango)){
                return materialCreado;
            }
        }
        materialCreado = new TipoMetalYPiedra();
        return materialCreado;
    }
}
