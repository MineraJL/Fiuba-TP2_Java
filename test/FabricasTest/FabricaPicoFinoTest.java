package FabricasTest;

import Modelo.Fabricas.FabricaPicoFino;
import Modelo.Fabricas.IFabricaHerramienta;
import Modelo.Herramientas.Herramienta;
import Modelo.MateriaPrima.MPMadera;
import Modelo.MateriaPrima.MPMetal;
import Modelo.MateriaPrima.MPPiedra;
import Modelo.MateriaPrima.MPVacio;
import Modelo.MesaDeTrabajo.Mesa;
import Modelo.Recursos.Diamante;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FabricaPicoFinoTest {

    @Test
    public void testSeCreaUnPicoFinoDeMAderaAPartirDeLaDisposicionCorrecta() {
        IFabricaHerramienta fabricaHerramientas = new FabricaPicoFino();
        Mesa mesa = new Mesa();
        MPMadera madera = new MPMadera();
        MPPiedra piedra = new MPPiedra();
        MPMetal metal = new MPMetal();
        MPVacio vacio = new MPVacio();
        mesa.guardarMateriaPrimaEn(metal, 0, 0);
        mesa.guardarMateriaPrimaEn(metal, 0, 1);
        mesa.guardarMateriaPrimaEn(metal, 0, 2);
        mesa.guardarMateriaPrimaEn(piedra, 1, 0);
        mesa.guardarMateriaPrimaEn(madera, 1, 1);
        mesa.guardarMateriaPrimaEn(vacio, 1, 2);
        mesa.guardarMateriaPrimaEn(vacio, 2, 0);
        mesa.guardarMateriaPrimaEn(madera, 2, 1);
        mesa.guardarMateriaPrimaEn(vacio, 2, 2);

        Herramienta herramientaFabricada = fabricaHerramientas.fabricarHerramienta(mesa);
        Diamante diamanteEnPiso = new Diamante();

        herramientaFabricada.golpear(diamanteEnPiso);

        //veo si se comporta como un Pico de madera

        assertEquals(1000 -(int)(1000*0.1), herramientaFabricada.durabilidad());
        assertEquals(100 - 20, diamanteEnPiso.durabilidad());
    }

}
