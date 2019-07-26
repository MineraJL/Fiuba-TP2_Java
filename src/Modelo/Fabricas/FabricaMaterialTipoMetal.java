package Modelo.Fabricas;

import Modelo.Mapa.Ocupante;
import Modelo.MateriaPrima.MPMadera;
import Modelo.MateriaPrima.MPMetal;
import Modelo.TipoMaterial.TipoMaterial;
import Modelo.TipoMaterial.TipoMaterialInexistente;
import Modelo.TipoMaterial.TipoMetal;

import java.util.List;

public class FabricaMaterialTipoMetal implements IFabricaMaterial {

    @Override
    public TipoMaterial fabricarMaterial(List<Ocupante> materiaPrima) {
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
