package TipoMaterial;
import Recursos.Diamante;

public class TipoMetalYPiedra extends TipoMaterial{

    public TipoMetalYPiedra(){
    }

    public void golpear(Diamante recurso, int fuerza){ recurso.reducirDurabilidadEn(fuerza);}
}
