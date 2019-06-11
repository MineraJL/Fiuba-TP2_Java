package TipoMaterial;
import Herramientas.Herramienta;
import Recursos.Diamante;

public class TipoMetalYPiedra extends TipoMaterial{

    public TipoMetalYPiedra(){
    }


    @Override
    public void definirValores(Herramienta herramienta) {
        herramienta.asignarMaterial(this);
    }
    public void golpear(Diamante recurso, int fuerza){ recurso.reducirDurabilidadEn(fuerza);}
}
