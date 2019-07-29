package FabricasTest;

import Modelo.Excepciones.HerramientaDesgastadaExcepcion;
import Modelo.Fabricas.FabricaHerramientas;
import Modelo.Herramientas.Herramienta;
import Modelo.MateriaPrima.MPMadera;
import Modelo.MateriaPrima.MPPiedra;
import Modelo.MateriaPrima.MPVacio;
import Modelo.MesaDeTrabajo.Mesa;
import Modelo.Recursos.Madera;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FabricaHerramientaTest {
    @Test
    public void test01SeCreaUnHachaDeMaderaAPartirDeLaDisposicionCorrecta() throws HerramientaDesgastadaExcepcion{
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
    public void test02SeCreaUnHachaDePiedraAPartirDeLaDisposicionCorrecta() throws HerramientaDesgastadaExcepcion{
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
