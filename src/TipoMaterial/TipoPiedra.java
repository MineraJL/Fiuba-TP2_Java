package TipoMaterial;

import Recursos.Madera;
import Recursos.Piedra;

public class TipoPiedra extends TipoMaterial{

    public TipoPiedra(){
    }

    public void golpear(Madera recurso, int fuerza){ recurso.reducirDurabilidadEn(fuerza);}
    public void golpear(Piedra recurso, int fuerza){recurso.reducirDurabilidadEn(fuerza);}

}
