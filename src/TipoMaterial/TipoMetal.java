package TipoMaterial;

import Herramientas.Herramienta;
import Recursos.Madera;
import Recursos.Metal;
import Recursos.Piedra;

public class TipoMetal extends TipoMaterial{

    public TipoMetal(){
    }


    @Override
    public void definirValores(Herramienta herramienta) {
        herramienta.asignarMaterial(this);
    }
    public void golpear(Madera recurso, int fuerza){ recurso.reducirDurabilidadEn(fuerza);}
    public void golpear(Piedra recurso, int fuerza){recurso.reducirDurabilidadEn(fuerza);}

}
