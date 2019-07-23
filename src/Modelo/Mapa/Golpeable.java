package Modelo.Mapa;

import Modelo.Herramientas.Herramienta;
import Modelo.TipoMaterial.TipoMaterial;

public interface Golpeable {

    void serGolpeadoCon(Herramienta unaHerramienta);

    void serGolpeadoCon(TipoMaterial material, int fuerza);
}
