package Modelo.Fabricas;

import Modelo.Mapa.Ocupante;
import Modelo.MateriaPrima.MPMadera;
import Modelo.MateriaPrima.MPPiedra;
import Modelo.MateriaPrima.MPMetal;
import Modelo.TipoMaterial.TipoMaterial;
import Modelo.TipoMaterial.TipoMaterialInexistente;
import Modelo.TipoMaterial.TipoMetalYPiedra;

import java.util.List;

public class FabricaMaterialTipoMetalYPiedra implements IFabricaMaterial {

    @Override
    public TipoMaterial fabricarMaterial(List<Ocupante> materiaPrima) {
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
