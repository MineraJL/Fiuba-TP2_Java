package MapaTest;

import Modelo.Mapa.Casillero;
import Modelo.MateriaPrima.MPMadera;
import Modelo.Recursos.DurabilidadRecurso;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DurabilidadRecursoTest {

    @Test
    public void testDurabilidadRecursoSeCreaCon10DeDurabilidad(){

        DurabilidadRecurso durabilidadRecurso = new DurabilidadRecurso(10);

        assertEquals(10,durabilidadRecurso.durabilidad());

    }

    @Test
    public void testDurabilidadRecursoSeSeDisminuyeEn1(){

        DurabilidadRecurso durabilidadRecurso = new DurabilidadRecurso(10);

        durabilidadRecurso.reducirDurabilidadEn(1,new MPMadera(), new Casillero());

        assertEquals(10-1,durabilidadRecurso.durabilidad());

    }

    @Test
    public void testDurabilidadRecursoSeSeDisminuyeEn2(){

        DurabilidadRecurso durabilidadRecurso = new DurabilidadRecurso(10);

        durabilidadRecurso.reducirDurabilidadEn(2,new MPMadera(), new Casillero());

        assertEquals(10-2,durabilidadRecurso.durabilidad());

    }

    @Test
    public void testDurabilidadRecursoSeDisminuyeHastaCero(){

        DurabilidadRecurso durabilidadRecurso = new DurabilidadRecurso(10);

        MPMadera materiaPrima = new MPMadera();
        Casillero casillero = new Casillero();
        durabilidadRecurso.reducirDurabilidadEn(9,materiaPrima, casillero);
        durabilidadRecurso.reducirDurabilidadEn(1,materiaPrima, casillero);

        assertEquals(0,durabilidadRecurso.durabilidad());

    }

    @Test
    public void testDurabilidadRecursoSigueSiendoCeroSiSeLaContinuaDisminuyendo(){

        DurabilidadRecurso durabilidadRecurso = new DurabilidadRecurso(10);

        MPMadera materiaPrima = new MPMadera();
        Casillero casillero = new Casillero();
        durabilidadRecurso.reducirDurabilidadEn(9,materiaPrima, casillero);
        durabilidadRecurso.reducirDurabilidadEn(1,materiaPrima, casillero);
        durabilidadRecurso.reducirDurabilidadEn(1,materiaPrima, casillero);

        assertEquals(0,durabilidadRecurso.durabilidad());

    }

    @Test
    public void testDurabilidadRecursoColocaMateriaPrimaEnElCasilleroRecibidoAlLlegarACero(){

        DurabilidadRecurso durabilidadRecurso = new DurabilidadRecurso(10);

        MPMadera materiaPrima = new MPMadera();
        Casillero casillero = new Casillero();
        durabilidadRecurso.reducirDurabilidadEn(9,materiaPrima, casillero);
        durabilidadRecurso.reducirDurabilidadEn(1,materiaPrima, casillero);

        assertEquals(materiaPrima,casillero.getOcupante());

    }



}
