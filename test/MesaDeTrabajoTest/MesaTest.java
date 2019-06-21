package MesaDeTrabajoTest;

import Herramientas.Hacha;
import Herramientas.Herramienta;
import MateriaPrima.MateriaPrima;
import MesaDeTrabajo.Mesa;
import MateriaPrima.*;
import Recursos.Madera;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MesaTest {


    @Test
    public void testMesaDeTrabajoRecibeFiguraCorrectaYCreaHachaDeMadera(){

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

        Herramienta hacha = mesa.construiHerramienta();

        // hacer assert de que sea un hacha.
        Madera maderaEnPiso = new Madera();

        hacha.golpear(maderaEnPiso);

        //veo si se comporta como un Hacha de piedra
        assertEquals(400 - 5, hacha.durabilidad());
        assertEquals(10 - 10, maderaEnPiso.durabilidad());

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


        assertEquals(mesa.obtenerItemEn(0,0),madera);


    }



}