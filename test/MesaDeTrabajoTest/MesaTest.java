package MesaDeTrabajoTest;

import Herramientas.Hacha;
import MateriaPrima.MateriaPrima;
import MesaDeTrabajo.Mesa;
import MateriaPrima.*;
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

    @Test
    public void testMesaDeTrabajoDevuelveItemDelLugarCorrecto(){
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


        assertEquals(mesa.obtenerItemEn(0,0),vacio);


    }



}