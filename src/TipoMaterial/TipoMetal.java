package TipoMaterial;

import Recursos.Madera;
import Recursos.Metal;
import Recursos.Piedra;

public class TipoMetal extends TipoMaterial{

    public TipoMetal(){
    }

    public void golpear(Madera recurso, int fuerza){ recurso.reducirDurabilidadEn(fuerza);}
    public void golpear(Piedra recurso, int fuerza){recurso.reducirDurabilidadEn(fuerza);}

}
