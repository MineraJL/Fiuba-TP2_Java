package Fabricas;

import Mapa.Item;
import MateriaPrima.MPMadera;
import MateriaPrima.MPPiedra;
import TipoMaterial.TipoMaterial;
import TipoMaterial.TipoMaterialInexistente;
import TipoMaterial.TipoPiedra;

import java.util.List;

public class FabricaMaterialTipoPiedra implements IFabricaMAterial {

    @Override
    public TipoMaterial fabricarMaterial(List<Item> materiaPrima) {
        TipoMaterial materialCreado = new TipoMaterialInexistente();
        MPPiedra materia = new MPPiedra();
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
        materialCreado = new TipoPiedra();
        return materialCreado;
    }
}
