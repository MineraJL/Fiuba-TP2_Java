package MesaDeTrabajoTest;

import Herramientas.Hacha;
import MateriaPrima.MateriaPrima;
import MesaDeTrabajo.Mesa;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MesaTest {


    @Test
    public void testMesaDeTrabajoRecibeFiguraCorrectaYCreaHachaDeMadera(){

        Mesa mesa = new Mesa();


        MateriaPrima[][] disposicionHachaDeMadera = mesa.obtenerDisposicionCorrectaHachaDeMadera();
        MateriaPrima[][] disposicionCreadaPorUser = mesa.obtenerDisposicionCorrectaHachaDeMadera();


        Hacha hacha = mesa.construiHerramienta(disposicionHachaDeMadera);

        // hacer assert de que sea un hacha.

        assertEquals(1,1);







    }



}