package Modelo.Fabricas;

import Modelo.Mapa.Ocupante;
import Modelo.TipoMaterial.TipoMaterial;

import java.util.List;

public interface IFabricaMaterial {

    public TipoMaterial fabricarMaterial(List<Ocupante> materiaPrima);
}
