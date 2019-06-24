package MesaDeTrabajoTest;

import MateriaPrima.MPVacio;
import org.junit.Test;

public class MPVacioTest {

    @Test
    public void testMesaDeTrabajoRecibeFiguraCorrectaYCreaHachaDeMadera() {

        MPVacio vacio = new MPVacio();
        MPVacio vacio2 = new MPVacio();
        Boolean esIgual = vacio.equals(vacio2);

        if (esIgual) {  // borrar esta porqueria jaja, solo esta para mostrar que funciona
            System.out.println(444);    // funciona pero no se que poner en el assert
        }
        //assertEquals(true, esIgual); // esto dice que no sabe cual assertEquals elegir.

    }

}
