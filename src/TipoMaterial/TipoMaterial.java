package TipoMaterial;

import Desgastes.Desgaste;
import Materiales.Diamante;
import Materiales.Madera;
import Materiales.Metal;
import Materiales.Piedra;

public abstract class TipoMaterial {


    protected TipoMaterial(){

    }


    public void golpear(Madera madera, int fuerza){}
    public void golpear(Piedra piedra, int fuerza){}
    public void golpear(Metal metal,int fuerza ){}
    public void golpear(Diamante diamante, int fuerza){}
}
