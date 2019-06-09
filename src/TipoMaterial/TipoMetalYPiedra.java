package TipoMaterial;
import Materiales.Diamante;

public class TipoMetalYPiedra extends TipoMaterial{

    public TipoMetalYPiedra(){
    }

    public void golpear(Diamante recurso, int fuerza){ recurso.reducirDurabilidadEn(fuerza);}
}
