package FabricasTest;

import Fabricas.FabricaHerramientas;
import Herramientas.Hacha;
import Herramientas.Herramienta;
import MateriaPrima.MPMadera;
import MateriaPrima.MPPiedra;
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
        mesa.guardarMateriaPrimaEn(vacio,0,2);
        mesa.guardarMateriaPrimaEn(madera,1,0);
        mesa.guardarMateriaPrimaEn(madera,1,1);
        mesa.guardarMateriaPrimaEn(vacio,1,2);
        mesa.guardarMateriaPrimaEn(vacio,2,0);
        mesa.guardarMateriaPrimaEn(madera,2,1);
        mesa.guardarMateriaPrimaEn(vacio,2,2);

        Herramienta herramientaFabricada = fabricaHerramientas.fabricarHerramienta(mesa);

        Madera maderaEnPiso = new Madera();

        herramientaFabricada.golpear(maderaEnPiso);

        //veo si se comporta como un Hacha de madera
        assertEquals(100-2,herramientaFabricada.durabilidad());
        assertEquals(10-2,maderaEnPiso.durabilidad());
    }


    @Test
    public void testSeCreaUnHachaDePiedraAPartirDeLaDisposicionCorrecta(){
        FabricaHerramientas fabricaHerramientas = new FabricaHerramientas();
        Mesa mesa = new Mesa();
        MPPiedra piedra = new MPPiedra();
        MPMadera madera = new MPMadera();
        MPVacio vacio = new MPVacio();
        mesa.guardarMateriaPrimaEn(piedra,0,0);
        mesa.guardarMateriaPrimaEn(piedra,0,1);
        mesa.guardarMateriaPrimaEn(vacio,0,2);
        mesa.guardarMateriaPrimaEn(piedra,1,0);
        mesa.guardarMateriaPrimaEn(madera,1,1);
        mesa.guardarMateriaPrimaEn(vacio,1,2);
        mesa.guardarMateriaPrimaEn(vacio,2,0);
        mesa.guardarMateriaPrimaEn(madera,2,1);
        mesa.guardarMateriaPrimaEn(vacio,2,2);

        Herramienta herramientaFabricada = fabricaHerramientas.fabricarHerramienta(mesa);

        Madera maderaEnPiso = new Madera();

        herramientaFabricada.golpear(maderaEnPiso);

        //veo si se comporta como un Hacha de piedra
        assertEquals(200-5,herramientaFabricada.durabilidad());
        assertEquals(10-5,maderaEnPiso.durabilidad());
    }
}