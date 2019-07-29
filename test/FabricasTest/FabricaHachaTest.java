package FabricasTest;

import Modelo.Excepciones.HerramientaDesgastadaExcepcion;
import Modelo.Fabricas.FabricaHacha;
import Modelo.Herramientas.Herramienta;
import Modelo.MateriaPrima.MPMadera;
import Modelo.MateriaPrima.MPMetal;
import Modelo.MateriaPrima.MPPiedra;
import Modelo.MateriaPrima.MPVacio;
import Modelo.MesaDeTrabajo.Mesa;
import Modelo.Recursos.Madera;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FabricaHachaTest {


    @Test
    public void test01SeCreaUnHachaDeMAderaAPartirDeLaDisposicionCorrecta() throws HerramientaDesgastadaExcepcion {
        FabricaHacha fabricaHerramientas = new FabricaHacha();
        Mesa mesa = new Mesa();
        MPMadera madera = new MPMadera();
        MPVacio vacio = new MPVacio();
        mesa.guardarMateriaPrimaEn(madera, 0, 0);
        mesa.guardarMateriaPrimaEn(madera, 0, 1);
        mesa.guardarMateriaPrimaEn(vacio, 0, 2);
        mesa.guardarMateriaPrimaEn(madera, 1, 0);
        mesa.guardarMateriaPrimaEn(madera, 1, 1);
        mesa.guardarMateriaPrimaEn(vacio, 1, 2);
        mesa.guardarMateriaPrimaEn(vacio, 2, 0);
        mesa.guardarMateriaPrimaEn(madera, 2, 1);
        mesa.guardarMateriaPrimaEn(vacio, 2, 2);

        Herramienta herramientaFabricada = fabricaHerramientas.fabricarHerramienta(mesa);
        Madera maderaEnPiso = new Madera();

        herramientaFabricada.golpear(maderaEnPiso);

        //veo si se comporta como un Hacha de madera
        assertEquals(100 - 2, herramientaFabricada.durabilidad());
        assertEquals(10 - 2, maderaEnPiso.durabilidad());
    }


    @Test
    public void test02SeCreaUnHachaDePiedraAPartirDeLaDisposicionCorrecta() throws HerramientaDesgastadaExcepcion {
        FabricaHacha fabricaHerramientas = new FabricaHacha();
        Mesa mesa = new Mesa();
        MPPiedra piedra = new MPPiedra();
        MPMadera madera = new MPMadera();
        MPVacio vacio = new MPVacio();
        mesa.guardarMateriaPrimaEn(piedra, 0, 0);
        mesa.guardarMateriaPrimaEn(piedra, 0, 1);
        mesa.guardarMateriaPrimaEn(vacio, 0, 2);
        mesa.guardarMateriaPrimaEn(piedra, 1, 0);
        mesa.guardarMateriaPrimaEn(madera, 1, 1);
        mesa.guardarMateriaPrimaEn(vacio, 1, 2);
        mesa.guardarMateriaPrimaEn(vacio, 2, 0);
        mesa.guardarMateriaPrimaEn(madera, 2, 1);
        mesa.guardarMateriaPrimaEn(vacio, 2, 2);

        Herramienta herramientaFabricada = fabricaHerramientas.fabricarHerramienta(mesa);
        Madera maderaEnPiso = new Madera();

        herramientaFabricada.golpear(maderaEnPiso);

        //veo si se comporta como un Hacha de piedra
        assertEquals(200 - 5, herramientaFabricada.durabilidad());
        assertEquals(10 - 5, maderaEnPiso.durabilidad());
    }


    @Test
    public void test03SeCreaUnHachaDeMetalAPartirDeLaDisposicionCorrecta() throws HerramientaDesgastadaExcepcion {
        FabricaHacha fabricaHerramientas = new FabricaHacha();
        Mesa mesa = new Mesa();
        MPMetal metal = new MPMetal();
        MPMadera madera = new MPMadera();
        MPVacio vacio = new MPVacio();
        mesa.guardarMateriaPrimaEn(metal, 0, 0);
        mesa.guardarMateriaPrimaEn(metal, 0, 1);
        mesa.guardarMateriaPrimaEn(vacio, 0, 2);
        mesa.guardarMateriaPrimaEn(metal, 1, 0);
        mesa.guardarMateriaPrimaEn(madera, 1, 1);
        mesa.guardarMateriaPrimaEn(vacio, 1, 2);
        mesa.guardarMateriaPrimaEn(vacio, 2, 0);
        mesa.guardarMateriaPrimaEn(madera, 2, 1);
        mesa.guardarMateriaPrimaEn(vacio, 2, 2);

        Herramienta herramientaFabricada = fabricaHerramientas.fabricarHerramienta(mesa);
        Madera maderaEnPiso = new Madera();

        herramientaFabricada.golpear(maderaEnPiso);

        //veo si se comporta como un Hacha de metal
        assertEquals(400 - 5, herramientaFabricada.durabilidad());
        assertEquals(10 - 10, maderaEnPiso.durabilidad());
    }
}
