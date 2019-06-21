package FabricasTest;

import Fabricas.FabricaHacha;
import Fabricas.FabricaPico;
import Fabricas.IFabricaHerramienta;
import Herramientas.Herramienta;
import MateriaPrima.MPMadera;
import MateriaPrima.MPMetal;
import MateriaPrima.MPPiedra;
import MateriaPrima.MPVacio;
import MesaDeTrabajo.Mesa;
import Recursos.Madera;
import Recursos.Piedra;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FabricaPicoTest {

    @Test
    public void testSeCreaUnPicoDeMAderaAPartirDeLaDisposicionCorrecta() {
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
        Piedra maderaEnPiso = new Piedra();

        herramientaFabricada.golpear(maderaEnPiso);

        //veo si se comporta como un Pico de madera
        assertEquals(100 - 2, herramientaFabricada.durabilidad());
        assertEquals(30 - 2, maderaEnPiso.durabilidad());
    }


    @Test
    public void testSeCreaUnPicoDePiedraAPartirDeLaDisposicionCorrecta() {
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
        Piedra maderaEnPiso = new Piedra();

        herramientaFabricada.golpear(maderaEnPiso);

        //veo si se comporta como un Pico de piedra
        assertEquals(200 - 2, herramientaFabricada.durabilidad());
        assertEquals(30 - 4, maderaEnPiso.durabilidad());
    }


    @Test
    public void testSeCreaUnPicoDeMetalAPartirDeLaDisposicionCorrecta() {
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
        Piedra maderaEnPiso = new Piedra();

        herramientaFabricada.golpear(maderaEnPiso);

        assertEquals(30 - 12, maderaEnPiso.durabilidad());

        //veo si se comporta como un Pico de madera
        assertEquals(400, herramientaFabricada.durabilidad());
        for (int i = 0; i < 8; i++) {
            herramientaFabricada.golpear(maderaEnPiso);
        }
        assertEquals(400, herramientaFabricada.durabilidad());

        herramientaFabricada.golpear(maderaEnPiso);
        assertEquals(0, herramientaFabricada.durabilidad());

    }
}
