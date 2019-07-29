package MesaDeTrabajoTest;

import Modelo.Excepciones.HerramientaDesgastadaExcepcion;
import Modelo.Herramientas.Herramienta;
import Modelo.MesaDeTrabajo.Mesa;
import Modelo.MateriaPrima.*;
import Modelo.Recursos.*;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MesaTest {
	
    @Test
    public void test01MesaDeTrabajoRecibeFiguraCorrectaYCreaHachaDeMadera() throws HerramientaDesgastadaExcepcion{

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

        Herramienta hacha = mesa.construiHerramienta();

        // hacer assert de que sea un hacha.
        Madera maderaEnPiso = new Madera();

        hacha.golpear(maderaEnPiso);

        //veo si se comporta como un Hacha de madera
        assertEquals(100 - 2, hacha.durabilidad());
        assertEquals(8, maderaEnPiso.durabilidad());

    }

    @Test
    public void test02MesaDeTrabajoRecibeFiguraCorrectaYCreaHachaDePiedra() throws HerramientaDesgastadaExcepcion{

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

        Herramienta hacha = mesa.construiHerramienta();

        // hacer assert de que sea un hacha.
        Madera maderaEnPiso = new Madera();

        hacha.golpear(maderaEnPiso);

        //veo si se comporta como un Hacha de piedra
        assertEquals(200 - 5, hacha.durabilidad());
        assertEquals(5, maderaEnPiso.durabilidad());

    }
    
    @Test
    public void test03MesaDeTrabajoRecibeFiguraCorrectaYCreaHachaDeMetal() throws HerramientaDesgastadaExcepcion{

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
    public void test04MesaDeTrabajoRecibeFiguraCorrectaYCreaPicoDeMadera() throws HerramientaDesgastadaExcepcion{

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

        Herramienta pico = mesa.construiHerramienta();

        // hacer assert de que sea un pico.
        Piedra piedraEnPiso = new Piedra();

        pico.golpear(piedraEnPiso);

        //veo si se comporta como un pico de madera
        assertEquals(100 - 2, pico.durabilidad());
        assertEquals(30 - 2, piedraEnPiso.durabilidad());

    }
    
    @Test
    public void test05MesaDeTrabajoRecibeFiguraCorrectaYCreaPicoDePiedra() throws HerramientaDesgastadaExcepcion{

        Mesa mesa = new Mesa();

        MPMadera madera = new MPMadera();
        MPPiedra piedra = new MPPiedra();
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

        Herramienta pico = mesa.construiHerramienta();

        // hacer assert de que sea un pico.
        Piedra piedraEnPiso = new Piedra();

        pico.golpear(piedraEnPiso);

        //veo si se comporta como un pico de piedra
        assertEquals(198, pico.durabilidad());
        assertEquals(30 - 4, piedraEnPiso.durabilidad());

    }
    
    @Test
    public void test06MesaDeTrabajoRecibeFiguraCorrectaYCreaPicoDeMetal() throws HerramientaDesgastadaExcepcion{

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

        Herramienta pico = mesa.construiHerramienta();

        // hacer assert de que sea un pico.
        Piedra piedraEnPiso = new Piedra();

        pico.golpear(piedraEnPiso);

        //veo si se comporta como un pico de metal
        assertEquals(400, pico.durabilidad());
        assertEquals(30 - 12, piedraEnPiso.durabilidad());

    }
    
    @Test
    public void test07MesaDeTrabajoRecibeFiguraCorrectaYCreaPicoFino() throws HerramientaDesgastadaExcepcion{

        Mesa mesa = new Mesa();

        MPPiedra piedra = new MPPiedra();
        MPMetal metal = new MPMetal();
        MPMadera madera = new MPMadera();
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

        Herramienta pico = mesa.construiHerramienta();

        // hacer assert de que sea un pico fino.
        Diamante diamanteEnPiso = new Diamante();

        pico.golpear(diamanteEnPiso);

        //veo si se comporta como un pico fino
        assertEquals(900, pico.durabilidad());
        assertEquals(100 - 20, diamanteEnPiso.durabilidad());

    }
    
    @Test
    public void test08MesaDeTrabajoRecibeFiguraINCorrectaYCreaHerramientaInexistente() throws HerramientaDesgastadaExcepcion{

        Mesa mesa = new Mesa();

        MPMetal metal = new MPMetal();
        MPMadera madera = new MPMadera();
        MPVacio vacio = new MPVacio();
        mesa.guardarMateriaPrimaEn(vacio, 0, 0);
        mesa.guardarMateriaPrimaEn(vacio, 0, 1);
        mesa.guardarMateriaPrimaEn(vacio, 0, 2);
        mesa.guardarMateriaPrimaEn(metal, 1, 0);
        mesa.guardarMateriaPrimaEn(madera, 1, 1);
        mesa.guardarMateriaPrimaEn(vacio, 1, 2);
        mesa.guardarMateriaPrimaEn(vacio, 2, 0);
        mesa.guardarMateriaPrimaEn(madera, 2, 1);
        mesa.guardarMateriaPrimaEn(vacio, 2, 2);

        Herramienta herramienta = mesa.construiHerramienta();

        Madera maderaEnPiso = new Madera();
        herramienta.golpear(maderaEnPiso);


        assertEquals(0, herramienta.durabilidad());
        assertEquals(10, maderaEnPiso.durabilidad());

    }

    @Test
    public void test09MesaDeTrabajoDevuelveItemDelLugarCorrecto(){
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