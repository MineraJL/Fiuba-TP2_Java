package Fabricas;

import Mapa.Item;
import MateriaPrima.MPMadera;
import MateriaPrima.MPMetal;
import TipoMaterial.TipoMaterial;
import TipoMaterial.TipoMaterialInexistente;
import TipoMaterial.TipoMetal;

import java.util.List;

public class FabricaMaterialTipoMetal implements IFabricaMAterial {

    @Override
    public TipoMaterial fabricarMaterial(List<Item> materiaPrima) {
        TipoMaterial materialCreado = new TipoMaterialInexistente();
        MPMetal materia = new MPMetal();
        MPMadera materiaMango = new MPMadera();
        for (int i = 0; i < 3 ; i++) {
            if (  !materiaPrima.get(i).equals(materia)){
                return materialCreado;
            }
        }
        for (int i = 3; i < materiaPrima.size() ; i++) {
            if (  !materiaPrima.get(i).equals(materiaMango)){
                return materialCreado;
            }
        }
        materialCreado = new TipoMetal();
        return materialCreado;
    }
}
