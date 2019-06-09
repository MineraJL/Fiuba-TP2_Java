package TipoMaterial;

import Desgastes.Desgaste;
import Desgastes.DesgasteSegunMultiplicador;
import Materiales.Diamante;
import Materiales.Madera;
import Materiales.Metal;
import Materiales.Piedra;

public class TipoMetal extends TipoMaterial{

    public TipoMetal(){
    }

    public void golpear(Madera recurso, int fuerza){ recurso.reducirDurabilidadEn(fuerza);}
    public void golpear(Piedra recurso, int fuerza){recurso.reducirDurabilidadEn(fuerza);}
    public void golpear(Metal recurso, int fuerza){recurso.reducirDurabilidadEn(fuerza);}
}
