package TipoMaterial;

import Desgastes.Desgaste;
import Desgastes.DesgasteSegunMultiplicador;
import Materiales.Diamante;
import Materiales.Madera;
import Materiales.Metal;
import Materiales.Piedra;

public class TipoMetal extends TipoMaterial{

    public TipoMetal(int fuerza,  Desgaste desgasteIndicado){
        super(2, desgasteIndicado);
    }

    public  void golpear(Madera madera){ madera.reducirDurabilidadEn(this.fuerza);}
    public  void golpear(Piedra piedra){piedra.reducirDurabilidadEn(this.fuerza);}
    public  void golpear(Metal metal){metal.reducirDurabilidadEn(this.fuerza);}
}
