package TipoMaterial;

import Desgastes.Desgaste;
import Materiales.Diamante;
import Materiales.Madera;
import Materiales.Metal;
import Materiales.Piedra;

public abstract class TipoMaterial {

    protected int fuerza;
    protected Desgaste desgaste;

    protected TipoMaterial(){

    }

    public int getFuerza() {
        return this.fuerza;
    }

    public int desgastar(){
        //this.desgaste.
        return 0;
    }

    public  void golpear(Madera madera){}
    public  void golpear(Piedra piedra){}
    public  void golpear(Metal metal){}
    public  void golpear(Diamante diamante){}
}
