package FabricasTest;

import Modelo.Excepciones.HerramientaDesgastadaExcepcion;
import Modelo.Fabricas.FabricaPico;
import Modelo.Fabricas.IFabricaHerramienta;
import Modelo.Herramientas.Herramienta;
import Modelo.MateriaPrima.MPMadera;
import Modelo.MateriaPrima.MPMetal;
import Modelo.MateriaPrima.MPPiedra;
import Modelo.MateriaPrima.MPVacio;
import Modelo.MesaDeTrabajo.Mesa;
import Modelo.Recursos.Piedra;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FabricaPicoTest {

    @Test
    public void test01SeCreaUnPicoDeMAderaAPartirDeLaDisposicionCorrecta() throws HerramientaDesgastadaExcepcion {
        IFabricaHerramienta fabricaHerramientas = new FabricaPico();
        Mesa mesa = new Mesa();
        MPMadera madera = new MPMadera();
        MPVacio vacio = new MPVacio();
        mesa.guardarMateriaPrimaEn(madera, 0, 0);
        mesa.guardarMateriaPrimaEn(madera, 0, 1);
        mesa.guardarMateriaPrimaEn(madera, 0, 2);
        mesa.guardarMateriaPrimaEn(vacio, 1, 0);
        mesa.guardarMateriaPrimaEn(madera, 1, 1);
        mesa.guardarMateriaPrimaEn(vacio, 1, 2);
        mesa.guardarMateriaPrimaEn(vacio, 2, 0);
        mesa.guardarMateriaPrimaEn(madera, 2, 1);
        mesa.guardarMateriaPrimaEn(vacio, 2, 2);

        Herramienta herramientaFabricada = fabricaHerramientas.fabricarHerramienta(mesa);
        Piedra piedraEnPiso = new Piedra();

        herramientaFabricada.golpear(piedraEnPiso);

        //veo si se comporta como un Pico de madera
        assertEquals(100 - 2, herramientaFabricada.durabilidad());
        assertEquals(30 - 2, piedraEnPiso.durabilidad());
    }


    @Test
    public void test02SeCreaUnPicoDePiedraAPartirDeLaDisposicionCorrecta() throws HerramientaDesgastadaExcepcion {
        IFabricaHerramienta fabricaHerramientas = new FabricaPico();
        Mesa mesa = new Mesa();
        MPPiedra piedra = new MPPiedra();
        MPMadera madera = new MPMadera();
        MPVacio vacio = new MPVacio();
        mesa.guardarMateriaPrimaEn(piedra, 0, 0);
        mesa.guardarMateriaPrimaEn(piedra, 0, 1);
        mesa.guardarMateriaPrimaEn(piedra, 0, 2);
        mesa.guardarMateriaPrimaEn(vacio, 1, 0);
        mesa.guardarMateriaPrimaEn(madera, 1, 1);
        mesa.guardarMateriaPrimaEn(vacio, 1, 2);
        mesa.guardarMateriaPrimaEn(vacio, 2, 0);
        mesa.guardarMateriaPrimaEn(madera, 2, 1);
        mesa.guardarMateriaPrimaEn(vacio, 2, 2);

        Herramienta herramientaFabricada = fabricaHerramientas.fabricarHerramienta(mesa);
        Piedra piedraEnPiso = new Piedra();

        herramientaFabricada.golpear(piedraEnPiso);

        //veo si se comporta como un Pico de piedra
        assertEquals(200 - 2, herramientaFabricada.durabilidad());
        assertEquals(30 - 4, piedraEnPiso.durabilidad());
    }


    @Test
    public void test03SeCreaUnPicoDeMetalAPartirDeLaDisposicionCorrecta() throws HerramientaDesgastadaExcepcion {
        IFabricaHerramienta fabricaHerramientas = new FabricaPico();
        Mesa mesa = new Mesa();
        MPMetal metal = new MPMetal();
        MPMadera madera = new MPMadera();
        MPVacio vacio = new MPVacio();
        mesa.guardarMateriaPrimaEn(metal, 0, 0);
        mesa.guardarMateriaPrimaEn(metal, 0, 1);
        mesa.guardarMateriaPrimaEn(metal, 0, 2);
        mesa.guardarMateriaPrimaEn(vacio, 1, 0);
        mesa.guardarMateriaPrimaEn(madera, 1, 1);
        mesa.guardarMateriaPrimaEn(vacio, 1, 2);
        mesa.guardarMateriaPrimaEn(vacio, 2, 0);
        mesa.guardarMateriaPrimaEn(madera, 2, 1);
        mesa.guardarMateriaPrimaEn(vacio, 2, 2);

        Herramienta herramientaFabricada = fabricaHerramientas.fabricarHerramienta(mesa);
        Piedra piedraEnPiso = new Piedra();

        herramientaFabricada.golpear(piedraEnPiso);

        assertEquals(30 - 12, piedraEnPiso.durabilidad());

        //veo si se comporta como un Pico de metal
        assertEquals(400, herramientaFabricada.durabilidad());
        for (int i = 0; i < 8; i++) {
            herramientaFabricada.golpear(piedraEnPiso);
        }
        assertEquals(400, herramientaFabricada.durabilidad());

        herramientaFabricada.golpear(piedraEnPiso);
        assertEquals(0, herramientaFabricada.durabilidad());

    }
}
