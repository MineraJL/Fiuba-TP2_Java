package TipoMaterial;

import Desgastes.Desgaste;
import Desgastes.DesgasteSegunMultiplicador;
import Materiales.Diamante;
import Materiales.Madera;
import Materiales.Metal;
import Materiales.Piedra;

public class TipoMadera extends TipoMaterial{

    public TipoMadera(){
    }

    public void golpear(Madera recurso){ recurso.reducirDurabilidadEn(this.fuerza);}
    public void golpear(Piedra recurso){recurso.reducirDurabilidadEn(this.fuerza);}
}
