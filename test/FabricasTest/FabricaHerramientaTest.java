package FabricasTest;

import Fabricas.FabricaHerramientas;
import Herramientas.Hacha;
import Herramientas.Herramienta;
import MateriaPrima.MPMadera;
import MateriaPrima.MPVacio;
import MesaDeTrabajo.Mesa;
import Recursos.Madera;
import TipoMaterial.TipoMadera;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FabricaHerramientaTest {
    @Test
    public void testSeCreaUnHachaDeMaderaAPartirDeLaDisposicionCorrecta(){
        FabricaHerramientas fabricaHerramientas = new FabricaHerramientas();
        Mesa mesa = new Mesa();
        MPMadera madera = new MPMadera();
        MPVacio vacio = new MPVacio();
        mesa.guardarMateriaPrimaEn(madera,0,0);
        mesa.guardarMateriaPrimaEn(madera,0,1);
        mesa.guardarMateriaPrimaEn(madera,0,2);
        mesa.guardarMateriaPrimaEn(vacio,1,0);
        mesa.guardarMateriaPrimaEn(madera,1,1);
        mesa.guardarMateriaPrimaEn(vacio,1,2);
        mesa.guardarMateriaPrimaEn(vacio,2,0);
        mesa.guardarMateriaPrimaEn(madera,2,1);
        mesa.guardarMateriaPrimaEn(vacio,2,2);

        Herramienta herramientaFabricada = fabricaHerramientas.fabricarHerramienta(mesa);
        assertEquals(new Hacha(new TipoMadera()).equals(herramientaFabricada),true);
        //assertEquals(new Hacha(new TipoMadera()), herramientaFabricada);
        //assertEquals(new Hacha(new TipoMadera()),new Hacha(new TipoMadera()));
    }
}
