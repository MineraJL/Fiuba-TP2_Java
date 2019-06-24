package TipoMaterial;

import Herramientas.Herramienta;
import Recursos.Madera;
import Recursos.Piedra;

public class TipoMadera extends TipoMaterial{

    public TipoMadera(){
    }

    public void golpear(Madera recurso, int fuerza){ recurso.reducirDurabilidadEn(fuerza);}
    public void golpear(Piedra recurso, int fuerza){recurso.reducirDurabilidadEn(fuerza);}


    @Override
    public void definirValores(Herramienta herramienta) {
        herramienta.asignarMaterial(this);
    }


}
