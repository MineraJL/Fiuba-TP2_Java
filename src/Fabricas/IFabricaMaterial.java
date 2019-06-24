package Fabricas;

import Mapa.Item;
import TipoMaterial.TipoMaterial;

import java.util.List;

public interface IFabricaMaterial {

    public TipoMaterial fabricarMaterial(List<Item> materiaPrima);
}
