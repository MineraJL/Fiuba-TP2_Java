package Modelo.Fabricas;

import Modelo.Mapa.Item;
import Modelo.TipoMaterial.TipoMaterial;

import java.util.List;

public interface IFabricaMaterial {

    public TipoMaterial fabricarMaterial(List<Item> materiaPrima);
}
